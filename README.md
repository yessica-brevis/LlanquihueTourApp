#🧠 Evaluación Desarrollo Orientado a Objetos I – Semana 6

## 👤 Autor del proyecto

- **Nombre completo:** Yessica Ximena Brevis Garnica
- **Sección:** 008A
- **Carrera:** Analista Programador computacional
- **Sede:** Online

---

##📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación de la Semana 6 de la asignatura Desarrollo Orientado a Objetos I.

Consiste en un sistema desarrollado en Java para administrar distintos servicios turísticos ofrecidos por una agencia. El sistema permite crear y gestionar diferentes tipos de servicios turísticos, aplicando los principios fundamentales de la Programación Orientada a Objetos como herencia, encapsulamiento y polimorfismo.

Los servicios disponibles incluyen excursiones culturales, paseos lacustres y rutas gastronómicas, cada uno con características particulares.

🧱 Estructura general del proyecto
```plaintext

📁 src/
├── data/                           # Gestión de la colección de servicios turísticos.
│   └── GestorServicios.java        # Agrega, almacena y muestra los servicios.

├── model/                          # Clases del dominio.
│   ├── ServicioTuristico.java      # Clase base con la información común de todos los servicios (Super Clase).
│   ├── ExcursionCultural.java      # Hereda de ServicioTuristico y representa excursiones culturales.
│   ├── PaseoLacustre.java          # Hereda de ServicioTuristico y representa paseos por lagos.
│   └── RutaGastronomica.java       # Hereda de ServicioTuristico y representa rutas gastronómicas.

├── ui/                             # Interfaz de ejecución.
│   └── Main.java                   # Punto de entrada del programa.
````

##⚙️ Instrucciones para compilar y ejecutar

1.- Clonar o descargar el repositorio en boton `Code`

git clone
```bash
https://github.com/yessica-brevis/LlanquihueTourApp.git
```
2.- Abrir el proyecto en NetBeans.

3.- Compilar el proyecto.

4.- Ejecutar la clase `Main.java` ubicada en el paquete `ui`.

5-  Revisar la salida del programa en la consola.

📂 Repositorio GitHub:
https://github.com/yessica-brevis/LlanquihueTourApp.git


📅 Fecha de entrega
29/06/2026
