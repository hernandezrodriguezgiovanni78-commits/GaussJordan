# Método de Gauss-Jordan en Java

## I. Explicación breve de la estructura modular del proyecto
El proyecto está dividido en tres clases independientes para mantener un diseño limpio y modular:
- **`defmatrizz.java`**: Contiene la definición y almacenamiento de la matriz aumentada [A | b].
- **`GaussJordan.java`**: Agrupa la lógica numérica, reutilizando la triangulación gaussiana y añadiendo la normalización de pivotes y el barrido superior para transformar la matriz en una matriz identidad.
- **`Lanzador_GaussJordan.java`**: Clase principal encargada de coordinar la ejecución del algoritmo y presentar los resultados en consola.

## II. Pasos para compilar y ejecutar el programa en Java
1. Clona o descarga este repositorio público en tu computadora.
2. Abre tu entorno de desarrollo favorito compatible con Java (como IntelliJ IDEA).
3. Asegúrate de incluir los tres archivos `.java` dentro del paquete principal del proyecto.
4. Ejecuta la clase **`Lanzador_GaussJordan.java`** haciendo clic en el botón de Run/Play.

## III. Ejemplo de prueba y salida por consola
### Código de ejecución / Entrada:
Matriz inicial de 3 x 4:
- Fila 1: `{ 3.0, -0.1, -0.2, 7.85 }`
- Fila 2: `{ 0.1, 7.0, -0.3, -19.3 }`
- Fila 3: `{ 0.3, -0.2, 10.0, 71.4 }`

### Salida por consola:
```text
Soluciones del sistema por el método de Gauss-Jordan:
x1 = 3.0
x2 = -2.5
x3 = 7.000000000000002
