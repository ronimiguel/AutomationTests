/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

	Browsers browser = new Browsers();
	/**
	 * Este metodo é utilizado para clicar em um (elemento)
	 * @param clicar
	 * Interage clicando em um elemento
	 * @param elemento
	 * Fornecer nome do elemento a ser clicado
	 * @author Roni
	 */
	public void click(By elemento) {
		try {
			Browsers.adriver().findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("--------------- erro ao clicar --------------- " + e.getMessage());
			System.err.println("--------------- Causa do erro ---------------" + e.getCause());
		}
	}
	/**
	 * Este metodo é utilizado para escrever texto
	 * @param elemento
	 * Fornecer nome do elemento que recebe o texto
	 * @param texto
	 * texto a ser escrito
	 * @author Roni
	 */
	public void type(By elemento, String texto) {
		try {
			Browsers.adriver().findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("--------------- erro ao preencher --------------- " + e.getMessage());
			System.err.println("--------------- Causa do erro ---------------" + e.getCause());

		}

		
	}
	/**
	 * Este metodo é utilizado para selecionar um elemento em caixas do tipo DropDown
	 * @param elemento
	 * Fornecer nome do elemento do tipo DropDown
	 * @param selecao
	 * Fornecer o nome do elemento a ser selecionado
	 * @author Roni
	 */
	public void selectDropDown(By elemento, By selecao) {
		try {
			WebElement dropdown = Browsers.adriver().findElement(elemento);
			dropdown.findElement(selecao).click();
			
		} catch (Exception e) {
			System.err.println("--------------- erro ao preencher --------------- " + e.getMessage());
			System.err.println("--------------- Causa do erro ---------------" + e.getCause());

		}
	}
	/**
	 * Este metodo é utilizado para pausar a execucao
	 * @param tempo
	 * Quantidade de segundos
	 * @author Roni
	 */
	public void pause(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.err.println("--------------- erro ao pausar --------------- " + e.getMessage());
			System.err.println("--------------- Causa do erro ---------------" + e.getCause());
		}
	}

	/**
	 * Espera um determinado elemento ficar disponivel para clicar
	 * @param esperarElementoClicavel
	 * @author Roni
	 */
	public void waitClickableElement(By elemento, int tempo) {
		try {
		
			// TODO atualizar essa funcao
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(Browsers.adriver(), tempo);
			wait.until(ExpectedConditions.elementToBeClickable(elemento));
		} catch (Exception e) {
			System.err.println("--------------- erro ao esperar elemento clicavel --------------- " + e.getMessage());
			System.err.println("--------------- Causa do erro ---------------" + e.getCause());
		}
	}


}
