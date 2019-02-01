package programa10a;

import java.util.Scanner;

public class programa10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte noProductos=0, i=0;
		Scanner leer = new Scanner(System.in);
		double precioProducto=0.0, suma=0, aumento=0.0;
		
		System.out.print("Ingrese el numero de productos:");
		noProductos=leer.nextByte();
		
		i++;
		do {
			System.out.print("Ingrese el precio del producto"+i+":");
			precioProducto=leer.nextDouble();
			suma+=precioProducto;
			i++;
		}while(i<=noProductos);
		
		if (suma>=1500) {
			aumento=suma*0.11;
		}else {
			aumento = suma*0.10;
		}
		System.out.println("Total de productos:"+noProductos);
		System.out.println("El monto es: "+suma);
		System.out.println("El monto total es:"+(aumento));
		System.out.println("El monto total es:"+(suma+aumento));

	}

}
