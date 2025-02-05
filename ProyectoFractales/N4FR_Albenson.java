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
public class N4FR_Albenson extends N4FR_Fractal{
    protected double l;

    public N4FR_Albenson(){
        super();
        this.l=10.0;
    }
    
    public N4FR_Albenson(int n, JPanel l){
        super(n, l);
        this.l=10.0;
    }

    public N4FR_Albenson(int n, double L, JPanel l){
        super(n, l);
        this.l = L;
    }

    public N4FR_Albenson(JPanel l){
        super(l);
        this.l=10.0;
    }
    
    public void asignaL(double l){
        this.l = l;
    }
    
    protected void Albs(int n, double l){
        if (n<=0){
            tortuga.avanza(l);
        }
        else {
            double l3 = l/(1.5);
            Albs(n-1, l3);
            tortuga.der(90);
            Albs(n-1, l3);
            tortuga.izq(90);
            
        }
    }
    
    
    
    
    public void dibuja(){
        Albs(nivelRecursion, l);
    }
    
}

