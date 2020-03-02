package com.manu.contador;

public class Libro {
	private String titulo, autor;
	private int ejemplares, prestados;
	
	
	
	public Libro() {

	}
	/**
	 * 
	 * @param titulo
	 * @param autor
	 * @param ejemplares
	 * @param prestados
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	public int getPrestados() {
		return prestados;
	}
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
	public boolean prestamo () {
		if (ejemplares>0) {
			this.prestados++;
			this.ejemplares--;
			return true;
			} else {
				return false;
			} 
	}
	
	
	public boolean devolucion() {
		if (prestados>0) {
			this.prestados--;
			this.ejemplares++;
			return true;
			} else {
				return false;
			} 
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ejemplares;
		result = prime * result + prestados;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (ejemplares != other.ejemplares)
			return false;
		if (prestados != other.prestados)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "titulo [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", Prestados=" + prestados
				+ "]";
	}
	
	
}
