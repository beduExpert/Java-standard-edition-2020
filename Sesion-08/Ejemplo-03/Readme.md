## Ejemplo 03: Formateo de información.

### OBJETIVO

- Aprender a dar formato a tipos de datos de texto numérico y fechas para mostrar al usuario.
- Practicar el uso de los métodos ***printf*** y ***String.format*** para dar formato a la información.
- Hacer uso de distintas banderas de formato.

#### REQUISITOS

1. Tener instalada la última versión del JDK 8.
2. Tener instalada la última versión de IntelliJ IDEA Community.


#### DESARROLLO

En este reto usarás distintas banderas y modificadores de formato para cambiar la forma en la que se muestra información al usuario en consola.

1. En el IDE IntelliJ IDEA, crea un nuevo proyecto llamado **Formato**.

2. Dentro del proyecto crea un nuevo paquete llamado **org.bedu.java.jse.basico.sesion8.ejemplo3**.

3. Dentro del paquete anterior crea una nueva clase llamada **Formato** y dentro de esta un método **main**.

4. Dentro del método **main** vamos a definir cuatro constantes, que será la información que mostraremos el ususario:
```java
 	final String NOMBRE = "Beto";
        final int EDAD = 23;
        final float PROMEDIO = 8.4F;
        final LocalDate FECHA_NACIMIENTO = LocalDate.of(1996, Month.FEBRUARY, 21);
```

5. Si quisiéramos mostrar esta información al usuario como lo hemos hecho hasta ahora, tendríamos que concatenar cada una de las constantes anteriores a una serie de cadenas fijas, de la siguiente forma:
```java
	System.out.println("Mi nombre es " + NOMBRE + ", tengo " + EDAD + " años, mi promedio es de " + PROMEDIO + " y nací el día " + FECHA_NACIMIENTO);
```

![imagen](https://picsum.photos/200/300)


