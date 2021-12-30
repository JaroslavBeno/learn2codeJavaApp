import java.util.Scanner;

class JavaChatBot {
    public static void main(String[] args) {

        System.out.println("Hello, I am Java Chat Bot.");
        System.out.println("What is your name ?");
        Scanner s = new Scanner(System.in);
        String readLine = s.nextLine();
        System.out.println("You have nice name, "+readLine+". Have a nice day, see you later...  ");
        s.close();
        
        
    }
}
