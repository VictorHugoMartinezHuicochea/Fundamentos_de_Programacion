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
public class N4FR_Dragon extends N4FR_Fractal{
    protected double l;

    public N4FR_Dragon(){
        super();
        this.l=10.0;
    }
    
    public N4FR_Dragon(int n, JPanel l){
        super(n, l);
        this.l=10.0;
    }

    public N4FR_Dragon(int n, double L, JPanel l){
        super(n, l);
        this.l = L;
    }

    public N4FR_Dragon(JPanel l){
        super(l);
        this.l=10.0;
    }
    
    public void asignaL(double l){
        this.l = l;
    }
    
    protected void DragonRecursivo(int n, double l){
        if (n<=0){
            tortuga.avanza(l);
        }
        else {
            double l3 = l/(1.5);
            DragonRecursivo(n-1, l3);
            tortuga.izq(90);
            Dragonder(n-1, l3);
            
        }
    }
    
    
    protected void Dragonder(int n,double l){
         if (n<=0){
            tortuga.avanza(l);
        }
        else {
            double l3 = l/(1.5);
            DragonRecursivo(n-1, l3);
            tortuga.der(90);
            Dragonder(n-1, l3);
            
        }
    }
    
    
    public void dibuja(){
        DragonRecursivo(nivelRecursion, l);
    }
    
}

