import java.util.Scanner;


class IfState{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        if(age > 20){
            System.out.println("You can Love me now");
        }else{
            System.out.println("You should forget me now");
        }
    }
}