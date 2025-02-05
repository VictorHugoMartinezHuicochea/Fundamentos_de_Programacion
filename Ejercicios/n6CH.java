/*Manejo de cadenas de caracteres. Desarrolle un programa que maneje cadenas de caracteres
 *como arreglos de caracteres con terminador el caracter nulo (’\0’). La funcionalidad a implementar debe ser
 *la siguiente:
 *1. en un entero obtener la longitud de una cadena.
 *2. en una tercer cadena obtener la concatenaci ́on de dos cadenas.
 *3. en un entero obtener el resultado de la comparaci ́on de dos cadenas dada por cero si son iguales, un valor
 *negativo si la primera cadena es menor que la segunda y un valor positivo si la primera cadena es mayor
 *que la segunda. Si dos cadenas son distintas, se utiliza el orden lexicogr ́afico (de diccionoario) para su
 *comparaci ́on, en el primer caracter que sean distintas ah ́ı se indica de acuerdo a la comparaci ́on de esos
 *dos caracteres (ejemplo Roberto es como y Roberta fue al, son iguales en sus primeros seis caracteres,
 *pero en el s ́eptimo o es mayor que a, por lo que la primera cadena es mayor que la segunda). Si dos
 *cadenas tienen diferente longitud y una de ellas es igual en su totalida a la otra, la m ́as larga se considera
 *mayor que la otra (ejemplo hola y hola a todos, la primera cadena es menor que la segundo debido a
 *que en su totalidad es igual a la segunda, pero la segunda es m ́as larga).
 *4. en un entero obtener el  ́ındice donde se encuentra la primera ocurrencia de un caracter dado dentro de
 *una cadena dada o −1 si el caracter no se encuentra dentro de la cadena.
 *5. en un entero obtener el  ́ındice donde se encuentra la primera ocurrencia de una cadena dada dentro de
 *una segunda cadena dada o −1 si la primera cadena no se encuentra dentro de la segunda cadena.
 *6. en una cadena obtener el resutlado de eliminiar todas las ocurrencias de un caracter dado en otra cadena
 *(ejemplo si se quiere eliminar el caracter espacio de la cadena anita lava la tina la cadena resultante
 *quedar ́ıa como anitalavalatina) 
 */
