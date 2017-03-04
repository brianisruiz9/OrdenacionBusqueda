/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author BrianisRuiz
 */
public class Ordenacion {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        //Burbuja
        int cantdn;
        System.out.println("----------¡Metodo Burbuja!----------");
        System.out.println("Dijite tamaño del vector:");
        cantdn = lea.nextInt();
        int a[] = new int[cantdn];
        for (int i = 0; i <= cantdn - 1; i++) {
            System.out.println("Digite el elemento en la posición No." + i);
            a[i] = lea.nextInt();
        }
        System.out.println("Al Array es:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        int n;
        System.out.println("Dijite 1 o 2 para ordenar el vector:");
        System.out.println("1 = Forma Ascendente. 2 = Forma Descendente");
        n = lea.nextInt();
        burbuja(n, a);

        //Inserción
        int c;
        System.out.println("");
        System.out.println("----------¡Metodo Inserción!----------");
        System.out.println("Dijite tamaño del vector:");
        c = lea.nextInt();
        int b[] = new int[c];
        for (int i = 0; i <= c - 1; i++) {
            System.out.println("Digite el elemento en la posición No." + i);
            b[i] = lea.nextInt();
        }
        System.out.println("Al Array es:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("");
        int nu;
        System.out.println("Dijite 1 o 2 para ordenar el vector:");
        System.out.println("1 = Forma Ascendente. 2 = Forma Descendente");
        nu = lea.nextInt();
        insercion(nu, b);

        //Selección
        int ct;
        System.out.println("");
        System.out.println("----------¡Metodo Selección!----------");
        System.out.println("Dijite tamaño del vector:");
        ct = lea.nextInt();
        int d[] = new int[ct];
        for (int i = 0; i <= ct - 1; i++) {
            System.out.println("Digite el elemento en la posición No." + i);
            d[i] = lea.nextInt();
        }
        System.out.println("Al Array es:");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println("");
        int nm;
        System.out.println("Dijite 1 o 2 para ordenar el vector:");
        System.out.println("1 = Forma Ascendente. 2 = Forma Descendente");
        nm = lea.nextInt();
        seleccion(nm, d);

        //Shellsort
        int ctd;
        System.out.println("");
        System.out.println("----------¡Metodo ShellSort!----------");
        System.out.println("Dijite tamaño del vector:");
        ctd = lea.nextInt();
        int e[] = new int[ctd];
        for (int i = 0; i <= ctd - 1; i++) {
            System.out.println("Digite el elemento en la posición No." + i);
            e[i] = lea.nextInt();
        }
        System.out.println("Al Array es:");
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println("");
        int numero;
        System.out.println("Dijite 1 o 2 para ordenar el vector:");
        System.out.println("1 = Forma Ascendente. 2 = Forma Descendente");
        numero = lea.nextInt();
        shellsort(numero, e);
         
        //Mezcla
        int catd;
        System.out.println("");
        System.out.println("----------¡Metodo Por Mezcla!----------");
        System.out.println("Dijite tamaño del vector:");
        catd = lea.nextInt();
        int f[] = new int[catd];
        for (int i = 0; i <= catd - 1; i++) {
            System.out.println("Digite el elemento en la posición No." + i);
            f[i] = lea.nextInt();
        }
        System.out.println("Al Array es:");
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + " ");
        }
        System.out.println("");
        System.out.println("Array Ordenado:");
        merge(f);
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + " ");
        }

        //Quicksort
        int cat;
        System.out.println("");
        System.out.println("----------¡Metodo QuickSort!----------");
        System.out.println("Dijite tamaño del vector:");
        cat = lea.nextInt();
        int g[] = new int[cat];
        for (int i = 0; i <= cat - 1; i++) {
            System.out.println("Digite el elemento en la posición No." + i);
            g[i] = lea.nextInt();
        }
        System.out.println("Al Array es:");
        for (int i = 0; i < g.length; i++) {
            System.out.print(g[i] + " ");
        }
        System.out.println("");
        quicksort(g, 0, cat-1);
        System.out.println("Array Ordenado:");
        for (int i = 0; i < g.length; i++) {
            System.out.print(g[i] + " ");
        }
    }

    public static void burbuja(int n, int v[]) {
        int aux;
        if (n == 1) {
            for (int i = 0; i < v.length; i++) {
                for (int j = i + 1; j < v.length; j++) {
                    if (v[i] > v[j]) {
                        aux = v[i];
                        v[i] = v[j];
                        v[j] = aux;
                    }
                }
            }
            System.out.println("Burbuja Ascendente:");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + " ");
            }
        } else if (n == 2) {
            for (int i = 0; i < v.length; i++) {
                for (int j = i; j < v.length; j++) {
                    if (v[i] < v[j]) {
                        aux = v[i];
                        v[i] = v[j];
                        v[j] = aux;
                    }
                }
            }
            System.out.println("Burbuja Descendente:");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + " ");
            }
        } else {
            System.out.println("¡¡¡ Solo dijite 1 o 2 !!!");
        }
    }

    public static void insercion(int n, int v[]) {
        System.out.println("");
        int aux;
        if (n == 1) {
            for (int i = 1; i < v.length; i++) {
                aux = v[i];
                for (int j = i - 1; j >= 0 && v[j] > aux; j--) {
                    v[j + 1] = v[j];
                    v[j] = aux;
                }
            }
            System.out.println("Inserción Ascendente:");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + " ");
            }
        } else if (n == 2) {
            for (int i = 1; i < v.length; i++) {
                aux = v[i];
                for (int j = i - 1; j >= 0 && v[j] < aux; j--) {
                    v[j + 1] = v[j];
                    v[j] = aux;
                }
            }
            System.out.println("Inserción Descendente:");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + " ");
            }
        } else {
            System.out.println("¡¡¡ Solo dijite 1 o 2 !!!");
        }
    }

    public static void seleccion(int n, int v[]) {
        System.out.println("");
        int aux;
        if (n == 1) {
            for (int i = 0; i < v.length; i++) {
                int min = i;
                for (int j = i + 1; j < v.length; j++) {
                    if (v[j] < v[min]) {
                        min = j;
                    }
                }
                aux = v[i];
                v[i] = v[min];
                v[min] = aux;
            }
            System.out.println("Selección Ascendente:");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + " ");
            }
        } else if (n == 2) {
            for (int i = 0; i < v.length; i++) {
                int min = i;
                for (int j = i + 1; j < v.length; j++) {
                    if (v[j] > v[min]) {
                        min = j;
                    }
                }
                aux = v[i];
                v[i] = v[min];
                v[min] = aux;
            }
            System.out.println("Selección Descendente:");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + " ");
            }
        } else {
            System.out.println("¡¡¡ Solo dijite 1 o 2 !!!");
        }
    }

    public static void shellsort(int n, int v[]) {
        System.out.println("");
        int aux;
        if (n == 1) {
            for (int incremento = v.length / 2; incremento > 0; incremento = (incremento == 2) ? 1 : (int) Math.round(incremento / 2.2)) {
                for (int i = incremento; i < v.length; i++) {
                    for (int j = i; j >= incremento && v[j - incremento] > v[j]; j = incremento) {
                        aux = v[j];
                        v[j] = v[j - incremento];
                        v[j - incremento] = aux;
                    }
                }
            }
            System.out.println("Shellsort Ascendente:");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + " ");
            }
        } else if (n == 2) {
            for (int incremento = v.length / 2; incremento > 0; incremento = (incremento == 2) ? 1 : (int) Math.round(incremento / 2.2)) {
                for (int i = incremento; i < v.length; i++) {
                    for (int j = i; j >= incremento && v[j - incremento] < v[j]; j = incremento) {
                        aux = v[j];
                        v[j] = v[j - incremento];
                        v[j - incremento] = aux;
                    }
                }
            }
            System.out.println("Shellsort Descendente:");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + " ");
            }
        } else {
            System.out.println("¡¡¡ Solo dijite 1 o 2 !!!");
        }
    }

    public static int[] merge(int v[]) {
        System.out.println("");
        int j, k;

        if (v.length > 1) {
            int izq = v.length / 2;
            int der = v.length - izq;
            int vizq[] = new int[izq];
            int vder[] = new int[der];
            for (int i = 0; i < izq; i++) {
                vizq[i] = v[i];
            }
            for (int i = izq; i < izq + der; i++) {
                vder[i - izq] = v[i];
            }
            vizq = merge(vizq);
            vder = merge(vder);
            int i = 0;
            j = 0;
            k = 0;
            while (vizq.length != j && vder.length != k) {
                if (vizq[j] < vder[k]) {
                    v[i] = vizq[j];
                    i++;
                    j++;
                } else {
                    v[i] = vder[k];
                    i++;
                    k++;
                }
            }
            while (vizq.length != j) {
                v[i] = vizq[j];
                i++;
                j++;
            }
            while (vder.length != k) {
                v[i] = vder[k];
                i++;
                k++;
            }

        }
        return v;
    }

    public static void quicksort(int v[], int izq, int der) {
        int index = partition(v, izq, der);

        if (izq < index - 1) {
            quicksort(v, izq, index - 1);
        }
        if (index < der) {
            quicksort(v, index, der);
        }
    }

    public static int partition(int v[], int izq, int der) {
        int pivote = v[(izq + der) / 2];
        while (izq <= der) {
            while (v[izq] < pivote) {
                izq++;
            }

            while (v[der] > pivote) {
                der--;
            }

            if (izq <= der) {
                int tmp = v[izq];
                v[izq] = v[der];
                v[der] = tmp;

                izq++;
                der--;
            }
        }
        return izq;
    }

}
