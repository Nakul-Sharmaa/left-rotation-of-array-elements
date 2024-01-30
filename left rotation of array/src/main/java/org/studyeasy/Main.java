package org.studyeasy;
import java.io.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int N =arr.length;
        rotate(arr, 3,N);
        printarray(arr,N);
    }


    static void rotate(int arr[], int d, int n){
        int temp[]=new int[n];
        int k=0;
        for(int i=d;i<n;i++){
            temp[k]=arr[i];
            k++;
        }

        for(int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];

        }


    }
    static void printarray(int arr[],int n){
        for (int i=0;i<n; i++){
            System.out.println(arr[i]);
        }
    }
}