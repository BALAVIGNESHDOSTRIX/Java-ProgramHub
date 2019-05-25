import java.util.Scanner;


class Switchstate{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s;
        System.out.println("Enter your name First Letter");
        s = sc.next().charAt(0);

        switch(s){
            case 'A':
                System.out.println("Your are nice heart person");
                break;
            case 'B':
                System.out.println("Your are Sweet and charming person");
                break;
            case 'S':
                System.out.println("You are sexy and beautiful person");
                break;
            default:
                System.out.println("Please try again");
                break;
        }

    }
}