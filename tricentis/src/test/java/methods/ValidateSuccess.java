/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package methods;

import static org.junit.Assert.assertEquals;

import elements.ValidateSuccessElements;

public class ValidateSuccess {
	Browsers browser = new Browsers();
	Metodos metodo = new Metodos();
	ValidateSuccessElements el = new ValidateSuccessElements();
	
	/**
	 * Este metodo é utilizado para verificar o sucesso do teste.
	 * Recebe e compara a mensagem de sucesso.
	 * @author Roni
	 */
	public void success() {
		// Esperar Mensagem Sending e-mail success! aparecer
		metodo.waitClickableElement(el.getOkButton(), 10);

		String textoSucesso = "Sending e-mail success!";
		String textoRecebido = Browsers.adriver().findElement(el.getSendingEmail()).getText();
		System.out.println(textoRecebido + " Foi o Texto Encontrado!");
		assertEquals(textoRecebido, textoSucesso);
		if (textoRecebido.equalsIgnoreCase(textoSucesso)) {
			System.out.println("Sucesso ao validar o teste");

		} else {
			System.out.println("Verificar Teste. Possiveis Falhas");
		}
	}

	public void finalizar() {
		metodo.click(el.getOkButton());
	}

}
