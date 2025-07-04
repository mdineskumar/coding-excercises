package core_java_udemy.variables;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("enter the numner: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("starting for loop");

        for(int i = 0; i <= num; i++){
            if(i> 100){
                break;
            }
            if(i % 10 == 0){
                continue;
            }
            System.out.print(i+"\t");
        }

        System.out.println("\nstarting while loop");
        int j = 0;
        while(j <= num){
            if(j > 100){
                break;
            }
            if(j%10!=0){
                System.out.print(j+ "\t");
            }

            j++;
        }

        System.out.println("\nstarting do while loop");
        int k = 0;
        do{
            if(k > 100){
                break;
            }

            if(k%10!=0) {
                System.out.print(k + "\t");
            }

            k++;
        }while(k <= num);
    }
}
