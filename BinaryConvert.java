import java.util.Scanner;
/*
입력받은 수를 이진수로 변환하는 프로그램

@author 박귀열
*/
public class BinaryConvert {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int bin [] = new int[100];
        int i = 0;
        /*
        19 / 2   9 ... 1
        9  / 2   4 ... 1
        4  / 2   2 ... 0
        2  / 2   1 ... 0
        1  / 2   0 ... 1
        */
        while(number > 0){
            bin[i] = number % 2;
            number /= 2;
            i++;
        }
        i--;
        for(; i >= 0; i--){
            System.out.print(bin[i]);
        }
    }
}