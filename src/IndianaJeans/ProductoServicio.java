package IndianaJeans;

import java.util.ArrayList;

public class ProductoServicio extends Producto {
	
//	************************************
//	ArrayList para contener los productos
//	*************************************
	ArrayList<String>listaProductos = new ArrayList<String>();

	
	
	
	
//	*********************************************
//	Getters que retorne la lista
//	*********************************************
	public ArrayList<String> getListaProductos() {
		return listaProductos;
	}

	
//	*********************************************
//	Setter  que modifica la lista
//	*********************************************
	public void setListaProductos(ArrayList<String> listaProductos) {
		this.listaProductos = listaProductos;
	}

//	*********************************************
//					Metdodos
//	*********************************************	
	
	public void listarProductos () {
		for(int i=0;i<listaProductos.size();i++) {
			System.out.println(getListaProductos().get(i));
		}
	}
	
	
	public void agregarProductos(String dato) {
		listaProductos.add(dato);
		
	}





}
