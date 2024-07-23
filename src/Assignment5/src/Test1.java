package Assignment5.src;
import java.util.Scanner;         


//This program is simply scanning the input that is typed by troll idiot
//displaying without changing any order of the number typed

public class Test1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Enter 3 numbers:");
        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextInt();
        }
        
        System.out.println("The numbers you entered are:");
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }
    }
}

