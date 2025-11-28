# Kata: Facade

## Contexto
Estás trabajando en un sistema donde un cliente debe interactuar con múltiples subsistemas como inventario, pagos, envíos, logs y notificaciones. Esto obliga al cliente a conocer demasiados detalles internos, creando alto acoplamiento y código difícil de mantener.

## El Patrón: Facade
Facade proporciona una **interfaz sencilla** que envuelve múltiples subsistemas y expone un método de alto nivel para realizar operaciones complejas.

El patrón resuelve el problema al:
- Esconder la complejidad interna  
- Reducir dependencias del cliente  
- Proporcionar un punto de entrada unificado  
- Encapsular procesos que involucran varios módulos  

## Beneficios principales:
- **Simplicidad:** el cliente usa un solo método  
- **Bajo acoplamiento:** los subsistemas quedan ocultos  
- **Mantenibilidad:** cambios internos no afectan al cliente  
- **Organización:** ideal para grandes sistemas con muchos módulos  

## ¿Cuándo usar este patrón?
- Cuando el cliente no debe conocer detalles internos  
- Cuando hay múltiples subsistemas complejos  
- Cuando quieres simplificar un API grande  
- Cuando implementas flujos complejos que requieren orquestación  

## Challenge
Consulta el README del challenge para implementar una fachada que orqueste varios módulos del sistema.

## Recursos Adicionales
- [Refactoring Guru - Facade Pattern](https://refactoring.guru/design-patterns/facade)
- [Source Making - Facade Pattern](https://sourcemaking.com/design_patterns/facade)