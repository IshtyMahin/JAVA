import java.util.Scanner;

public class _2_userInput {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("How old are you ? ");
        int age = input.nextInt();
        input.nextLine(); // next int er por nextline  dite hobe natoh porer nextline  escape hoi jabe
        
        System.out.println("What is your favourite food? ");
        String food= input.nextLine();

        System.out.println("Hello "+ name);
        System.out.println("You are "+age+" years old.");
        System.out.println("You like "+food);
    }
}
