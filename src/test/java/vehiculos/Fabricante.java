package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricantes;
	private static Fabricante fabricaMayorVentas;
	
	public Fabricante(String nombre,Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		
	}
	public static void listafabricantes(Fabricante fabrica) {
		if (fabricantes==null) {
			fabricantes=new ArrayList<Fabricante>();
			fabricantes.add(fabrica);
		}
		else {
		fabricantes.add(fabrica);}
		if(fabricantes==null) {
			fabricaMayorVentas=null;
		}
		else {
			fabricaMayorVentas=fabricantes.get(0);
			int contadorfabricamayorventas=0;
			for (int k=0;k<fabricantes.size();k++) {
				if(fabricantes.get(k)==fabricaMayorVentas) {
					contadorfabricamayorventas++;
				}}
			for(int i=0;i<fabricantes.size();i++) {
				int con=0;
				for (int j=0;j<fabricantes.size();j++) {
					if(fabricantes.get(i)==fabricantes.get(j)) {
						con++;
					}
				}
			
				if(con>=contadorfabricamayorventas) {
					fabricaMayorVentas=fabricantes.get(i);
					contadorfabricamayorventas=con;
				}}}
	}
	
	public Fabricante fabricaMayorVentas() {
		return fabricaMayorVentas;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public Pais getPais() {
		return this.pais;
	}
	public void setPais(Pais pais) {
		this.pais=pais;
	}
}
