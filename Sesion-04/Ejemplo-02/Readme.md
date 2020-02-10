## Ejemplo 02: Método hashCode

### OBJETIVO

- Lo que esperamos que el alumno aprenda

#### REQUISITOS

1. Tener instalada la última versión del JDK 8.
2. Tener instalada la última versión de IntelliJ IDEA Community

#### DESARROLLO

1. En el IDE IntelliJ IDEA, crea un nuevo proyecto llamado **ejemplo2**.

2. Dentro del proyecto crea un nuevo paquete llamado **org.bedu.java.jse.basico.sesion4.ejemplo2**.

3. Dentro del paquete anterior crea una nueva clase llamada **Ejemplo2** y dentro de esta un método **main**.

4. Crea una clase **Automovil** que tenga los siguientes atributos: marca, modelo, año de fabricación y kilometraje; los dos primeros de tipo `String` y los dos últimos de tipo numérico:

```java
    public class Automovil {
        private String marca;
        private String modelo;
        private short anioFabricacion;
        private int kilometraje;
    }
```
 
5. Agrega un constructor que reciba un parémtro por cada uno de los tipos atributos de `Automovil`:

```java
    public Automovil(String marca, String modelo, short anioFabricacion, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
    }
```

6. Ahora, sobrescribiremos el método **hashCode**. Lo primero que debemos hacer es declararlo y colocarle la anotación **@Override**, la cual indica al compilador que tenemos la intención de sobrescribir dicho método:

```java
    @Override
    public int hashCode() {
    }
```

7. Posteriormente, en el cuerpo de `hashCode` colocaremos una variable local llamada **hash** que inicializamos con el valor **0**. Será esta variable donde coloquemos el valor final del hash que el método regresará:

```java
    int hash = 0;
```

![imagen](https://picsum.photos/200/300)


