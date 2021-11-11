/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package elements;

import org.openqa.selenium.By;

import methods.Metodos;

public class HomeElements {

	Metodos metodo = new Metodos();

	/*
	 * Top Menu Itens ****************
	 */
	By automobile	= By.id("nav_automobile");
	By truck 		= By.id("nav_truck");
	By motorcycle 	= By.id("nav_motorcycle");
	By camper 		= By.id("nav_camper");

	public Metodos getMetodo() {
		return metodo;
	}

	public By getAutomobile() {
		return automobile;
	}

	public By getTruck() {
		return truck;
	}

	public By getMotorcycle() {
		return motorcycle;
	}

	public By getCamper() {
		return camper;
	}

}
