package org.example;

/* Árboles Binarios de Búsqueda (BST)
📌 Un Árbol Binario de Búsqueda (BST) es una estructura donde cada nodo tiene:
-.Un valor.
-.Un hijo izquierdo, con valores menores.
-.Un hijo derecho, con valores mayores.*/

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        System.out.print("Recorrido InOrden: ");
        arbol.inOrden(arbol.raiz);
    }
}

class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int item) {
        valor = item;
        izquierdo = derecho = null;
    }
}

class ArbolBinario {
    Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            return new Nodo(valor);
        }
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }
        return raiz;
    }

    public void inOrden(Nodo raiz) {
        if (raiz != null) {
            inOrden(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            inOrden(raiz.derecho);
        }
    }
}
