package N4FR_Methods;



/*
 * Fractal.java
 */

import javax.swing.JPanel;

/**
 *
 * @author <b>Carlos Coronado</b> <br></br>
 * Materia: Programaci&oacute;n <tt>II</tt><br></br>
 */

abstract public class N4FR_Fractal {
    protected int nivelRecursion;
    protected N4FR_Logo tortuga;
    
    /** Creates a new instance of Fractal */
    public N4FR_Fractal(){
        tortuga = new N4FR_Logo();
        nivelRecursion = 0;
    }
    
    public N4FR_Fractal(int n, JPanel l) {
        tortuga = new N4FR_Logo(l);
        nivelRecursion = n;
    }
    
    public N4FR_Fractal(JPanel l) {
        this(5, l);
    }
    
    public void reinicia(){
        tortuga.alOrigen();
    }
    
    public void asignaNivelRecursion(int n){
        nivelRecursion = n;
    }
    
    public void asignaLienzo(JPanel l){
        tortuga.asignaLienzo(l);
    }
    
    public void actualizaLienzo(){
        tortuga.actualizaLienzo();
    }
    
    public void posicion(double x, double y){
        tortuga.posicion(x, y);
    }
    
    public void direccion(int grados){
        tortuga.direccion(grados);
    }
    
    public void ponPluma(boolean pluma){
        tortuga.ponPluma(pluma);
    }

    abstract void dibuja();
    
    public int obtenNivelRecursion(){
        return nivelRecursion;
    }
    
}
