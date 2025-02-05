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
public class N4FR_Weave extends N4FR_Fractal{
    protected double l;

    public N4FR_Weave(){
        super();
        this.l=10.0;
    }
    
    public N4FR_Weave(int n, JPanel l){
        super(n, l);
        this.l=10.0;
    }

    public N4FR_Weave(int n, double L, JPanel l){
        super(n, l);
        this.l = L;
    }

    public N4FR_Weave(JPanel l){
        super(l);
        this.l=10.0;
    }
    
    public void asignaL(double l){
        this.l = l;
    }
    
   protected void Camaron(int n, double l){
        int K=-1;
        Pulpo(n,l,K);
    }
    
    
    protected void Pulpo(int n, double l, int k){
        int I;
        if (n<=0){
            Pescado(l,k);
        }
        else {
            double l3 = l/(3/(1.2));
            Pulpo(n-1, l3,k);
            tortuga.izq(90);
            Pulpo(n-1, l3,k);
            for(I=0;I<3;I++)
            {
            tortuga.der(90);
            Pulpo(n-1, l3,k);
            }
            for(I=0;I<3;I++)
            {
            tortuga.izq(90);
            Pulpo(n-1, l3,k);
            }
        }
    }
    
    
    protected void Pescado(double l,int k){
         k=0-k;
         double l5=l/(5/(1.2));
         tortuga.izq(45);
         tortuga.avanza(4*l5);
         tortuga.der(90*k);
          tortuga.avanza(3*l5);
         tortuga.der(90*k);
          tortuga.avanza(2*l5);
         tortuga.der(90*k);
          tortuga.avanza(l5);
         tortuga.der(90*k);
         tortuga.avanza(l5);
         tortuga.izq(90*k);
         tortuga.avanza(l5);
         tortuga.izq(90*k);
         tortuga.avanza(2*l5);
         tortuga.izq(90*k);
         tortuga.avanza(3*l5);
         tortuga.izq(90*k);
         tortuga.avanza(4*l5);
         tortuga.izq(90*k);
          tortuga.avanza(4*l5);
         tortuga.der(90*k);
        tortuga.der(90*k);
         tortuga.avanza(4*l5);
         tortuga.izq(45);
    }
    
    
    public void dibuja(){
        Camaron(nivelRecursion, l);
    }
    
}
