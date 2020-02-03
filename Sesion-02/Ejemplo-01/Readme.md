## Ejemplo 01: Declaración y asignación de valores a tipos primitivos.

### OBJETIVO

- Aprender las reglas dedeclaración y asignación de valores literales a tipos primitivos.

#### REQUISITOS
1. Tener instalada la última versión del JDK 8.
2. Tener instalada la última versión de IntelliJ IDEA Community


#### DESARROLLO

1. Crea un nuevo proyecto en IntelliJ IDEA, llamado **Primitivos**.

2. Dentro del proyecto crea un nuevo paquete llamado **org.bedu.java.jse.basico.sesion2.ejemplo1**.

3. Dentro del paquete anterior crea una nueva clase llamada **Primitivos** y dentro de esta un método **main**.

4. Dentro del método `main` iniciaremos declarando algunas variables primitivas, todas con el valor literal 1:

```java
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt = 1;
        long valorLong = 1L;

        float valorFloat = 1.5F;
        double valorDouble = 1.5;
```
	
**Nota:** Recuerda que en el caso de los valores **long** y **float** debemos usar los postfijos ***L*** y ***F*** respectívamente. Intenta colocar estos postfijos como minúsculas y ve qué ocurre; también, intenta eliminar estos postfijos para ver qué ocurre y responde ¿por qué ocurre esto?

5. Ahora, imprimiremos los valores de cada una de las variables.

```java 
	System.out.println("byte: " + valorByte);
        System.out.println("short: " + valorShort);
        System.out.println("int: " + valorInt);
        System.out.println("long: " + valorLong);

        System.out.println("float: " + valorFloat);
        System.out.println("double: " + valorDouble);
```	

6. Ahora, agregaremos una variable tipo `boolean` y otra tipo  `char` e imprimiremos sus valores en la consola.

```java
	boolean valorBoolean = true;
        char valorChar = 'B';
	System.out.println("boolean: " + valorBoolean);
        System.out.println("char: " + valorChar);
```

7. Ejecuta la aplicación y ve el resultado obtenido.

8. Ahora, haremos algunos casteos de tipos para ver qué ocurre. Declara la siguiente variable de tipo `float` y luego asígnala a una variable de tipo `int`.



![imagen](https://picsum.photos/200/300)


