import java.util.Scanner;


class Program1 {
    // Sum of Digits
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}

class Program2 {
    // Reverse of a Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        System.out.println("Reversed number = " + rev);
    }
}

class Program3 {
    // Palindrome Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        if (n == rev) {
            System.out.println(n + " is a Palindrome number");
        } else {
            System.out.println(n + " is not a Palindrome number");
        }
    }
}

class Program4 {
    // Digital Root
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while (n >= 10) {
            int sum = 0;
            while (n != 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            n = sum;
        }
        System.out.println("Digital Root = " + n);
    }
}

class Program5 {
    // Count Digits
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        System.out.println("Total digits = " + count);
    }
}

class Program6 {
    // Product of Digits
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int product = 1;
        while (n != 0) {
            int digit = n % 10;
            product = product * digit;
            n = n / 10;
        }
        System.out.println("Product of digits = " + product);
    }
}

class Program7 {
    // Armstrong Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = n;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }
            sum = sum + power;
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}

class Program8 {
    // Strong Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println(n + " is a Strong number");
        } else {
            System.out.println(n + " is not a Strong number");
        }
    }
}

class Program9 {
    // Spy Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int product = 1;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }
        if (sum == product) {
            System.out.println(n + " is a Spy number");
        } else {
            System.out.println(n + " is not a Spy number");
        }
    }
}

class Program10 {
    // Perfect Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println(n + " is a Perfect number");
        } else {
            System.out.println(n + " is not a Perfect number");
        }
    }
}

class Program11 {
    // Automorphic Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sq = n * n;
        int temp = n;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        int lastDigits = (int) (sq % Math.pow(10, digits));
        if (lastDigits == n) {
            System.out.println(n + " is an Automorphic number");
        } else {
            System.out.println(n + " is not an Automorphic number");
        }
    }
}

class Program12 {
    // Neon Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sq = n * n;
        int sum = 0;
        while (sq != 0) {
            sum = sum + sq % 10;
            sq = sq / 10;
        }
        if (sum == n) {
            System.out.println(n + " is a Neon number");
        } else {
            System.out.println(n + " is not a Neon number");
        }
    }
}

class Program13 {
    // Duck Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String n = sc.next();
        boolean isDuck = false;
        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) == '0') {
                isDuck = true;
                break;
            }
        }
        if (n.charAt(0) == '0') {
            // leading zero doesn't count, but Scanner won't give us this anyway
            isDuck = false;
        }
        if (isDuck) {
            System.out.println(n + " is a Duck number");
        } else {
            System.out.println(n + " is not a Duck number");
        }
    }
}

class Program14 {
    // Harshad Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            sum = sum + temp % 10;
            temp = temp / 10;
        }
        if (n % sum == 0) {
            System.out.println(n + " is a Harshad number");
        } else {
            System.out.println(n + " is not a Harshad number");
        }
    }
}

class Program15 {
    // Swap First and Last Digit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        int firstDigit = n;
        for (int i = 1; i < digits; i++) {
            firstDigit = firstDigit / 10;
        }
        int lastDigit = n % 10;
        int divisor = (int) Math.pow(10, digits - 1);
        int middle = (n % divisor) / 10;
        int result = lastDigit * divisor + middle * 10 + firstDigit;
        System.out.println("After swapping = " + result);
    }
}

class Program16 {
    // Largest Digit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int largest = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit > largest) {
                largest = digit;
            }
            n = n / 10;
        }
        System.out.println("Largest digit = " + largest);
    }
}

class Program17 {
    // Smallest Digit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int smallest = 9;
        while (n != 0) {
            int digit = n % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            n = n / 10;
        }
        System.out.println("Smallest digit = " + smallest);
    }
}

class Program18 {
    // Remove Zero Digits
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        String result = "";
        if (temp == 0) {
            result = "0";
        }
        while (temp != 0) {
            int digit = temp % 10;
            if (digit != 0) {
                result = digit + result;
            }
            temp = temp / 10;
        }
        System.out.println("After removing zeros = " + result);
    }
}

class Program19 {
    // Prime Number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is not a Prime number");
        }
    }
}

class Program20 {
    // Prime Digits Only
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        boolean allPrime = true;
        while (temp != 0) {
            int digit = temp % 10;
            if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                allPrime = false;
                break;
            }
            temp = temp / 10;
        }
        if (allPrime) {
            System.out.println("All digits of " + n + " are prime digits");
        } else {
            System.out.println("Not all digits of " + n + " are prime digits");
        }
    }
}
