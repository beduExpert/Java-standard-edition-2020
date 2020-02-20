## Ejemplo 02: Manejo de archivos de texto.

### OBJETIVO

- Aprender a escribir archivos de texto plano.
- Aprender a leer archivos de texto plano.
- Aprender a hacer uso de Buffers para facilitar y hacer más eficiente el trabajo de lectura y escritura.

#### REQUISITOS

1. Tener instalada la última versión del JDK 8.
2. Tener instalada la última versión de IntelliJ IDEA Community.


#### DESARROLLO

En este ejemplo escribirás unas serie de cadenas de texto en un archivo de texto plano, y posteriormente leerás el contenido de ese mismo archivo. 

1. En el IDE IntelliJ IDEA, crea un nuevo proyecto llamado **Texto**.

2. Dentro del proyecto crea un nuevo paquete llamado **org.bedu.java.jse.basico.sesion8.ejemplo2**.

3. Dentro del paquete anterior crea una nueva clase llamada **Texto** y dentro de esta un método **main**.

4. En el método **main** crea una nueva instancia de **FileWriter** pasando el siguiente parámetro a su constructor:
```java
	System.getProperty("user.home") + "archivo.txt")
```

`System.getProperty` es una forma que tiene Java de leer propiedades, o valores que puede establecer el usuario, el sistema operativo o la máquina virtual. `"user.home"` hace referencia al directorio raíz del usuario con el que se está ejecutando la aplicación. Con esto lograremos que generar un nuevo archivo en el directorio raíz del usuario que estás usando.

5. Crea una nueva instancia de **BufferedWriter**, usando en su constructor la instancia de **FileWriter** creada hace un momento. No es necesario declarar dos variables, todos los pasos anteiores pueden encadenarse, de la siguiente forma:
```java
	BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "archivo.txt"));
```

![imagen](https://picsum.photos/200/300)


