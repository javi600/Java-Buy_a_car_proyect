/**
 * @author Javier Muñoz Fernandez
 *
 */
public class Coche {
	String marc1;
	String marc2;
	String marc3;
	String marc4;
	
	private Rueda[] ruedas;
	
	public Coche() {
	this.ruedas= new Rueda[4];		
	}
	
	public void cambiarRueda(Rueda rued, int pos) {
	Rueda rueda = new Rueda(rued.getMarca(),rued.getCodRueda());	
	this.ruedas[pos] = rueda;
	}
	/*public void agregarRueda(Rueda rued) {
		this.ruedas[this.ruedas.length-1]= rued;
	}*/
	public Rueda[] getRuedas() {
		return ruedas;
	}
	void estableCatalogoCoches(String marc1, String marc2, String marc3, String marc4) {
		this.marc1 = marc1;
		this.marc2 = marc2;
		this.marc3 = marc3;
		this.marc4 = marc4;
	}

	public void error() {
		System.out.println("error, vuelva a iniciar el programa y elija una opción válida");
	};

	public void Bmodelo1() {
		System.out.println("Procedencia=Jamaica");
		int precioB1 = 17500;
		System.out.println("precio = " + precioB1);
		System.out.println();
		System.out.println("Su reserva se ha efectuado correctamente");
	};

	public void Bmodelo2() {
		System.out.println("Procedencia=Australia");
		int precioB2 = 13000;
		System.out.println("precio = " + precioB2);
		System.out.println();
		System.out.println("Su reserva se ha efectuado correctamente");
	};

	public void Omodelo1() {
		System.out.println("Procedencia=Berlin");
		int precioO1 = 6000;
		System.out.println("precio = " + precioO1);
		System.out.println();
		System.out.println("Su reserva se ha efectuado correctamente");
	};

	public void Omodelo2() {
		System.out.println("Procedencia=Munich");
		int precioO2 = 22000;
		System.out.println("precio = " + precioO2);
		System.out.println();
		System.out.println("Su reserva se ha efectuado correctamente");
	};

	public void Fmodelo1() {
		System.out.println("Procedencia=Florencia");
		int precioF1 = 127000;
		System.out.println("precio = " + precioF1);
		System.out.println();
		System.out.println("Su reserva se ha efectuado correctamente");
	};

	public void Fmodelo2() {
		System.out.println("Procedencia=Roma");
		int precioF2 = 78000;
		System.out.println("precio = " + precioF2);
		System.out.println();
		System.out.println("Su reserva se ha efectuado correctamente");
	};

	public void Kmodelo1() {
		System.out.println("Procedencia=Korea");
		int precioK1 = 9000;
		System.out.println("precio = " + precioK1);
		System.out.println();
		System.out.println("Su reserva se ha efectuado correctamente");
	};

	public void Kmodelo2() {
		System.out.println("Procedencia=Taiwan");
		int precioK2 = 7000;
		System.out.println("precio = " + precioK2);
		System.out.println();
		System.out.println("Su reserva se ha efectuado correctamente");
	};
}
