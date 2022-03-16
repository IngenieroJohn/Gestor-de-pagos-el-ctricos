
public class Plan_Electrica {
	
	private int id;
	private String nombre;
	private double tarifa;
	private Ciudad city;
	
	public Plan_Electrica(int id, String name, double tarifa, Ciudad city) {
		this.id= id;
		this.nombre=  name;
		this.tarifa= tarifa;
		this.city= city;
		
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

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: "+ id +" Planta Electrica: " +nombre+" Tarifa: " +tarifa  + city;
	}
	

}
