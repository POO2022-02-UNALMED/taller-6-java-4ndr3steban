package vehiculos;

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	protected static int cantidadVehiculos = 0;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos++;
		fabricante.getPais().aumentarVehiculoxPais();
		fabricante.aumentarVehiculoxFabrica();
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public void setVelocidadMaxima(int vm) {
		this.velocidadMaxima = vm;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setTraccion(String trac) {
		this.traccion = trac;
	}
	
	public String getTraccion() {
		return traccion;
	}
	public void setFabricante(Fabricante fab) {
		this.fabricante = fab;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public static void setCantidadVehiculos(int cv) {
		cantidadVehiculos = cv;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public static String vehiculosPorTipo() {
		
		String str = "Automoviles: "+ Automovil.getCantidadAutomoviles()  + "\n" + 
				"Camionetas: "+ Camioneta.getCantidadCamionetas() + "\n" + 
				"Camiones: "+ Camion.getCantidadCamiones();
		return str;
	}
}


