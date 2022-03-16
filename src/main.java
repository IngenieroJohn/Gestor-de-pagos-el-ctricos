import java.util.*;
public class main {

	public static void main(String[] args) {
		ArrayList<Consumo> cons = new ArrayList<Consumo>();
		int[] consumo_co_quito = {400, 432, 400, 420, 432, 460, 432, 400, 432, 300, 213};
		
		
		
		Ciudad city = new Ciudad(1, "Quito", consumo_co_quito);
		Plan_Electrica planelec = new Plan_Electrica(1, "Coca codo", 65, city  );  
		Consumo consumo = new Consumo (1, planelec);
		
		Ciudad city2 = new Ciudad(1, "Quito", consumo_co_quito);
		Plan_Electrica planelec2 = new Plan_Electrica(2, "Sopladora", 79, city  );
		Consumo consumo2 = new Consumo (2, planelec2);
		
		
		
		
		cons.add(consumo);
		cons.add(consumo2);
		
		
		
		System.out.println(((cons.get(0)).getPlan()).toString()+ consumo_co_quito);
		System.out.println(((cons.get(1)).getPlan()).toString());
	}

}
