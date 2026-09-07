public class data {
  public static void main(String args[]) {
    // print(5);
    // printdec(5);
    // System.out.println(factorial(5));
    // System.out.println(power(2, 3));
    // System.out.println(countDigits(12345));
    // System.out.println(sumOfDigits(999));
    // System.out.println(lastDigit(123));
    System.out.println(findSum(new int[]{1, 2, 3, 4, 5}, 0));
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
  };

  public static int countDigits(int n) {
    if (n == 0) {
      return 0;
    }
    return 1 + countDigits(n / 10);
  };

  public static int sumOfDigits(int n) {
    if (n == 0) {
      return 0;
    }
    return n % 10 + sumOfDigits(n / 10);
  };

  public static int lastDigit(int n) {
    return n % 10;
  };

  public static int findSum(int arr[], int idx) {
    if (idx == arr.length) {
      return 0;
    }
    return arr[idx] + findSum(arr, idx + 1);

  }
};


