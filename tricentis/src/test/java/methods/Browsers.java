/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Browsers {

	private static WebDriver driver;

	public static WebDriver adriver() {
		return driver;
	}

	/**
	 * Metodo para abrir o browser Google Chrome.
	 * 
	 * @param chrome Abre o browser.
	 * @param url    URL a ser acessada.
	 * @author Roni
	 */
	private void chrome(String url) {
		try {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
			driver.get(url);

		} catch (Exception e) {
			System.err.println("--------------- Erro ao abrir navegador --------------- " + e.getMessage());
			System.err.println("--------------- Causa do erro ---------------" + e.getCause());
		}
	}
	
	

	/**
	 * Metodo para abrir o browser Mozilla Firefox.
	 * 
	 * @param firefox Abre o browser.
	 * @param url     URL a ser acessada.
	 * @author Roni
	 */
	private void firefox(String url) {
		try {

			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("start-maximized");
			driver = new FirefoxDriver(options);
			driver.get(url);

		} catch (Exception e) {
			System.err.println("--------------- Erro ao abrir navegador --------------- " + e.getMessage());
			System.err.println("--------------- Causa do erro ---------------" + e.getCause());
		}
	}
	/**
	 * Metodo para abrir o browser Microsoft Edge.
	 * 
	 * @param chrome Abre o browser.
	 * @param url    URL a ser acessada.
	 * @author Roni
	 */
	private void edge(String url) {
		try {

			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			EdgeOptions options = new EdgeOptions();
			options.addArguments("start-maximized");
			driver = new EdgeDriver(options);
			driver.get(url);

		} catch (Exception e) {
			System.err.println("--------------- Erro ao abrir navegador --------------- " + e.getMessage());
			System.err.println("--------------- Causa do erro ---------------" + e.getCause());
		}
	}

	
	
	/**
	 * Método para trocar/escolher qual browser sera aberto.
	 * "chrome", "firefox" ou "edge". 
	 * 	 * 
	 * @param open Abre o browser.
	 * @param BrowswerName default "chrome"
	 * @param url URL a ser acessada.
	 * @author Roni
	 */
	public void open(String browserName, String url) {
				
		switch (browserName.toLowerCase()) {
		case "chrome":
			chrome(url);
			break;

		case "firefox":
			firefox(url);
			break;
			
		case "edge":
			edge(url);
			break;
			
		default:
			chrome(url);
			break;
		}

	}
	/**
	 * Metodo para fechar o browser.
	 * 
	 * @author Roni
	 */
	public void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("--------------- erro ao fechar --------------- " + e.getMessage());
			System.err.println("--------------- Causa do erro ---------------" + e.getCause());
		}
	}


}
