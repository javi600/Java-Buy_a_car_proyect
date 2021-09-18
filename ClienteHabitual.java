
public class ClienteHabitual extends Cliente {
	private String ambientador;
	private String RuedaRepuesto;
	private String garantia;

	public ClienteHabitual() {
		garantia = "Tienes una garantia de dos años";
		ambientador = "Y tambien te regalamos un ambientador AirWIck!";
		RuedaRepuesto = "Ten, una rueda de repuesto marca Michelin gratiiss";
	}
	public String dimeTipoCliente() {
		return "Ud se identificó como cliente habitual";
	}
	public String MuestraDatosClientHabit() {

		return garantia + "." + RuedaRepuesto + "." + ambientador;
	}
}
