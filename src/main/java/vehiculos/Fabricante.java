package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private int vehiculosxFabrica = 0;
	private static List<Fabricante> fabricas = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.fabricas.add(this);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante masvend = fabricas.get(0);
		
		for(Fabricante f: fabricas) {
			if (f.vehiculosxFabrica > masvend.vehiculosxFabrica) {
				masvend = f;
			}
		}
		return masvend;
	}
	
	
	public void aumentarVehiculoxFabrica() {
		this.vehiculosxFabrica++;
	}
	
}
