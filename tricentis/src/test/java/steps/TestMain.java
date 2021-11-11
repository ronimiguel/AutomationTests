/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.Browsers;
import methods.MenuSwitch;
import methods.Metodos;
import pages.InsurantDataPage;
import pages.ProductDataPage;
import pages.SelectPricePage;
import pages.SendQuotePage;
import pages.ValidateSuccessPage;
import pages.VehicleDataPage;

public class TestMain {


	Browsers browser = new Browsers();
	Metodos metodo = new Metodos();
	MenuSwitch menu = new MenuSwitch();
	VehicleDataPage vehicleData = new VehicleDataPage();
	InsurantDataPage insurantData = new InsurantDataPage();
	ProductDataPage productData = new ProductDataPage();
	SelectPricePage selectPrice = new SelectPricePage();
	SendQuotePage sendQuote = new SendQuotePage();
	ValidateSuccessPage validate = new ValidateSuccessPage();

	@Given("que entre no site da tricentis {string}")
	public void que_entre_no_site_da_tricentis(String url) {
		
		//Escolha qual navegador utilizar para o teste retirando o "//"
		
		//browser.open("firefox", url);
		browser.open("chrome", url);
		// browser.open("edge", url);
	}

	@Given("clico na cotacao de seguro {string}")
	public void clico_na_cotacao_de_seguro(String tipoVeiculo) {
		menu.selectMenuItem(tipoVeiculo);

	}

	@When("preencho os dados do veiculo {string}")
	public void preencho_os_dados_do_veiculo(String tipoVeiculo) {
		vehicleData.vehicleData(tipoVeiculo);

	}

	@When("preencho os dados do seguro")
	public void preencho_os_dados_do_seguro() {
		insurantData.insurantData();
	}

	@When("preencho os dados do produto {string}")
	public void preencho_os_dados_do_produto(String tipoVeiculo) {
		productData.productData(tipoVeiculo);
	}

	@When("preencho os dados do valor")
	public void preencho_os_dados_do_valor() {
		selectPrice.SelectPrice();

	}

	@When("envio a cotacao")
	public void envio_a_cotacao() {
		sendQuote.SendQuote();
	}

	@Then("valido o envio do {string}")
	public void valido_o_envio_do(String tipoVeiculo) {
		validate.validate(tipoVeiculo);

		// validate.finalizar();
		browser.quit();
	}


}
