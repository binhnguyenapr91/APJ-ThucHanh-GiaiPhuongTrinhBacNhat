import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("---Linear Equation Reslover---");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        System.out.println("------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the constant:");
        System.out.print("a:");
        double a = scanner.nextDouble();
        System.out.print("b:");
        double b = scanner.nextDouble();
        if(a!=0){
            double solution = -b/a;
            System.out.println("x="+solution);
        }else {
            if (b==0){
                System.out.println("All x");
            }else{
                System.out.println("No x");
            }
        }
    }
}
