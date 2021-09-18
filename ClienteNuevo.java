
public class ClienteNuevo extends Cliente {
	
	private String MsjInfo;
	public ClienteNuevo() {
		MsjInfo = "Al haber hecho tu primera compra te conviertes en un cliente habitual!";
		
	}
	public String dimeTipoCliente() {
		return "Ud se identificó como cliente nuevo";
	}
	public  String dimedatosClientN() {
		return "Enhorabuena,  "+ MsjInfo;
	}
}
