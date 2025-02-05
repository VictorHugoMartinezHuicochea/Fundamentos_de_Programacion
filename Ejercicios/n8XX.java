/*
 *Opcion triangular: Desarrolle un programa que lea un caracter X seguido de dos naturales n y c,
 *con c una opcion entre 1 y 4 y escriba en la salida estandar lo siguiente de acuerdo a la opcion elegida.
 *
 *Opcion 1
 *X 
 *X X
 *...
 *X X ... X (n veces)
 *
 *Opcion 2
 *                   X
 *                 X X
 *                 ...
 * (n veces) X ... X X
 *
 *Opcion 3
 *X X ... X (n veces)
 *...
 *X X
 *X
 *
 *Opcion 4
 *(n veces) X ... X X
 *                ...
 *                X X
 *                  X
 */
package n9xx;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class n8XX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner C1=new Scanner(System.in);
        Scanner I1=new Scanner(System.in);
        Scanner I2=new Scanner(System.in);
        String X;
        int N,C,i,e,j,k,l;
        
        System.out.println("Por favor digite un caracter (en caso de ser mas deuno solo se tomara el primero), las veces que desea replicarlo y la opcion de visualizacion (entre el 1 y 4):");
        X=C1.nextLine();
        N=I1.nextInt();
        C=I2.nextInt();
        
       
        char y[]=X.toCharArray();
        
        if(C==1)
        {
            for(i=0;i<=N;++i)
            {
                for(e=0;e<i;e++)
                {
                System.out.print(y[0]);
                }
                System.out.println();
            }
        }
        if(C==2)
        {
            e=N-1;
            i=1;
            for(j=0;j<N;++j)
            {
                for(k=0;k<e;k++)
                {
                    System.out.print(" ");
                }
                for(l=0;l<i;l++)
                {
                    System.out.print(y[0]);
                }
                e--;
                i++;
                System.out.println();
            }
        }
        if(C==3)
        {
            i=N;
            while(i>=0)
            {
                for(e=0;e<i;e++)
                {
                System.out.print(y[0]);
                }
                System.out.println();
                i--;
            }
        }
        
        if(C==4)
        {
            i=N;
            e=1;
            for(j=0;j<N;++j)
            {
                for(k=0;k<e;k++)
                {
                    System.out.print(" ");
                }
                for(l=0;l<i;l++)
                {
                    System.out.print(y[0]);
                }
                e++;
                i--;
                System.out.println();
            }
        }
        if(C<1 || C>4)
        {
            System.out.println("Por favor digite una presentacion valida");
        }
        
        
    }
    
}
