package vehiculos;
import java.util.ArrayList;

public class País {
	private String nombre;
	private static ArrayList<País> paises;
	private static País paisMasVendedor;
	
	public País(String nombre) {
		this.nombre=nombre;
	}
	
	public static void listapais(País pais) {
		paises.add(pais);
		if(paises.size()==0) {
			paisMasVendedor=null;
		}
		else {
			paisMasVendedor=paises.get(0);
			int contadorpaisMasVendedor=0;
			for (int k=0;k<paises.size();k++) {
				if(paises.get(k)==paisMasVendedor) {
					contadorpaisMasVendedor++;
				}}
			for(int i=0;i<paises.size();i++) {
				int con=0;
				for (int j=0;j<paises.size();j++) {
					if(paises.get(i)==paises.get(j)) {
						con++;
					}
				}
			
				if(con>=contadorpaisMasVendedor) {
					paisMasVendedor=paises.get(i);
					contadorpaisMasVendedor=con;
				}}}
	}			
	
	public País paisMasVendedor() {
		return paisMasVendedor;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
}
