package N4FR_Methods;


import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EXPRESS
 */
public class N4FR_Snow extends N4FR_Fractal{
    protected double l;

    public N4FR_Snow(){
        super();
        this.l=10.0;
    }
    
    public N4FR_Snow(int n, JPanel l){
        super(n, l);
        this.l=10.0;
    }

    public N4FR_Snow(int n, double L, JPanel l){
        super(n, l);
        this.l = L;
    }

    public N4FR_Snow(JPanel l){
        super(l);
        this.l=10.0;
    }
    
    public void asignaL(double l){
        this.l = l;
    }
    
    protected void Snowr(int n, double l){
       
        if (n<=0){
            tortuga.avanza(l);
        }
        else {
            double l3 = l/(3);
            double SUN=(l*2*Math.sin(Math.PI/3)/9);
            tortuga.izq(60);
            Snowl(n-1, l3);
            Snowr(n-1,l3);
            tortuga.der(60);
             Snowr(n-1,l3);
            tortuga.der(60);
             Snowr(n-1,l3);
            tortuga.der(150);
            Snowr(n-1,SUN);
            Snowl(n-1, SUN);
            tortuga.izq(60);
            Snowr(n-1,SUN);
            tortuga.izq(60);
            Snowl(n-1, SUN);
            Snowr(n-1,SUN);
            tortuga.izq(90);
            Snowl(n-1, l3);
            Snowr(n-1,l3);
        }
    }
    
    
    protected void Snowl(int n,double l){
        
         if (n<=0){
            tortuga.avanza(l);
        }
        else {
        double l3 = l/(3);
        double SUN=l*2*Math.sin(Math.PI/3)/9;
             Snowl(n-1, l3);
            Snowr(n-1,l3);
            tortuga.der(90);
             Snowl(n-1, SUN);
            Snowr(n-1,SUN);
            tortuga.der(60);
            Snowl(n-1, SUN);
            tortuga.der(60);
            Snowr(n-1,SUN);
            Snowl(n-1, SUN);
            tortuga.izq(150);
            Snowl(n-1, l3);
            tortuga.izq(60);
             Snowl(n-1, l3);
            tortuga.izq(60);
            Snowl(n-1, l3);
            Snowr(n-1,l3);
            tortuga.der(60);
        }
    }
    
    
    public void dibuja(){
        Snowr(nivelRecursion, l);
    }
    
}
