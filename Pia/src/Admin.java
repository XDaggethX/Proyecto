//Aqui agregamos las bibliotecas que necesitaremos
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Admin extends Archivos {	
	
	//Aqui llamamos a la clase archivos, scan y hacemos arreglos
	Archivos archi = new Archivos();
	Comidas comidas = new Comidas();
	Promociones promos = new Promociones();
	Temporadas temps = new Temporadas();
	Scanner scan = new Scanner(System.in);
	
	void admin(){
		
		int op = 0;
		do {
		
			System.out.println("\nA que seccion desea ir:");
			System.out.println("1- para Comidas\n2- para Promociones\n3- para Comidas de temporada\n4-para salir");
			op = scan.nextInt();
			//un switch para ver a que seccion quiere ir
			switch(op) {
				case 1:
					comidas.opComidas();
					
					break;
				case 2:
					promos.opPromociones();
					
					break;
				case 3:
					temps.opComidaTemp();
					
					break;
				
				case 4:
					break;
					
				default:
					System.out.println("Esta opcion no existe, por favor elija la correcta\n");
					break;
			}
			
		}while(op != 4);
	}
}
	