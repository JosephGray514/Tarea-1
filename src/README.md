# Documentación del Proyecto de Patrón Builder para Calzado

Version JAVA: JDK 21

## Introducción
El proyecto implementa el patrón de diseño Builder para la creación de objetos complejos, en este caso, objetos de tipo `Calzado`. Este patrón permite la construcción paso a paso de un objeto complejo y facilita el proceso al separar la construcción de su representación.

## Estructura del Proyecto
El proyecto se compone de varias clases, interfaces y enumeraciones que trabajan conjuntamente para permitir la configuración y creación de instancias de `Calzado`.

### Paquetes y sus Componentes


#### Paquete `builder`
Define la interfaz `Builder` y la clase concreta `CalzadoBuilder`, las cuales son responsables de la construcción paso a paso de objetos `Calzado`.

- `Builder`: Interfaz que declara métodos para establecer los diferentes componentes del calzado.
- `CalzadoBuilder`: Implementación concreta de `Builder`, mantiene una instancia de `Calzado` durante su construcción y proporciona una interfaz para agregar componentes.

#### Paquete `Class`
Contiene la clase `Calzado`, que representa el producto final en el patrón Builder.

- `Calzado`: Clase que representa el objeto complejo final. Contiene atributos para cada parte del calzado y es construido por el `CalzadoBuilder`.

#### Paquete `director`
Incluye el `ClazadoBuilderDirector`, que encapsula la lógica para construir distintas variantes de `Calzado`.

- `ClazadoBuilderDirector`: Clase que ofrece métodos para crear configuraciones específicas de `Calzado`, como calzado con cordón, con velcro, con tacones, etc.

#### Paquete `enums`
Contiene enumeraciones que definen opciones para varios atributos del calzado como color, material de suela, tipo de cordón, etc.

- `Color`: Enumeración que define colores posibles para diferentes partes del calzado.
- `EstiloEmpeine`: Define los estilos de empeine disponibles.
- `Material`: Enumera los materiales disponibles para diferentes componentes del calzado.
- `MaterialTacon`: Enumera los materiales disponibles para los tacones del calzado.
- `Suela`: Enumera los tipos de suela disponibles.
- `TipoAlmohadilla`: Enumera los tipos de almohadillas que pueden incorporarse al calzado.
- `TipoCordon`: Enumera los tipos de cordones disponibles.

#### Paquete `ticket`
Proporciona una interfaz para generar boletines de información sobre las características del calzado construido.

- `Boletin`: Clase que contiene métodos para generar boletines informativos basados en las características del `Calzado`.

### Clase `Main`
Esta clase contiene el método `main` y es el punto de entrada al programa. Gestiona la interacción con el usuario, mostrando un menú y ejecutando acciones basadas en la selección del usuario.

## Funcionamiento del Patrón Builder en el Proyecto

El patrón Builder se implementa a través de la interfaz `Builder` y la clase concreta `CalzadoBuilder`. El `ClazadoBuilderDirector` utiliza estas abstracciones para definir la construcción de diferentes tipos de `Calzado`. La clase `Boletin` se utiliza para generar representaciones textuales del producto terminado, que en este caso es un `Calzado` personalizado.

### Ejemplo de Uso del Builder

1. Se instancia un `CalzadoBuilder`.
2. Se instancia un `ClazadoBuilderDirector`.
3. El director utiliza el builder para crear un calzado con un método específico, como `buildCalzadoCordon`.
4. El builder añade cada componente al `Calzado` paso a paso.
5. Una vez que todos los componentes están establecidos, se llama a `getCalsado()` para obtener el objeto `Calzado` construido.
6. Se puede generar un boletín del calzado utilizando la clase `Boletin`.

## Conclusión

El patrón Builder ha sido aplicado a este proyecto para facilitar la creación de objetos complejos de `Calzado` permitiendo la configuración detallada de sus características y componentes. El uso de enumeraciones proporciona un conjunto estandarizado de opciones para los atributos del calzado, lo que contribuye a la robustez del código.