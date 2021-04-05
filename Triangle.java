import java.util.Scanner;
/*
원하는 층 만큼의 삼각형을 출력하는 프로그램
ex)
     *
    **
   ***
  **** 
 *****
 
 @author 박귀열
*/

public class Triangle{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        
        for(int i = n; i >= 1; i--){
            int j;
            for(j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}