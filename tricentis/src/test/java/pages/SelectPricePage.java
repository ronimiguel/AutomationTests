/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package pages;

import elements.SelectPriceElements;
import methods.Browsers;
import methods.Metodos;

public class SelectPricePage {
	SelectPriceElements el = new SelectPriceElements();
	Metodos metodo = new Metodos();
	Browsers browser = new Browsers();
	
	/**
	 * Preenche dados na aba SelectPrice 
	 * @author Roni
	 */
	public void SelectPrice() {
		metodo.waitClickableElement(el.getSelectSilver(), 5);
		metodo.click(el.getSelectSilver());
	
		
		metodo.waitClickableElement(el.getNextsendquote(), 5);
		metodo.click(el.getNextsendquote());
	}
}
