import java.util.Scanner;
class Lab4_4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] word = new String[5];
    System.out.println("Enter 5 strings");
    for (int i = 0; i < 5; i++) {
		System.out.print("Enter String "+(i+1)+" : ");
		word[i] = input.nextLine();
    }
    for (int i = 0; i < 5; i++) {
      for (int j = i + 1; j < 5; j++) {
        if (word[i].equals(word[j])) {
          System.out.println("String "+(i+1)+" = String "+(j+1));
        }//end if
      }//end for in
    }//end for out
  }//end main
}//end class