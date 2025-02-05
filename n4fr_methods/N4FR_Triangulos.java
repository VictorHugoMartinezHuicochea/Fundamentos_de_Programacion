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
public class N4FR_Triangulos extends N4FR_Fractal{
    protected double l;

    public N4FR_Triangulos(){
        super();
        this.l=10.0;
    }
    
    public N4FR_Triangulos(int n, JPanel l){
        super(n, l);
        this.l=10.0;
    }

    public N4FR_Triangulos(int n, double L, JPanel l){
        super(n, l);
        this.l = L;
    }

    public N4FR_Triangulos(JPanel l){
        super(l);
        this.l=10.0;
    }
    
    public void asignaL(double l){
        this.l = l;
    }
    
   
    
    
    protected void Nido(int n,double l){
        int i;
         if (!(n<=0)){
            for(i=0;i<3;i++){
                Nido(n-1, l/2);
                tortuga.avanza(l);
                tortuga.der(120);
            }
            
        }
    }
    
    
    public void dibuja(){
        Nido(nivelRecursion, l);
    }
    
}
