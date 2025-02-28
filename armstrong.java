// armstrong nuber 153 = 1*1*1 + 5*5*5 + 3*3*3

import java.util.Scanner;

public class armstrong 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the armstroing number: ");
        String character  = sc.nextLine();
        boolean isNumberInteger = false;
        int number  = 0;
        while(isNumberInteger == false)
        {
            try{
                number = Integer.parseInt(character);
                System.out.println("Valid number:" + number);
                isNumberInteger = true;
            }
            catch(NumberFormatException e){
                System.out.println("Invalid Input. Please enter only integers as an input!!!\n");
                character  = sc.nextLine();
            }
        }// while
       
        System.out.println("TEST\n");
        int n = number;
        int indCube = 0;
        int  sum= 0;

        while(n>0)
        {
            indCube = n % 10;
            double cube = Math.pow(indCube, 3);
            sum += cube;
            n /= 10;
        }
  
        if(sum == number)
        {
            System.out.println("ITS A ARMSTRONG\n");

        }
        else{
            System.out.println("ITS NOT\n");
        }



    }
}
