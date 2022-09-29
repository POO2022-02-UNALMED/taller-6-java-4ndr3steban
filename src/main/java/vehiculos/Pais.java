package vehiculos;
import java.util.ArrayList;
import java.util.List;

public class Pais {
	
	private String nombre;
	private int vehiculosxPais = 0;
	private static List<Pais> paices = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		Pais.paices.add(this);
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public static Pais paisMasVendedor() {
		Pais masvend = paices.get(0);
		
		for(Pais p: paices) {
			if (p.vehiculosxPais > masvend.vehiculosxPais) {
				masvend = p;
			}
		}
		return masvend;
	}
	
	public void aumentarVehiculoxPais() {
		this.vehiculosxPais++;
	}
	
	
}
