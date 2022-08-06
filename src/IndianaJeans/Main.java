package IndianaJeans;

import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException,InterruptedException {
		int opcion;
		Producto producto1 = new Producto();
		ProductoServicio lista1 = new ProductoServicio();
		ExportarTxt exportar = new ExportarTxt(producto1,lista1);
		
		Scanner teclado = new Scanner(System.in);
				
		do {
			Menu.menu();
			opcion=teclado.nextInt();
		
			if(opcion ==1) {
				System.out.println("Datos del producto: \n");
				lista1.listarProductos();
				System.out.println("----------------------");
				
			}else if(opcion == 2) {
				producto1.crearProductos(null, null, null, null, null, null, null);
			
				
				lista1.agregarProductos(producto1.getArticulo());
				lista1.agregarProductos(producto1.getPrecio());
				lista1.agregarProductos(producto1.getDescripcion());
				lista1.agregarProductos(producto1.getCodigo());
				lista1.agregarProductos(producto1.getTalla());
				lista1.agregarProductos(producto1.getMarca());
				lista1.agregarProductos(producto1.getColor());
				
				
				System.out.println("Producto Creado!!");
				
			}else if(opcion==3){
				System.out.println("EXPORTAR DATOS");
				exportar.exportar(producto1);
				System.out.println("Datos exportados correctamente en formato .txt");
				System.out.println(".............................................");
				
			}else if (opcion==4) {
				System.out.println("Adios");
				break;
			}
				
		}while(opcion==1||opcion==2||opcion==3);
		teclado.close();
	}

}
