import java.util.Scanner;

public class LeapYear {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner .nextInt();
                 if (n % 4 == 0){
                    if (n % 100 == 0){
                        if (n % 400 == 0){
                      System.out.println("leap year");

                        }
                    }
                 }
                  else{
                    System.out.println("not leap year");
                  }
                   
      }
    
}
