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

public class Admin extends Archivos  {
	
	//Aqui llamamos a la clase archivos, scan y hacemos arreglos
	Archivos archi = new Archivos();
	ArrayList<String> comi = new ArrayList<String>();
	ArrayList<String> temp = new ArrayList<String>();
	ArrayList<String> prom = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	
	void admin(){
		
		int op = 0;
		do {
		
			System.out.println("A que seccion desea ir:");
			System.out.println("1- para Comidas\n2- para Promociones\n3- para Comidas de temporada\n4-para salir");
			op = scan.nextInt();
			//un switch para ver a que seccion quiere ir
			switch(op) {
				case 1:
					opComidas();
					break;
				case 2:
					opPromociones();
					break;
				case 3:
					opComidaTemp();
					break;
				
				case 4:
					break;
					
				default:
					System.out.println("Esta opcion no existe, por favor elija la correcta\n");
					break;
			}
			
		}while(op != 4);
	}
	
	// Este metodo es para Agregar comida o eliminarla
	private void opComidaTemp() {
		archi.temp();
		int op = 0;
		do {
			System.out.println("1-Agregar comida de temporada\n2-Elimnar comida de temporada\n3-para salir");
			System.out.print("Que deseas hacer: ");
			op = scan.nextInt();
			scan.next();
			switch(op) {
				case 1:
					System.out.println("Nombre de la comida de temporada que desa ingresar: ");
					temp.add(scan.next());
					
					System.out.println("Precio de la comida de temporada que desa ingresar: ");
					temp.add(scan.next());
					
					break;
					
				case 2:
					System.out.println("Que comida de temporada quieres elimnar: ");
					String c = scan.nextLine();
					
					//Abrimos el archivo para eliminarlo
					File inputFile = new File("./ComidasTemp.txt");
					File outputFile = new File("./ComidasTemp.txt");

					try {
						// aqui usamos uno para leerlo y otro para sobreescribirlo
						BufferedReader reader = new BufferedReader(new FileReader(inputFile));
						BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

					    String Line;
					    
					    //aqui buscamos para eliminar
					    while((Line = reader.readLine()) != null) {                        
					        if(Line.trim().equals(c)){ 
					            continue;
					        }
					        //aqui eliminamos
					        writer.write(Line + System.getProperty("line.separator"));
					    }       
					    
					    //cerramos el archivo
					    writer.close();
					    reader.close();

					    } catch (IOException e) {
					        e.printStackTrace();
					    }
					
					System.out.println("Comida Eliminada ");
					break;
					
				case 3:
					break;
					
				default:
					System.out.println("Esta opcion no existe, por favor elija la correcta\n");
					break;
			}
		}while(op !=3);
		
		//Aqui abrimos y cerramos el archivo
		try{
			FileWriter fw = new FileWriter ("./ComidasTemp.txt",true);
			PrintWriter pw = new PrintWriter(fw);
		
			for (String i : temp) {
				pw.println(i);
			}
			pw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	// Este metodo es para Agregar promociones o eliminarla
	private void opPromociones() {
		archi.promo();
		int op = 0;
		do {
			System.out.println("1-Agregar Promocion\n2-Elimnar Promocion\n3-para salir");
			System.out.print("Que deseas hacer: ");
			op = scan.nextInt();
			scan.next();
			switch(op) {
				case 1:
					System.out.println("Que promocion que desa ingresar: ");
					prom.add(scan.next());
					
					break;
					
				case 2:
					System.out.println("Que promocion quieres eliminar: ");
					String c = scan.nextLine();
					
					//Abrimos el archivo para eliminarlo
					File inputFile = new File("./Promociones.txt");
					File outputFile = new File("./Promociones.txt");
					  
					try {
						// aqui usamos uno para leerlo y otro para sobreescribirlo
						BufferedReader reader = new BufferedReader(new FileReader(inputFile));
					    BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

					    String Line;
					    
					    //aqui buscamos para eliminar
					    while((Line = reader.readLine()) != null) {                        
					        if(Line.trim().equals(c)){ 
					            continue;
					        }
					        //aqui eliminamos
					        writer.write(Line + System.getProperty("line.separator"));
					    }       
					    
					    //cerramos el archivo
					    writer.close();
					    reader.close();

					    } catch (IOException e) {
					        e.printStackTrace();
					    }
					
					
					System.out.println("Comida Eliminada ");
					break;
					
				case 3:	
					break;	
				
				default:
					System.out.println("Esta opcion no existe, por favor elija la correcta\n");
					break;
			}
		}while(op !=3);
		//Aqui abrimos y cerramos el archivo
		try{
			FileWriter fw = new FileWriter ("./Promociones.txt",true);
			PrintWriter pw = new PrintWriter(fw);
		
			for (String i : prom) {
				pw.println(i);
			}
			pw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

	// Este metodo es para Agregar comida o eliminarla
	private void opComidas() {
		archi.comidas();
		int op = 0;
		do {
			System.out.println("1-Agregar comida\n2-Elimnar comida\n3-para salir");
			System.out.print("Que deseas hacer: ");
			op = scan.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("Nombre de la comida que desa ingresar: ");
					comi.add(scan.next());
					
					System.out.println("Precio de la comida que desa ingresar: ");
					comi.add(scan.next());
					
					break;
					
				case 2:
					System.out.println("Que comida  quieres elimnar: ");
					String c = scan.next();
					
					//Abrimos el archivo para eliminarlo
					File inputFile = new File("./comidas.txt");
					   File outputFile = new File("./comidas.txt");

					    try {
					    	// aqui usamos uno para leerlo y otro para sobreescribirlo
					      BufferedReader reader = new BufferedReader(new FileReader(inputFile));
					      BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

					    String Line;
					    
					    //aqui buscamos para eliminar
					    while((Line = reader.readLine()) != null) {                        
					        if(Line.trim().equals(c)){ 
					            continue;
					        }
					        //aqui eliminamos
					        writer.write(Line + System.getProperty("line.separator"));
					    }       
					    
					    //cerramos el archivo
					    writer.close();
					    reader.close();

					    } catch (IOException e) {
					        e.printStackTrace();
					    }
					
					System.out.println("Comida Eliminada ");
					break;
					
				case 3:
					break;
					
				default:
					System.out.println("Esta opcion no existe, por favor elija la correcta\n");
					break;
			}
		}while(op !=3);
		//Aqui abrimos y cerramos el archivo
		try{
			FileWriter fw = new FileWriter ("./comidas.txt",true);
			PrintWriter pw = new PrintWriter(fw);

			
			for (String i : comi) {
				pw.println(i);
			}
			pw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
