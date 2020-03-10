package empleado;

public class Empleado {
	
	private String nombre;	// Nombre del empleado
	private String nif;
	private double sueldobase;
	private int irpf;
	private int numhorasextras;
	private boolean casado;
	private int hijos;
	private static double horaextra;
	
	/**
	 * Constructor por defecto
	 */
	public Empleado() {

		// TODO Apéndice de constructor generado automáticamente
	}

	/**
	 * Constructor solo con el parámetro Nif
	 * @param nif
	 */
	public Empleado(String nif) {
		super();
		this.nif = nif;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * @param nif el nif a establecer
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * @return el sueldobase
	 */
	public double getSueldobase() {
		return sueldobase;
	}

	/**
	 * @param sueldobase el sueldobase a establecer
	 */
	public void setSueldobase(double sueldobase) {
		this.sueldobase = sueldobase;
	}

	/**
	 * @return el irpf
	 */
	public int getIrpf() {
		return irpf;
	}

	/**
	 * @param irpf el irpf a establecer
	 */
	public void setIrpf(int irpf) {
		this.irpf = irpf;
	}

	/**
	 * @return el numhoras
	 */
	public int getNumhorasextras() {
		return numhorasextras;
	}

	/**
	 * @param numhoras el numhoras a establecer
	 */
	public void setNumhorasextras(int numhorasextras) {
		this.numhorasextras = numhorasextras;
	}

	/**
	 * @return el casado
	 */
	public boolean isCasado() {
		return casado;
	}

	/**
	 * @param casado el casado a establecer
	 */
	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	/**
	 * @return el hijos
	 */
	public int getHijos() {
		return hijos;
	}

	/**
	 * @param hijos el hijos a establecer
	 */
	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	/**
	 * @return el horaextra
	 */
	public static double getHoraextra() {
		return horaextra;
	}

	/**
	 * @param horaextra el horaextra a establecer
	 */
	public static void setHoraextra(double horaextra) {
		Empleado.horaextra = horaextra;
	}
	/**
	 * Funcion que calcula el complemento
	 * @return
	 */
	public double calculoComplemento() {
		return numhorasextras * horaextra;
	}
	/**
	 * Funcion que calcula el sueldo bruto
	 * @return
	 */
	public double sueldoBruto() {
		return this.sueldobase + this.calculoComplemento();
	}
	/**
	 * Funcion que calcula la retencion cogiendo el irpf, le resta 2 al irpf si esta casado
	 *  y 1 mas por cada hijo
	 * @return
	 */
	public double retencion() {
		
		int irpffinal;
		
		irpffinal = irpf;
		if(casado) {
			irpffinal = irpffinal - 2;
		}
		if(hijos>0) {
			irpffinal = irpffinal - hijos;
		}
		if(irpffinal<0) {
			irpffinal = 0;
		}
		
		return (sueldoBruto() * (irpffinal/100));	
		
	}

	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		String cadena = "";
		cadena += nif + " " + nombre + "\n";
		cadena += "Sueldo Base: " + sueldobase + "\n";
		cadena += "Horas Extras: " + numhorasextras + "\n";
		cadena += "Tipo IRPF: " + irpf + "\n";
		cadena += "Casado: " + (casado?"S":"N") + "\n";
		cadena += "Número de hijos: " + hijos + "\n";
		
		return cadena;
	}
	
	
	
	
	
	
	
	
	
	

}
