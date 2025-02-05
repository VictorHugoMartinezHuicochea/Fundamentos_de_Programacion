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
public class N4FR_Gosper extends N4FR_Fractal{
    protected double l;

    public N4FR_Gosper(){
        super();
        this.l=10.0;
    }
    
    public N4FR_Gosper(int n, JPanel l){
        super(n, l);
        this.l=10.0;
    }

    public N4FR_Gosper(int n, double L, JPanel l){
        super(n, l);
        this.l = L;
    }

    public N4FR_Gosper(JPanel l){
        super(l);
        this.l=10.0;
    }
    
    public void asignaL(double l){
        this.l = l;
    }
    
    protected void Gosperin(int n, double l){
        double G=1/(Math.sqrt(7));
        double l3 = l/(20);
        double t=l3*G;
      if (n<=0){
            tortuga.avanza(l3);
        }
        else {
            tortuga.der(75);
            GaspaLin(n-1, l);
            tortuga.izq(60);
            Gosperin(n-1,l);
            Gosperin(n-1,l);
            tortuga.izq(120);
            Gosperin(n-1,l);
            tortuga.izq(60);
            GaspaLin(n-1,l);
            tortuga.der(120);
            GaspaLin(n-1,l);
            tortuga.der(60);
            Gosperin(n-1,l);
            tortuga.izq(15);
        }
    }
    
    
    protected void GaspaLin(int n, double l){
        double G=1/(Math.sqrt(7));
        double l3 = l/(20);
        double t=l3*G;
      if (n<=0){
            tortuga.avanza(l3);
        }
        else {
            tortuga.der(15);
            GaspaLin(n-1,l);
            tortuga.izq(60);
            Gosperin(n-1,l);
            tortuga.izq(120);
            Gosperin(n-1,l);
            tortuga.der(60);
            GaspaLin(n-1,l);
            tortuga.der(120);
            GaspaLin(n-1,l);
            GaspaLin(n-1,l);
            tortuga.der(60);
            Gosperin(n-1,l);
            tortuga.izq(75);
        }
        
    }
    
    public void dibuja(){
        Gosperin(nivelRecursion, l);
    }
    
}


