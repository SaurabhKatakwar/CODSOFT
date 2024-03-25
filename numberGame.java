package Task1;
import java.util.Scanner;
class randomNumberGenerate{
    int numberGenerate(){
        int max=100,min=1;
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
public class numberGame {

    public static void main(String[] args) {
        randomNumberGenerate rNGObj = new randomNumberGenerate();
        System.out.println("Random Number Generated Sucessfully");
        Scanner scan = new Scanner(System.in);
        boolean loop=false;
        int totalAttempt=0,attempt=0,win=0;
        do {
            loop=false;
            int num = rNGObj.numberGenerate();
            while(true){
                System.out.println("Please Enter Your Number Between 1 to 100: ");
                int guessNumber = scan.nextInt();
                attempt++;
                if (guessNumber == num) {
                    System.out.println("Your Guess is correct");
                    win++;
                    break;
                }
                else if(guessNumber>num) {
                    System.out.println("Number is Greater");
                }
                else {
                    System.out.println("Number is Small");
                }
            }
            totalAttempt += attempt;
            System.out.println("Attempts= "+ attempt);
            double winrate = (double)win/totalAttempt*100;
            System.out.printf("Winrate is: %.2f \n" , winrate);
            System.out.println("Do you want to play again(y/n): ");
            String loopInput = scan.next();
            if(loopInput.equalsIgnoreCase("y")){
                loop=true;
            }
        }while (loop);
    }
}