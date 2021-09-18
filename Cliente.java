/**


/**
 * @author Javier Muñoz
 *
 */
public abstract class Cliente {
	private String nombre;
	private String apellido;
	private int dni;
	
	/*public Cliente(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido=apellido;
		this.dni = dni;
	}*/
	public abstract String dimeTipoCliente();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApellido() {
		return apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}	

	
	
	public String MuestraDatosCliente() {
		return "Estimado "+ nombre + " "+apellido+" con Dni "+ dni+":";
	}
	public  String dimecuantosClientes() {
		return "Tras iniciar las reservas, este es el cliente numero:  ";
	}
}

