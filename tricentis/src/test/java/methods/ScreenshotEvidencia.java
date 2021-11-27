/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEvidencia {
	Browsers browser = new Browsers();
	/**
	 * Método para tirar Screenshot.
	 * @param name
	 * Recebe nome utilizado para salvar arquivo. 
	 * @author Roni
	 */
	public void Screenshot(String name) {

	    TakesScreenshot screenShot = ((TakesScreenshot) Browsers.adriver());
	    File source = screenShot.getScreenshotAs(OutputType.FILE);
	    try {
			FileHandler.copy(source, new File("C://Evidencias/" + name + System.currentTimeMillis() + ".png"));
			System.out.println("Screenshot capturado e salvo em C:\\Evidencias\\");
		} catch (IOException e) {
			System.err.println("--------------- Erro ao salvar Screenshot --------------- " + e.getMessage());
			System.err.println("--------------- Causa do erro ---------------" + e.getCause());
		}
	}

}
