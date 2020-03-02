package com.manu.contador;

public class Contador {
	private int cont;

	public Contador() {
	}

	public Contador(int cont) {
		if (cont < 0) {
			this.cont = 0;
		}else {
				this.cont = cont;
			}
		}
	
	public Contador(Contador c) {
		if (c.cont < 0) {
			this.cont = 0;
		}else {
				this.cont = c.cont;
			}
		}
	public void incrementar() {
		this.cont++;
	}
	
	public void decrementar() {
		if (this.cont > 0) {
			this.cont--;
		} else {
			this.cont = 0;
		}
		
		
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		if (cont<0) {
			this.cont = 0;
		} else {
			this.cont = cont;
		}
	}
	
	
	
	}

	
	
