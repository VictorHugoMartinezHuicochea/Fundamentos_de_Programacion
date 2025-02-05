package fracciones;

import java.util.Scanner;

/**
 *
 * @author megah
 */
public class Fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        int n1,d1,pacman;
        System.out.println("Vamos a hacer operaciones de fracciones :D");
        System.out.println("Digite su numerador");
        n1=p.nextInt();
        System.out.println("Digite su denominador");
        d1=p.nextInt();
        System.out.println("Ok su fraccion es: "+n1+"/"+d1);
        System.out.println("Procesando...");
        Operaciones F1=new Operaciones(n1,d1);
        System.out.println("Ahora, que desea hacer con su fraccion:");
        System.out.println("1:Simplificar||2:Sumar||3:Restar||4:Multiplicar||5:Dividir");
        pacman=p.nextInt();
        
        
        if(pacman==1){
            F1.Simpli(F1);
        }
        else{
            System.out.println("Ahora necesitamos otra fraccion:");
            System.out.println("Digite su numerador");
            n1=p.nextInt();
            System.out.println("Digite su denominador");
            d1=p.nextInt();
            System.out.println("Ok su nueva fraccion es: "+n1+"/"+d1);
            System.out.println("Procesando...");
            Operaciones F2=new Operaciones(n1,d1);
            
            switch(pacman){
                case 2:
                    F1.Suma(F1, F2);
                    break;
                case 3:
                    F1.Resta(F1, F2);
                    break;
                case 4:
                    F1.Multiplicacion(F1, F2);
                    break;
                case 5:
                    F1.Division(F1, F2);
                    break;
                default:
                    System.out.println("Digite una opcion valida.Fin del programa");
            }
        }
        
    }
    
}