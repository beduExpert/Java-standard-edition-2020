## Ejemplo 02: Clase propia

### OBJETIVO

- Aprender los elementos básicos de la declaración de una clase propia.
- Aplicar la creación de métodos que regresen valores booleanos, numéricos y Strings.

#### REQUISITOS

1. Tener instalada la última versión del JDK 8.
2. Tener instalada la última versión de IntelliJ IDEA Community


#### DESARROLLO

Usando una lógica similar a la del reto 1, crear una clase que indique cuántas vocales, consonantes, números y símbolos hay en una cadena ingresada por el usuario.

1. En el IDE IntelliJ IDEA, crea un nuevo proyecto llamado **Letras**.

2. Dentro del proyecto crea un nuevo paquete llamado **org.bedu.java.jse.basico.sesion3.ejemplo2**.

3. Dentro del paquete anterior crea una nueva clase llamada **Letras** y dentro de esta un método **main**. Esta clase será el punto de entrada de la aplicación, pero no en la que se ejecute la lógica principal de la aplicación.

4. Crea, también dentro del paquete, una nueva clase llamada **Lector** esta clase será la encargada de manejar la lectura de datos por parte del usuario. Inicialmente será un envoltorio para la clase **Scanner**, pero esto nos dará flexibilidad si más adelante decidimos usar alguna clase distinta para hacer dicha lectura. 

5. Dentro de la clase lector, comencemos declarando e instanciando un *atributo* de tipo **Scanner**:

```java
	private Scanner scanner = new Scanner(System.in);
```

6. Después, declaremos un *método* llamado **muestraMensaje** que recibirá como parámetro el mensaje a mostrar, como una variable de tipo **String** y no regresará ningún valor (**void**). Este método también nos sirve para encapsular la forma en la imprimimos este mensaje:

```java
	public void muestraMensaje(String mensaje){
        	System.out.print(mensaje);
    	}
```

7. Ahora, declaramos un método llamado **leeEntrada**, que no recibirá parámetros y regresará una **String**. Este método usará la instancia de **Scanner** para leer el texto ingresado por el usuario y regresarlo posteriormente:

```java
	public String leeEntrada(){
        	return scanner.nextLine();
    	}
```

con esto, terminamos la clase **Lector**.

![imagen](img/img_01.jpg)

