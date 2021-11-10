import java.io.File;
import java.io.IOException;

public class Archivos {
	// en esta clase es donde creamos los archivos

	void comidas(){
		File Comidas = new File("./comidas.txt");
		
		if (!Comidas.exists()) {
			try {
				Comidas.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	void temp() {
		File ComidasTemp = new File("./ComidasTemp.txt");
		
		if (!ComidasTemp.exists()) {
			try {
				ComidasTemp.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	void promo() {
		File Promociones = new File("./Promociones.txt");
		
		if (!Promociones.exists()) {
			try {
				Promociones.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
