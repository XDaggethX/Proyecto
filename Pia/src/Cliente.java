import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cliente {
	 //leer un TXT
	
    void leercliente() {
    	
    	File comi = new File("./comidas.txt");
    	File promo = new File("./Promociones.txt");
    	File temp = new File("./ComidasTemp.txt");
        
    	
    	System.out.println("******Comidas*********");
        if(comi != null) {
	        try {
				FileReader fr = new FileReader(comi);
				BufferedReader br = new BufferedReader(fr);
				String linea;
				
				do {
					linea = br.readLine();
					System.out.println(linea);
				}while(linea != null);
			}catch(IOException e) {
				e.printStackTrace();
			}
        }else {
        	System.out.println("No hay comidas \n\n");
        }
        
        System.out.println("******Promociones*********");
        if(promo != null) {
	        try {
				FileReader fr = new FileReader(promo);
				BufferedReader br = new BufferedReader(fr);
				String linea;
				
				do {
					linea = br.readLine();
					System.out.println(linea);
				}while(linea != null);
			}catch(IOException e) {
				e.printStackTrace();
			}
        }else {
        	System.out.println("No hay Promociones \n\n");
        }
        
        
        System.out.println("******Comidas de temporada*********");
        if(temp != null) {
	        try {
				FileReader fr = new FileReader(temp);
				BufferedReader br = new BufferedReader(fr);
				String linea;
				
				do {
					linea = br.readLine();
					System.out.println(linea);
				}while(linea != null);
			}catch(IOException e) {
				e.printStackTrace();
			}
        }else {
        	System.out.println("No hay comidas de temporadas \n\n");
        }
        
    }
}
