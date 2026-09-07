public class data {
  public static void main(String args[]) {
    // print(5);
    // printdec(5);
    // System.out.println(factorial(5));
    System.out.println(power(2, 3));
  };

  public static void print(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n + "");
    print(n - 1);
  };

  public static void printdec(int n){
    if (n == 0) return;
    printdec(n - 1);
    System.out.println(n);
  };

  public static int factorial(int n){
    int fact = 1;
    for (int i = 1; i<=n; i++) {
            fact = fact*i;
        }
        return fact;
  };

  public static int power(int a, int b) {
    if (b == 0) {
      return 1;
    }
    return a * power(a, b - 1);
  }
};


