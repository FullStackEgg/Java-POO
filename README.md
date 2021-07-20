# PARADIGMA ORIENTADO A OBJETOS - JAVA 

_Compendio de ejercicios de la guia 6.0 ( POO JAVA )._

Cada uno de los ejercicios se subirá en un folder correspondiente con el nombre "Ejercicio_#". Dicho folder solo contendrá las clases usadas para la solución planteada al problema de cada ejercicio, NO el proyecto completo. Si se desea recrear el proyecto, y se descargan los archivos, se deberán crear manualmente los packages correspondientes a cada una de las clases.

Nota: La finalidad de este repositorio es brindar una posible solución a cada uno de los ejercicios planteados y servir de comparación con c/u de sus soluciones.

## ELEMENTOS DE UNA CLASE 📖
Una clase describe un tipo de objetos con características comunes. Es necesario definir la
información que almacena el objeto y su comportamiento.

### ATRIBUTOS
El estado o información de un objeto se almacena en atributos. Los atributos pueden ser de
tipos primitivos de Java o del tipo de otros objetos. La
declaración de un atributo de un objeto tiene la siguiente forma:
```
<modificador>* <tipo> <nombre> [ = <valor inicial> ];
```

### CONSTRUCTORES
Toda clase debe definir un método especial denominado
constructor para instanciar los objetos de la clase. Este método tiene el mismo nombre de
la clase. La declaración básica toma la siguiente forma:
```
[<modificador>] <nombre de clase> ( <argumento>* ) {
        <sentencia>*
}
```

### MÉTODOS
Los métodos son funciones que determinan el comportamiento de los objetos. Un objeto se
comporta de una u otra forma dependiendo de los métodos de la clase a la que pertenece.
Para definir los métodos, el lenguaje de programación Java toma la
siguiente forma básica:
```
<modificador>* <tipo de retorno> <nombre> ( <argumento>>* ) {
        <sentencias>*
        return valorRetorno;
}
```
### 📌 Invocación de métodos 
Un método se puede invocar dentro o fuera de la clase donde se ha declarado. Si el método
se invoca dentro de la clase, basta con indicar su nombre. Si el método se invoca fuera de la
clase entonces se debe indicar el nombre del objeto y el nombre del método.

### 📌 Parámetros y argumentos 
Los parámetros de un método definen la cantidad y el tipo de dato de los valores que recibe
un método para su ejecución. Los argumentos son los valores que se pasan a un método
durante su invocación. El método recibe los argumentos correspondientes a los parámetros
con los que ha sido declarado. Un método puede tener tantos parámetros como sea
necesario.

### 📌 El valor de retorno 
Un método puede devolver un valor. Los métodos que no devuelven un valor se declaran
 ```void```, mientras que los métodos que devuelven un valor indican el tipo que devuelven: ```int,
double, char, String``` o un tipo de objeto.

## MÉTODOS GET Y SET EN JAVA
Los métodos get y set, son simples métodos que usamos en las clases para ```mostrar/ obtener (get)``` o ```modificar/ ingresar (set)``` el valor de un atributo. El nombre del método siempre será get o set y a continuación el nombre del atributo, su modificador siempre es ```public``` ya que queremos mostrar o modificar desde fuera la clase. Por ejemplo: getNombre o setNombre.

Sintaxis: 
```
// METODO GET
public tipo_dato_atributo getAtributo (){
        return atributo;
}

// METODO SET
public void setAtributo (tipo_dato_atributo variable){
        this.atributo = variable;
}
```

## MODIFICADORES DE ACCESO EN JAVA
Los modificadores de acceso nos permiten indicar la visibilidad de esos métodos o atributos fuera de la clase, se ponen al principio del método o atributo. 
Los tipos de modificadores son: 

### public:
El método o atributo es accesible por cualquiera.
### private:
El método o atributo solo es accesible para la propia clase. Fuera de la clase, no se ven. Se suelen usar en atributos y métodos que solo se usen dentro de la 
clase.
### protected:
El método o atributo de una clase padre se podrá acceder desde las clases hijas de la misma, es muy usado en herencia. 

📌 Lo más normal es que los atributos sean privados para que no sean modificados directamente desde fuera, además se suelen usar los métodos get and set para modificar y mostrar el valor de atributos.

## SOBRECARGA DE METODOS Y CONSTRUCTORES EN JAVA
La sobrecarga de métodos significa tener varios métodos con el mismo nombre pero con distintos parámetros. 
Si has probado alguna de las clases de Java, habrás visto que un mismo método esta repetido pero con distinto parámetros.
Si tenemos dos métodos iguales, pero uno con un parámetro más, esto es la sobrecarga de métodos. 

Es muy importante tener en cuenta, que si dos métodos tienen el mismo tipo de dato como parámetros y distinto tipo de dato devuelto, esto nos indicara error.
