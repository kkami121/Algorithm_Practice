import java.util.Scanner;
/*
문자열을 입력받고 소문자는 대문자, 대문자는 소문자로 변환해주는 프로그램
@author 박귀열
*/
public class StringConversion{
    public static void main(String[] args){
        
        System.out.print("문자열을 입력하세요 : ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        char [] arr;
        arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 'a' && arr[i] <= 'z'){
                arr[i] = (char)(arr[i] - 32);
            }
            else if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] = (char)(arr[i] + 32);
            }
        }
        System.out.println(arr);
    }
}