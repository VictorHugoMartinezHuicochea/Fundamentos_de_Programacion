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
public class N4FR_Poligon extends N4FR_Fractal{
    protected double l;
    int t;
    public N4FR_Poligon(){
        super();
        this.l=10.0;
    }
    
    public N4FR_Poligon(int n, JPanel l){
        super(n, l);
        this.l=10.0;
    }

    public N4FR_Poligon(int n, double L, JPanel l){
        super(n, l);
        this.l = L;
    }

    public N4FR_Poligon(JPanel l){
        super(l);
        this.l=10.0;
    }
    
    public void asignaL(double l){
        this.l = l;
    }
    
    protected void Poligonz(int n,double l, int a, int s){
        int C=s;
       
        Poligon2(l,a,0,C);
       
    }
    
    
    protected void Poligon2(double l,int a, int t,int C){
        if (!(l<C)){
            Porigon(l,a, C);    
            t=t+a;
            if(!(t%360==0)){
                 Poligon2(l,a,t,C);
            }
        
        }
    }
    
    
    protected void Porigon(double l, int a,int C){
    tortuga.avanza(l);
    Poligon2(l/2,0-a,0,C);
    tortuga.der(a);
    
     
}
    
    public void dibuja(){
        Poligonz(nivelRecursion, 8, 144, 1);
    }
    
}

