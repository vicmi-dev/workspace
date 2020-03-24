package com.manu.repaso;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
	static String text = JOptionPane.showInputDialog("Introduce un número");

	public static void devolverNum() {

		int txtN = Integer.parseInt(text);
		int largo = text.length();
		// System.out.println(txtN);
		for (int i = (int) Math.pow(10, (largo - 1)); i > 0; i = i / 10) {
			int num = txtN / i;
			System.out.println(num);
		}
	}

	public static void devolverInv() {
		String text = JOptionPane.showInputDialog("Introduce un número");
		int txtN = Integer.parseInt(text);
		int largo = text.length();
		// 11System.out.println(txtN);
		for (int i = 10; i <= (int) Math.pow(10, (largo)); i = i * 10) {
			int num = txtN % i;
			System.out.println(num);
		}
	}

	public static void fibonacci() {
		int rep = Integer.parseInt(text);
		int second = 1;
		int third = 1;
		System.out.print("1, 1");
		for (int i = 2; i < rep; i++) {
			third = second + third;
			second = third - second;
			System.out.print(", " + third);
		}
	}

	public static void binary() {
		int num = Integer.parseInt(text);
		List<Integer> binario = new ArrayList<Integer>();
		while (num > 0) {
			binario.add(0, num % 2);
			num = num / 2;
		}
		for (int i = 0; i < binario.size(); i++) {
			System.out.print(binario.get(i));
		}

	}

	public static void binaryInv() {
		int txtN = Integer.parseInt(text);
		List<Integer> binario = new ArrayList<Integer>();
		int resultado = 0;

		while (txtN > 0) {
			binario.add(txtN % 10);
			txtN = txtN / 10;
		}
		for (int i = 0; i < binario.size(); i++) {
			resultado = (int) (resultado + binario.get(i) * Math.pow(2, i));
		}
		System.out.println(resultado);
	}

	public static void romanos() {
		int numVeces;
		List<String> numRom = new ArrayList<String>();
		int largo = text.length();
		int txtN = Integer.parseInt(text);
		if (largo == 4) {
			numVeces = txtN / 1000;
			txtN = txtN - numVeces * 1000;
			while (numVeces > 0) {
				numRom.add("M");
				numVeces--;
			}
			numVeces = txtN / 100;
			txtN = txtN - numVeces * 100;
			if (numVeces == 9) {
				numRom.add("CM");
			} else if (numVeces == 8) {
				numRom.add("DCCC");
			} else if (numVeces == 7) {
				numRom.add("DCC");
			} else if (numVeces == 6) {
				numRom.add("DC");
			} else if (numVeces == 5) {
				numRom.add("D");
			} else if (numVeces == 4) {
				numRom.add("CD");
			} else if (numVeces == 3) {
				numRom.add("CCC");
			} else if (numVeces == 2) {
				numRom.add("CC");
			} else if (numVeces == 1) {
				numRom.add("C");
			}
			numVeces = txtN / 10;
			txtN = txtN - numVeces * 10;
			if (numVeces == 9) {
				numRom.add("XC");
			} else if (numVeces == 8) {
				numRom.add("LXXX");
			} else if (numVeces == 7) {
				numRom.add("LXX");
			} else if (numVeces == 6) {
				numRom.add("LX");
			} else if (numVeces == 5) {
				numRom.add("L");
			} else if (numVeces == 4) {
				numRom.add("XL");
			} else if (numVeces == 3) {
				numRom.add("XXX");
			} else if (numVeces == 2) {
				numRom.add("XX");
			} else if (numVeces == 1) {
				numRom.add("X");
			}
			numVeces = txtN;
			if (numVeces == 9) {
				numRom.add("IX");
			} else if (numVeces == 8) {
				numRom.add("VII");
			} else if (numVeces == 7) {
				numRom.add("VII");
			} else if (numVeces == 6) {
				numRom.add("VI");
			} else if (numVeces == 5) {
				numRom.add("V");
			} else if (numVeces == 4) {
				numRom.add("IV");
			} else if (numVeces == 3) {
				numRom.add("III");
			} else if (numVeces == 2) {
				numRom.add("II");
			} else if (numVeces == 1) {
				numRom.add("I");
			}
		} else if (largo == 3) {
			numVeces = txtN / 100;
			txtN = txtN - numVeces * 100;
			if (numVeces == 9) {
				numRom.add("CM");
			} else if (numVeces == 8) {
				numRom.add("DCCC");
			} else if (numVeces == 7) {
				numRom.add("DCC");
			} else if (numVeces == 6) {
				numRom.add("DC");
			} else if (numVeces == 5) {
				numRom.add("D");
			} else if (numVeces == 4) {
				numRom.add("CD");
			} else if (numVeces == 3) {
				numRom.add("CCC");
			} else if (numVeces == 2) {
				numRom.add("CC");
			} else if (numVeces == 1) {
				numRom.add("C");
			}
			numVeces = txtN / 10;
			txtN = txtN - numVeces * 10;
			if (numVeces == 9) {
				numRom.add("XC");
			} else if (numVeces == 8) {
				numRom.add("LXXX");
			} else if (numVeces == 7) {
				numRom.add("LXX");
			} else if (numVeces == 6) {
				numRom.add("LX");
			} else if (numVeces == 5) {
				numRom.add("L");
			} else if (numVeces == 4) {
				numRom.add("XL");
			} else if (numVeces == 3) {
				numRom.add("XXX");
			} else if (numVeces == 2) {
				numRom.add("XX");
			} else if (numVeces == 1) {
				numRom.add("X");
			}
			numVeces = txtN;
			if (numVeces == 9) {
				numRom.add("IX");
			} else if (numVeces == 8) {
				numRom.add("VII");
			} else if (numVeces == 7) {
				numRom.add("VII");
			} else if (numVeces == 6) {
				numRom.add("VI");
			} else if (numVeces == 5) {
				numRom.add("V");
			} else if (numVeces == 4) {
				numRom.add("IV");
			} else if (numVeces == 3) {
				numRom.add("III");
			} else if (numVeces == 2) {
				numRom.add("II");
			} else if (numVeces == 1) {
				numRom.add("I");
			}
		} else if (largo == 2) {

			numVeces = txtN / 10;
			txtN = txtN - numVeces * 10;
			if (numVeces == 9) {
				numRom.add("XC");
			} else if (numVeces == 8) {
				numRom.add("LXXX");
			} else if (numVeces == 7) {
				numRom.add("LXX");
			} else if (numVeces == 6) {
				numRom.add("LX");
			} else if (numVeces == 5) {
				numRom.add("L");
			} else if (numVeces == 4) {
				numRom.add("XL");
			} else if (numVeces == 3) {
				numRom.add("XXX");
			} else if (numVeces == 2) {
				numRom.add("XX");
			} else if (numVeces == 1) {
				numRom.add("X");
			}
			numVeces = txtN;
			if (numVeces == 9) {
				numRom.add("IX");
			} else if (numVeces == 8) {
				numRom.add("VII");
			} else if (numVeces == 7) {
				numRom.add("VII");
			} else if (numVeces == 6) {
				numRom.add("VI");
			} else if (numVeces == 5) {
				numRom.add("V");
			} else if (numVeces == 4) {
				numRom.add("IV");
			} else if (numVeces == 3) {
				numRom.add("III");
			} else if (numVeces == 2) {
				numRom.add("II");
			} else if (numVeces == 1) {
				numRom.add("I");
			}
		} else if (largo == 1) {
			numVeces = txtN;
			if (numVeces == 9) {
				numRom.add("IX");
			} else if (numVeces == 8) {
				numRom.add("VII");
			} else if (numVeces == 7) {
				numRom.add("VII");
			} else if (numVeces == 6) {
				numRom.add("VI");
			} else if (numVeces == 5) {
				numRom.add("V");
			} else if (numVeces == 4) {
				numRom.add("IV");
			} else if (numVeces == 3) {
				numRom.add("III");
			} else if (numVeces == 2) {
				numRom.add("II");
			} else if (numVeces == 1) {
				numRom.add("I");
			}
		}
		numRom.forEach(e -> System.out.print(e));
	}

	static void numeroE() {

		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					for (int l = 0; l <= 9; l++) {
						for (int m = 0; m <= 9; m++) {
							System.out.print(i != 3 ? i : "E");
							System.out.print(j != 3 ? j : "E");
							System.out.print(k != 3 ? k : "E");
							System.out.print(l != 3 ? l : "E");
							System.out.println(m != 3 ? m : "E");
						}
					}
				}
			}
		}

	}


	public static void main(String[] args) {
		// devolverInv();
		// devolverNum();
		// fibonacci();
		// binary();
		// binaryInv();
		// romanos();
		//numeroE();
	}
}
