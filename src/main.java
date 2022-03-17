import java.util.*;
public class main  {
	
	


	public static void main(String[] args)  {
		
		
		
		int[] consumo_co_quito = {400, 432, 400, 420, 432, 460, 432, 400, 432, 300, 213};
		int[] consumo_co_gya = {120, 55, 32, 120, 75, 32, 150, 55, 32, 120, 97,32};
		
		int[] consumo_sop_gya = {310, 220, 321, 310, 220, 321, 310, 220, 321, 310, 220,321};
		int[] consumo_sop_qto = {400, 432, 587, 400, 432, 587, 400, 432, 587, 400, 432,587};
		int[] consumo_sop_loja = {50, 32, 32, 50, 32, 32, 50, 32, 32, 50, 32,32};
		
		
		
		
		Diccionario tupla1_coca = new Diccionario(consumo_co_quito);
		Diccionario tupla2_coca = new Diccionario(consumo_co_gya);
		
		Diccionario tupla1_sop = new Diccionario(consumo_sop_gya);
		Diccionario tupla2_sop = new Diccionario(consumo_sop_qto);
		Diccionario tupla3_sop = new Diccionario(consumo_sop_loja);
		
		
		
		Hashtable<String, Diccionario> Coca_codo = new Hashtable<String, Diccionario>();
		
		Coca_codo.put("quito",tupla1_coca );
		Coca_codo.put("guayaquil", tupla2_coca);
		
		
		
		Hashtable<String, Diccionario> Sopladora = new Hashtable<String, Diccionario>();
		Sopladora.put("Guayaquil", tupla1_sop);
		Sopladora.put("Quito", tupla2_sop);
		Sopladora.put("Loja", tupla3_sop);
		
		Diccionario Sopladora_p = new Diccionario(Sopladora);
		
		
		
		
		
		boolean rep=true;
		do {
		System.out.println("<1> Presentar total megavatios por ciudad en una planta");
		System.out.println("<2> Total de megavatios a una ciudad por planta");
		System.out.println("<3> Dinero por region");
		System.out.println("<4> Salir");
		
		Scanner scan = new Scanner (System.in);
		int op;
		op = scan.nextInt();
		String name_city, name_plan;
		switch(op) {
		
		case 1:
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese nombre de la planta: ");
			name_plan= sc.next();
			
			if(name_plan.equals("Sopladora")) {
				System.out.println("Ingrese nombre de la ciudad: ");
				name_city = sc.next();
				if(Sopladora.containsKey(name_city) ) 
					
					System.out.println("El total de megavatios de "+name_city+" en la planta: "+name_plan+" es de : "+(Sopladora.get(name_city)).calculo_megavatios());
		
				else 
					System.out.println("No existe esa ciudad en dicha planta");
				
			}
			else if (name_plan.equals("Coca codo sinclair")) {
				System.out.println("Ingrese nombre de la ciudad: ");
				name_city = sc.next();
				if(Coca_codo.containsKey(name_city) ) 
					System.out.println("El total de megavatios de "+name_city+" en la planta: "+name_plan+" es de : "+(Coca_codo.get(name_city)).calculo_megavatios());
					
		
				else 
					System.out.println("No existe esa ciudad en dicha planta");	
			}
			else 
				System.out.println("Error de tipeo");
			
			break;
			
		case 2:
			
			int resulcoca=0, resulsop=0;
			System.out.println("Ingrese nombre de la ciudad: ");
			name_city= scan.next();
			boolean a=Sopladora.containsKey(name_city), b= Coca_codo.containsKey(name_city);
				
			if(a== true && b==true) {
				resulcoca=(Sopladora.get(name_city)).calculo_megavatios(); 
				resulsop=(Coca_codo.get(name_city)).calculo_megavatios();
				System.out.println(name_city+" es abastecida por ambas plantas >> En Coca codo Sinclair con: " +resulcoca +" voltios y Sopladora con: "+ resulsop+" voltios");
			}
			else if(a== false && b== true) {
				resulcoca=(Coca_codo.get(name_city)).calculo_megavatios(); 
				
				System.out.println(name_city+" es abastecida por Coca codo sinclair con: "+ resulsop+" voltios");
			}
			else if(a== true && b== false) {
				resulsop=(Sopladora.get(name_city)).calculo_megavatios(); 
				
				System.out.println(name_city+" es abastecida por Coca codo sinclair con: "+ resulsop+" voltios");
			}
			
			
			break;
			
		case 3:
			
			
			
			break;
		case 4:
			rep = false;
			break;
		
		
		
		
		
		}
		
		}while(rep!= false);
		
		
		
		
		
		
	}


