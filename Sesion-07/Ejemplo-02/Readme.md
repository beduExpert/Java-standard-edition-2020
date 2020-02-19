## Ejemplo 02: Comparando personas

### OBJETIVO

- Implementar la interface **Comparator** para realizar el ordenamiento de objetos propios.
- Aprender la forma correcta de comparar valores numéricos.

#### REQUISITOS

1. Tener instalada la última versión del JDK 8.
2. Tener instalada la última versión de IntelliJ IDEA Community.

#### DESARROLLO

En este reto, implementaremos la interface **Comparator** para comparar objetos de tipo **Persona** y ordenarlos por estatura.

1. En el IDE IntelliJ IDEA, crea un nuevo proyecto llamado **Comparator**.

2. Dentro del proyecto crea un nuevo paquete llamado **org.bedu.java.jse.basico.sesion7.ejemplo2**.

3. Dentro del paquete anterior crea una nueva clase llamada **Comparator** y dentro de esta un método **main**.

4. Creamos una clase **Persona** con tres atributos, dos `String` que representen su ***nombre*** y ***apellido*** y un `float` que represente su ***estatura***. Agregamos también el correspondiente constructor y *getters*:
```java
	public class Persona {
	    private final String nombre;
	    private final String apellido;
	    private float estatura;

	    public Persona(String nombre, String apellido, float estatura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.estatura = estatura;
	    }

	    public String getNombre() {
		return nombre;
	    }

	    public float getEstatura() {
		return estatura;
	    }
	}
```
5. Haremos que **Persona** implemente la interface **Comparable**:

```java
	public class Persona implements Comparable<Persona> {
		@Override
		public int compareTo(Persona persona) {
		
		}
	}
```

6. En ejemplos anteriores implementamos la funcionalidad del método a través de una operación de resta; aunque esto funciona, puede ocurrir un error de desbordamiento de buffer si uno de los valores es muy grande o muy pequeño. Es por esto que las clases wrappers proporcionan la implementación un método llamado **compare**, el cual recibe dos valores y regregsa un valor entero, que cumple con el contrato de **compareTo**. Es por esto que es una buena práctica el uso de este método para realizar la comparación:
```java
    @Override
    public int compareTo(Persona persona) {
        return Float.compare(this.estatura, persona.estatura);
    }
```

![imagen](https://picsum.photos/200/300)


