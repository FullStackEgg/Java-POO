#  :white_medium_small_square: *COLECCIONES EN JAVA* ☕

Una colección representa un grupo de objetos. Esto objetos son conocidos como
elementos. Cuando queremos trabajar con un conjunto de elementos, necesitamos un
almacén donde poder guardarlos. Las colecciones nos dan la opción de almacenar
cualquier tipo de objeto, esto incluye los objetos de tipo de datos. Por lo que, para crear una
colección de un tipo de dato, no podremos usar los datos primitivos de los tipos de datos,
sino sus objetos. Por ejemplo: en vez de int, hay que utilizar Integer.

### Listas:
Las listas modelan una colección de objetos ordenados por posición. La principal diferencia
entre las listas y los arreglos tradicionales, es que la lista crece de manera dinámica a medida
que se van agregando objetos.

* **ArrayList**: se implementa como un arreglo de tamaño variable. A medida que se agregan
más elementos, su tamaño aumenta dinámicamente. Es el tipo más común.
Ejemplo de un ArrayList de numeros:

```java
ArrayList<Integer> numeros = new ArrayList();
```

* **LinkedList**: se implementa como una [lista de doble enlace](https://www.deltapci.com/java-listas-doblemente-enlazadas/). Su rendimiento al agregar y
quitar es mejor que Arraylist, pero peor en los métodos set y get.
Ejemplo de una LinkedList de numeros:

```java
LinkedList<Integer> numeros = new LinkedList();
```

## :white_medium_small_square: *CONJUNTOS EN JAVA* 

Los conjuntos modelan una colección de objetos de una misma clase donde cada elemento
aparece sólo una vez, no puede tener duplicados, a diferencia de una lista donde los
elementos podían repetirse.

* **HashSet**, se implementa utilizando una [tabla hash](https://latam.kaspersky.com/blog/que-es-un-hash-y-como-funciona/2806/#:~:text=10%20Abr%202014-,Una%20funci%EF%BF%B3n%20criptogr%EF%BF%A1fica%20hash-%20usualmente%20conocida%20como%20) para darle un valor único a cada
elemento y de esa manera evitar los duplicados. Los métodos de agregar y eliminar
tienen una complejidad de tiempo constante por lo que tienen mejor performance que
el Treeset.
Ejemplo de un HashSet de cadenas:

```java
HashSet<String> nombres = new HashSet();
```

* **TreeSet** se implementa utilizando una estructura de árbol (árbol rojo-negro en el libro de
algoritmos). La gran diferencia entre el HashSet y el TreeSet, es que el TreeSet mantiene
todos sus elementos de manera ordenada(forma ascendente), pero los métodos de
agregar, eliminar son más lentos que el HashSet ya que cada vez que le entra un
elemento debe posicionarlo para que quede ordenado.
Ejemplo de un TreeSet de numeros:

```java
TreeSet<Integer> numeros = new TreeSet();
```

* **LinkedHashSet** está entre HashSet y TreeSet. Se implementa como una tabla hash con
una lista vinculada que se ejecuta a través de ella, por lo que proporciona el orden de
inserción.
Ejemplo de un LinkedHashSet de cadenas:

```java
LinkedHashSet<String> frases = new LinkedHashSet();
```

##  :white_medium_small_square: *MAPAS EN JAVA*

Los mapas modelan un objeto a través de una llave y un valor. Esto significa que cada valor
de nuestro mapa, va a tener una llave única para representar dicho valor. Las llaves de
nuestro mapa no pueden repetirse, pero los valores sí. Un ejemplo seria una persona que
tiene su dni/rut (llave única) y como valor puede ser su nombre completo, puede haber dos
personas con el mismo nombre, pero distinto dni/rut.

* **HashMap** es un mapa implementado a través de una tabla hash, las llaves se almacenan
utilizando un algoritmo de hash para las llaves y evitar que se repitan.
Ejemplo de un HashMap de personas:

```java
HashMap<Integer,String> personas = new HashMap();
```

* **TreeMap** es un mapa que ordena los elementos de manera ascendente a través de las
llaves.
Ejemplo de un TreeMap de personas:

```java
TreeMap<Integer,String> personas = new TreeMap();
```

* **LinkedHashMap** es un HashMap que conserva el orden de inserción.
Ejemplo de un TreeMap de personas:

```java
LinkedHashMap<Integer,String> personas = new LinkedHashMap();
```

##  :white_medium_small_square: *AÑADIR UN ELEMENTO A UNA COLECCIÓN*

Las colecciones constan con funciones para realizar distintas operaciones, en este caso si
queremos añadir un elemento a las listas o sets vamos a tener que utilizar la función add(T),
pero para los mapas vamos a utilizar la función put(llave,valor).

**Listas:**
```java
ArrayList<Integer> numeros = new ArrayList();
int num = 20;
numeros.add(num);
```

**Conjuntos:**
```java
HashSet<Integer> numeros = new HashSet();
int num = 20;
numeros.add(20);
```

**Mapas:**
```java
HashMap<Integer, String> alumnos = new HashMap();
int dni = 34576189;
String nombreAlumno = “Pepe”
alumnos.put(dni, nombreAlumno);
```

##  :white_medium_small_square: *RECORRER UNA COLECCIÓN*
Si quisiéramos mostrar todos los elementos que le hemos agregado y que componen
nuestra colección vamos a tener que recorrerla.
Para recorrer una colección, vamos a tener que utilizar el bucle forEach. 
```java
for ( Tipo de dato variable : Colección){
}
```
El bucle comienza con la palabra clave for al igual que un bucle for normal. En lugar de declarar e inicializar
una variable contador del bucle, declara una variable vacia que es del mismo tipo que la
colección, seguido de dos puntos y seguido del nombre de la colección. La variable recibe
en cada iteración un elemento de la colección, de esa manera si nosotros mostramos esa
variable, podemos mostrar todos los elementos de nuestra colección.

**Listas:**
```java
ArrayList<String> lista = new ArrayList();

for (String cadena : lista) {
    System.out.println(cadena); // mostramos los elementos a traves de la variable
}
```

**Conjuntos:**
```java
HashSet<Integer> numerosSet = new HashSet();

for (Integer numero : numerosSet) {
    System.out.println(numero); // mostramos los elementos a traves de la variable
}
```

**Mapas:**
```java
HashMap<Integer, String> estudiantes = new HashMap();

// Recorrer las dos partes del mapa
for (Map.Entry<Integer, String> entry : estudiantes.entrySet()) {
    System.out.println("documento=" + entry.getKey() + ", nombre=" +
                        entry.getValue());
    // entry.getKey trae la llave y entry.getValue trae los valores del mapa
}

// Mostrar solo las llaves
for (Integer dni : estudiantes.keySet()) {
    System.out.println("Documento = " + dni);
}

// Mostrar solo los valores
for (String nombres : estudiantes.values()) {
    System.out.println("Nombre: " + nombres);
}
```
##  :white_medium_small_square: *ITERATOR*
El Iterator es una interfaz que pertenece al framework de colecciones. Este, nos permite
recorrer, acceder a la información y eliminar algún elemento de una colección. Ya que,
cuando queremos eliminar algún elemento, mediante el for each, nos va a tirar un error.
Gracias a que el Iterator es parte de el framework de colecciones, todas las colecciones
vienen con un metodo iterator(), este devuelve un iterador para recorrer esa colección,
este iterador que devuelve la colección, lo recibe el objeto iterator y nos deja iterar sobre
nuestra colección.

Para poder usar el Iterator es importante crear el objeto de tipo Iterator, con el mismo tipo
de dato que nuestra colección.

El iterator contiene tres metodos muy utiles para lograr esto:
* **boolean hasNext():** Retorna verdadero si al iterator le quedan elementos por
iterar.

* **Object next():** Devuelve el siguiente elemento en la coleccion, mientras le
metodo hasNext() retorne true. Este metodo es el que nos sirve para mostrar el
elemento.

* **void remove():** Elimina el elemento actual de la colección.

**Ejemplo:**
```java
    ArrayList<String> lista = new ArrayList<String>();
    lista.add("A");
    lista.add("B");
    
    // Iterator para recorrer la lista
    Iterator iterator = lista.iterator(); // Devolvemos el iterador
    System.out.println("Elementos de la lista : ");
    
    // Usamos un while para recorrer la lista, siempre que el hasnext() devuelva true.
    while (iterator.hasNext()) {
        // Mostramos los elementos con el iterator.next()
        System.out.print(iterator.next() + " ");
        System.out.println();
    }
```

##  :white_medium_small_square: *ELIMINAR UN ELEMENTO DE UNA COLECCIÓN*
Como pudimos ver más arriba para eliminar un elemento de una colección vamos a tener
que utilizar la funcion remove() del Iterator, esto se aplica para el resto de nuestras
colecciones. Para los mapas, vamos a utilizar el Map. Entry para usar con el iterator.
Ademas, podemos eligir sobre si queremos preguntar por la llave o por el valor, para
validar que elemento eliminar.

**Conjuntos:**
```java
    HashSet<Integer> numerosSet = new HashSet();
    Iterator<Integer> it = hashEnteros.iterator();
    
    while (it.hasNext()) {
        if (it.next() == 3) { // Borramos si está el numero 3
            it.remove();
        }
    }
```

**Mapas:**
Con los mapas vamos a tener que usar el remove propio de los Mapas pero no podemos
recorrerlos, este remove, solo sirve para eliminar elementos del mapa según su llave.
```java
    HashMap<Integer, String> estudiantes = new HashMap();
    Int llaveABorrar = 123;
    
    estudiantes.remove(llaveABorrar)
}
```
