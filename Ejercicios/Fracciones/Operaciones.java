package fracciones;

import java.util.Scanner;

/**
 *
 * @author megah
 */
public class Operaciones {
    private int n,d;
    Scanner p=new Scanner(System.in);
    
    
    //Constructor
    public Operaciones(int n,int d){
        this.n=n;
        if(d!=0){
            this.d=d;
        }
        else{
            while(d==0){
                System.out.println("Error. Digite un denominador valido");
                d=p.nextInt();
            }
            this.d=d;
        }
        //negativo con negativo da positivo
        if(n<0 && d<0){
            this.n=n*-1;
            this.d=d*-1;
        }
    }
    
    
    //operaciones basicas
    public void Suma(Operaciones a,Operaciones b){
        int nn;
        int nd;
        a.Simplificar();
        b.Simplificar();
        nn=(a.n*b.d)+(b.n*a.d);
        nd=a.d*b.d;
        Operaciones c=new Operaciones(nn,nd);
        c.Simplificar();
        
        if(c.n==0){
            System.out.println("La suma de las fracciones da: 0");
        }
        else{
            System.out.println("La suma de las fracciones da: "+c.n+"/"+c.d);
        }
    }
    public void Resta(Operaciones a,Operaciones b){
        int nn;
        int nd;
        a.Simplificar();
        b.Simplificar();
        nn=(a.n*b.d)-(b.n*a.d);
        nd=a.d*b.d;
        Operaciones c=new Operaciones(nn,nd);
        c.Simplificar();
        
        if(c.n==0){
            System.out.println("La resta de las fracciones da: 0");
        }
        else{
            System.out.println("La resta de las fracciones da: "+c.n+"/"+c.d);
        }
    }
    public void Multiplicacion(Operaciones a,Operaciones b){
        int nn;
        int nd;
        a.Simplificar();
        b.Simplificar();
        nn=a.n*b.n;
        nd=a.d*b.d;
        Operaciones c=new Operaciones(nn,nd);
        c.Simplificar();
        
        if(c.n==0){
            System.out.println("La multiplicacion de las fracciones da: 0");
        }
        else{
            System.out.println("La multiplicacion de las fracciones da: "+c.n+"/"+c.d);
        }
    }
    public void Division(Operaciones a,Operaciones b){
        int nn;
        int nd;
        a.Simplificar();
        b.Simplificar();
        nn=a.n*b.d;
        nd=a.d*b.n;
        if(nd!=0){
            Operaciones c=new Operaciones(nn,nd);
            c.Simplificar();
        
            if(c.n==0){
                System.out.println("La division de las fracciones da: 0");
            }
            else{
                System.out.println("La division de las fracciones da: "+c.n+"/"+c.d);
            }
        }
        else{
            System.out.println("No dividas entre 0");
        }
    }
    
    //simplificacion por euclides
    public void Simplificar(){
        int a=n;
        int b=d;
        if(a!=0){
            if(a<0){
                a=-a;
            }
            if(b<0){
                b=-b;
            }
            int c=Euclides(a,b);
            n=n/c;
            d=d/c;
        }      
    }
    public int Euclides(int n,int d){
        while(d!=0){
            if(n>d){
                n=n-d;
            }
            else{
                d=d-n;
            }
        }
        return n;
    }
    public void Simpli(Operaciones a){
        a.Simplificar();
        if(a.n==0){
            System.out.println("Tu fraccion simplificada es: 0");
        }
        else{
            System.out.println("Tu fraccion simplificada es: "+a.n+"/"+a.d);
        }
    }
}