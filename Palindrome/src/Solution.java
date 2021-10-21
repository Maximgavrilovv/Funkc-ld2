import java.util.Scanner;

public class Solution {

    static int distance;
    static int length;

    static boolean palindrome(String s) {

        if (s.charAt(distance) == s.charAt(length-distance-1)) {
            distance += 1;
            if (length / distance == 2) return true;
            palindrome(s);
        }

        if (distance > 0) {
            if (length / distance == 2) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        length = s.length();
        distance = 0;
        System.out.println(palindrome(s));
    }
}
