
## Ejemplo 02: Uso de switch

### OBJETIVO

- Aprender el uso de la sentencia switch, usando casos de tipo numérico y String.

#### REQUISITOS
1. Tener instalada la última versión del JDK 8.
2. Tener instalada la última versión de IntelliJ IDEA Community


#### DESARROLLO

Usando sentencias switch, crea un proyecto que felicite al alumno dependiendo de su calificación. 

Posteriormente, crea otra aplicación que diga cuáles meses faltan para terminar el año.

1. En el IDE IntelliJ IDEA, crea un nuevo proyecto llamado **Switch**.

2. Dentro del proyecto crea un nuevo paquete llamado **org.bedu.java.jse.basico.sesion2.ejemplo2**.

3. Dentro del paquete anterior crea una nueva clase llamada **Switch** y dentro de esta un método **main**.

4. Dentro del método main iniciaremos declarando una sentencia switch, el cual debe cumplir con las siguientes condiciones:
	a) Si la calificación es igual a **10** el mensaje debe ser: "**¡Excellente!**".
	b) Si la calificación es **9** u **8** el mensaje debe ser: **¡Muy bien!**.
	c) Si la calificación es **7** el mensaje debe ser: **Bien hecho**.
	d) Si la calificación es **6** el mensaje debe ser: **Pasaste**.
	e) Si la calificación es menor a **5** el mensaje debe ser: **Mejor vuelve a intentarlo**.
	
5. Primero, declararemos una variable de tipo **String** que almacenará el mensaje que se mostrará.

```java
String mensaje;
```

6. Después, una variable que será en la que pondremos la calificación, la cual en este momento no tendrá ningún valor, como la calificación sólo tendrá valores entre 0 y 10 usaremos una variable de tipo **byte**:

```java
byte calificacion;
```

7. Agregaremos la instrucción `switch`. En este caso la variable cuyo valor probaremos será **calificacion**, por lo que iniciamos la instrucción de la siguiente forma:
```java
switch(calificacion) {
}
```

8. Dentro de cada uno de los `case` asignaremos un valor a **mensaje** dependiendo de la calificación obtenida. En primer lugar, iniciaremos con la calificación de **10**:

```java
	case 10:
		mensaje = "¡Excelente!";
                break;
```

9. Después, colocaremos los casos para las calificaciones de **9** y **8**; ya que ambos mostrarán el mismo mensaje, podemos colocar dos `case`, uno seguido del otro, y posteriormente realizar la asignación del mensaje:

```java
	case 9:
        case 8:
                mensaje = "¡Muy bien!";
                break;

```

10. Los siguientes casos, para el **7** y el **6** son idénticos al caso del **10**, probamos los valores individuales y asignámos el mensaje correspondiente:

```java
            case 7:
                mensaje = "Bien hecho";
                break;
            case 6:
                mensaje = "Pasaste";
                break;
```

11. Para terminar, con los valores del **5** al **0** podemos usar la instrucción **default**, que es como decir: "En cualquier otro caso, ejecuta estas instrucciones". Lo colocaremos de la siguiente forma:

```java
	default :
                mensaje = "Mejor vuelve a intentarlo";
```

La instrucción **switch** completa debe verse de la siguiente forma:

 ```java
 	switch(calificacion) {
            case 10:
                mensaje = "¡Excelente!";
                break;
            case 9:
            case 8:
                mensaje = "¡Muy bien!";
                break;
            case 7:
                mensaje = "Bien hecho";
                break;
            case 6:
                mensaje = "Pasaste";
                break;
            default :
                mensaje = "Mejor vuelve a intentarlo";
        }
 ```

Nota que en cada `case` hemos puesto una instrucción **break** que indica que se termina la ejecución de ese `case`.

12. Ahora, mostraremos un mensaje que nos diga cuál es la calificación y el mensaje que le daremos al alumno, de la siguiente forma:

```java
	System.out.println("Tu calificación es " + calificacion + ". " + mensaje);
```
En la última sesión veremos cómo podemos mejorar el formato de la instrucción anterior para que sea más clara y fácil de programar.

13. Asigna un valor a la variable **calificacion** para comprobar que el mensaje se muestra de forma correcta.

![imagen](img/img_01.jpg)

**Nota:** Hay un problema con el switch anterior, y es que acepta valores negativos y mayores a 10. ¿Puedes corregirlo para que solo acepte valores entre 0 y 10?.


14. Ahora, crearemos el segundo switch del ejercicio, en el que mostraremos los meses que hacen falta para terminar el año. Comencemos creando una variable que tendrá el nombre del mes actual:

```java
String mesActual = "junio";
```

15. El **switch** probará el valor de la variable `mesActual`, de esta forma:

