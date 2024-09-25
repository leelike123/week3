public class Operation {
    public static void main(String[] args) {

        int result = (5 + 3) * 2;

        int x = 5;
        int y = ++x;

        System.out.println("y = " + y);

        int z = ++y;
        System.out.println("z = " + z);

        boolean flag = false;
        boolean notflag = !flag;

        System.out.println("notflag = " + notflag);
        boolean flag2 = !notflag;
        System.out.println("flag2 = " + flag2);

    }
}
