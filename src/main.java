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
		
		
		
		
		System.out.println("****EMPRESA ELECTRICA****");
	
		boolean rep=true;
		do {
		System.out.println("\n<1> Presentar total megavatios por ciudad en una planta");
		System.out.println("<2> Total de megavatios a una ciudad por planta");
		System.out.println("<3> Dinero por region");
		System.out.println("<4> Salir\n");
		System.out.println("INGRESA UNA OPCION : ");
		
		
		Scanner scan = new Scanner (System.in);
		int op;
		op = scan.nextInt();
		String name_city, name_plan,name_region;
		int resultotal=0;
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
			int resulcoca1=0 ,resulsop1=0 ,resulsop2=0;
			System.out.println("Ingrese nombre de la region : ");
			name_region=scan1.next();
			int numero=0 ,i;
			
			if(name_region.equals("Sierra")) {
				
				for(i=0; i<consumo_co_quito.length; i++) {
					numero=consumo_co_quito[i]+numero;
					}
				    int resul=numero*75;
				    
				for(i=0; i<consumo_sop_qto.length;i++) {
					numero=consumo_sop_qto[i]+numero;
				    }
				    int resul1=numero*79;
				for(i=0; i<consumo_sop_loja.length; i++) {
					numero=consumo_sop_loja[i]+numero;
				    }
				    int resul2=numero*32;
				    
				    resultotal=resul1+resul2+resul; 
				    
				System.out.println("El dinero recaudado en la Sierra es : $"+resultotal);
			 }
			
			else if(name_region.equals("Costa")) {
				
				for(i=0; i<consumo_co_gya.length; i++) {
					numero=consumo_co_gya[i]+numero;
					}
				    int resul=numero*64;
				    
				for(i=0; i<consumo_sop_gya.length;i++) {
					numero=consumo_sop_gya[i]+numero;
				    }
				    int resul1=numero*85;
				    resultotal=resul1+resul;
				
				System.out.println("El dinero recaudado en la Costa es : $"+resultotal);
				
			  }
			else 
				System.out.println("Error de tipeo");
			
			break;	
		
		case 4:
			rep = false;
			System.out.println(" Gracias por utilizar nuestros servicios :) ");
			break;
		
		
		
		
		
		}
		
		}while(rep!= false);
		
		
		
		
		
		
	}

}
