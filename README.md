# 📌 API Gestión de Tareas (private-endpoints)

```card
| **Detalles Técnicos**          |                                                                 |
|-------------------------------|-----------------------------------------------------------------|
| **Versión API**               | 1.0.0                                                          |
| **Especificación**            | OAS 3.0                                                        |
| **Documentación**             | `/v3/api-docs/private-endpoints`                               |
| **Servidor**                  | `http://localhost:8083`                                        |

| **Flujo de Autenticación**    |                                                                 |
|-------------------------------|-----------------------------------------------------------------|
| 🔓 **Endpoints Públicos**     | `POST /api/authorization/CrearUsuario` (Registro)              |
|                               | `POST /api/authorization/login` (Autenticación)                |
| 🔒 **Endpoints Protegidos**   | Todos bajo `/api/**` (Requieren JWT)                           |

| **Instrucciones Clave**       |                                                                 |
|-------------------------------|-----------------------------------------------------------------|
| 1. Registrar usuario          | Enviar payload a `/CrearUsuario`                               |
| 2. Obtener JWT                | Login con credenciales válidas                                 |
| 3. Autorizar solicitudes      | Incluir header: `Authorization: Bearer <token>`                |
| 4. Validaciones               | Token JWT válido + sesión activa                               |
