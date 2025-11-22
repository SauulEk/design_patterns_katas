Kata: Decorator
Contexto
Estás trabajando en un sistema donde tienes un objeto base y quieres añadirle comportamientos adicionales como toppings, filtros, características opcionales o funcionalidades extra. Actualmente usas herencia para crear múltiples combinaciones como “CaféConLeche”, “CaféConChocolate”, “CaféConTodo”, lo cual explota en una jerarquía inmanejable y rompe el principio abierto/cerrado porque cada nueva combinación requiere modificar el código.
El Patrón: Decorator
El patrón Decorator permite agregar responsabilidades adicionales a un objeto de forma dinámica envolviéndolo en otro objeto que cumple la misma interfaz. Cada decorador añade una funcionalidad específica y puede combinarse con otros.
El Decorator resuelve el problema de combinaciones múltiples al:
Permitir extender comportamiento sin modificar la clase original
Envolver objetos con capas adicionales
Mantener la misma interfaz en el objeto base y sus decoradores
Promover la composición en lugar de herencia
Beneficios principales:
Principio abierto/cerrado: agregar una nueva funcionalidad es crear un nuevo decorador
Flexibilidad: permite combinar múltiples decoradores en tiempo de ejecución
Reutilización: cada decorador agrega una única responsabilidad
Reducción de clases innecesarias: evitas combinaciones en cascada por herencia
¿Cuándo usar este patrón?
Cuando quieres agregar responsabilidades opcionales
Cuando hay muchas combinaciones posibles
Cuando quieres modificar funcionalidad en runtime
Cuando no quieres modificar el objeto original