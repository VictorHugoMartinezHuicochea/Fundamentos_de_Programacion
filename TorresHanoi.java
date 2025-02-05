/*
 * Resuelva las Torres de Hanoi sin usar Recursividad
 */
package torreshanoi;

import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author megah
 */
public class TorresHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n,i,m,j,potint,it,aux,tor;
        double pot;
        // Creamos tres pilas para "simular" las tres torres
        Stack<Integer> Torre1=new Stack<Integer>();
        Stack<Integer> Torre2=new Stack<Integer>();
        Stack<Integer> Torre3=new Stack<Integer>();
        //agragamos los anillos, en este caso 5
        Scanner anillos=new Scanner(System.in);
        
        System.out.println("Bienvenido a las torres de Hanoi");
        System.out.println("Por favor, digite el numero de anillos que desea");
        n=anillos.nextInt();
        System.out.println("Ok, empecemos:");
        
        
        //ponemos los "anillos"
        for(i=n;i>0;i--){
            Torre1.push(i);
        }
        System.out.println("Torre 1 tiene: "+Torre1);
        //sacamos cuantos pasos haremos en total +1 porque necesitamos empezar en 1
        m=2;
        for(i=0;i<(n-1);i++){
            m*=2;
        }
        
        /** creamos un elemento que nos diga que anillo 
         * nos toca poner y otro que nos diga en que parte de la torre esta
         * al cual llenaremos como 1 puesto que todos inician en la torre 1
         **/
        int[] turno=new int[m];
        int[] ub=new int[n+1];
        for(i=1;i<(n+1);i++){
            ub[i]=1;
        }
        
        
        /**le damos el turno que corresponde a cada elemento, cada anillo de la torre de hanoi 
         * se mueve siguiendo una sucesión, el anillo 1 o el mas pequeño siempre se movera en movimientos
         * impares, mientras que los demás (arriba de 2) se moveran si se cumple que el numero de movimiento (n) cumpla que
         * n/(2^[n-1]) sea una división exacta cuyo resultado sea a su vez impar y siga la sucesion 1,3,5,7,...,2(n)+1
         */
        for(i=1;i<m;i++){
            if(i%2!=0){
                turno[i]=1;
            }
            else{
                for(j=n;j>0;j--){
                    pot=Math.pow(2,(j-1));
                    potint=(int)pot;
                    if(i%potint==0){
                       it=i/potint;
                       if(it%2==1){
                           turno[i]=j;
                       }
                    }
                    
                }
            }
            /**
             * Así con esto, sabremos que pieza nos toca mover en el turno correspondiente
             */
                
            
        }
        

        
        /**Movemos las piezas segun su turno, tomamos a las torres como un anillo algebraico con los elementos 0,1,2
         * Dependiendo de si son pares o impares, decidira su movimiento, pero tomemos el ejemplo de que el numero de anillos
         * es impar, entonces los anillos imparas se moveran de 2 en 2 posiciones, ejemplo: 1,3,5,7,9,11,..., mientras que los
         * pares se moveran de 1 en 1, así 1,2,3,4,5,6,7,... 
         * Si recordamos que con el módulo de su division entre 3 nos da 0,1 o 2, podemos utilizarlo para definir a que torre
         * se movera, solo quedaria sacarlo y luego meterlo en la torre correspondiente
         */
        //anillos impares
        if(n%2==1){
            for(i=1;i<m;i++){
                if(turno[i]%2==1){
                    aux=ub[turno[i]];
                    tor=aux%3;
                    switch(tor){
                        case 1:
                            Torre1.pop();
                            Torre3.push(turno[i]);
                            break;
                        case 2:
                            Torre2.pop();
                            Torre1.push(turno[i]);
                            break;
                        case 0:
                            Torre3.pop();
                            Torre2.push(turno[i]);
                            break;
                        default:
                            System.out.println("ayuda");
                    }
                    aux+=2;
                    ub[turno[i]]=aux;
                }
                else{
                    aux=ub[turno[i]];
                    tor=aux%3;
                    switch(tor){
                        case 1:
                            Torre1.pop();
                            Torre2.push(turno[i]);
                            break;
                        case 2:
                            Torre2.pop();
                            Torre3.push(turno[i]);
                            break;
                        case 0:
                            Torre3.pop();
                            Torre1.push(turno[i]);
                            break;
                        default:
                            System.out.println("ayuda");
                    }
                    aux+=1;
                    ub[turno[i]]=aux;
                }
            }
            
            
        }
        //anillos pares
       else{
          for(i=1;i<m;i++){
                if(turno[i]%2==1){
                    aux=ub[turno[i]];
                    tor=aux%3;
                    switch(tor){
                        case 1:
                            Torre1.pop();
                            Torre2.push(turno[i]);
                            break;
                        case 2:
                            Torre2.pop();
                            Torre3.push(turno[i]);
                            break;
                        case 0:
                            Torre3.pop();
                            Torre1.push(turno[i]);
                            break;
                        default:
                            System.out.println("ayuda");
                    }
                    aux+=1;
                    ub[turno[i]]=aux;
                }
                else{
                    aux=ub[turno[i]];
                    tor=aux%3;
                    switch(tor){
                        case 1:
                            Torre1.pop();
                            Torre3.push(turno[i]);
                            break;
                        case 2:
                            Torre2.pop();
                            Torre1.push(turno[i]);
                            break;
                        case 0:
                            Torre3.pop();
                            Torre2.push(turno[i]);
                            break;
                        default:
                            System.out.println("ayuda");
                    }
                    aux+=2;
                    ub[turno[i]]=aux;
                }
            }
            
            
        }
        
        //imprimimos resultado
        System.out.println("Torre 1 ahora tiene "+ Torre1);
        System.out.println("Torre 2 tiene: " +Torre2);
        System.out.println("Torre 3 "+ Torre3);
        
        
    }
    
}
