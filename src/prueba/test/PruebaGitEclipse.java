package prueba.test;

import prueba.modelo.Saludo;
/**
 * Punto de entrada a la plicacion
 * @author Jhon, Diana, Adrian
 * */
public class PruebaGitEclipse {

	public static void main(String[] args) {
		Saludo saludo = new Saludo();
		System.out.println(saludo.saludar("Juan"));
		System.out.println(saludo.saludar("Isabel"));
		System.out.println(saludo.saludar("Pablo"));
		System.out.println(saludo.saludar("Luis"));
		 

	}

}
