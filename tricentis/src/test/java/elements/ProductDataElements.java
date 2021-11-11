/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package elements;

import org.openqa.selenium.By;

public class ProductDataElements {

	By startDate				= By.id("startdate");
	By insuranceSum				= By.id("insurancesum");
	By selectInsuranceSum		= By.cssSelector("#insurancesum > option:nth-child(3)");
	By meritRating				= By.id("meritrating");
	By selectMeritRating		= By.xpath("//option[. = 'Bonus 3']");
	By damageInsurance			= By.id("damageinsurance");
	By selectDamageInsurance	= By.xpath("//option[. = 'Partial Coverage']");
	By optionalProducts			= By.cssSelector(".field:nth-child(5) .ideal-radiocheck-label:nth-child(2) > .ideal-check");
	By optionalProdMotor		= By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[2]/span");
	By courtesyCar				= By.id("courtesycar");
	By selectCortesyCar			= By.cssSelector("#courtesycar > option:nth-child(2)");
	By nextSelectPriceOption	= By.id("nextselectpriceoption");
	
	
	public By getStartDate() {
		return startDate;
	}
	public By getInsuranceSum() {
		return insuranceSum;
	}
	public By getSelectInsuranceSum() {
		return selectInsuranceSum;
	}
	public By getMeritRating() {
		return meritRating;
	}
	public By getSelectMeritRating() {
		return selectMeritRating;
	}
	public By getDamageInsurance() {
		return damageInsurance;
	}
	public By getSelectDamageInsurance() {
		return selectDamageInsurance;
	}
	public By getOptionalProducts() {
		return optionalProducts;
	}
	public By getOptionalProdMotor() {
		return optionalProdMotor;
	}
	public By getCortesyCar() {
		return courtesyCar;
	}
	public By getSelectCortesyCar() {
		return selectCortesyCar;
	}
	public By getNextSelectPriceOption() {
		return nextSelectPriceOption;
	}
	
	
	
}
