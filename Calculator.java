import java.util.Scanner;
public class Calculator{
    int n, i, num;
    public void doSum(){
        // This is the method to add numbers.
        int sum=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        n = scan.nextInt();
        System.out.print("Enter " +n+ " Numbers: ");
        for(i=0; i<n; i++)
        {
            num = scan.nextInt();
            sum = sum + num;
        }
        System.out.println("\nSum = " +sum);
    }
    public void doSub(){
        // This is the method to subtract numbers.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers for subtraction: ");
        System.out.print("Enter first number: ");
        int n1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scan.nextInt();
		 if(n1>n2)
            System.out.println("Subtract = "+(n1-n2));
        else
            System.out.println("Subtract = "+(n2-n1));
    }

    public void doMul(){
        // This is the method to multiply two numbers.

        int mul=1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Value of n: ");
        n = scan.nextInt();
        System.out.print("Enter " +n+ " Numbers: ");
        for(i=0; i<n; i++)
        {
            num = scan.nextInt();
            mul = mul * num;
        }

        System.out.println("\nMultiplicaton = " +mul);
    }

    public void doDiv(){
        // This is the method to divide two numbers.
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers for division: ");
        System.out.print("Enter first number: ");
        int n1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scan.nextInt();

        if(n1>n2)
            System.out.println("Division = "+(n1/n2));
        else
            System.out.println("Division = "+(n2/n1));
    }

    public static void main(String[] args) {

        Calculator cp = new Calculator();

        System.out.println("What operation do you want to perform ?");
        System.out.println("Choices: ");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter 5 for exit");

        Scanner a = new Scanner(System.in);
        int choice = a.nextInt();

        switch (choice)
        {
            case 1:
                cp.doSum();
                break;

            case 2:
                cp.doSub();
                break;

            case 3:
                cp.doMul();
                break;

            case 4:
                cp.doDiv();
                break;

            case 5:
                break;

            default:
                System.out.println("Invalid choice. Please enter correct choice");
                break;
        }
    }
}
			
