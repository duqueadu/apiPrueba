package com.prueba.gestionarTareaAPI.infrastructure.controllers.tarea;

import com.prueba.gestionarTareaAPI.application.services.tarea.TareaService;
import com.prueba.gestionarTareaAPI.domain.model.Tarea.Tarea;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tareas")
public class TareaController {

    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    // Método privado para verificar la sesión
    private ResponseEntity<?> verifySession(HttpSession session) {
        String token = (String) session.getAttribute("access_token");
        if (token == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Acceso no autorizado: No hay sesión activa");
        }
        return null; // Retorna null si la sesión es válida
    }


    @PostMapping
    public ResponseEntity<?> createTarea(@RequestBody @Valid Tarea tarea, HttpSession session) {
        ResponseEntity<?> verification = verifySession(session);
        if (verification != null) return verification;

        Tarea createdTarea = tareaService.createTarea(tarea);
        return new ResponseEntity<>(createdTarea, HttpStatus.CREATED);
    }


    @GetMapping("/todos")
    public ResponseEntity<?> getAllTareas(HttpSession session) {
        ResponseEntity<?> verification = verifySession(session);
        if (verification != null) return verification;

        List<Tarea> tareas = tareaService.getAllTareas();
        if (tareas.isEmpty()) {
            return new ResponseEntity<>("No hay tareas disponibles", HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(tareas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarea> getTareaById(@PathVariable Long id, HttpSession session) {
        ResponseEntity<?> verification = verifySession(session);
        if (verification != null) return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();

        return tareaService.getTareaById(id)
                .map(tarea -> new ResponseEntity<>(tarea, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarea> updateTarea(@PathVariable Long id, @RequestBody @Valid Tarea updatedTarea, HttpSession session) {
        ResponseEntity<?> verification = verifySession(session);
        if (verification != null) return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();

        return tareaService.updateTarea(id, updatedTarea)
                .map(tarea -> new ResponseEntity<>(tarea, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTarea(@PathVariable Long id, HttpSession session) {
        ResponseEntity<?> verification = verifySession(session);
        if (verification != null) return verification;

        boolean deleted = tareaService.deleteTarea(id);
        if (deleted) {
            return new ResponseEntity<>("Tarea eliminada exitosamente", HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>("No se pudo eliminar la tarea con ID: " + id, HttpStatus.NOT_FOUND);
        }
    }
}