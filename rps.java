
import java.util.Scanner;
import java.util.Random;

public class rps{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("WELCOME TO THE GAME: ROCK, PAPER, SCISSORS");
        System.out.println("Enter your choice: rock, paper or scissors:");

        String userChoice = scanner.nextLine();

        String[] choices ={ "rock", "paper", "scissors"};
        String computerChoice = choices[random.nextInt(3)];

        System.out.println("Computer choice: " + computerChoice);
 

        if(userChoice.equals(computerChoice)){
            System.out.println("It's a tie!");
        }
        else if(userChoice.equals("rock")&& computerChoice.equals("scissors")){
            System.out.println("You win!");
        }
        else if(userChoice.equals("rock")&& computerChoice.equals("paper")){
            System.out.println("You lose!");
        }
        else if(userChoice.equals("paper")&& computerChoice.equals("rock")){
            System.out.println("You win!");
        }
        else if(userChoice.equals("paper")&& computerChoice.equals("scissors")){
            System.out.println("You lose!");
        }
        else if(userChoice.equals("scissors")&& computerChoice.equals("paper")){
            System.out.println("You win!");
        }
        else if(userChoice.equals("scissors")&& computerChoice.equals("rock")){
            System.out.println("You lose!");
        }
        else{
            System.out.println("Invalid input!");
        }
        
     scanner.close();
    }
    
}
