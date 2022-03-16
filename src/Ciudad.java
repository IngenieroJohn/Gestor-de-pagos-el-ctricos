import java.util.*;
public class Ciudad {

	
	private String nombre;
	private int[] consumo_city = new int[12];
	
	public Ciudad( String nombre) {
		
		this.nombre= nombre;
		
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	@Override
	public String toString() {
		
	
		return  " Ciudad: "+ nombre + " Consumo eléctrico: "  ;
	}


	
}
