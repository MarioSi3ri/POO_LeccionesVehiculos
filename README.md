# 🚗 POO — Lecciones de Vehículos

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 17">
  <img src="https://img.shields.io/badge/IntelliJ%20IDEA-compatible-purple?style=for-the-badge&logo=intellijidea&logoColor=white" alt="IntelliJ IDEA">
  <img src="https://img.shields.io/badge/Paradigma-POO-blue?style=for-the-badge" alt="Programación Orientada a Objetos">
</p>

<p align="center">
  Proyecto académico de <strong>Programación Orientada a Objetos</strong> enfocado en clases, atributos, métodos, encapsulamiento, constructores y sobrecarga en Java.
</p>

---

## 📌 ¿De qué trata?

**POO — Lecciones de Vehículos** es un proyecto educativo desarrollado para practicar los fundamentos de la Programación Orientada a Objetos mediante ejemplos sencillos y fáciles de extender.

El proyecto presenta dos clases principales:

- **`Vehiculos`**: modela las características básicas de un vehículo, como el tipo y el número de llantas, además de incluir un comportamiento para arrancar.
- **`Matematicas`**: demuestra el uso de constructores y la sobrecarga del método `multiplicar`.
- **`Test`**: funciona como punto de entrada para crear objetos, asignar valores y ejecutar los métodos de las clases.

Este ejercicio corresponde a una práctica académica de UVEG relacionada con clases y métodos aplicados a características de vehículos.

## 🎯 Objetivos de aprendizaje

- Comprender la estructura básica de una clase en Java.
- Crear objetos a partir de una clase.
- Trabajar con atributos y métodos.
- Aplicar encapsulamiento mediante modificadores de acceso.
- Utilizar métodos `get` y `set` para consultar y modificar atributos.
- Implementar constructores con y sin parámetros.
- Practicar la sobrecarga de métodos.
- Ejecutar un programa Java desde un método `main`.

## 🧰 Tecnologías utilizadas

- **Java 17**
- **IntelliJ IDEA** — configuración incluida para trabajar con el proyecto.
- **JDK 17** — versión configurada en los archivos del proyecto.
- **Git** — control de versiones.

> El repositorio no utiliza Maven ni Gradle. La compilación se puede realizar directamente con el JDK o mediante IntelliJ IDEA.

## 📂 Estructura del proyecto

```text
POO_LeccionesVehiculos/
├── .idea/                                      # Configuración del proyecto en IntelliJ IDEA
├── Vehiculos/
│   ├── .idea/                                  # Configuración específica del módulo
│   ├── src/
│   │   └── main/
│   │       └── java/
│   │           └── com/si3ri/lecciones/
│   │               ├── Matematicas.java       # Constructores y sobrecarga de métodos
│   │               ├── Test.java              # Punto de entrada y demostración
│   │               └── Vehiculos.java         # Clase de ejemplo sobre vehículos
│   ├── .gitignore
│   └── Vehiculos.iml                           # Módulo de IntelliJ IDEA
└── README.md
```

## 🧱 Conceptos de POO implementados

### Clase `Vehiculos`

La clase `Vehiculos` contiene los atributos privados:

- `noLlantas`: número de llantas del vehículo.
- `tipoVehiculo`: descripción o tipo de vehículo.

Para trabajar con estos atributos se utilizan métodos de acceso:

- `setNoLlantas(int noLlantas)` y `getNoLlantas()`.
- `setTipoVehiculo(String tipoVehiculo)` y `getTipoVehiculo()`.

También incluye el método público `Arrancar()`, que muestra un mensaje en consola. El método privado `Encender()` sirve como ejemplo de un comportamiento restringido dentro de la clase.

### Clase `Matematicas`

La clase `Matematicas` muestra diferentes formas de inicializar y utilizar un objeto:

- Constructor sin parámetros, con valores iniciales `2` y `5`.
- Constructor parametrizado para recibir dos números.
- Método `multiplicar()` sin argumentos.
- Método `multiplicar(int numero2)` con un parámetro.
- Método `multiplicar(int numero2, String mensaje)` con un mensaje adicional.

Estos métodos tienen el mismo nombre, pero diferentes parámetros, lo que permite practicar **sobrecarga de métodos**.

## ⚙️ Requisitos previos

Antes de ejecutar el proyecto, asegúrate de contar con:

