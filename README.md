# *PARADIGMA ORIENTADO A OBJETOS - JAVA*  :coffee:

_Compendio de ejercicios de la guia 6.0 ( POO JAVA )._

Cada uno de los ejercicios se subirá en un folder correspondiente con el nombre "Ejercicio_#". Dicho folder solo contendrá las clases usadas para la solución planteada al problema de cada ejercicio, NO el proyecto completo. Si se desea recrear el proyecto, y se descargan los archivos, se deberán crear manualmente los packages correspondientes a cada una de las clases.

Nota: La finalidad de este repositorio es brindar una posible solución a cada uno de los ejercicios planteados y servir de comparación con c/u de sus soluciones.

## :white_medium_small_square: *ELEMENTOS DE UNA CLASE*
Una clase describe un tipo de objetos con características comunes. Es necesario definir la
información que almacena el objeto y su comportamiento.

### ATRIBUTOS
El estado o información de un objeto se almacena en atributos. Los atributos pueden ser de
tipos primitivos de Java o del tipo de otros objetos. La
declaración de un atributo de un objeto tiene la siguiente forma:
```java
<modificador> <tipo> <nombre> [ = <valor inicial> ];
```

### CONSTRUCTORES
Toda clase debe definir un método especial denominado
constructor para instanciar los objetos de la clase. Este método tiene el mismo nombre de
la clase. La declaración básica toma la siguiente forma:
```java
[<modificador>] <nombre de clase> ( <argumento> ) {
        <sentencia>
}
```

### MÉTODOS
Los métodos son funciones que determinan el comportamiento de los objetos. Un objeto se
comporta de una u otra forma dependiendo de los métodos de la clase a la que pertenece.
Para definir los métodos, el lenguaje de programación Java toma la
siguiente forma básica:
```java
<modificador>* <tipo de retorno> <nombre> ( <argumento> ) {
        <sentencias>*
        return valorRetorno;
}
```
### Invocación de métodos 
Un método se puede invocar dentro o fuera de la clase donde se ha declarado. Si el método
se invoca dentro de la clase, basta con indicar su nombre. Si el método se invoca fuera de la
clase entonces se debe indicar el nombre del objeto y el nombre del método.

### Parámetros y argumentos 
Los parámetros de un método definen la cantidad y el tipo de dato de los valores que recibe
un método para su ejecución. Los argumentos son los valores que se pasan a un método
durante su invocación. El método recibe los argumentos correspondientes a los parámetros
con los que ha sido declarado. Un método puede tener tantos parámetros como sea
necesario.

### El valor de retorno 
Un método puede devolver un valor. Los métodos que no devuelven un valor se declaran
 ```void```, mientras que los métodos que devuelven un valor indican el tipo que devuelven: ```int,
double, char, String``` o un tipo de objeto.

## :white_medium_small_square: *MÉTODOS GET Y SET EN JAVA* 
Los métodos get y set, son simples métodos que usamos en las clases para ```mostrar/ obtener (get)``` o ```modificar/ ingresar (set)``` el valor de un atributo. El nombre del método siempre será get o set y a continuación el nombre del atributo, su modificador siempre es ```public``` ya que queremos mostrar o modificar desde fuera la clase. Por ejemplo: getNombre o setNombre.

Sintaxis: 
```java
// METODO GET
public tipo_dato_atributo getAtributo (){
        return atributo;
}

// METODO SET
public void setAtributo (tipo_dato_atributo variable){
        this.atributo = variable;
}
```

## :white_medium_small_square: *MODIFICADORES DE ACCESO EN JAVA* 
Los modificadores de acceso nos permiten indicar la visibilidad de esos métodos o atributos fuera de la clase, se ponen al principio del método o atributo. 
Los tipos de modificadores son: 

### public:
El método o atributo es accesible por cualquiera.
### private:
El método o atributo solo es accesible para la propia clase. Fuera de la clase, no se ven. Se suelen usar en atributos y métodos que solo se usen dentro de la 
clase.
### protected:
El método o atributo de una clase padre se podrá acceder desde las clases hijas de la misma, es muy usado en herencia. 

:rotating_light: Lo más normal es que los atributos sean privados para que no sean modificados directamente desde fuera, además se suelen usar los métodos get and set para modificar y mostrar el valor de atributos.

## :white_medium_small_square: *SOBRECARGA DE METODOS Y CONSTRUCTORES EN JAVA*
La sobrecarga de métodos significa tener varios métodos con el mismo nombre pero con distintos parámetros. 
Si has probado alguna de las clases de Java, habrás visto que un mismo método esta repetido pero con distinto parámetros.
Si tenemos dos métodos iguales, pero uno con un parámetro más, esto es la sobrecarga de métodos. 

:rotating_light: Es muy importante tener en cuenta, que si dos métodos tienen el mismo tipo de dato como parámetros y distinto tipo de dato devuelto, esto nos indicara error.

##  :white_medium_small_square: *COLECCIONES EN JAVA*

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
