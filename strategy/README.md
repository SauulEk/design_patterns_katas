# Kata: Strategy

## Contexto
Estás trabajando en un sistema que debe ejecutar diferentes algoritmos dependiendo de un tipo específico, como costos de envío, cálculos de impuestos, métodos de compresión o estrategias de ordenamiento. El código actual está lleno de condicionales como:

```java
if(type.equals("NORMAL")) ...
else if(type.equals("EXPRESS")) ...
```

Esto hace difícil extender el sistema y agregar nuevas variantes sin romper el código existente.

## El Patrón: Strategy
El patrón Strategy encapsula cada algoritmo dentro de una clase independiente que comparte una interfaz común. El cliente selecciona la estrategia sin usar condicionales y sin depender de implementaciones concretas.

Strategy resuelve el problema al:
- Separar cada algoritmo en su propia clase
- Eliminar condicionales por tipo
- Permitir cambiar el algoritmo en tiempo de ejecución
- Desacoplar al cliente de las implementaciones concretas

## Beneficios principales
- **OCP:** agregar una estrategia no modifica las existentes  
- **Polimorfismo:** todas las estrategias comparten una interfaz común  
- **Flexibilidad:** puedes cambiar dinámicamente el algoritmo  
- **Claridad:** cada algoritmo vive en su propia clase  

## ¿Cuando usar Strategy?
- Cuando existen múltiples maneras de ejecutar una misma operación  
- Cuando quieres evitar condicionales por tipo  
- Cuando necesitas cambiar algoritmos dinámicamente  
- Cuando cada algoritmo debe encapsularse independientemente
## Challenge
Consulta el README del challenge para implementar un algoritmo con pasos fijos y pasos personalizados.

## Recursos Adicionales
- [Refactoring Guru – Strategy Pattern](https://refactoring.guru/design-patterns/strategy)  
- [Source Making – Strategy ](https://sourcemaking.com/design_patterns/strategy)


