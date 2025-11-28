# Kata: Chain of Responsibility

## Contexto
Estás trabajando en un sistema donde una solicitud debe pasar por múltiples validaciones o filtros, como verificar usuario, monto, permisos o límites. Actualmente, todas estas validaciones están dentro de un único método lleno de `if/else`, lo que dificulta agregar nuevas reglas sin modificar el código existente. Esto viola el principio abierto/cerrado y crea un método rígido y difícil de extender.

## El Patrón: Chain of Responsibility
El patrón Chain of Responsibility divide cada validación en un **handler** independiente conectado a un siguiente handler.  
Cada handler decide si:
- Maneja la solicitud  
- La rechaza  
- O la delega al siguiente handler en la cadena  

El patrón resuelve el problema al:
- Separar cada regla en una clase individual  
- Evitar métodos gigantes con múltiples validaciones  
- Permitir agregar o quitar validaciones sin afectar a otras  

## Beneficios principales:
- **OCP:** puedes agregar nuevos handlers sin modificar los existentes  
- **SRP:** cada clase se encarga de una sola validación  
- **Flexibilidad:** puedes reordenar, agregar o remover reglas dinámicamente  
- **Bajo acoplamiento:** cada handler solo conoce al siguiente  

## ¿Cuándo usar este patrón?
- Validaciones secuenciales  
- Filtros de seguridad  
- Autenticación y autorización  
- Pipelines configurables  
- Procesamientos paso a paso

## Challenge
Consulta el README del challenge que contiene un ejercicio práctico para implementar la cadena de validaciones.

## Recursos Adicionales
- [Refactoring Guru - chain-of responsibility Pattern](https://refactoring.guru/design-patterns/chain-of-responsibility)
- [Source Making - chain of responsibility Pattern](https://sourcemaking.com/design_patterns/chain_of_responsibility)