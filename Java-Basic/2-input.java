import java.util.Scanner;

class Takeinput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter your name \n");
        name = sc.nextLine();
        System.out.println("Your name is:" + name);
    }
}