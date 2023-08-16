public class Main {
    public static void main(String[] args) {
        int a = 10;

        a += 5;
        a -= 4;

        int b = a++;
        boolean statement1 = b % 2 != 0;
        boolean statement2 = (b* (b * 1)) % 3 == 0;
        System.out.println("statement1 " + statement1);
        System.out.println("statement2 " + statement2);
    }
}
