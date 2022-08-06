package IndianaJeans;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ExportarTxt implements ExportadorTxt{
	
	Producto producto;
	ProductoServicio listaServicio;

	public ExportarTxt(Producto producto, ProductoServicio listaServicio) {
		super();
		this.producto = producto;
		this.listaServicio = listaServicio;
	}

	public void exportar(Producto producto) {
		
		System.out.println("Ingrese la ruta donde desea guardar el archivo .TXT");
		Scanner sc = new Scanner (System.in);
		String directo = sc.next();
		File directorio = new File(directo);
	//	File directorio = new File("src/IndianaJeans/venta");
		
		File documento = new File(directo+"/clientes"+nombreDocumento(0,10)+".txt");
		if (directorio.mkdir()) {
			if (directorio.exists()) {
				System.out.println("Carpeta creada");
			}
		}else {
		//	System.out.println("Carpeta creada con anterioridad");
		}
		
		if (documento.exists()==false) {
			try {
				documento.createNewFile();
				System.out.println("Archivo creado");
				FileWriter escritura = new FileWriter(documento);
				try (BufferedWriter escrituraGrande = new BufferedWriter(escritura)) {
						escrituraGrande.write("Nombre producto: " + producto.getArticulo());
						escrituraGrande.newLine();
						escrituraGrande.write("Precio producto: $" + producto.getPrecio());
						escrituraGrande.newLine();
						escrituraGrande.write("Descripcion producto: " + producto.getDescripcion());
						escrituraGrande.newLine();
						escrituraGrande.write("Codigo producto: " + producto.getCodigo());
						escrituraGrande.newLine();
						escrituraGrande.write("Talla producto: " + producto.getTalla());
						escrituraGrande.newLine();
						escrituraGrande.write("Marca producto: " + producto.getMarca());
						escrituraGrande.newLine();
						escrituraGrande.write("Color producto: " + producto.getColor());
						escrituraGrande.newLine();
		//			}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			
			}
		}
	
	
	public int nombreDocumento(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);

	}







	






	

}
