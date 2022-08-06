package IndianaJeans;

import java.util.Scanner;

public class Producto  {

//	****************************************
//				VARIABLES
//	****************************************
	String articulo;
	String precio;
	String descripcion;
	String codigo;
	String talla;
	String marca;
	String color;

//		**********************************
//					GETTERS
//		**********************************

	public String getArticulo() {
		return articulo;
	}

	public String getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTalla() {
		return talla;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

//		************************************
//					SETTERS
//		************************************

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

//		************************************
//				ToString
//		************************************

		@Override
		public String toString() {
			return "Producto [articulo=" + articulo + ", precio=" + precio + ", descripcion=" + descripcion
					+ ", codigo=" + codigo + ", talla=" + talla + ", marca=" + marca + ", color=" + color + "]";
		}
		
		
		
		public void crearProductos(String articulo, String precio, String descripcion, String codigo, String talla, String marca, String color) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingrese nombre del producto: ");
			articulo = teclado.nextLine();
			setArticulo(articulo);
			System.out.println("Ingrese precio del producto: ");
			precio = teclado.nextLine();
			setPrecio(precio);
			System.out.println("Ingrese descripcion del producto: ");
			descripcion = teclado.nextLine();
			setDescripcion(descripcion);
			System.out.println("Ingrese codigo del producto: ");
			codigo = teclado.nextLine();
			setCodigo(codigo);
			System.out.println("Ingrese talla del producto: ");
			talla = teclado.nextLine();
			setTalla(talla);
			System.out.println("Ingrese marca del producto: ");
			marca = teclado.nextLine();
			setMarca(marca);
			System.out.println("Ingrese color del producto: ");
			color = teclado.nextLine();
			setColor(color);
			
		}
		
}
