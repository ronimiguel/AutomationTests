/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package pages;

import elements.VehicleDataElements;
import methods.Metodos;

public class VehicleDataPage {

	Metodos metodo			= new Metodos();
	VehicleDataElements el	= new VehicleDataElements();

	public void automobile() {

		// Preenche os dados da pagina Vehicle Data

		// Seleciona Fabricante
		metodo.waitClickableElement(el.getMake(), 10);
		metodo.selectDropDown(el.getMake(), el.getSelectMake());

		// Preenche Engine Performance
		metodo.type(el.getEnginePerformance(), "3");

		// Preenche data de fabricacao
		metodo.type(el.getDateOfManufacture(), "10/13/2021");

		// Seleciona Quantidade de assentos
		metodo.selectDropDown(el.getNumberOfSeats(), el.getSelectNumber());

		// Seleciona tipo Combustivel
		metodo.selectDropDown(el.getFuel(), el.getSelectFuel());

		// Preenche Preco
		metodo.type(el.getListPrice(), "35000");

		// Preenche Placa
		metodo.type(el.getLicensePlateNumber(), "I2luvU");

		// Preenche Anual Milleage
		metodo.type(el.getAnnualMileage(), "10000");

		// Clicar next
		metodo.click(el.getNextenterinsurantdata());

	}
	public void truck() {
		// Seleciona Fabricante
		metodo.waitClickableElement(el.getMake(), 10);
		metodo.selectDropDown(el.getMake(), el.getSelectMake());

		// Preenche Engine Performance
		metodo.type(el.getEnginePerformance(), "3");

		// Preenche data de fabricacao
		metodo.type(el.getDateOfManufacture(), "10/13/2021");

		// Seleciona Quantidade de assentos
		metodo.selectDropDown(el.getNumberOfSeats(), el.getSelectNumber());

		// Seleciona tipo Combustivel
		metodo.selectDropDown(el.getFuel(), el.getSelectFuel());

		// Preenche PayLoad KG
		metodo.type(el.getPayload(), "400");

		// Preeche Total Weight
		metodo.type(el.getTotalWeight(), "1000");

		// Preenche Preco
		metodo.type(el.getListPrice(), "35000");

		// Preenche Placa
		metodo.type(el.getLicensePlateNumber(), "I2luvU");

		// Preenche Anual Milleage
		metodo.type(el.getAnnualMileage(), "10000");

		// Clicar next
		metodo.click(el.getNextenterinsurantdata());

	}

	public void motorcycle() {
		// Seleciona Fabricante
		metodo.waitClickableElement(el.getMake(), 10);
		metodo.selectDropDown(el.getMake(), el.getSelectMake());

		// Seleciona Modelo
		metodo.waitClickableElement(el.getModel(), 10);
		metodo.selectDropDown(el.getModel(), el.getSelectModel());

		// Preenche Cilinder Capacity
		metodo.type(el.getCilinderCapacity(), "4");
		
		// Preenche Engine Performance
		metodo.type(el.getEnginePerformance(), "3");

		// Preenche data de fabricacao
		metodo.type(el.getDateOfManufacture(), "10/13/2021");

		// Seleciona Quantidade de assentos
		metodo.selectDropDown(el.getNumberOfSeatsCycle(), el.getSelCicleSeats());

		// Preenche Preco
		metodo.type(el.getListPrice(), "35000");

		// Preenche Anual Milleage
		metodo.type(el.getAnnualMileage(), "10000");

		// Clicar next
		metodo.click(el.getNextenterinsurantdata());

	}
	
	public void camper() {
		// Seleciona Fabricante
		metodo.waitClickableElement(el.getMake(), 10);
		metodo.selectDropDown(el.getMake(), el.getSelectMake());

		// Preenche Engine Performance
		metodo.type(el.getEnginePerformance(), "3");

		// Preenche data de fabricacao
		metodo.type(el.getDateOfManufacture(), "10/13/2021");

		// Seleciona Quantidade de assentos
		metodo.selectDropDown(el.getNumberOfSeats(), el.getSelectNumber());

		// Seleciona Right Hand Drive
		metodo.click(el.getRightHandDriveNo());

		// Seleciona tipo Combustivel
		metodo.selectDropDown(el.getFuel(), el.getSelectFuel());

		// Preenche PayLoad KG
		metodo.type(el.getPayload(), "400");

		// Preeche Total Weight
		metodo.type(el.getTotalWeight(), "1000");

		// Preenche Preco
		metodo.type(el.getListPrice(), "35000");

		// Preenche Placa
		metodo.type(el.getLicensePlateNumber(), "I2luvU");

		// Preenche Anual Milleage
		metodo.type(el.getAnnualMileage(), "10000");

		// Clicar next
		metodo.click(el.getNextenterinsurantdata());

	}
	
	/**
	 * Seleciona quais dados preencher.
	 * @param Categoria
	 * Nome do tipo de veiculo 
	 * @author Roni
	 */
	public void vehicleData(String Categoria) {
		switch (Categoria.toLowerCase()) {

		case "automobile":
			automobile();

			break;
		case "truck":
			truck();

			break;
		case "motorcycle":
			motorcycle();

			break;
		case "camper":
			camper();

			break;

		default:
			automobile();
			break;
		}
	}

}
