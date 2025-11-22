Kata: State
Contexto
Estás trabajando con un objeto cuya lógica depende de su estado actual, como un pedido (nuevo, cocinando, enviado, entregado), un semáforo o un usuario. Actualmente, el código está lleno de condicionales que verifican el estado, lo que hace difícil modificar o agregar nuevos estados.
El Patrón: State
El patrón State encapsula cada estado en una clase independiente. El contexto delega el comportamiento al estado actual sin usar condicionales.
El State resuelve el problema de lógica dependiente del estado al:
Evitar condicionales gigantes
Permitir agregar nuevos estados sin modificar la clase principal
Darle a cada estado su propia lógica
Manejar transiciones de forma clara
Beneficios principales:
Principio abierto/cerrado: nuevos estados no modifican el contexto
Legibilidad: cada estado tiene su propia clase
SRP: cada estado maneja una sola responsabilidad
Flexibilidad: el contexto puede cambiar de estado dinámicamente
¿Cuándo usar este patrón?
Cuando el objeto cambia su comportamiento según su estado
Cuando hay muchos condicionales por estado
Cuando necesitas agregar nuevos estados fácilmente
Cuando los estados deben ser intercambiables