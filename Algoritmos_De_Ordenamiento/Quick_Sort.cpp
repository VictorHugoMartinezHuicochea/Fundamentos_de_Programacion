/* Numero de Cuenta: 2022330395
 * Nombre: Victor Hugo Martinez Huicochea
 * Materia: Analisis de Algoritmos
 */

//iniciamos con la declaracion de librerias y demas
#include <iostream>
#include <ctime> 
using namespace std;

//declaramos las funciones primitivas
void sumergir(int a[], int p, int r);
void surgir(int a[],int p, int q, int r);


//funcion principal
int main(){
	//Declaramos para medir el tiempo
	unsigned t0, t1;
	//tomamos el tiempo inicial
	t0=clock();
	
	
	
	
	//Creamos el arreglo que queremos ordenar, aparte de un contador i
	cout<<"Prueba de Quick sort \n";
	int a[20]={10,1,2,56,7,3,9,5,2,3,6,11,3,7,6,5,6,3,2,1};
	int i;
	/* t es el tamaño del arreglo, para no manipular tanto 
	 * el codigo si deseamos arreglos de mayor tamaño*/
	int t=20;
	
	//imprimimos el arreglo
	cout<<"Probemos a ordenar el siguiente arreglo \n";
	for(i=0;i<t;i++){
		cout<<a[i]<<",";
	}
	cout<<"\n";
	
	
	/*llamamos a la funcion sumergir, inicia el procedimiento recursivo
	 *se ocupa t-1 para que en el extremo derecho no ocurran errores*/
	sumergir(a,0,t-1);
	
	//imprimimos el arreglo ya ordenado
	cout<<"Ordenado \n";
	for(i=0;i<t;i++){
		cout<<a[i]<<",";
	}
	cout<<"\n";
	
	
	
	//tomamos el tiempo final
	t1 = clock();
	
	//calculamos cuanto se tardo y lo imprimimos
	double time = (double(t1-t0)/CLOCKS_PER_SEC);
	cout << "Execution Time: " << time << endl;

	
	
	//fin del programa :D
	cout<<"\n Fin del programa :D";
	return 0;
}


//Funcion sumergir, usamos un techo (t), un suelo (s), y un pivote p piso (p)
void sumergir(int a[], int s, int t){
	//inicializamos el pivote y el piso
	int p,piv,cont,i;
	piv=0;

	//si el suelo no es igual al techo
	if(s<t){
		//calculamos el pivote como el promedio del piso
		for(i=s;i<t;i++){
			cont+=a[i];
		}
		//Evitamos errores
		if(i!=0){
			//como cont es int, este se redondea
			cont=cont/i;
			//contamos cuantos son menores al promedio
			for(i=s;i<t;i++){
				if(a[i]<cont){
					//asi creamos un pivote que nos ayuda a colocar el piso
					piv++;	
				}
			}
		}
		
		
		//se le suma al suelo el pivote para saber el piso
		p=s+piv;
		
		/* sumergimos de nuevo, pero ahora el techo cambia del techo T al piso (p)
		 * pensemoslo como un edificio, vas alternando de piso y el nuevo techo es
		 * el piso superior*/
		sumergir(a,s,p);
		//Lo mismo, pero ahora nosotros estamos sobre el piso, el nuevo suelo es el piso actual
		sumergir(a,p+1,t);
		//Al retortar la funcion, entonces da paso a que se pueda ejecutar la funcion surgir
		surgir(a,s,p,t);
	}
	//cuando el suelo y el techo son el mismo, entonces retorna la funcion
}


//Funcion Surgir, usamos un techo (t), un suelo (s), y un piso (s)
void surgir(int a[], int s, int p, int t){
	
	/* declaramos las variables para ordenar nuestra 
	 * "pila de cartas", R de right, L de Left, contadors i y j
	 *  para los bucles y un auxiliar para unificar nuestras "pilas de cartas"*/
	int R,L,i,j,aux;
	
	//L es la diferencia de piso menos suelo mas 1, acota la parte izquierda
	L=p-s+1;
	//R es la diferencia de techo menos piso, acota la parte derecha
	R=t-p;
	
	//Creamos los lugares donde guardaremos "las pilas de cartas", le de Left y ri de Right
	int le[20], ri[20];
	
	//asignamos la pila de cartas a su lugar, la parte izquierda a Le y la derecha a Ri
	for(i=0;i<L;i++){
		le[i]=a[s+i];
	}
	
	for(i=0;i<R;i++){
		ri[i]=a[p+i+1];
	}
	
	
	//En su acotacion o final agregamos un valor muy alto, que cuente como nuestro infinito
	le[L]=999;
	ri[R]=999;
	
	//iniclizamos contadores
	i=0;
	j=0;
	
	//ordenamos las dos pilas en una
	for(aux=s;aux<=t;aux++){
		//si la carte de la derecha es mayor a la de la izquierda, apilamos la izquierda
		if(le[i]<=ri[j]){
			a[aux]=le[i];
			//subimos i, podemos decir que "pasamos a la carta de abajo"
			i++;
		}
		//si la carte de la izquierda es mayo, se apila la derecha
		else{
			a[aux]=ri[j];
			j++;
		}
	}
	
	
}
