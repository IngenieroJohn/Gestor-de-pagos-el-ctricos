import java.util.*;
public class Diccionario {

	private int[] consumo_city;
	private double tarifa;
	private Hashtable<String, Diccionario> planta_ele = new Hashtable<String, Diccionario>();
	private Hashtable<String, Diccionario> planta_ele2 = new Hashtable<String, Diccionario>();
	
	
	
	public Diccionario(int[] dic) {
		
		this.consumo_city= dic;
	}
	public Diccionario(Hashtable<String, Diccionario> planta_ele) {
		this.planta_ele= planta_ele;
	}
	
	
	
	
	public void showdic() {
		for( int i=0; i< consumo_city.length ; i++) {
			System.out.println(consumo_city[i]);
		}
	}
	
	public int calculo_megavatios() {
		int suma = 0;
		for(int i=0; i< consumo_city.length;i++) {
		
			suma= consumo_city[i]+suma;
			
		}
		return suma;
	}


	public Hashtable<String, Diccionario> getPlanta_ele() {
		return planta_ele;
	}
	public int[] getConsumo_city() {
		return consumo_city;
	}
	
	public double getTarifa() {
		return tarifa;
	}
	


	
	
	
}
