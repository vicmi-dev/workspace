package com.exionarixdan.ejerciciosPOO;

import java.time.LocalDate;

public class Fecha {
	private int day, month, year;

	public Fecha() {
		super();
	}

	public Fecha(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	private boolean esBisiesto(int year) {
		return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? true : false;
	}

	public boolean fechaCorrecta() {
		// Con Java 8
//		try {
//			LocalDate ld = LocalDate.of(this.year, this.month, this.day);
//			return true;
//		} catch (Exception e) {
//			return false;
//		}

		// Con Java 5
		if (this.month < 1 || this.month > 12) {
			return false;
		} else if ((this.month % 2 == 1 && this.month < 8) || (this.month % 2 == 0 && this.month > 7)) {
			return (this.day <= 31 && this.day >= 0) ? true : false;
		} else if (((this.month % 2 == 1 && this.month > 8) || (this.month % 2 == 0 && this.month < 7))
				&& this.month != 2) {
			return (this.day <= 30 && this.day >= 0) ? true : false;
		} else {
			return ((this.day <= 29 && this.day >= 0 && esBisiesto(this.year))
					|| (this.day <= 28 && this.day >= 0 && !esBisiesto(this.year))) ? true : false;
		}
	}

	public void diaSiguiente() {
		// Con Java (8
//		LocalDate ld = LocalDate.of(this.year,this.month,this.day);
//		LocalDate diasiguiente = ld.plusDays(1);
//		this.year = diasiguiente.getYear();
//		this.month = diasiguiente.getMonthValue();
//		this.day = diasiguiente.getDayOfMonth();

		// Con Java 5
		this.day++;
		if (!fechaCorrecta()) {
			this.day = 1;
			this.month++;
			if (!fechaCorrecta()) {
				this.month = 1;
				this.year++;
			}
		}
	}

	@Override
	public String toString() {
		return (this.day < 10 ? "0" + this.day : "" + this.day) + "-"
				+ (this.month < 10 ? "0" + this.month : "" + this.month) + "-" + this.year;
	}
}
