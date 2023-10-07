package edu.uoc.ds.adt;

public class PR0GeometricProgressionArray {
    public int[] vector;

    public PR0GeometricProgressionArray(int v1, int v2, int v3) { //Constructor de l'array
        vector = new int[v3];
        for (int i = 0; i < v3; i++) {
            vector[i] = v1 * (int) Math.pow(v2, i);
        }
    }

    public int[] getArray() {               //Metode valor array
        return this.vector;
    }

    public int getIndexOf(int valor) {              //Metode index element
        for (int i = 0; i < vector.length; i++) {   //Fem un bucle buscant el valor introduït a dins de l'array.
            if (vector[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int valor) {    //Metode buscar
        int l = 0;                          //Principi
        int r = vector.length - 1;          //Final

        while (l <= r) {
            int m = l + (r - l) / 2;        //Index central del rang actual (entre "l" i "r")

            if (vector[m] == valor) {       //Comparem el index central amb el valor que hem agafat, si es igual el retornem
                return m;
            }

            if (vector[m] < valor) {        //Si el index central es menor al valor, vol dir que el valor que busquem ha d'estar +
                l = m + 1;                  //a la meitat final del rang actual.
            } else {                        //Si el index central es major al valor, vol dir que el valor que busquem ha d'estar +
                r = m - 1;                  //a la meitat principal del rang actual.
            }
        }
        return -1;                          //Retorna -1 quan el valor buscat no està dins del array.
    }


}