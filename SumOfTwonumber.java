import java.util.Scanner;
public class SumOfTwonumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();

        sc.close();
        int Total=calcTotal(num1,num2);
        System.out.println("Sum of two numbers  "+Total);
    }

    public static int calcTotal(int x,int y){
        int result=x+y;
        return result;
    }
}
