package Ejercicio;

public class TipoImpuesto {
	int Porcentaje;
	int Porcentaje30;
	String Nombre;

	public TipoImpuesto(int _porcentaje, int _porcentaje30, String _nombre) {
		this.Porcentaje = _porcentaje;
		this.Porcentaje30 = _porcentaje30;
		this.Nombre = _nombre;

	}

	public void setPorcentaje(int _Porcentaje) {
		this.Porcentaje = _Porcentaje;
	}

	public int getPorcentaje() {
		return this.Porcentaje;
	}

	public void setPorcentaje30(int _Porcentaje30) {
		this.Porcentaje30 = _Porcentaje30;
	}

	public int getPorcentaje30() {
		return this.Porcentaje30;
	}

	public void setNombre(String _Nombre) {
		this.Nombre = _Nombre;
	}

	public String getNombre() {
		return this.Nombre;
	}

}
