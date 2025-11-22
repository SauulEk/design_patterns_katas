Kata: Builder
Contexto
Estás construyendo objetos complejos con muchos parámetros opcionales (por ejemplo, paquetes turísticos, configuraciones de usuario o vehículos). El constructor actual requiere demasiados parámetros y provoca código poco legible, además de romper SRP y dificultar agregar nuevos campos.
El Patrón: Builder
El patrón Builder permite construir objetos complejos paso a paso mediante métodos encadenables que configuran el objeto antes de terminar con un build().
El Builder resuelve el problema de constructores gigantes al:
Separar la construcción de la representación
Permitir parámetros opcionales de manera clara
Hacer que el código sea más legible
Reducir errores por el orden de argumentos
Beneficios principales:
Código limpio y legible
Principio abierto/cerrado: agregar campos no rompe el API
Evita múltiples constructores sobrecargados
Flexibilidad en la creación de objetos
¿Cuándo usar este patrón?
Cuando un objeto tiene muchos parámetros opcionales
Cuando quieres un proceso de construcción claro
Cuando el orden de parámetros puede causar errores
Cuando quieres objetos inmutables