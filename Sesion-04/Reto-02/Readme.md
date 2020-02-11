## Reto 02: Método equals

### OBJETIVO 

- Aprender a sobrescribir el método equals

#### REQUISITOS 

1. Tener instalada la última versión del JDK 8.
2. Tener instalada la última versión de IntelliJ IDEA Community

#### DESARROLLO

En este reto, sobrescribiras los métodos para las clases creadas en el reto 2 de la sesión 3: `Combustible`, `Llanta` y `Vehiculo`.

En cada una de las clases deberás revisar:

- Si los dos objetos comparados son el mismo (==), entonces sabemos que son iguales.
- Si el objeto que se compara es nulo, o es de una clase distinta, entonces sabemos que los objetos son iguales.
- Si ninguna de las dos condiciones anteriores se cumple, debemos comparar los valores de todos sus atributos, si todos son iguales podemos decir que los dos objetos son iguales.

<details>
	<summary>Solución</summary>
	
1. En el IDE IntelliJ IDEA, crea un nuevo proyecto llamado **reto2**.

2. Dentro del proyecto crea un nuevo paquete llamado **org.bedu.java.jse.basico.sesion4.reto2**.

3. Dentro del paquete anterior crea una nueva clase llamada **Reto2** y dentro de esta un método **main**.

4. Copia las clases del `Reto 2` de la `Sesión 3`. Comienza con la clase **Combustible** realizando una sobrescritura de equals como la siguiente:

```java
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Combustible that = (Combustible) o;

        if (litrosMaximos != that.litrosMaximos) return false;
        return litrosActuales == that.litrosActuales;
    }
```

en esto caso estamos comparando al final los valores de los atributos **litrosMaximos** y **litrosActuales**.

5. Continua con la clase **Llanta**, sobrescribiendo `equals` de la siguiente forma:

```java
	    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Llanta llanta = (Llanta) o;

        if (Float.compare(llanta.ancho, ancho) != 0) return false;
        if (Float.compare(llanta.diametro, diametro) != 0) return false;
        return Float.compare(llanta.presion, presion) == 0;
    }
```

en este caso, estamo usando la función `compare` del wrapper `Float`, pero también puede hacerse directamente la comparación.

6. A continuación, sobrescribe el método de **Vehiculo**, este podría parecer complicado puesto que tenemos un objeto de tipo `Combustible` y un arreglo de 4 `Llanta`s; sin embargo, como ya hemos sobrescrito los métodos de estas clases el trabajo se simplifica mucho, ya que podemos aprovecharlos:

```java
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehiculo vehiculo = (Vehiculo) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(llantas, vehiculo.llantas)) return false;
        return combustible.equals(vehiculo.combustible);
    }
```

en este caso, en vez de comparar a mano cada una de las llantas, usamos el método **Arrays.equals**, que se encarga de revisar si todos los elementos en ambos arreglos son iguales.

7. Para terminar, 

</details> 

![imagen](https://picsum.photos/200/300)

