## Reto 01: Conteo de vocales

### OBJETIVO 

- Reforzar los conocimientos de la sesión sobre lectura de información desde el teclado.
- Hacer uso de los conocimientos adquiridos en otras sesiones para completar correctamente el reto.

#### REQUISITOS 

1. Tener instalada la última versión del JDK 8.
2. Tener instalada la última versión de IntelliJ IDEA Community


#### DESARROLLO

Utilizando las herramientas aprendidas en clase, lee la entrada del usuario desde el teclado y muestra en pantalla el número de vocales que contiene el texto que haya escrito. 

Por ejemplo:

Hola Mundo: **4**

Curso de Java Standar Edition en Bedu: **14**

<details>
	<summary>Solución</summary>
	
1. En el IDE IntelliJ IDEA, crea un nuevo proyecto llamado **Vocales**.

2. Dentro del proyecto crea un nuevo paquete llamado **org.bedu.java.jse.basico.sesion3.reto1**.

3. Dentro del paquete anterior crea una nueva clase llamada **Vocales** y dentro de esta un método **main**.

4. Dentro del método main lo primero que hay que hacer, es crear una nueva instancia de la clase **Scanner** (o **Console**, dependiendo de qué quieras prácticar).

```java
	Scanner scanner = new Scanner(System.in);
```

5. Después, muestra el mensaje que indica al usuario que debe escribir la palabra a la cual se le contarán las vocales. 

```java
	System.out.print("Escribe la palabra que se analizará: ");
```

6. Ahora, leemos la palabra que el usuario ingrese para el conteo:

```java
	String palabra = scanner.nextLine();
```

7. Ahora, crea una variable que mantendrá el conteo de las vocales:

```java
	int conteoVocales = 0;
```

8. El siguiente paso es el más importante, en el que realizarás el conteo. Para eso, 

</details> 

![imagen](https://picsum.photos/200/300)

