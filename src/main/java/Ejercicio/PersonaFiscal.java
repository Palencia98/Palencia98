package Ejercicio;

public class PersonaFiscal {
	String nombre;
	int Edad;
	int Sueldo;
	TipoImpuesto Impuesto;

	public void setnNombre(String _nombre) {
		this.nombre = _nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setnEdad(int _Edad) {
		this.Edad = _Edad;
	}

	public int getEdad() {
		return this.Edad;
	}

	public void setSueldo(int _Sueldo) {
		this.Edad = _Sueldo;
	}

	public int getSueldo() {
		return this.Sueldo;
	}

	public int calcularImpuesto() {
		return -1;
	}

	public void vincularTipoImpuesto(String tipo) {
		if (tipo == "A") {
			TipoImpuesto ImpuestoA = new TipoImpuesto(20, 30, "A");
		} else if (tipo == "B") {
			TipoImpuesto ImpuestoB = new TipoImpuesto(10, 5, "B");
		} else if (tipo == "C") {
			TipoImpuesto ImpuestoC = new TipoImpuesto(30, 25, "C");
		} else {
			TipoImpuesto ImpuestoD = new TipoImpuesto(10, 30, "D");
		}
	}
}
