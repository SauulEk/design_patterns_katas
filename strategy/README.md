Kata: Strategy
Contexto
Estás trabajando en un sistema que necesita ejecutar diferentes algoritmos dependiendo de un tipo, por ejemplo: formas de envío, cálculos de precio, métodos de pago o algoritmos de compresión. Actualmente usas condicionales como “if NORMAL… else if EXPRESS…”, lo que hace el código difícil de extender y mantener.
El Patrón: Strategy
El patrón Strategy permite encapsular cada algoritmo dentro de una clase independiente con una interfaz común. El cliente elige qué estrategia usar sin necesidad de condicionales.
El Strategy resuelve el problema de algoritmos múltiples al:
Separar cada algoritmo en su propia clase
Eliminar condicionales por tipo
Permitir cambiar el algoritmo en tiempo de ejecución
Desacoplar el servicio de las implementaciones concretas
Beneficios principales:
Principio abierto/cerrado: agregar un nuevo algoritmo no modifica el código existente
Polimorfismo: todas las estrategias se usan por una misma interfaz
Claridad: cada algoritmo tiene su propia clase
Flexibilidad: permite cambiar la estrategia dinámicamente
¿Cuándo usar este patrón?
Cuando tienes varios algoritmos intercambiables
Cuando quieres eliminar condicionales por tipo
Cuando el comportamiento debe poder variarse en tiempo real
Cuando cada variante debe estar encapsulada