/**
*
* @author Roni Miguel
* GitHub: https://github.com/ronimiguel
*
*/
package methods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFieldProductData {

	/**
	 * Este metodo é utilizado para criar uma data futura (2 meses)
	 * utilizada ao preencher o campo "Start Date" na pagina ProductDataPage 
	 * de forma automática.
	 * 
	 * @author Roni
	 */
	public String Data() {

		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // Mes dia ano
		LocalDate dataHoje = LocalDate.now(); // data de agora
		LocalDate addMeses = dataHoje.plusMonths(2); // add 2 meses
		String data = addMeses.format(formatoData);

		return data;

	}

}