/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package pages;

import methods.ScreenshotEvidencia;
import methods.ValidateSuccess;

public class ValidateSuccessPage {

	ValidateSuccess metodo = new ValidateSuccess();
	ScreenshotEvidencia take = new ScreenshotEvidencia();
	
	public void validate(String tipoVeiculo) {
		//COMPARAR
		metodo.success();
		
		//EVIDENCIAR COM SCREENSHOT
		take.Screenshot(tipoVeiculo);
		
		//FINALIZAR
		metodo.finalizar();
	}
}
