package vehiculos;

public class Automóvil extends Vehículo {
	private int puestos;
	private static int cantidadAutomoviles;
	
	public Automóvil(String placa,String nombre,float precio,float peso,Fabricante fabricante,int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos=puestos;
		cantidadAutomoviles++;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}

	public static void setCantidadAutomoviles(int cantidadAutomoviles) {
		Automóvil.cantidadAutomoviles = cantidadAutomoviles;
	}
}
