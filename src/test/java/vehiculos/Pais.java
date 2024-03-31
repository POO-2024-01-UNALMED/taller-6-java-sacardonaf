package vehiculos;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises;
	private static Pais paisMasVendedor;
	
	public Pais(String nombre) {
		this.nombre=nombre;
	}
	
	public static void listapais(Pais pais) {
		if (paises==null) {
			paises=new ArrayList<Pais>();
			paises.add(pais);
		}
		else {
		paises.add(pais);}
		if(paises==null) {
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
	
	public Pais paisMasVendedor() {
		return paisMasVendedor;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
}
