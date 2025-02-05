/* Numero de Cuenta: 2022330395
 * Nombre: Victor Hugo Martinez Huicochea
 * Materia: Analisis de Algoritmos
 */

//iniciamos con la declaracion de librerias y demas
#include <iostream>
#include <ctime> 
using namespace std;



//funcion principal
int main(){
	//Declaramos para medir el tiempo
	unsigned t0, t1;
	//tomamos el tiempo inicial
	t0=clock();
	
	
	
	//Creamos el arreglo que queremos ordenar, aparte de un contador i
	cout<<"Prueba de Insertion sort \n";
	int a[20]={10,1,2,56,7,3,9,5,2,3,6,11,3,7,6,5,6,3,2,1};
	int i,piv,j;
    
	/* t es el tamaño del arreglo, para no manipular tanto 
	 * el codigo si deseamos arreglos de mayor tamaño*/
	int t=20;
	
	//imprimimos el arreglo
	cout<<"Probemos a ordenar el siguiente arreglo \n";
	for(i=0;i<t;i++){
		cout<<a[i]<<",";
	}
	cout<<"\n";
	
	//Recorremos el arreglo, iniciamos en 1 para poder comparar con el anterior
	for(i=1;i<t;i++)
    {
    	//el pivote se vuelve el valor de avanzada, este queda almacenado en caso de que se requiera permutar
        piv=a[i];
        //j representara al valor anterior del arreglo
        j=i-1;
        //Si el anterior resulta ser mayor
        while(a[j]>piv && j>=0)
        {
        	//el siguiente elemento del arreglo pasa a ser el grande
            a[j+1]=a[j];
            //disminuimos y si el anterior resulta ser mas grande tambien que a[i], tambien lo permutamos
            j--;
        }
        //finalmente almacenamos el pequeno
        a[j+1]=piv;
    }
	
	
	
	
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
