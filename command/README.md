Kata: Command
Contexto
Estás trabajando con un sistema donde un “invocador” (botón, menú, control remoto) debe ejecutar acciones sobre diferentes objetos (luces, música, puertas). Actualmente, el invocador llama directamente los métodos concretos de cada dispositivo, lo cual genera condicionales y alto acoplamiento.
El Patrón: Command
El patrón Command convierte una acción en un objeto independiente que implementa un método execute(). El invocador no conoce los detalles del receptor, solo ejecuta comandos.
El Command resuelve el problema de acoplamiento al:
Desacoplar el invocador del receptor
Representar acciones como objetos reutilizables
Permitir agregar nuevas acciones sin modificar el invocador
Habilitar funcionalidades avanzadas como undo, colas, macros
Beneficios principales:
Bajo acoplamiento: el invocador no conoce al receptor
Principio abierto/cerrado: puedes agregar comandos sin modificar el invocador
Reutilización: comandos pueden guardarse, deshacerse o encadenarse
Extensibilidad: ideal para acciones complejas o repetibles
¿Cuándo usar este patrón?
Cuando necesitas desacoplar acciones de quien las invoca
Cuando necesitas undo/redo
Cuando quieres soportar macros o historial
Cuando quieres un sistema de botones flexible