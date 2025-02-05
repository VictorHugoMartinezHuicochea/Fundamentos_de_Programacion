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
public class N4FR_Square extends N4FR_Fractal{
    protected double l;

    public N4FR_Square(){
        super();
        this.l=10.0;
    }
    
    public N4FR_Square(int n, JPanel l){
        super(n, l);
        this.l=10.0;
    }

    public N4FR_Square(int n, double L, JPanel l){
        super(n, l);
        this.l = L;
    }

    public N4FR_Square(JPanel l){
        super(l);
        this.l=10.0;
    }
    
    public void asignaL(double l){
        this.l = l;
    }
    
    protected void Square(int n, double l){
        int i;
       double l3 = l/(100);
        for(i=0; i<4; i++){
            Aux(n,l3);
            tortuga.der(90);
        }
    }
    
    
    protected void Aux(int n,double l){
         if (n<=0){
            tortuga.avanza(l);
        }
        else {
            Aux(n-1, l);
            tortuga.izq(90);
            Aux(n-1, l);
            tortuga.der(90);
            Aux(n-1, l);
            tortuga.der(90);
            Aux(n-1, l);
            Aux(n-1, l);
            tortuga.izq(90);
            Aux(n-1, l);
            tortuga.izq(90);
            Aux(n-1, l);
            tortuga.der(90);
            Aux(n-1, l);
        }
    }
    
    
    public void dibuja(){
        Square(nivelRecursion, l);
    }
    
}