package n6ch;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class N6CH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner P1= new Scanner(System.in);
        Scanner P2= new Scanner(System.in);
        Scanner I1=new Scanner(System.in);
        Scanner I2=new Scanner(System.in);
        Scanner I3=new Scanner(System.in);
        Scanner C1=new Scanner(System.in);
        Scanner C2=new Scanner(System.in);
        String F1, F2, Cont, busc,el, esp;
        int Des,Des2,Des3, V, W, W1, k,k1, n,n1;
        Integer i,i2,i3,a,a1,e, t1,t2, p,pp,p1,pp1,r,r1,r2,r3;
        
        System.out.println("Digite una Frase porfavor");
        F1=P1.nextLine();
        System.out.format("La frase es: %s", F1).println();
        
        System.out.println("Digite una segunda frase: ");
        F2=P2.nextLine();
        System.out.format("La frase es: %s", F2).println();
        
        System.out.println("Dijite a que frase desea contar sus caracteres (pueden ser ambas (3)):");
        Des=I1.nextInt();
        
        //Medicion de cadenas
        switch(Des) 
        {
            case 1: System.out.println("La primera frase tiene un total de palabras de: " + F1.length()); break;
            case 2: System.out.println("La segundo frase tiene un total de palabras de: " + F2.length()); break;
            case 3: System.out.println("La primera frase tiene un total de palabras de: " + F1.length()+ ", y la segundo frase tiene un total de palabras de: " + F2.length()); break;
            default: System.out.println("Digite un numero valido");
        }
        
        //Concatenacion de cadenas
        Cont=F1+ " " +F2;
        System.out.format("La concatenacion es de %s", Cont).println();
       
        //Arrays
        i=0;
        char Fra1[]=F1.toCharArray();
        char Fra2[]=F2.toCharArray();
         while( (i!=(F1.length()-1) && i!=(F2.length()-1)) && Fra1[i]==Fra2[i])
        {   
            i++;   
        }
        e=Fra1[i]-Fra2[i];
        
        //Identificador de cadena mayor
        if(e<0 || (F1.length()<F2.length()))
        {
           System.out.println("La segunda frase es mas grande");
        }
        if(e==0 && F1.length()==F2.length())
        {
           System.out.println("Son iguales las frases");
        }
        if(e>0 ||(F1.length()>F2.length()))
        {
           System.out.println("La primera frase es mas grande");
        }
        
        //Identificador de letra
        System.out.println("Ahora identificaremos una letra dentro de una cadena. Primero diga, que frase desea usar (si quiere en ambas digite 3):");
        Des2=I2.nextInt();
        if (Des2<1 || Des2>3)
        {
            System.out.println("Digite un numero valido");
        }
        System.out.println("Ahora digite la letra que desea buscar");
        busc=C1.nextLine();
        char Bus[]=busc.toCharArray();
        i2=0;
        i3=0;
        if (Des2==1)
        {
            while(i2!=(F1.length()-1) && Fra1[i2]!=Bus[0])
            {   
                i2++;   
            }
            if(Fra1[i2]==Bus[0])
            {
                V=i2+1;
                System.out.format("La letra aparece en la posicion %d",V).println();            
            }
            else
            {
                V=-1;
                System.out.format("La letra no se encuentra: error{%d}",V).println();
            }
        } 
        
        if (Des2==2)
        {
            while(i2!=(F2.length()-1) && Fra2[i2]!=Bus[0])
            {   
                i2++;   
            }
            if(Fra2[i2]==Bus[0])
            {
                V=i2+1;
                System.out.format("La letra aparece en la posicion %d",V).println();            
            }
            else
            {
                V=-1;
                System.out.format("La letra no se encuentra: error{%d}",V).println();
            }
        }
        if (Des2==3)
        {
            while(i2!=(F1.length()-1) && Fra1[i2]!=Bus[0])
            {   
                i2++;   
            }
            while(i3!=(F2.length()-1) && Fra2[i3]!=Bus[0])
            {   
                i3++;   
            }
            if(Fra1[i2]==Bus[0])
            {
                V=i2+1;
                System.out.format("La letra aparece en la primera frase en la posicion %d",V).println();            
            }
            if(Fra2[i3]==Bus[0])
            {
                V=i3+1;
                System.out.format("La letra aparece en la segunda frase en la posicion %d",V).println();            
            }
            if(Fra1[i2]!=Bus[0] && Fra2[i3]!=Bus[0])
            {
                    V=-1;
                    System.out.format("La letra no se encuentra: error{%d}",V).println();
            }
            
            
        }
       //Ver su esta dentro de otro
       if(e==0 && F1.length()<F2.length())
       {
            System.out.println("La segunda frase contiene la primera frase");
       }
       if(e==0 && F1.length()>F2.length())
       {
            System.out.println("La primera frase contiene la segunda frase");
       }
       if(e!=0)
       {
           System.out.println("Ninguna frase esta dentro de otra");
       }
        
       
       //Quitar signos malos
        System.out.println("Ahora quitaremos una letra de su preferencia. Por favor digite la letra que quiere quitar:");
        el=C2.nextLine();
        char Eli[]=el.toCharArray();
        System.out.println("Ahora digite que frase quiere usar(si son ambas digite 3)");
        Des3=I3.nextInt();
        t1=F1.length();
        t2=F2.length();
        char Cor1[];
        Cor1=new char[t1];
        char Cor2[];
        Cor2=new char[t2];
        a=0;
        a1=0;
        if(Des3<1 || Des3>3)
        {
            System.out.println("Por favor digite un numero valido");
        }
        if(Des3==1)
        {
            while(a!=(F1.length()))
            {   
                if(Eli[0]!=Fra1[a])
                {
                    Cor1[a]=Fra1[a];
                }
                a++;
            }
            System.out.println(Cor1);
        }
        if(Des3==2)
        {
            while(a1!=(F2.length()))
            {   
                if(Eli[0]!=Fra2[a1])
                {
                    Cor2[a1]=Fra2[a1];
                }
                a1++;
            }
            System.out.println(Cor2);
        }
        if(Des3==3)
        {
            while(a!=(F1.length()))
            {   
                if(Eli[0]!=Fra1[a])
                {
                    Cor1[a]=Fra1[a];
                }
                a++;
            }
            System.out.println(Cor1);
            
            while(a1!=(F2.length()))
            {   
                if(Eli[0]!=Fra2[a1])
                {
                    Cor2[a1]=Fra2[a1];
                }
                a1++;
            }
            System.out.println(Cor2);
        }
        
        //Palindromos
        esp=" ";
        char ESP[]=esp.toCharArray();
        char pa1[];
        pa1=new char[t1];
        char pa2[];
        pa2=new char[t2];
        p=0;
        pp=0;
        p1=0;
        pp1=0;
        k=0;
        k1=0;
        while(p!=(F1.length()))
            {   
                if(ESP[0]!=Fra1[p])
                {
                    pa1[pp]=Fra1[p];
                    pp++;
                }
                else
                {
                    k++;
                }
                p++;
            }  
        while(p1!=(F2.length()))
            {   
                if(ESP[0]!=Fra2[p1])
                {
                    pa2[pp1]=Fra2[p1];
                    pp1++;
                }
                else
                {
                    k1++;
                }
                p1++;
            }
        W=pa1.length-k-1;
        W1=pa2.length-k1-1;
        r=0;
        r1=1;
        r2=0;
        r3=1;
        n=W/2;
        n1=W1/2;
        while(r!=n && r1!=0)
            {   
                if(pa1[r]==pa1[W])
                {
                  r1=1;
                }
                else
                {
                  r1=0;
                }
                r++;
                W--;
            }  
        if(r1==1)
        {
            System.out.println("La frase 1 es un palindromo");
        }
        else
        {
            System.out.println("La frase 1 no es un palindromo");
        }
        
        while(r2!=n1 && r3!=0)
            {   
                if(pa2[r2]==pa2[W1])
                {
                  r3=1;
                }
                else
                {
                  r3=0;
                }
                r2++;
                W1--;
            }  
        if(r3==1)
        {
            System.out.println("La frase 2 es un palindromo");
        }
        else
        {
            System.out.println("La frase 2 no es un palindromo");
        }
        
       
      
    }
       
}
