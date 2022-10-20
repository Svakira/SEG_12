public class AVL {
    private Node root;

    public AVL(){
        root=null;
    }

    //Buscar
    public Node search(int dato, Node r){
        if(root==null){
            return null;
        }else if(r.dato==dato){
            return r;
        } else if (r.dato<dato) {
            return search(dato,r.hijoDerecho);
        }else{
            return search(dato,r.hijoIzquierdo);
        }
    }

    //Obtener factor de equilibrio
    public int getFe(Node x){
        if (x==null){
            return -1;
        }else{
            return x.fe;
        }
    }

    //Rotacion simple izquierda
    public Node leftRotation(Node c){
        Node aux=c.hijoIzquierdo;
        c.hijoIzquierdo=aux.hijoDerecho;
        aux.hijoDerecho=c;
        c.fe=Math.max(getFe(c.hijoIzquierdo),getFe(c.hijoDerecho))+1;
        aux.fe=Math.max(getFe(aux.hijoIzquierdo),getFe(aux.hijoDerecho))+1;
        return aux;
    }

    //Rotacion simple derecha
    public Node rigthRotation(Node c){
        Node aux=c.hijoDerecho;
        c.hijoDerecho=aux.hijoIzquierdo;
        aux.hijoIzquierdo=c;
        c.fe=Math.max(getFe(c.hijoIzquierdo),getFe(c.hijoDerecho))+1;
        aux.fe=Math.max(getFe(aux.hijoIzquierdo),getFe(aux.hijoDerecho))+1;
        return aux;
    }

    //Rotacion doble derecha
    public Node doubleRightRotation(Node c){
        Node temp;
        c.hijoIzquierdo=rigthRotation(c.hijoIzquierdo);
        temp=leftRotation(c);
        return temp;
    }

    //Rotacion doble izquierda
    public Node doubleLeftRotation(Node c){
        Node temp;
        c.hijoDerecho=leftRotation(c.hijoDerecho);
        temp=rigthRotation(c);
        return temp;
    }

    //Insertar AVL
    public Node insertAVL(Node novo, Node subAr){
        Node newDad=subAr;
        if (novo.dato<subAr.dato){
            if(){

            }
        }
    }
}
