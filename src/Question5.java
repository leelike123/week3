import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 적어 주세요 : ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("미성년자입니다.");
        } else if (age > 18) {
            System.out.println("성인입니다.");
        }
    }
}
