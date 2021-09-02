# Proyecto
Oscar Andres Moreno Coronado 1488970
David Rey Gomez Garza 1908925
Alef Benyamin Passos Silveira 1909332

# Plantamiento del problema


El dueño de una tienda de nombre Donkey's Place especialista en la venta de burritos, esta interesado en dar a conocer su menú al publico por medio de una aplicación. quiere que el publico pueda ver su variedad de alimentos (burritos, postre, complementos, bebidas) ademas del precio, promociones y comidas especiales inspiradas en la temática del mes.

El restaurante tiene varias sucursales en el país, ubicados estratégicamente para que todas las sucursales vendan el mismo menú al mismo precio.


## Objetivo
Nos encargaremos que la aplicación pueda mostrar el menú y todo lo especificado por el cliente (el dueño), para que el publico este al día del precio, especiales del mes y promociones.

## Sobre la aplicación

La aplicación deberá ser capaz de desplegar una interfaz amigable y fácil de entender para que los clientes interactúen con ella, puedan navegar entre las diferentes opciones y puedan ver con claridad la opción que mas les guste. 

El *menu* de la aplicación deberá mostrar las opciones:

 1.  **Comida** que se divide en burritos, complementos, postres , la comida temática y sus respectivos precios 
 2. **Promociones** mostrara las ofertas del mes
 

## Propuesta técnica

Vamos a describir las clases y atributos que utilizaremos
|Clase| Atributos| Descripción|
|--|--|--| 
| **Administrador** | Modificar el menú| Se encarga de cambiar un tipo de dato que este mal colocado o simplemente quiera hacer una mejora
| | Agregar Productos| Es necesario que podamos agregar la comida de temporada |
| | Borrar Productos| Eliminar elemento obsoletos y promociones caducadas|
|| Ver menú|El administrador debe tener la opción de ver el menú
 **Guest** | Ver menú|El publico solo tiene la opción de ver el menú
 |-|-|-
 |**Menú**| Nombre| El nombre por el cual se identifica el producto|
 ||Grupo|Se divide en comida, promociones, comida de temporada|
 ||Subgrupo| La comida se divide en postres, bebidas y platillos|
 ||Precio|El precio que cuesta cada producto, la promoción vigente y comida de temporada|

![image](https://user-images.githubusercontent.com/88564305/131584175-a0f036d5-a023-4268-a63d-43ccc102fa53.png)


