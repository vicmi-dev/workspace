package com.manu.FechaEj;

import java.util.Calendar;
import java.util.Date;

public class Fecha {
	private int day, month, year;

	public Fecha() {

	}

	public Fecha(int day, int month, int year) {
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

	public boolean esBisiesto() {
		if ((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean fechaCorrecta() {
		boolean correcto=false;
		if (month < 13 && month > 0) {
			if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
					&& (day < 32 && day > 0)) {
				correcto = true;
			} else if (month == 2) {
				if ((day < 29 && day > 0) || (esBisiesto() && day < 30)) {
					correcto = true;
				} else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day < 31 && day > 0)) {
					correcto = true;
				} else {
					correcto = false;
				}
			}
		}
		return correcto;
	}

	public Date diaSiguiente() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, this.year);
		cal.set(Calendar.MONTH, this.month);
		cal.set(Calendar.DAY_OF_MONTH, this.day);
		cal.add(day, 1);
		return cal.getTime();
	}
	//28-12-2015
	@Override
	public String toString() {
		return (this.day<10?"0" + this.day: this.day) + "-" + (this.month<10?"0" + this.month : this.month) + "-" + getYear();
	}

}
