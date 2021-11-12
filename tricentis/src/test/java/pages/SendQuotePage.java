/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package pages;

import elements.SendQuoteElements;
import methods.Metodos;

public class SendQuotePage {
	SendQuoteElements el = new SendQuoteElements();
	Metodos metodo = new Metodos();
	
	/**
	 * Preenche dados na aba SendQuote 
	 * @author Roni
	 */
	public void SendQuote() {
		metodo.type(el.getEmail(), "mypersonalmail@gmail.com");		
		metodo.type(el.getPhone(), "41045350");		
		metodo.type(el.getUsername(), "georgefman");		
		metodo.type(el.getPassword(), "Bologne1");		
		metodo.type(el.getConfirmPassword(), "Bologne1");		
		metodo.type(el.getComments(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");		
		metodo.click(el.getSendEmail());		
		
	}

}
