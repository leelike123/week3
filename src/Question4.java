import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수를 입력하세요 : ");
        int first = sc.nextInt();
        System.out.print("두번째 수를 입력하세요 : ");
        int second = sc.nextInt();
        System.out.print("연산자를 입력하세요 (+, -, *, /) : ");
        String a = sc.next();
        System.out.print("결과 : ");

        switch (a) {
            case "+":
                System.out.print(first+second);
                break;
            case "-":
                System.out.print(first-second);
                break;
            case "*":
                System.out.print(first*second);
                break;
            case "/":
                System.out.print(first/second);
                break;
            default:
                System.out.print("올바른 연산자를 입력하세요.");
        }
        sc.close();

    }
}
