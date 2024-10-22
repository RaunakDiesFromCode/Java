package AlphabetGenerator;

import java.util.Scanner;

public class Generate {

  public static String alphabet[] = {
        "01110100011000111111100011000110001", // A
        "11110100011000111110100011000111110", // B
        "01111100011000010000100001000001111", // C
        "11110100011000110001100011000111110", // D
        "11111100001000011110100001000011111", // E
        "11111100001000011110100001000010000", // F
        "01111100011000010111100011000101111", // G
        "10001100011000111111100011000110001", // H
        "01110001000010000100001000010001110", // I
        "00001000010000100001000011000101110", // J
        "10001100011001011100100101000110001", // K
        "10000100001000010000100001000011111", // L
        "10001110111010110001100011000110001", // M
        "10001110011010110011100011000110001", // N
        "01110100011000110001100011000101110", // O
        "11110100011000111110100001000010000", // P
        "01110100011000110001101011001001101", // Q
        "11110100011000111110101001001010001", // R
        "01111100001000001110000010000111110", // S
        "11111001000010000100001000010000100", // T
        "10001100011000110001100011000101110", // U
        "10001100011000110001100010101000100", // V
        "10001100011000110101101011101110001", // W
        "10001100010101000100010101000110001", // X
        "11111000010001000100010001000011111"  // Z
  };

  public String[][] gen(String a) {
    String[][] result = new String[5][7];
    int beg = 0, end = 1;
    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 5; j++) {
        result[j][i] = (a.substring(beg, end).equals("1")) ? "*" : " ";
        beg = end;
        end++;
      }
    }
    return result;
  }
  
  public static void main(String[] args) {
    Generate ob = new Generate();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char c = sc.next().charAt(0);
    System.out.println("The character you entered is: " + c + "\n Dgit of the alphabet is: "+(int)c);
    String[][] result = ob.gen(alphabet[(int)c - 97]);
    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(result[j][i]);
      }
      System.out.println();
    }
    sc.close();
  }
};