package com.fran.LambdaFeb20;

public class MiniCesar {

		
		public static void codificarCesar(char letra, int numero) {
			if((letra+numero)>'z') {
				System.out.println((char)(((letra+numero)-25)));
			}
			else {
				System.out.println((char)((letra+numero)));
			}
		}
		
		public static void main(String[] args) {
			
			codificarCesar('h', 3);
			codificarCesar('o', 3);
			codificarCesar('l', 3);
			codificarCesar('a', 3);
			
			
			
		}


}
