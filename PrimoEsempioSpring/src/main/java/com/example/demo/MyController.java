package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	 public String getHello(Model model){
		
   	
		ArrayList<Persona> lista = new ArrayList<Persona>();
		
		lista.add(new Persona("Rossi", "operaio", 2000, "https://m.media-amazon.com/images/I/514ejUU7VHL._AC_UL960_FMwebp_QL65_AIweblab1378949,T1_.jpg"));
		lista.add(new Persona("Bianchi", "funzionario", 2000, "https://m.media-amazon.com/images/I/81ZiOramv5L._AC_UL960_FMwebp_QL65_AIweblab1378949,T1_.jpg"));
		
		model.addAttribute("lista", lista);
		
		 
		 return "hello";
		 
	 }
	
	@GetMapping("/corsoJava")
	 public String getCorso(Model model){
		
String nome = "Carlo";
		
		model.addAttribute("nome", nome);
		
		 
		 return "corso";
		 
	 }

}
