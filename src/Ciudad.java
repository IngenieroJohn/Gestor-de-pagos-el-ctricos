import java.util.*;
public class Ciudad {

	private int id;
	private String nombre;
	private int[] consumo_city = new int[12];
	
	public Ciudad(int id, String nombre, int[] consumocity) {
		this.id= id;
		this.nombre= nombre;
		this.consumo_city= consumocity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void shownumbers() {
		for(int i=0; i< consumo_city.length; i++) {
			  
			  System.out.println(consumo_city[i]);
		}
	}
	
	@Override
	public String toString() {
		
	
		return " ID_city: " + id + " Ciudad: "+ nombre + " Consumo eléctrico: "  ;
	}
	
	
}
