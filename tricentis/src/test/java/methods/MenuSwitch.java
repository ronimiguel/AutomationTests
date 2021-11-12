/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package methods;

import elements.HomeElements;
import pages.VehicleDataPage;

public class MenuSwitch {
	HomeElements el = new HomeElements();
	Metodos metodo = new Metodos();
	VehicleDataPage tipo = new VehicleDataPage();

	/**
	 * Este metodo é utilizado para selecionar qual item do menu sera clicado.
	 * Interage clicando em um elemento
	 * @param Categoria
	 * Recebe nome da categoria a ser clicada 
	 * @author Roni
	 */
	public void selectMenuItem(String Categoria) {
		switch (Categoria.toLowerCase()) {

		case "automobile":
			metodo.click(el.getAutomobile());

			break;
		case "truck":
			metodo.click(el.getTruck());

			break;
		case "motorcycle":
			metodo.click(el.getMotorcycle());

			break;
		case "camper":
			metodo.click(el.getCamper());

			break;

		default:
			metodo.click(el.getAutomobile());
			break;
		}
	}
}
