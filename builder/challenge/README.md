# Solución (Builder)

⚠️ **Intenta resolver el reto antes de ver la solución**

## Cambios Principales

1. **Separación de la construcción del objeto**  
   En lugar de usar un constructor con muchos parámetros en `TravelPackage`, se introduce una clase `TravelPackageBuilder` encargada del proceso de construcción.

2. **Clase `TravelPackageBuilder`**  
   - Contiene los mismos campos que `TravelPackage` (hotel, nights, breakfastIncluded, airportTransfer, tour, etc.).  
   - Proporciona métodos encadenables como:
     - `hotel(String hotel)`
     - `nights(int nights)`
     - `breakfastIncluded(boolean included)`
     - `airportTransfer(boolean transfer)`
     - `tour(String tour)`
   - Expone un método `build()` que crea y devuelve una instancia inmutable de `TravelPackage`.

3. **Constructor de `TravelPackage` hecho privado o package-private**  
   El objeto `TravelPackage` ahora se crea exclusivamente a través del builder, evitando constructores largos y confusos.

4. **Código cliente más legible**  
   En lugar de:
   ```java
   TravelPackage pkg = new TravelPackage("Sensira", 4, true, true, "Chichen Itza");
   ```
   ahora se utiliza:
   ```java
   TravelPackage pkg = new TravelPackageBuilder()
           .hotel("Sensira")
           .nights(4)
           .breakfastIncluded(true)
           .airportTransfer(true)
           .tour("Chichen Itza")
           .build();
   ```

## Salida Esperada

```text
Hotel: Sensira, Nights: 4, Breakfast: true, Transfer: true, Tour: Chichen Itza
```

Además, es posible crear variaciones fácilmente, por ejemplo:

```java
TravelPackage basic = new TravelPackageBuilder()
        .hotel("Budget Inn")
        .nights(2)
        .build();
```

Con el patrón Builder aplicado:

- Se mejora la legibilidad del código cliente.  
- Se reduce la probabilidad de errores por orden incorrecto de parámetros.  
- El sistema queda abierto a agregar nuevos campos sin romper el código existente, cumpliendo el principio abierto/cerrado.
