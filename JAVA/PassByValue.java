import java.util.Scanner;
class PassByValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        
        try {
            System.out.print("Enter an integer: ");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        
        System.out.println("Before: " + n);
        System.out.println("Change: " + showN(n));
        System.out.println("After: " + n);
    }//end main

    static int showN(int n) {
        n = n * n;
        return n;
    }//end showN
}//end class

