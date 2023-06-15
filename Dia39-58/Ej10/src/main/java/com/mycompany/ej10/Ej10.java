package com.mycompany.ej10;

public class Ej10 {
    public static void main(String[] args) {
        double arr1[] = new double [50];
        double arr2[] = new double [20];
        double max=10, min=1;
        
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=(Math.random() * (max-min) + min);
            System.out.print(arr1[i] + " ");
        }
        
        bubbleSort(arr1);
        
        for (int i = 0; i < 10; i++) {
            arr2[i]=arr1[i];
        }
        
        for (int i = 10; i < arr2.length; i++) {
            arr2[i]=arr2[i-10]*0.5;
        }
        
        System.out.println("Arreglo 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        
        System.out.println("Arreglo 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");
    }
    
    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
