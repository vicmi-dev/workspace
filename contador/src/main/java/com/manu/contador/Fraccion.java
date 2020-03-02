package com.manu.contador;

public class Fraccion {
int num, den;

privado simplificar() {
	
	
}

//Cálculo del máximo común divisor
private int mcd(){
int u=Math.abs(num);
int v=Math.abs(den);
if(v==0){
return u;
}
int r;
while(v!=0){
r=u%v;
u=v;
v=r;
}
return u;
}

}
