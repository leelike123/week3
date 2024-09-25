import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("키를 입력하세요 (m): ");
        double height = Double.parseDouble(sc.next());
        System.out.print("몸무게를 입력하세요 (kg): ");
        int weight = sc.nextInt();
        System.out.print("BMI 수치 : " + weight / (height * height));
        float health = sc.nextInt();
        System.out.print(health);

        if (health>=30) {
            System.out.print("비만입니다.");
        } else if (health<18.5) {
            System.out.print("저체중입니다.");
        } else if (health>=18.5 && health<=24.9) {
            System.out.print("정상입니다.");
        } else if (health>=24.9 && health<=29.9) {
            System.out.print("과체중입니다.");
        }
    }
}

