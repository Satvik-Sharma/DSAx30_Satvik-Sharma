import java.util.Scanner;

class Solution5 {
  public static boolean isKaprekar(int n) {
    long square = (long) n * n;
    String sqStr = Long.toString(square);
    int len = sqStr.length();

    int splitPos = len / 2; 

    String leftStr = splitPos > 0 ? sqStr.substring(0, splitPos) : "0";
    String rightStr = sqStr.substring(splitPos);

    long leftPart = Long.parseLong(leftStr);
    long rightPart = Long.parseLong(rightStr);
    return (leftPart + rightPart) == n;
  }

  public static int printKaprekarNumbers(int p, int q) {
    int count = 0;
    for (int i=p; i<=q; i++) {
      if (isKaprekar(i)) {
        System.out.print(i + ", ");
        count++;
      }
    }
    System.out.println();
    return count;
  }

  public static void main(String[] args) {
    int p, q;
    Scanner sc = new Scanner(System.in);
    System.out.print("p = ");
    p = sc.nextInt();
    System.out.print("q = ");
    q = sc.nextInt();
    System.out.println("The Kaprekar Numbers are: ");
    int freq = printKaprekarNumbers(p, q);
    System.out.println("Frequency of Kaprekar numbers is: " + freq);
    sc.close();
  }
}
