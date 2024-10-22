import java.util.Scanner;

public class anagram {

    String s1, s2;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Sentence: ");
        s1 = sc.nextLine().toLowerCase();
        System.out.print("Enter second Sentence: ");
        s2 = sc.nextLine().toLowerCase();
        sc.close();
    }

    public boolean checkL() {

        int i1 = s1.length();
        int i2 = s2.length();

        String k1 = "", k2 = "";

        for (int i = 0; i < i1; i++) {
            if (s1.charAt(i) != ' ') {
                k1 += s1.charAt(i);
            }
        }
        for (int i = 0; i < i2; i++) {
            if (s2.charAt(i) != ' ') {
                k2 += s2.charAt(i);
            }
        }

        s1 = k1;
        s2 = k2;

        if (s1.length() == s2.length()) {
            int ii1 = s1.length();
            for (int i = 0; i < ii1; i++) {
                char q = s1.charAt(i);
                int h = 0;
                int ii2 = s2.length();
                for (int j = 0; j < ii2; j++) {
                    if (s2.charAt(j) != q && h > 1) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        anagram ob = new anagram();
        ob.input();
        if (ob.checkL()) {
            System.out.println("Sentences are anagram");
        }
        else {
            System.out.println("Sentence isnt anagram");
        }
    }
}
