import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        while(true){
            System.out.print("Input first number\n");
            int a=obj.nextInt();
            System.out.print("Input first number\n");
            int b=obj.nextInt();

            System.out.println("Which operation do you want to perform??\n");
            System.out.println("1.Summation");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Divison");

            int op=obj.nextInt();
            int result;
            if(op==1){
                result=a+b;
            }
            else if(op==2){
                result=a-b;
            }
            else if(op==3){
                result=a*b;
            }
            else result=a/b;
            System.out.println("The result is "+result);
            System.out.println("Do you want to continue calculation??? press Y for Yes,pres N for No");
            char ch=obj.next().charAt(0);

            if(ch=='Y' || ch=='y') continue;
            else break;
        }

        obj.close();// Clean up scanner resource
    }
}
