/*
 * 01- Dise�ar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedir� una raza de perro en un bucle, el mismo se guardar�
 * en la lista y despu�s se le preguntar� al usuario si quiere guardar otro perro o si
 * quiere salir. Si decide salir, se mostrar� todos los perros guardados en el ArrayList.
 * 
 * Continuando el ejercicio anterior, despu�s de mostrar los perros, al usuario se le
 * pedir� un perro y se recorrer� la lista con un Iterator, se buscar� el perro en la lista.
 * Si el perro est� en la lista, se eliminar� el perro que ingres� el usuario y se mostrar�
 * la lista ordenada. Si el perro no se encuentra en la lista, se le informar� al usuario
 * y se mostrar� la lista ordenada.
 */
package mainapp;

import service.PerroServicio;

/**
 * 
 * @author Felipe Herrera
 *
 */
public class Main {

	public static void main(String[] args) {

		PerroServicio s = new PerroServicio(); // instanciamos el servicio para acceder a los metodos
		
		s.fabricaPerros();
		
		s.eliminarPorRaza();
		
		s.mostrarPerro();
	}
	
}
