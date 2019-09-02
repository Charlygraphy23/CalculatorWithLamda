import java.util.Scanner;

public class Main {
    private static double a;
    private static double b;


    private static Calculator calculator;
    public static void main(String[] args) {


         System.out.println("Enter two numbers");
         a=new Scanner(System.in).nextDouble();
         b=new Scanner(System.in).nextDouble();
        char ch;

        do{


            System.out.println("-----Main Menu -----");
            System.out.println("1 to Add");
            System.out.println("2 to Subtract");
            System.out.println("3 to Multiply");
            System.out.println("4 to Devide");
            System.out.println("5 to Exit");

            switch (new Scanner(System.in).nextInt()){


                case 1: calculator= (num1,num2)->(num1+num2);
                       display(calculator);
                       break;
                case 2:calculator= (num1,num2)->(num1-num2);
                        display(calculator);
                        break;
                case 3:calculator=(num1,num2)->(num1*num2);
                        display(calculator);
                        break;
                case 4:calculator=(num1,num2)->(num1/num2);
                        display(calculator);
                        break;
                case 5:System.exit(0);
                        break;
                default:
                    System.out.println("Invalid Option!!");

            }

            System.out.println("Do you Want to Continiue ?");
            ch=new Scanner(System.in).next().charAt(0);


        }while (ch=='Y'|| ch=='y');


    }

    private static void display(Calculator calculator) {
        System.out.println(" Value "+calculator.cal(a,b) );
    }
}

