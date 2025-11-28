#  Kata: Proxy


# #Contexto
Estás trabajando en un sistema donde un cliente accede directamente a un servicio costoso o sensible, como consultar expedientes médicos, cargar imágenes pesadas o conectarse a un servidor remoto. Este servicio real puede ser lento, caro o necesitar permisos especiales.
Actualmente, el cliente está directamente acoplado al servicio real, lo que genera varios problemas:
No hay control de acceso
No hay cache o optimización
Cada llamada provoca operaciones costosas
Para agregar seguridad o cache, tendrías que modificar el cliente o el servicio
Esto viola el principio abierto/cerrado y crea acoplamiento innecesario.


##  El Patrón: Proxy


El patrón Proxy actúa como un intermediario entre el cliente y el objeto real.
El cliente NO sabe que está hablando con un proxy: ambos comparten la misma interfaz.
El Proxy resuelve el problema al:
- Controlar el acceso antes de invocar al objeto real
- Añadir cache para evitar operaciones repetidas
- Añadir logs o auditoría sin alterar el servicio
- Proteger objetos costosos o sensibles
- Mantener al cliente desacoplado de la implementación real
Beneficios principales:
- **Abierto/cerrado**: agregas seguridad/cache sin modificar el servicio real
**DIP**: cliente depende de una interfaz, no de la clase concreta
**Seguridad**: validas roles antes de entregar información
**Eficiencia**: reduces operaciones costosas con cache


## ¿Cuándo usar Proxy?

- **Acceso a servicios remotos o lentos**
- **Control de permisos o roles**
- **Cache de resultados**
- **Logging o auditoría transversal**

## Challenge
Para poner en practica el patron Proxy, consulta el [README del challenge](./challenge/) que contiene un ejercicio practico.


## Recursos Adicionales

- [Refactoring Guru - Proxy Pattern](https://refactoring.guru/design-patterns/proxy)
- [Source Making - Proxy Pattern](https://sourcemaking.com/design_patterns/proxy)
