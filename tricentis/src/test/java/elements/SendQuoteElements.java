/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package elements;

import org.openqa.selenium.By;

public class SendQuoteElements {
	
	By email			= By.id("email");
	By phone 			= By.id("phone");
	By username 		= By.id("username");
	By password 		= By.id("password");
	By confirmPassword 	= By.id("confirmpassword");
	By comments 		= By.id("Comments");
	By sendEmail		= By.id("sendemail");
	public By getEmail() {
		return email;
	}
	public By getPhone() {
		return phone;
	}
	public By getUsername() {
		return username;
	}
	public By getPassword() {
		return password;
	}
	public By getConfirmPassword() {
		return confirmPassword;
	}
	public By getComments() {
		return comments;
	}
	public By getSendEmail() {
		return sendEmail;
	}
	
	

}
