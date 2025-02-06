/* Numero de Cuenta: 2022330395
 * Nombre: Victor Hugo Martinez Huicochea
 * Materia: Analisis de Algoritmos
 */

//iniciamos con la declaracion de librerias y demas
#include <iostream>

using namespace std;

//declaramos las funciones primitivas
void lcslength(char x[],char y[],int b[][7],int c[][7]);
void lcsprint(int b[][7],char x[],int i,int j);
//funcion principal
int main(){
	//Creamos las secuencias principales a las que vamos a obtener el LCS
	
	char x[]="ABCBDAB";//Tiene tamano 7
	char y[]="BDCABA";//Tiene tamano 6
	
	//Iniciamos el programa
	cout<<"Vamos a calcular la subsecuencia mas larga entre ABCBDAB y BDCABA\nIniciando... \nProcesando...\n\n";
	
	/* Creamos la memoria para el programa, en este caso, 
	 * seran dos, una para las direcciones (b) y otra para comparar(c)
	 * seran bidimensionales teniendo como tamano las domensiones de 
	 * los arrays mas 1 */
	int b[8][7];
	int c[8][7];
	
	//Evocamos la funcion para determinar la LCS de ambos
	lcslength(x,y,b,c);
	
	//La imprimimos y motrasmos en pantalla
	cout<<"La subsecuencia mas larga es: \n";
	lcsprint(b,x,7,6);
	
	
	//Fin del programa :D
	cout<<"\n Fin del programa :D";
	return 0;
}

//Iniciamos la funcion lcslength
void lcslength(char x[],char y[],int b[][7],int c[][7]){
	//Declaramos variables
	int n,m,i,j;
	//Las inicializamos, m tomara el tamano de x+1 y n el tamano de y+1
	m=7;
	n=6;
	
	/*La razon de que sea el tamano de x+1 y y+1 es para poner en los extremos 0,
	 * esto con la finalidad de evitar errores*/
	 
	for(i=1;i<=m;i++){
		c[i][0]=0;
	}
	for(j=0;j<=n;j++){
		c[0][j]=0;
	}
	
	
	/* Iniciamos los for anidados, que son conforme a m y n yy lo que le da tiempo O(nm), lo que haremos
	 * sera recorrer los dos subsecuencias principales*/
	
	//Este for se movera en x, iniciamos en 1 para no interferir con los extremos marcados en 0
	for(i=1;i<=m;i++){
		//Este se movera en y
		for(j=1;j<=n;j++){
			/* Como estamos manejando en x+1 y y+1, entonces 
			 * debemos restarlo para concordar con los arrays x y y
			 * En este caso vamos comparando los arrays en caso de que sean iguales*/
			if(x[i-1]==y[j-1]){
				//Sumaremos 1 a la direccion de memoria anterior y lo guardaremos en la actual
				c[i][j]=c[i-1][j-1]+1;
				/* determinaremos la direccion de b, este 
				 * acorde a las direcciones cardinales
				 * N=1 NO=2 O=3 SO=4 S=5 SE=6 E=7 NE=8
				 * En este caso indicaremos que debemos movernos en diagonal al
				 * Noroeste */
				b[i][j]=2;
			}
			/* En caso de no ser iguales compararemos la memoria
			 * si el numero de arriba resulta ser mayor o igual al
			 * de la izquierda*/
			else if(c[i-1][j]>=c[i][j-1]){
				//El actual toma el valor alto
				c[i][j]=c[i-1][j];
				//Marcamos hacia arriba
				b[i][j]=1;
			}
			//Si resulta lo contrario
			else{
				//El actual toma el valor alto
				c[i][j]=c[i][j-1];
				//Marcamos que debemos mover hacia la izquierda
				b[i][j]=3;
			}
		}
	}
	
}


//Iniciamos la funcion lcsprint
void lcsprint(int b[][7],char x[],int i,int j){
	//Si i==0 o j==0 retornamos, esto es la base
	if(i==0 || j==0){
		return;
	}
	/* Nos iremos moviendo de acuerdo a la memoria de b,
	 * en busqueda de los que son iguales 
	 * (Es decir cuando nos movimos en diagonal)*/
	//en caso de ir en diagonal
	if (b[i][j]==2){
		//Mandamos de nuevo pero nos movemos a la direccion de memoria en diagonal
		lcsprint(b,x,i-1,j-1);
		//Imprimimos la cadena
		cout<<x[i-1];
	}
	//En caso de que no fuera en diagonal, nos movemos segun la direccion de b
	else if(b[i][j]==1){
		//Hacia arriba
		lcsprint(b,x,i-1,j);
	}
	else{
		//Hacia la izquierda
		lcsprint(b,x,i,j-1);
	}
}
