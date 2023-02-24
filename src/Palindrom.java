import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int rev = 0;
        int palin = a;
        while (a != 0) {
            rev = rev * 10 + a % 10;
            a = a / 10;
        }
        if (palin == rev) {
            System.out.println("Number is a palindrome" + rev);
        } else {
            System.out.println("Number is not palindrome" + rev);
        }
    }
}
