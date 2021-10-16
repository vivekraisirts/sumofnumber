import java.util.Scanner;
public class MultiOfThreeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3=sc.nextInt();

        sc.close();
        int Total=multi(num1,num2,num3);
        System.out.println("Sum of three numbers  "+Total);
    }

    public static int multi(int x,int y,int z){
        int result=x*y*z;
        return result;
    }
}
