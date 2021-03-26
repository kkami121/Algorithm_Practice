import java.util.Scanner;
/*
입력 받은 숫자 만큼 길이의 피보나치 수열을 출력하는 프로그램
author 박귀열
*/
public class Fibonacci {
    public static void main(String[] args){
    
        System.out.print("원하는 수의 피보나치 입력 : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int [] n1 = new int[100];
        n1[1] = 1;
        n1[2] = 1;

		for(int i = 3; i <= number; i++){   
            n1[i] = n1[i-1] + n1[i-2];  
        }
        for(int i = 1; i <= number; i++){
            System.out.print(n1[i] + " ");
        }
        System.out.println(" ");
    }
}