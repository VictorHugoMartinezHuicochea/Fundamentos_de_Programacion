
package ArbolMerkle;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author victor Hugo 
 */
public class MT {

 
    public static void main(String[] args) {
        // Se crean los elementos del arbol
        ArrayList<String> Bloque = new ArrayList<>();
        Scanner P1= new Scanner(System.in);
        String F1;
                   
        int i=0;
        //agregaremos 5 elementos de prueba, pero podemos aumentarlo
        System.out.println("Digite 5 Frases porfavor");
        for(i=0;i<5;i++)
        {
            F1=P1.nextLine();
            Bloque.add(F1);
        }

        
        //generamos el arbol, le mandamos la lista y obtenemos la raiz
        MT_Nodo raiz = spawnArbol(Bloque);
        
        
        
        System.out.println("La clave es:");
        System.out.println(raiz.getHash());
    }
    
    public static MT_Nodo spawnArbol(ArrayList<String> Bloque) {
        //generamos una nueva lista
        ArrayList<MT_Nodo> Codificar = new ArrayList<>();
        
        //Con el for each, mandamos a codificar los Strings y los agregamos a la lista
        for (String Codin : Bloque) {
            Codificar.add(new MT_Nodo(null, null, MT_Codificador.Codigin(Codin)));
        }
        
        //retornaremos el nodo raiz que se obtiene del metodo al que se le pasa la lista "Codificar"
        return Arbololvo(Codificar);
    }
    

    private static MT_Nodo Arbololvo(ArrayList<MT_Nodo> hojas) {
        //Creamos la lista que contendra a las ramas de los nodos hoja 
        String Palo;
        ArrayList<MT_Nodo> Rama = new ArrayList<>();
        
        /*unificamos a las "hojas" en una "rama", 
        que si no es la RAIZ, entonces las ramas de vuelven hojas y se repite el ciclo*/
        while (hojas.size() != 1) {
            int i = 0, t = hojas.size();
            while (i < t) {
                MT_Nodo hojaizq = hojas.get(i);
                MT_Nodo hojader = null;
                
                //Condiciona para que cuando no exista el elemento, no se agregue 
                if ((i + 1) < t) {
                    hojader = hojas.get(i + 1);
                } else {
                    hojader = new MT_Nodo(null, null, null);
                }
                   
                if(hojaizq.getHash()!=null && hojader.getHash()!=null)
                {
                Palo =hojaizq.getHash() + hojader.getHash();
                }
                else
                {
                Palo =hojaizq.getHash();   
                }
                Rama.add(new MT_Nodo(hojaizq, hojader, Palo));
                i += 2;
                
            }
            //reiniciamos a la lista Rama y la Rama que teniamos vuelve a ser hoja
            hojas = Rama;
            Rama = new ArrayList<>();
            }
        
        //Retornamos 
        return hojas.get(0);
    }
    
    
    
    
    
}
