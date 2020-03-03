package com.manu.complejo;

public class Complejo {
		private double real;
		private double imagine;
		
		public Complejo() {
			this(0.0,0.0);
		}

		public Complejo(double real, double imagine) {
			this.real = real;
			this.imagine = imagine;
		}
		
		
		public Complejo sumar (Complejo c) {
			Complejo res = new Complejo();
			res.setReal(this.real + c.getReal());
			res.setImagine(this.imagine + c.getImagine());
			return res;
		}
		
		public Complejo restar (Complejo c) {
			Complejo res = new Complejo();
			res.setReal(this.real - c.getReal());
			res.setImagine(this.imagine - c.getImagine());
			return res;
		}
		public Complejo multiplicar (Complejo c) {
			
			Complejo res = new Complejo();
			res.setReal((this.real * c.getReal()) - (this.imagine * c.getImagine()));
			res.setImagine((this.real * c.getImagine()) + (this.imagine * c.getReal()));
			return res;
		}
		public Complejo multiplicar (double mult) {
			
			Complejo res = new Complejo();
			res.setReal((this.real * mult));
			res.setImagine((this.real * mult));
			return res;
		}

		public Complejo dividir (Complejo c) {
			
			Complejo res = new Complejo();
			res.setReal((this.real*c.getReal() + this.imagine * c.getImagine()) / (Math.pow(c.getReal(),2) + Math.pow(c.getImagine(),2)));
			res.setImagine((this.imagine*c.getReal()-this.real*c.getImagine()) / (Math.pow(c.getReal(), 2) + Math.pow(c.getImagine(), 2)));
			return res;															
		}

		public double getReal() {
			return real;
		}

		public void setReal(double real) {
			this.real = real;
		}

		public double getImagine() {
			return imagine;
		}

		public void setImagine(double imagine) {
			this.imagine = imagine;
		}
		
		

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(imagine);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(real);
			result = prime * result + (int) (temp ^ (temp >>> 32));
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
			Complejo other = (Complejo) obj;
			if (Double.doubleToLongBits(imagine) != Double.doubleToLongBits(other.imagine))
				return false;
			if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "(" + real + "," + imagine + ")";
		}
		
		
		
	/*
	 * 
	 dividir para dividir dos números
	 * complejos: (a, b) / (c, d) = ((a*c + b*d) / (c2 + d2 ) , (b*c – a*d) / (c2 +
	 * d2 ))
	 */
	}

