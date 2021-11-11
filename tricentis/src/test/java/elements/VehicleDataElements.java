/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package elements;

import org.openqa.selenium.By;

public class VehicleDataElements {

	By make 					= By.id("make");
	By selectMake 				= By.xpath("//option[. = 'Honda']");
	By model 					= By.id("model"); // Motorcycle
	By selectModel 				= By.xpath("//option[. = 'Motorcycle']"); // Motorcycle
	By cylinderCapacity 		= By.id("cylindercapacity"); // Motorcycle
	By enginePerformance 		= By.id("engineperformance");
	By dateOfManufacture 		= By.id("dateofmanufacture");
	By numberOfSeats 			= By.id("numberofseats");
	By selectNumber 			= By.xpath("//option[. = '5']");
	By numberOfSeatsCycle 		= By.id("numberofseatsmotorcycle");
	By selCycleSeats 			= By.xpath("//option[. = '1']");
	By rightHandDriveNo 		= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/p/label[2]/span"); // Camper
	By fuel 					= By.id("fuel");
	By payload 					= By.id("payload"); // Truck - Camper
	By totalWeight 				= By.id("totalweight"); // Truck - Camper
	By selectFuel 				= By.xpath("//option[. = 'Gas']");
	By listPrice 				= By.id("listprice");
	By licensePlateNumber 		= By.id("licenseplatenumber");
	By annualMileage 			= By.id("annualmileage");
	By nextenterinsurantdata 	= By.id("nextenterinsurantdata");

	public By getMake() {
		return make;
	}

	public By getSelectMake() {
		return selectMake;
	}

	public By getModel() {
		return model;
	}

	public By getSelectModel() {
		return selectModel;
	}

	public By getCilinderCapacity() {
		return cylinderCapacity;
	}

	public By getEnginePerformance() {
		return enginePerformance;
	}

	public By getDateOfManufacture() {
		return dateOfManufacture;
	}

	public By getNumberOfSeats() {
		return numberOfSeats;
	}

	public By getNumberOfSeatsCycle() {
		return numberOfSeatsCycle;
	}

	public By getSelCicleSeats() {
		return selCycleSeats;
	}

	public By getRightHandDriveNo() {
		return rightHandDriveNo;
	}

	public By getSelectNumber() {
		return selectNumber;
	}

	public By getFuel() {
		return fuel;
	}

	public By getPayload() {
		return payload;
	}

	public By getTotalWeight() {
		return totalWeight;
	}

	public By getSelectFuel() {
		return selectFuel;
	}

	public By getListPrice() {
		return listPrice;
	}

	public By getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public By getAnnualMileage() {
		return annualMileage;
	}

	public By getNextenterinsurantdata() {
		return nextenterinsurantdata;
	}

}

