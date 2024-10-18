# Proyecto-1 Cuatro en Línea y Gato (Tic-Tac-Toe)

Este proyecto contiene dos juegos clásicos implementados en Java:
- **Cuatro en Línea**: Un juego en el que dos jugadores se turnan para dejar caer fichas en una cuadrícula, con el objetivo de alinear cuatro fichas del mismo color.
- **Gato (Tic-Tac-Toe)**: Un juego en el que dos jugadores alternan turnos para marcar espacios en una cuadrícula 3x3, con el objetivo de conseguir tres marcas en línea (horizontal, vertical o diagonal).

## Requisitos previos

Para ejecutar este proyecto, necesitas tener instalado:
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) 8 o superior
- Un IDE como [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) o [Eclipse](https://www.eclipse.org/downloads/) (opcional, pero recomendado)

## Instrucciones de Instalación y Ejecución

1. **Clona este repositorio o descarga el código fuente.**
   
2. **Compilación**:
   - Si estás utilizando la línea de comandos, navega al directorio donde están los archivos `.java` y compílalos ejecutando:
     ```bash
     javac Main.java JuegoControlador.java CuatroEnLinea.java Gato2.java
     ```

3. **Ejecución**:
   - Una vez que los archivos se hayan compilado correctamente, ejecuta el archivo `Main.java` para iniciar el programa principal:
     ```bash
     java Main
     ```

4. **Uso del IDE**:
   - Si prefieres usar un entorno de desarrollo integrado (IDE) como IntelliJ o Eclipse, simplemente importa el proyecto como un nuevo proyecto de Java y ejecuta la clase `Main`.

## Cómo seleccionar y jugar ambos juegos

Al ejecutar el programa, el sistema te pedirá que selecciones uno de los dos juegos:
1. **Gato (Tic-Tac-Toe)**: Se juega en un tablero de 3x3. Dos jugadores alternan turnos para colocar 'X' o 'O' en el tablero, y el primero en alinear tres de sus marcas (horizontal, vertical o diagonalmente) gana el juego.
2. **Cuatro en Línea**: Se juega en una cuadrícula de 7x6. Los jugadores dejan caer fichas en las columnas, y el objetivo es formar una línea de cuatro fichas consecutivas, ya sea horizontal, vertical o diagonalmente.

Después de seleccionar el juego, sigue las instrucciones en pantalla para jugar.

## Otros detalles relevantes

- El proyecto es modular y está compuesto por diferentes clases que manejan la lógica de los juegos y el flujo general.
- Puedes modificar los tamaños de los tableros o las reglas específicas modificando las clases correspondientes.
- No se requiere conexión a internet para jugar.

¡Diviértete jugando!
"""