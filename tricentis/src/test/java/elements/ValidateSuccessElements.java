/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package elements;

import org.openqa.selenium.By;

public class ValidateSuccessElements {

	By okButton = By.cssSelector("div[class*='sa-confirm-button-container']");
	By sendingEmail = By.cssSelector("div[class*='sweet-alert'] > h2");

	public By getOkButton() {
		return okButton;
	}

	public By getSendingEmail() {
		return sendingEmail;
	}
	
}
