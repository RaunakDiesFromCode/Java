import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Want to see the magic?");
        String y = scanner.nextLine();
        if (y.equals("y")) {
            System.out.println("Good, now see this...");
            Thread.sleep(2000);
            String text = "Hello World";
            String strr = "";
            int i = 0;
            while (i < text.length()) {
                if (Character.isUpperCase(text.charAt(i))) {
                    char a = 'A';
                    while (a < text.charAt(i)) {
                        System.out.println(strr + a);
                        a = (char) (a + 1);
                        Thread.sleep(70);
                    }
                    if (a == text.charAt(i)) {
                        strr = strr + a;
                        System.out.println(strr);
                    }
                    i += 1;
                } else if (text.charAt(i) == ' ') {
                    char a = ' ';
                    while (a < text.charAt(i)) {
                        System.out.println(strr + a);
                        a = (char) (a + 1);
                        Thread.sleep(100);
                    }
                    if (a == text.charAt(i)) {
                        strr = strr + a;
                        System.out.println(strr);
                    }
                    i += 1;
                } else {
                    char a = 'a';
                    while (a < text.charAt(i)) {
                        System.out.println(strr + a);
                        a = (char) (a + 1);
                        Thread.sleep(100);
                    }
                    if (a == text.charAt(i)) {
                        strr = strr + a;
                        System.out.println(strr);
                    }
                    i += 1;
                }
            }
        } else {
            System.out.println("You missed something for sure");
        }
    }
}

