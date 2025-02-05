package N4FR_Methods;


import static java.lang.Math.sqrt;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EXPRESS
 */
public class N4FR_Sierpinski extends N4FR_Fractal{
    protected double l;

    public N4FR_Sierpinski(){
        super();
        this.l=10.0;
    }
    
    public N4FR_Sierpinski(int n, JPanel l){
        super(n, l);
        this.l=10.0;
    }

    public N4FR_Sierpinski(int n, double L, JPanel l){
        super(n, l);
        this.l = L;
    }

    public N4FR_Sierpinski(JPanel l){
        super(l);
        this.l=10.0;
    }
    
    public void asignaL(double l){
        this.l = l;
    }
    
    protected void Sierpins(int n, double l){
        int i;
        double l3 = l/(40);
        double D=(l3)/(Math.sqrt(2));
        for(i=0; i<4; i++){
            Aux(n,D, l3);
            tortuga.der(45);
            tortuga.avanza(D);
            tortuga.der(45);
        }
       
    }
    protected void Aux(int n, double D, double l){
        if (!(n<=0)){
            Aux(n-1,D, l);
            tortuga.der(45);
            tortuga.avanza(D);
            tortuga.der(45);
            Aux(n-1,D, l);
            tortuga.izq(90);
            tortuga.avanza(l);
            tortuga.izq(90);
            Aux(n-1,D, l);
            tortuga.der(45);
            tortuga.avanza(D);
            tortuga.der(45);
            Aux(n-1,D, l);
    }
    }
    
    public void dibuja(){
        Sierpins(nivelRecursion, l);
    }
    
}
