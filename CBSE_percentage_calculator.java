
import java.util.Scanner;

class CBSE_percentage_calculator {
        public static void main(String[] args) {
            System.out.println("Taking Input from the User : ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Marks of first subject : "); 
            float a = sc.nextInt();
            System.out.println("Enter Marks of second subject : ");
            float b = sc.nextInt();
            System.out.println("Enter Marks of third subject : ");
            float c = sc.nextInt();
            System.out.println("Enter Marks of fourth subject : ");
            float d = sc.nextInt();
            System.out.println("Enter Marks of fifth subject : ");
            float e = sc.nextInt();
            float average = (a + b + c + d + e)/5;
            System.out.print("Your CBSE percentage is = " + average + "%");
            sc.close();
        }
    }