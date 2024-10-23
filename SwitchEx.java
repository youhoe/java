import java.util.*;

class SwitchEx {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        System.out.println("Enter the option:");
        System.out.println("1. ODD EVEN");
        System.out.println("2. Prime");
        System.out.println("3. Armstrong number");
        System.out.println("4. Palindrome");
        choice = sc.nextInt();
        
        switch(choice) {
            case 1:
                if (n % 2 == 0)
                    System.out.println(n + " is even");
                else
                    System.out.println(n + " is odd");
                break;
                
            case 2:
                boolean isPrime = true;
                if (n <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(n); i++) {
                        if (n % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime)
                    System.out.println(n + " is a prime number");
                else
                    System.out.println(n + " is not a prime number");
                break;
                
            case 3:
                int originalNumber = n;
                int sum = 0;
                int count = String.valueOf(n).length();
                
                while (n > 0) {
                    int digit = n % 10;
                    sum += Math.pow(digit, count);
                    n /= 10;
                }
                
                if (sum == originalNumber)
                    System.out.println(originalNumber + " is an Armstrong number");
                else
                    System.out.println(originalNumber + " is not an Armstrong number");
                break;
                
            case 4:
                String original = String.valueOf(n);
                String reverse = "";
                
                for (int i = original.length() - 1; i >= 0; i--) {
                    reverse += original.charAt(i);
                }
                
                if (original.equals(reverse))
                    System.out.println(original + " is a palindrome");
                else
                    System.out.println(original + " is not a palindrome");
                break;
                
            default:
                System.out.println("Invalid option");
                break;
        }
        
        sc.close();
    }
}