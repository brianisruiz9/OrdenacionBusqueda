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
public class Busqueda {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        //Secuencial
        int cantdn;
        System.out.println("----------¡Busqueda Secuencial!----------");
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
        System.out.println("Dijite el elemento a encontrar:");
        n = lea.nextInt();
        int ind = secuencial(a, n);
        if (ind != -1) {
            System.out.println("Elemento encontrado en la posición: " + ind);
        } else {
            System.out.println("El elemento no fue encontrado.");
        }

        //Binaria
        int cantd;
        System.out.println("----------¡Busqueda Binaria!----------");
        System.out.println("Dijite tamaño del vector:");
        cantd = lea.nextInt();
        int b[] = new int[cantd];
        for (int i = 0; i <= cantd - 1; i++) {
            System.out.println("Digite el elemento en la posición No." + i);
            b[i] = lea.nextInt();
        }
        System.out.println("Al Array es:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("");
        Ordenacion.merge(b);
        System.out.println("Al Array ordenado es:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        int nu;
        System.out.println("");
        System.out.println("Dijite el elemento a encontrar:");
        nu = lea.nextInt();
        int indc = secuencial(b, nu);
        if (indc != -1) {
            System.out.println("Elemento encontrado en la posición: " + indc);
        } else {
            System.out.println("El elemento no fue encontrado.");
        }
    }

    public static int secuencial(int v[], int n) {
        boolean encontrado = false;
        for (int i = 0; i < v.length && encontrado == false; i++) {
            if (n == v[i]) {
                encontrado = true;
                return i;
            }
        }
        return -1;
    }

    public static int binaria(int v[], int n) {
        int centro, primero = 0, ultimo = v.length - 1, valorCentro;
        while (primero <= ultimo) {
            centro = (primero + ultimo) / 2;
            valorCentro = v[centro];
            System.out.println("Comparando a " + n + " Con " + v[centro]);
            if (n == valorCentro) {
                return centro;
            } else if (n < valorCentro) {
                ultimo = centro - 1;
            } else {
                primero = centro + 1;
            }
        }
        return -1;
    }
}
