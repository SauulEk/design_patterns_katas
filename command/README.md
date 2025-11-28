# Kata: Command

## Contexto
Estás trabajando con un sistema donde un "invocador" (botón, menú, control remoto) ejecuta acciones sobre diferentes receptores como luces, puertas, audio o procesos. Actualmente, el invocador conoce directamente qué método de qué objeto debe llamar, generando condicionales como:

```java
if (action.equals("LIGHT_ON")) light.on();
```

Esto causa alto acoplamiento y hace difícil agregar nuevas acciones.

## El Patrón: Command
El patrón Command encapsula cada acción en un **objeto comando** que implementa un método `execute()`.  
El invocador no conoce el receptor, solo ejecuta el comando.

El patrón resuelve el problema al:
- Separar el invocador de la lógica concreta  
- Representar acciones como objetos independientes  
- Permitir undo/redo, historial o colas de ejecución  

## Beneficios principales:
- **Bajo acoplamiento:** el invocador no conoce al receptor  
- **OCP:** puedes agregar nuevos comandos sin modificar el invocador  
- **Extensibilidad:** permite macros, historial y undo  
- **SRP:** cada comando representa una acción específica  

## ¿Cuándo usar este patrón?
- Cuando quieres desacoplar quién invoca de quién ejecuta  
- Cuando necesitas deshacer acciones  
- Cuando manejas menús, botones o atajos de teclado  
- Cuando quieres soportar macros o secuencias de comandos  

## Challenge
Consulta el README del challenge para implementar comandos concretos y un invocador flexible.

## Recursos Adicionales
- [Refactoring Guru - Command Pattern](https://refactoring.guru/design-patterns/command)
- [Source Making - Command Pattern](https://sourcemaking.com/design_patterns/command)