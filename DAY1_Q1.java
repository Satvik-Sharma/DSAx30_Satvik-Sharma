import java.util.Scanner;

class Solution1 {
  public static void printPattern(int n) {
    int matSize = n * 2 - 1;
    for (int i=0; i<matSize; i++) {
      for (int j=0; j<matSize; j++) {
        int disMin = Math.min(Math.min(i, j), Math.min(matSize - 1 - i, matSize - 1 - j));
        System.out.print(n - disMin + " ");
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
