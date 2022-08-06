package IndianaJeans;

import java.io.IOException;

public  interface ExportadorTxt  {

	public void exportar(Producto producto) ;
	
	public int nombreDocumento(int min, int max);

}
