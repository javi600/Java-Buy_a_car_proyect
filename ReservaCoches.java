
import java.io.InputStream;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Javier Muñoz
 *
 */
public class ReservaCoches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream stream = System.in;
		Scanner scanner = new Scanner(stream);
		int i =0;
		Coche cochR = new Coche();
		//los coches llevan la siguiente marca de rueda y numero predeterminados
		Rueda rued= new Rueda("Hankook","34656g");
		System.out.println("Por defecto sus ruedas serán Hankook quiere cambiarlas a Michelin?"+ "\n"+
		"Elija y escriba michelin o hankook");
		String marcR = scanner.nextLine();				
		rued.setMarca(marcR);
		//cambias o no la marca de la rueda
		for (int e=0; i>=3; i++) {
			cochR.cambiarRueda(rued, e);
		}
		System.out.println("Elegiste ruedas de la marca "+ rued.getMarca());
		boolean cerrado = false;
		while (cerrado == false) {
			System.out.println("1-->Reservar   2-->Abandonar el programa");
			int inicio = scanner.nextInt();
			i++;
			switch (inicio) {
			
			case 1:                                                //case 1 inicio
				// Datos relativos al cliente
				Cliente client = new ClienteNuevo();
				System.out.println("Introduzca su nombre: ");
				String nombre = scanner.next();
				client.setNombre(nombre);
				System.out.println("Y tambien su primer apellido: ");
				String apellido = scanner.next();
				client.setApellido(apellido);
				System.out.println(client.getApellido());
				System.out.println("Por ultimo el numero del DNI(solo el numero): ");
				int dni = scanner.nextInt();
				client.setDni(dni);
				System.out.println(client.getDni());

				// Datos relativos a la fecha
				Fecha fech = new Fecha();
				System.out.println("Ahora introduzca la fecha del dia de hoy : ");
				int numFecha = scanner.nextInt();
				fech.setNumFecha(numFecha);
				System.out.println(fech.getNumFecha());
				System.out.println("el mes en el que estamos: ");
				String mes = scanner.next();
				fech.setMes(mes);
				System.out.println(fech.getMes());
				System.out.println("Por ultimo el año: ");
				int año = scanner.nextInt();
				fech.setAño(año);
				System.out.println(fech.getAño());

				// reserva del coche
				Coche coch = new Coche();

				coch.estableCatalogoCoches("BMV", "Opel", "Ferrari", "Kia");
				System.out.println("1->" + coch.marc1 + "-----2->" + coch.marc2 + "----3->" + coch.marc3 + "-----4->"
						+ coch.marc4 + "|");
				System.out.println("(elige la marca del coche, escoge una opcion)");
				int opcion = scanner.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("1=Reggy----2=Rust");
					System.out.println("Elige modelo");
					int Mod1 = scanner.nextInt();
					switch (Mod1) {
					case 1:
						coch.Bmodelo1();
						break;
					case 2:
						coch.Bmodelo2();
						break;
					default:
						coch.error();
					}
					break;
				case 2:

					System.out.println("1=Astra----2=Insignia");
					System.out.println("Elige modelo");
					int Mod2 = scanner.nextInt();
					switch (Mod2) {
					case 1:
						coch.Omodelo1();
						break;
					case 2:
						coch.Omodelo2();
						break;
					default:
						coch.error();
					}
					break;
				case 3:
					System.out.println("1=Delux----2=Topp");
					System.out.println("Elige modelo");
					int Mod3 = scanner.nextInt();
					switch (Mod3) {
					case 1:
						coch.Fmodelo1();
						break;
					case 2:
						coch.Fmodelo2();
						break;
					default:
						coch.error();
					}
					break;
				case 4:
					System.out.println("1=Radal----2=Seul");
					System.out.println("Elige modelo");
					int Mod4 = scanner.nextInt();
					switch (Mod4) {
					case 1:
						coch.Kmodelo1();
						break;
					case 2:
						coch.Kmodelo2();
						break;
					default:
						coch.error();
					}

					break;
				default:
					coch.error();
				}
				//llamamos a la clase recibo y llamamos a su metodo para imprimir el recibo
				Cliente cont = new ClienteNuevo();				
				System.out.println(cont.dimecuantosClientes() + " "+ i);
				Recibo R = new Recibo();
				R.recibo(fech,client);
				System.out.println();
				System.out.println("¿Eres un nuevo cliente o eres un cliente habitual?");
				System.out.println("1---->Soy nuevo cliente 2---->Soy cliente habitual");
				int WhichClientIs = scanner.nextInt();
				switch (WhichClientIs) {
				case 1:
					ClienteNuevo ClientN = new ClienteNuevo();
					 
					System.out.println(ClientN.dimeTipoCliente());
					ClientN.setNombre(nombre);
					ClientN.setApellido(apellido);
					ClientN.setDni(dni);
					System.out.println(ClientN.MuestraDatosCliente());
					System.out.println(ClientN.dimedatosClientN());
					
					break;
				case 2:
					
					ClienteHabitual ClientH = new ClienteHabitual();
					System.out.println(ClientH.dimeTipoCliente());
					System.out.println("Enhorabuena por ser un cliente habitual te damos los siguientes privilegios;  "+"\n"
					+ ClientH.MuestraDatosClientHabit());
					
					break;
				default:
					coch.error();
				}
				System.out.println("Reserva finalizada, ¿quiere hacer otra reserva?");
				System.out.println();

				break;

			case 2:                                                     //case 2 inicio
				cerrado = true;
				System.out.println("Gracias por su visita, ¡hasta pronto!");
				break;
			default:                                                    //default inicio
				System.out.println("Elige una opción válida");
			}
	
		}
		

		scanner.close();
	}
}

