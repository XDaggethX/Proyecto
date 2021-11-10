import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Comidas extends Archivos {

	ArrayList<String> comi = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	Archivos archi = new Archivos();
	
	// Este metodo es para Agregar comida o eliminarla
		 void opComidas() {
			archi.comidas();
			int op = 0;
			
			do {
				System.out.println("\n1-Agregar comida\n2-Elimnar comida\n3-para salir");
				System.out.print("Que deseas hacer: ");
				op = scan.nextInt();
				scan.nextLine();
				switch(op) {
					case 1:
						System.out.println("Nombre de la comida que desa ingresar: ");
						comi.add(scan.nextLine());
						
						System.out.println("Precio de la comida que desa ingresar: ");
						comi.add(scan.nextLine());
						
						break;
						
					case 2:
						System.out.println("Que comida  quieres elimnar: ");
						String c = scan.next();
						
						for(String i: comi ) {
							if(comi.contains(c)) {
								comi.remove(i);
								comi.remove(i+1);
							}
						}

						
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
