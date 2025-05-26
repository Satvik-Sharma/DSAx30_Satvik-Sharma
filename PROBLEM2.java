import java.util.Scanner;

class Solution2 {
  public static void printPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int s = 0; s < n - i; s++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
          System.out.print((char)('A' + j));
      }
      for (int j = 1; j <= i-1; j++) {
          System.out.print((char)('A' + i - j - 1));
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    n = sc.nextInt();
    printPattern(n);
    sc.close();
  }
}