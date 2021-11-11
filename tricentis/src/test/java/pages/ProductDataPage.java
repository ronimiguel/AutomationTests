/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package pages;

import elements.ProductDataElements;
import methods.DateFieldProductData;
import methods.Metodos;

public class ProductDataPage {
	
	Metodos 				metodo	= new Metodos();
	ProductDataElements 	el 		= new ProductDataElements();
	DateFieldProductData 	data	= new DateFieldProductData();
	VehicleDataPage 		tipo	= new VehicleDataPage();
	
	public void productDataAutomobile() {
		
		metodo.type(el.getStartDate(), data.Data());
		
		metodo.selectDropDown(el.getInsuranceSum(), el.getSelectInsuranceSum());
		
		metodo.selectDropDown(el.getMeritRating(), el.getSelectMeritRating());
		
		metodo.selectDropDown(el.getDamageInsurance(), el.getSelectDamageInsurance());
		
		metodo.click(el.getOptionalProducts());
		
		metodo.selectDropDown(el.getCortesyCar(), el.getSelectCortesyCar());
		
		metodo.click(el.getNextSelectPriceOption());
		
	}
	public void productDataTruck() {
		
		metodo.type(el.getStartDate(), data.Data());
		
		metodo.selectDropDown(el.getInsuranceSum(), el.getSelectInsuranceSum());
		
		metodo.selectDropDown(el.getDamageInsurance(), el.getSelectDamageInsurance());
		
		metodo.click(el.getOptionalProdMotor());
		
		metodo.click(el.getNextSelectPriceOption());
		
	}	
	public void productDataMotorcicle() {
		
		metodo.type(el.getStartDate(), data.Data());
		
		metodo.selectDropDown(el.getInsuranceSum(), el.getSelectInsuranceSum());
		
		metodo.selectDropDown(el.getDamageInsurance(), el.getSelectDamageInsurance());
		
		metodo.click(el.getOptionalProdMotor());
		
		metodo.click(el.getNextSelectPriceOption());
		
	}
	public void productDataCamper() {
		
		metodo.type(el.getStartDate(), data.Data());
		
		metodo.selectDropDown(el.getInsuranceSum(), el.getSelectInsuranceSum());
		
		metodo.selectDropDown(el.getDamageInsurance(), el.getSelectDamageInsurance());
		
		metodo.click(el.getOptionalProdMotor());
		
		metodo.click(el.getNextSelectPriceOption());
		
	}
	
	public void productData(String Categoria) {
		switch (Categoria.toLowerCase()) {

		case "automobile":
			productDataAutomobile();

			break;
		case "truck":
			productDataTruck();

			break;
		case "motorcycle":
			productDataMotorcicle();;

			break;
		case "camper":
			productDataMotorcicle();

			break;

		default:
			productDataAutomobile();
			break;
		}
	}
	
}
