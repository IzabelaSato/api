package apis;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;


public class Main {
	public static void main(String[] args) {
		
		// colocar data:
		
		Date now = new Date();
		System.out.println (now);
		System.out.println();
		
		// nova API DATE
		String dataUltimaCompra = "20/05/2022 22:00:00";
		System.out.println(dataUltimaCompra);
		System.out.println();
		
		LocalDateTime ldt = LocalDateTime.parse(dataUltimaCompra, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		LocalDateTime now1 = LocalDateTime.now();
		
		Duration d = Duration.between(ldt, now1);
		System.out.println ("Sua ultima compra foi: "+ d.toDays() + " dias");
		System.out.println();
		
		// sem ordena??o
		//List<String> listaMercado = new ArrayList<>();
		
		// com ordena??o
		Set<String> listaMercado = new HashSet<>();
		
		// treeset ordena tbm
		//Set<String> listaMercado = new TreeSet<>();
				
		listaMercado.add("macarr?o");
		listaMercado.add("p?o");
		listaMercado.add("feij?o");
		listaMercado.add("arroz");
		listaMercado.add("batata");
		listaMercado.add("alface");
		
		// para ordenar a lista em ordem alfabetica usa colletions.sort
		
		//Collections.sort(listaMercado);
		
		//	System.out.println (listaMercado);
		
		for (String item : listaMercado) {
			System.out.println ("Item: " + item);
		}
		
		System.out.println();
		/*
		for (String item : listaMercado) {
			System.out.println ("Item Ordenado: " + item);
		}		*/
		
		//------------------------------------------------------------------
		
		//ordena??o usando hash map
		Map<Integer, String> listaMercado2= new HashMap<>();
		
		listaMercado2.put(1, "tomate");
		listaMercado2.put(6, "azeite");
		listaMercado2.put(3, "feij?o");
		listaMercado2.put(7, "arroz");
		listaMercado2.put(5, "batata");
		listaMercado2.put(2, "alface");
		
			System.out.println ("Item Ordenado: " + listaMercado2);
		
		
		System.out.println();
		
		//----------------------------------------------------------------------
		//entry
		
		Set<Map.Entry<Integer, String>> entries = listaMercado2.entrySet();
		
		for (Map.Entry<Integer, String> entry : entries ) {
			System.out.println (entry.getKey()+ " : "+ entry.getValue());
			
		
	}
	

 }
		
}

