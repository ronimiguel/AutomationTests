/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package elements;

import org.openqa.selenium.By;

public class SelectPriceElements {
	By selectSilver 	= By.cssSelector(".choosePrice:nth-child(1) > .ideal-radio");
	By nextsendquote	= By.id("nextsendquote");

	
	public By getSelectSilver() {
		return selectSilver;
	}
	public By getNextsendquote() {
		return nextsendquote;
	}
	

}
