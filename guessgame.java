import java.util.*;
class guessgame{
    public static void main(String args[])
    {
        double g = Math.random()*100;
        int f = (int)g;
        Scanner sc = new Scanner(System.in);
        System.out.print("Game has started! Guess the number: ");
        int s;
        while(true)
        {
            s = sc.nextInt();
            if(s<f)
            {
                System.out.println("Wrong! Guess a bigger number");
            }
            else if(s>f)
            {
                System.out.println("Wrong! Guess a smaller number");
            }
            else
            {
                System.out.println("Congratulation! You have guess correct number");
                System.exit(0);
            }
        }
    }
}