
package ArbolMerkle;

/**
 *
 * @author Victor Hugo
 */

//Estos nodos serviran para la creacion del arbol
public class MT_Nodo {
    private MT_Nodo izq;
    private MT_Nodo der;
    private String hash;

    public MT_Nodo(MT_Nodo izq, MT_Nodo der, String hash) {
        this.izq = izq;
        this.der = der;
        this.hash = hash;
    }

    
    //Implementamos los getters y setters
    public MT_Nodo getIzq() {
        return izq;
    }

    public void setIzq(MT_Nodo izq) {
        this.izq = izq;
    }

    public MT_Nodo getDer() {
        return der;
    }

    public void setDer(MT_Nodo der) {
        this.der = der;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
