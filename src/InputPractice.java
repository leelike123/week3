import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자: ");
        int number1 = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int number2 = sc.nextInt();
        System.out.print("연산자(+, -, *, /): ");
        String sign = sc.next();

        System.out.println("결과값: " + number1 + sign +number2);

        sc.close();

    }
}
