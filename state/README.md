# Kata: State

## Contexto

Estás trabajando con un objeto cuyo comportamiento depende de su estado actual, como un **pedido** (nuevo, cocinando, enviado, entregado), un **semáforo**, una **máquina expendedora**, o un **usuario** (activo/inactivo/baneado).  
Actualmente, este objeto contiene múltiples condicionales como:

```java
if (state.equals("NEW")) ...
else if (state.equals("COOKING")) ...
else if (state.equals("ON_THE_WAY")) ...
```

Este enfoque genera varios problemas:

- Condicionales gigantes y difíciles de mantener  
- Cada nuevo estado rompe código existente  
- La lógica del objeto depende fuertemente de strings o flags  
- Violas el principio abierto/cerrado cada vez que agregas un estado  

Esto crea un sistema rígido, complicado de escalar y difícil de extender.

---

## El Patrón: State

El patrón State encapsula cada **estado** en su propia clase independiente.  
El objeto principal (contexto) **delegará** su comportamiento al estado actual, evitando condicionales.

El patrón State resuelve el problema al:

- Reemplazar condicionales por **polimorfismo**  
- Permitir agregar nuevos estados sin modificar el contexto  
- Mantener cada estado con su propia lógica  
- Manejar transiciones de forma clara y organizada  
- Evitar que el contexto conozca la implementación concreta de cada estado

---

## Beneficios principales

- **Abierto/cerrado:** Puedes agregar nuevos estados sin modificar el contexto  
- **SRP:** Cada estado tiene una única responsabilidad  
- **Legibilidad:** Código más limpio y fácil de entender  
- **Flexibilidad:** El contexto puede cambiar de estado dinámicamente  
- **Bajo acoplamiento:** El contexto no depende de implementaciones concretas  

---

## ¿Cuándo usar este patrón?

- Cuando el objeto **cambia su comportamiento** según su estado  
- Cuando hay muchos `if/else` o `switch` basados en estados  
- Cuando necesitas agregar nuevos estados fácilmente  
- Cuando los estados deben ser intercambiables  
- Cuando la lógica por estado empieza a crecer y mezclarse  

---

## Challenge

Para poner en práctica el patrón State, consulta el **README del challenge** que contiene un ejercicio práctico donde deberás refactorizar un sistema lleno de condicionales para que cada estado esté completamente encapsulado.

---

## Recursos Adicionales

- [Refactoring Guru – State Pattern](https://refactoring.guru/design-patterns/state)  
- [Source Making – State Pattern](https://sourcemaking.com/design_patterns/state)
