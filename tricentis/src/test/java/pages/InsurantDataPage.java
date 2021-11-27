/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package pages;

import elements.InsurantDataElements;
import methods.Metodos;

public class InsurantDataPage {
	Metodos metodo = new Metodos();
	InsurantDataElements el = new InsurantDataElements();
	/**
	 * Preenche os dados na aba insurantData 
	 * @author Roni
	 */
	public void insurantData() {
		metodo.type(el.getFirstName(), "George");
		metodo.type(el.getLastName(), "Fritzman");
		metodo.type(el.getBirthDate(), "06/04/1976");
		
		metodo.click(el.getGender());
		
		metodo.type(el.getStreetaddress(), "3244 Vidal Drive");
		metodo.selectDropDown(el.getCountry(), el.getSelectCountry());
		metodo.type(el.getZipcode(), "94532");
		metodo.type(el.getCity(), "San Francisco");
		
		metodo.selectDropDown(el.getOccupation(), el.getSelectOccupation());
		
		metodo.click(el.getHobbies());
		
		metodo.type(el.getWebsite(), "www.google.com");
		
		metodo.click(el.getNextProductData());
		
	}
	

}
