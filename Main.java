import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] array=new int[n];

        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }

        int f1=factorial(2);
        int f2=f1*factorial(n-2);
        //int f3=f1*f2;
        int ss=(factorial(n)/f2);
        System.out.println(ss);
        // 1 2 3 5

        int array2[][]=new int[ss][2];

        int indices=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length-i-1 ; j++) {

                array2[indices][0]=array[i];                                //System.out.print(array[i]+"\t");
                array2[indices][1]=array[i+j+1];                              //System.out.println(array[i+j+1]);

                indices++;
            }
            System.out.println();
        }
        int sum=0;
        for (int i = 0; i <ss ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(array2[i][j]+"\t");

            }
            System.out.println();
        }

        for (int i = 0; i < ss; i++) {
            for (int j = 0; j <1 ; j++) {
                int m=array2[i][j]-array2[i][j+1];
                int m1=Math.abs(m);
                if (m1==1){
                    sum++;
                }
            }
        }
        System.out.println(sum);

    }





    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }




}