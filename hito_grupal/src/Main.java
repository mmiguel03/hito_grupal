import java.util.ArrayList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Bebida> bebidas = new ArrayList<Bebida>(); 
		Scanner lector = new Scanner(System.in);
		String opc;
		do {
			
		System.out.println("Maquina de Caf�");
		System.out.println("------------------------");
		System.out.println("1. Caf� solo ---- 1,00�");
		System.out.println("2. Caf� con leche ---- 1,20�");
		System.out.println("3. Capuchino ---- 1,30�");
		System.out.println("4. Americano ---- 1,40�");
		System.out.println("5. Salir");
		System.out.println("------------------------");
		System.out.println("Elige la opci�n que quiera");
		opc= lector.nextLine();
		
		switch (opc) {
		case "1":
			bebidas.add(new Bebida("Caf� solo", (float) 1.30));
			System.out.println("Su Caf� solo, Gracias");
		break;
		
		case "2":
			
			bebidas.add(new Bebida("Caf� con leche", (float) 1.20));
			System.out.println("Su Caf� con leche, Gracias");
		break;
			
		case "3":
			
			bebidas.add(new Bebida("Capuchino", (float) 1.20));
			System.out.println("Su Capuchino, Gracias");
		break;
		
		case "4":
			
			bebidas.add(new Bebida("Americano", (float) 1.00));
			System.out.println("Su Americano, Gracias");
		break;
		
		case "5":
			System.out.println("Informe de Ventas: ");
			
			System.out.println("Listado de todas las bebidas: ");
			
			float suma = 0;
			for (int i=0;i<bebidas.size();i++) {
					System.out.println(bebidas.get(i));
					
				suma+=bebidas.get(i).getPrecio();
			}
			System.out.println("Recaudaci�n: "+ suma); 
			
			System.out.println("Saliendo...");
			break;
			
		default:{
			System.out.println("Opci�n no valida, pruebe de nuevo");
		}
		
		}
		
		}while (!opc.equals("5"));
	lector.close();
	}

}