package N4FR_Methods;



/*
 * Logo.java
 */

import javax.swing.JPanel;

/**
 *
 * @author <b>Carlos Coronado</b> <br></br>
 * Materia: Programaci&oacute;n <tt>II</tt><br></br>
 */

public class N4FR_Logo {
    private JPanel lienzo;
    private double x, y, x0, y0;
    private int MX, MY;
    private final int ESCX=10, ESCY=10;
    private final double G2R = Math.PI/180;
    private int grados, grados0;
    private final boolean ABAJO=true, ARRIBA=false;
    private boolean pluma;
    
    /** Creates a new instance of Logo */
    public N4FR_Logo() {
        lienzo = null;
        x0 = y0 = x = y = 0.0;
        MX = MY = 0;
        grados = grados0 =0;
        pluma = ABAJO;
    }
    
    public N4FR_Logo(JPanel l) {
        this();
        lienzo = l;
        MX = lienzo.getWidth()/2;
        MY = lienzo.getHeight()/2;
    }
    
    public N4FR_Logo(JPanel l, double x, double y, int grad, boolean pluma) {
        lienzo = l;
        MX = lienzo.getWidth()/2;
        MY = lienzo.getHeight()/2;
        x0 = this.x = x;
        y0 = this.y = y;
        grados0 = grados = grad;
        this.pluma = pluma;
    }

    public void actualizaLienzo(){
        MX = lienzo.getWidth()/2;
        MY = lienzo.getHeight()/2;
    }
    
    private void linea(double x1, double y1, double x2, double y2){
        lienzo.getGraphics().drawLine((int)(MX+x1*ESCX), (int)(MY-y1*ESCY),
                (int)(MX+x2*ESCX), (int)(MY-y2*ESCY));
    }
    
    public void posicion(double x, double y){
        x0 = this.x = x;
        y0 = this.y = y;
    }
    
    public void direccion(int grados){
        grados0 = this.grados = grados;
    }
    
    public void ponPluma(boolean pluma){
        this.pluma = pluma;
    }
    

    public void alOrigen(){
        actualizaLienzo();
        posicion(x0, y0);
        direccion(grados0);
    }
    
    public void asignaLienzo(JPanel l){
        lienzo = l;
        actualizaLienzo();
    }
    
    public JPanel obtenLienzo(){
        return lienzo;
    }
    
    public void avanza(double l){
        double x1=x, y1=y, g=grados*G2R;
        x += l*Math.cos(g);
        y += l*Math.sin(g);
        if (pluma){
            linea(x1, y1, x, y);
        }
    }
    
    public void retrocede(double l){
        avanza(-l);
    }
    
    public void der(int g){
        grados -= g;
    }
    
    public void izq(int g){
        grados += g;
    }
}
