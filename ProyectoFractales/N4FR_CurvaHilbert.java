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
public class N4FR_CurvaHilbert extends N4FR_Fractal{
    protected double l;

    public N4FR_CurvaHilbert(){
        super();
        this.l=10.0;
    }
    
    public N4FR_CurvaHilbert(int n, JPanel l){
        super(n, l);
        this.l=10.0;
    }

    public N4FR_CurvaHilbert(int n, double L, JPanel l){
        super(n, l);
        this.l = L;
    }

    public N4FR_CurvaHilbert(JPanel l){
        super(l);
        this.l=10.0;
    }
    
    public void asignaL(double l){
        this.l = l;
    }
    
    protected void CurvaRecursivo(int n, double l,int k){
        if (!(n<=0)){
            double l3 = l/(3);
            tortuga.izq(k*90);
            CurvaRecursivo(n-1, l3, 0-k);
            tortuga.avanza(l3);
            tortuga.der(k*90);
            CurvaRecursivo(n-1, l3, k);
            tortuga.avanza(l3);
            CurvaRecursivo(n-1, l3, k);
            tortuga.der(k*90);
            tortuga.avanza(l3);
            CurvaRecursivo(n-1, l3, 0-k);
             tortuga.izq(k*90);
        }
    }
    
    
    
    public void dibuja(){
        CurvaRecursivo(nivelRecursion, l, 1);
    }
    
}
