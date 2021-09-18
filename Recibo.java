
public class Recibo {
	//Cliente client = new ClienteNuevo();
	//Fecha fech = new Fecha();
	Cliente client;
	Fecha fech;
	public void recibo(Fecha f, Cliente c) {
		client=c;
		fech=f;
		System.out.println(c.MuestraDatosCliente() + "\n"+"Hemos reservado el coche elegido el dia "
				+ f.getNumFecha() + " del mes " + f.getMes() + " del año " + f.getAño()
				+ " pronto tendra noticias nuestras. Gracias por la reserva.");
	}
	
}
