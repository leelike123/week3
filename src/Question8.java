import java.util.Scanner;

public class Question8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("몸무게를 입력해주세요 : ");
        double weight = sc.nextInt();
        System.out.print("키를 입력해주세요 : ");
        double height = sc.nextInt();

        double bmi = weight / (height * height);

        if(bmi < 18.5){
            System.out.println("저체중입니다.");
        }else if(bmi < 24.9){
            System.out.println("정상입니다.");
        }else if(bmi < 29.9) {
            System.out.println("과체중입니다.");
        }else{
            System.out.println("비만입니다.");
        }
    }
}