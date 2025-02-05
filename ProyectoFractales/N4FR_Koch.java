package N4FR_Methods;



/*
 * Koch.java
 */

import javax.swing.JPanel;



public class N4FR_Koch extends N4FR_Fractal{
    protected double l;

    public N4FR_Koch(){
        super();
        this.l=10.0;
    }
    
    public N4FR_Koch(int n, JPanel l){
        super(n, l);
        this.l=10.0;
    }

    public N4FR_Koch(int n, double L, JPanel l){
        super(n, l);
        this.l = L;
    }

    public N4FR_Koch(JPanel l){
        super(l);
        this.l=10.0;
    }
    
    public void asignaL(double l){
        this.l = l;
    }
    
    
    protected void KOCHS(int n,double l)
    {
        int i;
        for(i=0;i<3;i++)
        {
            kochRecursivo(n,l);
            tortuga.der(120);
        }
        
        
    }
    
    protected void kochRecursivo(int n, double l){
        if (n<=0){
            tortuga.avanza(l);
        }
        else {
            double l3 = l/3;
            kochRecursivo(n-1, l3);
            tortuga.izq(60);
            kochRecursivo(n-1, l3);
            tortuga.der(120);
            kochRecursivo(n-1, l3);
            tortuga.izq(60);
            kochRecursivo(n-1, l3);
        }
    }
    
    public void dibuja(){
        KOCHS(nivelRecursion, l);
    }
    
}
