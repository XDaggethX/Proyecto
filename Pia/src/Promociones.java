import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Promociones {
	
	Archivos archi = new Archivos();
	ArrayList<String> prom = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	
	// Este metodo es para Agregar promociones o eliminarla
		 void opPromociones() {
			archi.promo();
			int op = 0;
			
			do {
				System.out.println("\n1-Agregar Promocion\n2-Elimnar Promocion\n3-para salir");
				System.out.print("Que deseas hacer: ");
				op = scan.nextInt();
				scan.nextLine();
				switch(op) {
					case 1:
						
						System.out.println("Que promocion que desa ingresar: ");
						prom.add(scan.nextLine());
						
						break;
						
					case 2:
						
						System.out.println("Que promocion quieres eliminar: ");
						String c = scan.next();
						
						for(String i: prom ) {
							if(prom.contains(c)) {
								prom.remove(i);
								prom.remove(i+1);
							}
						}

						
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
}
