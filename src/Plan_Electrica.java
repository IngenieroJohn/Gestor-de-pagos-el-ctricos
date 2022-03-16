
public class Plan_Electrica {
	
	
	private String nombre;
	private double tarifa;
	private Ciudad city;
	
	public Plan_Electrica( String name, Ciudad city) {
		
		this.nombre=  name;
		
		this.city= city;
		
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Planta Electrica: " +nombre  + city;
	}
	

}
