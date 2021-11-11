/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package elements;

import org.openqa.selenium.By;

public class InsurantDataElements {

	By firstName					= By.id("firstname");	
	By lastName						= By.id("lastname");
	By birthDate					= By.id("birthdate");
	By gender						= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span");
	By streetaddress				= By.id("streetaddress");
	By country						= By.id("country");
	By selectCountry				= By.xpath("option[234]");
	By zipcode						= By.id("zipcode");
	By city							= By.id("city");
	By occupation					= By.id("occupation");
	By selectOccupation				= By.xpath("//option[. = 'Employee']");
	By hobbies						= By.xpath("//label[normalize-space()='Cliff Diving']//span[@class='ideal-check']");
	By website						= By.id("website");
	By picture						= By.id("picture");
	By open							= By.id("open");
	By nextProductData				= By.id("nextenterproductdata");
	public By getFirstName() {
		return firstName;
	}
	public By getLastName() {
		return lastName;
	}
	public By getBirthDate() {
		return birthDate;
	}
	public By getGender() {
		return gender;
	}
	public By getStreetaddress() {
		return streetaddress;
	}
	public By getCountry() {
		return country;
	}
	public By getSelectCountry() {
		return selectCountry;
	}
	public By getZipcode() {
		return zipcode;
	}
	public By getCity() {
		return city;
	}
	public By getOccupation() {
		return occupation;
	}
	public By getSelectOccupation() {
		return selectOccupation;
	}
	public By getHobbies() {
		return hobbies;
	}
	public By getWebsite() {
		return website;
	}
	public By getPicture() {
		return picture;
	}
	public By getOpen() {
		return open;
	}
	public By getNextProductData() {
		return nextProductData;
	}

	
	
}
