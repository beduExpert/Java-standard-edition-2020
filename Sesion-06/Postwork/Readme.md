## Postwork 06: Listas de Tareas.

### OBJETIVO

- Manejar objetos propios dentro de listas.
- Aprender a actualizar y eliminar elementos dentro de una lista.
- Hacer uso de lo aprendido en la sesión con respecto al trabajo con el framework Collections.

#### REQUISITOS

1. El avance del postwork de la sesión 05.

#### DESARROLLO

En este postwork comenzarás a usar la clase **java.util.List** para crear nuevas listas de tareas, agregando, recorriendo y eliminando elementos dentro de la misma.

En este postwork trabajaremos con las clases **ListaTareas** y **ListasTareas**.

<details>
        <summary>Solución</summary>
        
1. En la clase **ListaTareas** agrega un nuevo atributo de tipo **List<Tarea>**, este te permitirá mantener agrupadas un conjunto de tareas relacioandas, las cuales pueden ser tareas de una materia, pendientes de un fin de semana, pasos de una receta de cocina, etc.
        
Declara a inicializa esta lista, de la siguiente forma:
```java
        private final List<Tarea> tareas = new ArrayList<>();
```

2. Dentro de esta misma clase, agrega un nuevo método llamado ***agregaTarea***, que permitirá agregar una nueva `Tarea` a la lista anterior; este método no regresará nada, pero recibirá como parámetro la `Tarea` para agregar.
```java
    public void agregaTarea(Tarea tarea){
        tareas.add(tarea);
    }
```

3. Agrega también un método que permita eliminar una `Tarea` de la lista. El método deberá recibir el índice o posición de la `Tarea` que se debe eliminar de la lista. Como es posible que el usuario introduzca un índice mayor al número de elementos en la lista, valida que el índice sea menor al número de elementos de la lista. Si el número es mayor, muestra un mensaje de error y regresa un valor ***null***; si el número es menor elimina el elemento y regresa el elemento eliminado.

```java
    public Tarea eliminaTarea(int indice){
        if(indice > tareas.size()){
            System.out.println("La tarea indicada no se encuentra en la lista.");
            return null;
        }

        return tareas.remove(indice);
    }
```

4. Agrega también un método que permita obtener la lista de tareas (un *getter*) y otro que permita obtener el número de tareas que actualmente están en la lista.

```java
    public List<Tarea> getTareas() {
        return tareas;
    }

    public int numeroTareas(){
        return tareas.size();
    }
```

5. Para terminar, agrega un método que imprima el nombre de todas las tareas que se encuentran en la lista. Este método debe mostrar el índice de la tarea y su nombre. El índice será el valor al que posteriormente hará referencia al usuario para referirse a esa tarea:

```java
    public void muestraTareas(){
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i+1) + " - " + tareas.get(i).getNombre());
        }
    }
```

</details>


![imagen](https://picsum.photos/200/300)


