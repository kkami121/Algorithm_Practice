import java.util.Scanner;
/*
10개의 수를 입력하고 입력된 수에서 가장 많이 입력된 수를 출력하는 프로그램
ex) 1 2 2 3 4 5 6 2 3 4 2
    => 최빈수 : 2, count : 4번
@author 박귀열
*/
public class MostFrequent{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int []inputNumber = new int[10]; 

        for(int i = 0; i < 10; i++){ //입력 받을 수
            inputNumber[i] = input.nextInt();
        }

        int []pushNumber = new int[10]; 

        for(int i = 0; i < 10; i++){
            pushNumber[inputNumber[i]]++; // 입력 받은 수를 저장하며 count
        }

        int mostNumber = 0;//최빈수
        int mostCount = 0; //최빈수가 나온 횟수

        for(int i = 0; i < 10; i++){
            if(mostCount < pushNumber[i]){
                mostCount = pushNumber[i];
                mostNumber = i;
            }

        }

        System.out.printf("최빈수 : %d count : %d번 \n", mostNumber, mostCount);
    }
}