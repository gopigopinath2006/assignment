import java.util.Scanner;
public class gopi {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
               // int a = 13;
         int age = scanner.nextInt();
            if (age % 2 == 0){
                System.out.println("is even");
            }
            else{
                System.out.println("is odd");
            }
        }
}