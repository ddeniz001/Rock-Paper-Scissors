import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String Args[]){
        int player_score = 0;
        int cpu_score = 0;
        int counter = 0;
        Random random = new Random();
        Scanner user_input = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scizzors, you will regret doing this to yourself");
        System.out.println("What's your name young lad/lass?");
        String player_name = user_input.nextLine();
        System.out.println("You shall meet your demise very soon," + player_name + "!!!");

        while (counter == 0) {
            System.out.println("Press 1, 2, 3 (Rock, Paper, Scissozrs)for your choice of action.");
            int player_choice = user_input.nextInt();

            if (player_choice == 0 | player_choice >= 3) {
                System.out.println("please enter a valid input; 1, 2 or 3");
                int player_new = user_input.nextInt();
                player_choice = player_new;

            }
            int cpu_choice = 1 + random.nextInt(3);

            if (player_choice == 1 && cpu_choice == 1) {
                System.out.println("I choose rock!");
                System.out.println("ITS A TIE! WHAT ARE THE ODDS?!");
                System.out.println("Player Score" + player_score);
                System.out.println("Opponent Score" + cpu_score);
            }
            if (player_choice == 1 && cpu_choice == 2){
                System.out.println("I choose Paper");
                System.out.println("Muahaha I win this round");
                System.out.println("Player Score" + player_score);
                cpu_score++;
                System.out.println("Opponent Score" + cpu_score);

            }
            if (player_choice == 1 && cpu_choice == 3){
                System.out.println("I choose Scizzors");
                System.out.println("GAHH I lost this round!");
                player_score++;
                System.out.println("Player Score" + player_score);
                System.out.println("Opponent Score" + cpu_score);

            }
            if (player_choice == 2 && cpu_choice == 2) {
                System.out.println("I choose Paper'");
                System.out.println("A TIE? BLASPHEMY");
                System.out.println("Player Score" + player_score);
                System.out.println("Opponent Score" + cpu_score);
            }
            if (player_choice == 2 && cpu_choice == 3) {
                System.out.println("I choose Scizzors");
                System.out.println("HAHA I WIN!!!");
                System.out.println("Player Score" + player_score);
                cpu_score++;
                System.out.println("Opponent Score" + cpu_score);

            }
            if (player_choice == 2 && cpu_choice == 1){
                System.out.println("I choose Rocks!");
                System.out.println("GAHH I lost this round!");
                System.out.println("Player Score" + player_score);
                System.out.println("Opponent Score" + cpu_score);


            }
            if (player_choice == 3 && cpu_choice == 1) {
                System.out.println("I choose Rocks!");
                System.out.println("HAHA! I shall demolish yoU!!");
                System.out.println("Player Score" + player_score);
                cpu_score++;
                System.out.println("Opponent Score" + cpu_score);
            }
            if (player_choice == 3 && cpu_choice == 2){
                System.out.println("I choose Papersz!");
                System.out.println("SH$%T!!!");
                player_score++;
                System.out.println("Player Score" + player_score);
                System.out.println("Opponent Score" + cpu_score);


            }
            if (player_choice == 3 && cpu_choice == 3) {
                System.out.println("A tie? Waow!");
                System.out.println("Player Score" + player_score);
                System.out.println("Opponent Score" + cpu_score);

            }
            if (player_score == 10){
                System.out.println("HEEE?! I lost!! How is this possible? Maybe humans are the master-race after all.(Lol humanity isn't a race tho");
                counter++;
            }
            if(cpu_score == 10) {
                System.out.println("Hahaha, I will now go and exterminate the human kind");
                counter++;

            }
        }
    }
}


