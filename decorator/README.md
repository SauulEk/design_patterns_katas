# Kata: Decorator

## Contexto
Estás trabajando en un sistema donde un objeto base puede necesitar comportamientos adicionales opcionales, como toppings, filtros, permisos o funcionalidades agregadas. Actualmente, usas herencia para lograr combinaciones:

- CaféConLeche  
- CaféConChocolate  
- CaféConLecheChocolate  
- etc.  

Esto genera explosión de clases, baja flexibilidad y viola el principio abierto/cerrado.

## El Patrón: Decorator
El patrón Decorator permite agregar responsabilidades adicionales envolviendo un objeto dentro de otro que **implementa la misma interfaz**. Cada decorador añade una funcionalidad y puede combinarse con otros.

Decorator resuelve el problema al:
- Extender comportamiento sin modificar la clase original
- Agregar funcionalidades en tiempo de ejecución
- Promover composición sobre herencia
- Permitir combinar múltiples decoradores libremente

## Beneficios principales
- **OCP:** agregar nuevas funcionalidades sin modificar clases existentes  
- **Flexibilidad:** decoradores encadenables  
- **SRP:** cada decorador añade una única responsabilidad  
- **Evita explosión de clases:** no necesitas una clase por combinación  

## ¿Cuándo usar este patrón?
- Cuando quieres agregar responsabilidades opcionales  
- Cuando existen múltiples combinaciones posibles  
- Cuando la lógica debe extenderse sin modificar el objeto base  
- Cuando quieres modificar comportamiento dinámicamente  

## Challenge
Consulta el README del challenge para implementar un algoritmo con pasos fijos y pasos personalizados.

## Recursos Adicionales
- [Refactoring Guru – Decorator Pattern](https://refactoring.guru/design-patterns/decorator)  
- [Source Making – Decorator Method](https://sourcemaking.com/design_patterns/decorator)
