package geekbrains.lesson_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] mass1 = {0, 0, 1, 0, 1, 0, 0, 0, 1};


        oneToZero(mass1);
        //zeroToOne(mass1);

        //System.out.println(Arrays.toString(mass1));

        int[] mass2 = new int[8];
        fillByNums(mass2);
        //System.out.println(Arrays.toString(mass2));

        int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //doubleLessSix(mass3);
        //System.out.println(Arrays.toString(mass3));

        int[][] matrix1 = new int[8][8];

        diagToOne(matrix1);
       // System.out.println(matrix1[0][0]);

        int max=findMax(mass3);

        //System.out.println("max= " + max);

        int min=findMin(mass3);

        //System.out.println("min= " + min);

        int[] mass4 = {1, 1, 1, 2, 1};
        int[] mass5 = {2, 1, 3, 2, 1};



        //System.out.println("checkBalance = " + checkBalance(mass5));

        System.out.println(Arrays.toString(shiftArray(mass5,2)));
    }

    static void oneToZero (int[] a){

        for (int i=0; i< a.length; i++){
            if (a[i]==1) {
                a[i]=0;
            }
        }

    }

    static void zeroToOne (int[] a){

        for (int i=0; i< a.length; i++){
            if (a[i]==0) {
                a[i]=1;
            }
        }

    }

    static void fillByNums (int[] a){

        for (int i=0; i< a.length; i++){
            a[i]=i*3;
        }

    }

    static void doubleLessSix (int[] a){

        for (int i=0; i< a.length; i++){
            if (a[i] < 6)
            a[i]*=2;
        }

    }

    static void diagToOne (int[][] a){
        for (int i=0; i< a.length; i++){
            a[i][i]=1;
        }


    }

    static int findMax (int[] a){

        int max=a[0];

        for (int i=1; i< a.length; i++){
            if (a[i] > max)
                max=a[i];
        }
        return max;
    }

    static int findMin (int[] a){

        int min=a[0];

        for (int i=1; i< a.length; i++){
            if (a[i] < min)
                min=a[i];
        }
        return min;
    }
    static boolean checkBalance (int[] a){

        boolean bool = false;

        int sumLeft=0 ;
        int sumRight=0;



        for (int i = 0; i < a.length ; i++) {
            sumLeft+=a[i];

            for (int j = a.length-1; j > i ; j--) {
                sumRight+=a[j];
            }

            if (sumLeft ==  sumRight) {
                bool = true;
                break;
            }
            sumRight=0;
        }

        return bool;
    }

    static int [] shiftArray(int[] a, int n){
        //int[]  shifted = new int[a.length+n];
        if (isNegative(n) == true) {

            for (int i = 0; i < a.length + n; i++) {

                a[i] = a[i-n];
                a[i-n]=0;

            }

        }
        else{

            for (int i = a.length-1; i >=n; i--) {

                a[i] = a[i-n];
                a[i-n] = 0;
            }

        }


        return a;
    }

    static boolean isNegative (int a ){

        return (a<0);

    }


}
