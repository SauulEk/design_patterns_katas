Kata: Chain of Responsibility
Contexto
Estás trabajando en un sistema donde una solicitud debe pasar por varias validaciones o filtros, por ejemplo: contenido vacío, validación de usuario, validación de cantidad, validación de límites. Actualmente, todo está en un solo método lleno de condicionales.
El Patrón: Chain of Responsibility
Chain of Responsibility permite dividir cada regla en un “handler” independiente conectado al siguiente. Cada uno decide si manejar la solicitud o delegarla.
El patrón resuelve el problema de validaciones rígidas al:
Permitir encadenar handlers dinámicamente
Reducir condicionales secuenciales
Separar cada regla en su propia clase
Hacer posible agregar o quitar reglas sin afectar a las demás
Beneficios principales:
Principio abierto/cerrado: agregar una regla nueva no modifica las existentes
SRP: cada regla es una clase autónoma
Flexibilidad: puedes reordenar la cadena
Bajo acoplamiento: cada handler solo conoce al siguiente
¿Cuándo usar este patrón?
Validaciones paso a paso
Filtros de seguridad
Pipelines configurables
Procesamientos secuenciales dinámicos