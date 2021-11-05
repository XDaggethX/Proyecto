import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//llamamos a las clases cliente y admin
		Admin admin = new Admin();
		Cliente clie = new Cliente();
		
		Scanner sc = new Scanner(System.in);
		int resp =0;
		//entramos en un do while para saber en que usuario desea entrar y vereficamos con otro do while si ingresa un dato incorrecto
		do {
			do {
			   menuEntrada();
			   resp=sc.nextInt();
			   if(resp>3) {
				           System.out.println("***********Error: el numero es muy grande ********* ");
			              }if(resp<=0)
				           System.out.println("****** Error: el numero es menor a cero ");
			    }while(resp<=0 || resp>3);

// una ves ya validado podemos entrar a un switch para poder navegar por el programa
			switch(resp) {
			
			//caso uno si eres administrador********************************************
			case 1:
				System.out.println("********** Has entrado como Administrador******* ");
				admin.admin();
				break;
				
				
			//caso dos si eres cliente***************************************************	
			case 2:
				System.out.println("********** Has entrado como Cliente******* ");
				clie.leercliente();
				break;
			
			}
		
			
		    }while(resp!=3);
//saliendo del programa*************************************
	System.out.println("Esperemos y halla encontrado lo que buscaba regrese pronto!!!!! ");	
	sc.close();	

	}
	
	public static void menuEntrada(){
    	System.out.println("**********Con que usuario desea entrar?******* ");
        System.out.println("1- Administración ");
        System.out.println("2- Cliente ");
        System.out.println("3- para salir");
        
        return;	
	}
	
	 
}