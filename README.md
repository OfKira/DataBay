# DataBay
Proyecto DataBay - Pilas, Colas, Matrices y Arreglos

## 📊 Explicación del sistema y diagrama

El sistema DataBay representa el proceso de manejo de contenedores en un puerto utilizando estructuras de datos.

Primero, los contenedores se registran en el manifiesto, usando un arreglo donde se almacenan y se calcula el peso total.

Luego, se trasladan al patio, representado con una matriz, donde se ubican en el primer espacio disponible recorriendo filas y columnas.

Después, los contenedores con mayor prioridad pasan a inspección, donde se usa una cola (FIFO), es decir, el primero en entrar es el primero en salir.

Finalmente, los contenedores se cargan en el buque, usando una pila (LIFO), donde el último en entrar es el primero en salir.

Además, se implementa una pila auxiliar que permite retirar un contenedor desde el fondo sin alterar el orden de los demás.

📌 Diagrama

A continuación, se incluye el diagrama que representa el funcionamiento del sistema:

- Diagrama general del sistema: muestra el flujo de los contenedores entre cada estructura de datos.
<img width="2088" height="2524" alt="diagram" src="https://github.com/user-attachments/assets/8623e411-c5bf-49bf-8320-c824c563b7ca" />

📦 Descripción del funcionamiento

El taller simula cómo se mueven los contenedores en un puerto. Primero se registran en una lista, luego se organizan en un patio (matriz). Después, algunos pasan a una fila de inspección (cola) donde se atienden en orden de llegada. Finalmente, se cargan en el buque usando una pila, donde el último en entrar es el primero en salir.

<img width="1107" height="780" alt="Captura de pantalla 2026-04-15 172912" src="https://github.com/user-attachments/assets/90f2aa41-b8cd-4226-b3da-01775efd1fd2" />
<img width="1106" height="816" alt="Captura de pantalla 2026-04-15 173001" src="https://github.com/user-attachments/assets/67da0b6c-8755-4b0c-8080-85bb34dbc677" />


