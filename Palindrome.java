import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        PalindromeNum();
    }

    public static void PalindromeNum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digit = 0;
        int reverse = 0;
        int original = num;
        while (num > 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        if (original == reverse) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }
}
