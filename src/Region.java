import java.util.*;
public class Region  {

	private int id_reg;
	private String nombre_reg;
	private ArrayList<Ciudad> ciudades= new ArrayList<Ciudad>(); 
	
	public Region(int id_reg, String nombre_reg,int id_city,String city) {
		
		this.nombre_reg= nombre_reg;
		this.id_reg= id_reg;
	}

	public int getId_reg() {
		return id_reg;
	}

	public void setId_reg(int id_reg) {
		this.id_reg = id_reg;
	}

	public String getNombre_reg() {
		return nombre_reg;
	}

	public void setNombre_reg(String nombre_reg) {
		this.nombre_reg = nombre_reg;
	}
	
}