- **JDK 17** o una versión compatible.
- **Git**, si deseas clonar el repositorio.
- Opcionalmente, **IntelliJ IDEA** para abrir la configuración del proyecto.

Puedes comprobar la instalación de Java con:

```bash
java -version
javac -version
```

## 🚀 Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/MarioSi3ri/POO_LeccionesVehiculos.git
cd POO_LeccionesVehiculos
```

### 2. Abrir el proyecto en IntelliJ IDEA — opción recomendada

1. Abre **IntelliJ IDEA**.
2. Selecciona **Open** o **Open Project**.
3. Elige la carpeta clonada `POO_LeccionesVehiculos`.
4. Verifica que el proyecto utilice **JDK 17**.
5. Abre el archivo `Vehiculos/src/main/java/com/si3ri/lecciones/Test.java`.
6. Ejecuta el método `main` mediante el botón **Run**.

## ▶️ Uso desde la terminal

Como el proyecto no incluye un sistema de construcción como Maven o Gradle, puedes compilarlo directamente con `javac`.

Desde la raíz del repositorio, ejecuta:

```bash
mkdir -p out
javac -d out $(find Vehiculos/src/main/java -name "*.java")
java -cp out main.java.com.si3ri.lecciones.Test
```

En Windows PowerShell, puedes compilar los archivos con:

```powershell
New-Item -ItemType Directory -Force out
javac -d out (Get-ChildItem -Recurse -Filter *.java Vehiculos/src/main/java | ForEach-Object { $_.FullName })
java -cp out main.java.com.si3ri.lecciones.Test
```

> El nombre completo de la clase ejecutable es `main.java.com.si3ri.lecciones.Test`, de acuerdo con la declaración `package` utilizada en los archivos fuente.

## 🖥️ Salida esperada

Al ejecutar el programa, se muestran mensajes relacionados con el arranque del vehículo, sus propiedades y los resultados de las multiplicaciones:

```text
Estoy Arrancando...
Motocicleta
2
Su resultado es: 
10
Su resultado es: 
20
```

## 🧪 Pruebas y experimentación

El archivo `Test.java` puede utilizarse como escenario de prueba manual. Puedes modificarlo para experimentar con diferentes objetos y valores, por ejemplo:

- Crear un vehículo con otro tipo, como `Automóvil` o `Camión`.
- Cambiar el número de llantas.
- Crear objetos `Matematicas` con diferentes constructores.
- Probar cada una de las versiones sobrecargadas de `multiplicar`.
- Agregar nuevas propiedades o comportamientos a `Vehiculos`.

## 🔮 Posibles mejoras

- Renombrar la clase `Vehiculos` a `Vehiculo` si se desea representar una sola entidad.
- Seguir la convención de nombres de Java utilizando camelCase, por ejemplo `arrancar()` y `encender()`.
- Agregar constructores y validaciones a la clase `Vehiculos`.
- Crear clases especializadas como `Motocicleta`, `Automovil` y `Camion`.
- Aplicar herencia, polimorfismo, interfaces y clases abstractas.
- Incorporar pruebas automatizadas con JUnit.
- Añadir Maven o Gradle para facilitar la compilación y gestión del proyecto.
- Separar el código de demostración de las clases del dominio.

## 🤝 Contribuciones

Las contribuciones son bienvenidas y pueden servir para ampliar el material de aprendizaje.

1. Realiza un fork del repositorio.
2. Crea una rama para tu mejora:

   ```bash
   git checkout -b mejora/nueva-funcionalidad
   ```

3. Realiza tus cambios y documenta el comportamiento agregado.
4. Confirma los cambios:

   ```bash
   git commit -m "Agrega nueva funcionalidad al ejemplo de vehiculos"
   ```

5. Envía la rama a tu fork y abre un Pull Request.

## 📄 Licencia

Este repositorio no incluye actualmente un archivo de licencia. Si deseas reutilizar, modificar o distribuir el código fuera de un contexto académico, consulta con el autor o solicita la incorporación de una licencia explícita.

## 👤 Autor

**Mario Sierra Neri**

- GitHub: [@MarioSi3ri](https://github.com/MarioSi3ri)
- Repositorio: [POO_LeccionesVehiculos](https://github.com/MarioSi3ri/POO_LeccionesVehiculos)

---

<p align="center">
  Hecho con ☕ y Java para practicar Programación Orientada a Objetos.
</p>
