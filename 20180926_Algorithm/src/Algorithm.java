import java.util.Scanner;

public class Algorithm {


    public static void showArray ( int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static boolean isPrime ( int n ){
        int i = 2;
        boolean prime = true;

        while (i < (n / 2) && prime) {
            if(n % i == 0){
                prime = false;
            }
            i = i + 1;
        }
        return prime;
    }

    public static int[] increaseArray(int[] a, int e) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[b.length - 1] = e;
        return b;
    }

    public static boolean isPalindrome(int n){
        int N = n;
        int reverseN = 0;
        boolean palindrome = false;
        while(n > 0){
            int r = n % 10;
            reverseN = reverseN * 10 + r;
            n = n / 10;
        }
        if(N == reverseN){
            palindrome = true;
        }return palindrome;
    }
    public static boolean isOdd(int n) {
        boolean odd = false;
        if (n % 2 == 1) {
            odd = true;
        }
        return odd;
    }
    public static void algorithm(int[] a, String algorithm){
       int[]b = new int[0];
        switch(algorithm) {
            case "prime":
                for (int i = 0; i < a.length; i++) {
                    if (isPrime(a[i])) {
                       b = increaseArray(b, a[i]);
                    }
                }
                break;

            case "palindrome":
                for (int i = 0; i < a.length; i++) {
                    if (isPalindrome(a[i])) {
                        b = increaseArray(b, a[i]);
                    }
                }
                break;

            case "odd":
                for (int i = 0; i < a.length; i++) {
                    if (isOdd(a[i])) {
                        b = increaseArray(b, a[i]);
                    }
                }
                break;

            case "even":
                for (int i = 0; i < a.length; i++) {
                    if (!(isOdd(a[i]))) {
                        b = increaseArray(b, a[i]);
                    }
                }
                break;

            default:
                System.out.println();

        }
        showArray(b);
    }

    public static void main(String[] args) {
        int[] myArray = new int[100];
        for (int i = 0; i < 100; i++) {
            myArray[i] = i + 1;
        }
        System.out.println("Se afiseaza sirul myArray:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti algoritmul: ");
        String algorithm = scanner.next();
        System.out.println("Afisati elementele care indeplinesc algoritmul: ");
        algorithm(myArray, algorithm);
    }
}





