import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    static Random random = new Random();
    
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Are you ready? Write 'yes' if your are.");
            String play = scanner.nextLine();
    
            if(play.equalsIgnoreCase("yes") || play.equalsIgnoreCase("y")){
                System.out.println("Great!");
            }

            System.out.println("rock - paper - scissors, shoot!");
            String userChoice = scanner.nextLine();
            String computerChoice = computerPlay();

            System.out.println("You chose: "+ userChoice);
            System.out.println("The computer chose: "+ computerChoice);
            
            System.out.println(winner(userChoice, computerChoice));
        }
    
        public static String computerPlay(){
            int randNum = random.nextInt(3);
            String[] myArray = {"Rock", "Paper", "Scissors"};

        return myArray[randNum];
        }

        public static String winner(String user, String computer){
            if(user.equalsIgnoreCase("paper") && computer.equalsIgnoreCase("scissors")){
                return "You win!";
            }
            else if(user.equalsIgnoreCase("scissors") && computer.equalsIgnoreCase("paper")){
                return "You win!";
            }
            else if(user.equalsIgnoreCase("paper") && computer.equalsIgnoreCase("rock")){
                return "You win!";
            }
            else if(user.equalsIgnoreCase(computer)){
                return "Draw!";
            }
            else{
                return "Computer Wins!";
            }
        }

}
