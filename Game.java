import java.io.*;
import java.util.*;

class Game {
    private boolean used;  //to make sure the name of player is used
    private Player player;
    private int GuessTheNumber;
    private LuckyGuessGenerator luckyGuessGenerator;


    //Constructor
    public Game() {
        this.used = false;
        this.player = new Player();
        LuckyGuessGenerator luckyGuessGenerator = new LuckyGuessGenerator();
    }

    //Getter and Setter
    public boolean isUsed() {
        return used;
    }
    public void setUsed(boolean used) {
        this.used = used;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public int getGuessTheNumber() {
        return GuessTheNumber;
    }
    public void setGuessTheNumber(int guessTheNumber) {
        GuessTheNumber = guessTheNumber;
    }
    public LuckyGuessGenerator getLuckyGuessGenerator() {
        return luckyGuessGenerator;
    }
    public void setLuckyGuessGenerator(LuckyGuessGenerator luckyGuessGenerator) {
        this.luckyGuessGenerator = luckyGuessGenerator;
    }



    public void ViewMenu() { // Display the Menu For choice
        System.out.println("===================================================================\n\t\tWelcome to the Lucky Vending Machine\n===================================================================");
        System.out.println("(1) Set Up New Player");
        System.out.println("(2) Guess A Prize");
        System.out.println("(3) What Have I Won So Far?");
        System.out.println("(4) Display Game Help");
        System.out.println("(5) Exit Game\n===================================================================");
    }


    public void CreatePlayer() {// option 1 : asks the user to enter a name
        String name = "";
        Scanner playerNameScanner = new Scanner(System.in);

        System.out.print("Enter Player's Name: ");

        name = playerNameScanner.nextLine();

        if (name.equals("")) {

            System.out.println("Error: The Player's name must not be blank!");

        }else {
            player.setPlayerName(name);
            used = true;
        }


    }

    public void deletePlayer() {     //to delete the previous player
        used = false;
        player = new Player();
        System.out.println("Player Deleted");

    }

    public void Guessing() { //option 2 : generate random number and guess the prize
        LuckyGuessGenerator Guess = new LuckyGuessGenerator();
        Prize prize = new Prize();

        Scanner in = new Scanner(System.in);

        int myGuess = Guess.GenerateRandomNumber();

        System.out.print("Enter the Guess : ");

        try {
            int GuessTheNumber = in.nextInt(); // Read user input as an integer

            if (GuessTheNumber >= 1 && GuessTheNumber <= 5) {
                System.out.println("Your Guess : " + GuessTheNumber);
                System.out.println("My Guess: " + myGuess);

                if (GuessTheNumber == myGuess) {
                    Prize prize1 = new Prize();
                    System.out.println("Congratulations! You have won a " +
                            prize1.TheNameOfPrize(myGuess) +
                            ", Worth $" + prize1.TheWorthOfPrize(myGuess));
                    player.AddPrize(prize.TheNameOfPrize(myGuess), prize.TheWorthOfPrize(myGuess), prize.TheCostOfPrize(myGuess));
                } else {
                    player.setTotalSpending(player.getTotalSpending() + GuessTheNumber);
                    System.out.println("Sorry! You have won absolutely NOTHING! Please try again.");
                }
            } else {
                System.out.println("Error: Your Guess must be between 1-5");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer between 1 and 5.");
        }
    }

    public void PlayerStats() { // option 3 : Display The Player, worth a total ,total  spent
        System.out.println("Player " + player.getPlayerName() + " has won these prizes :");
        System.out.println(player.getWonPrizes());
        System.out.println("worth a total $" + player.getTotalWorth());
        System.out.println("Total amount spent is $" + player.getTotalSpending());
    }

    public void GameHelp() { // option 4 : explain the game rules
        System.out.println("--------------------------------------------------------------\n\t\t\tInstructions:\n--------------------------------------------------------------");
        System.out.println("1) Add The Player.");
        System.out.println("2) Guess The Number (Note: The Number Should Be Between 1-5)");
        System.out.println("(NOTE: If you do not set up the Player, the game will not start)");
        System.out.println("THIS table shows the elements with the cost and worth\n***********************************");
        System.out.println("NumberGenerated | Price Won | Price Worth | Cost to player");
        System.out.println("    1           |   Pen     |     $10     |       $1");
        System.out.println("    2           |   Book    |     $20     |       $2");
        System.out.println("    3           |   DVD     |     $30     |       $3");
        System.out.println("    4           |   Mouse   |     $40     |       $4");
        System.out.println("    5           | Keyboard  |     $50     |       $5");
    }

    public void savePlayerInfo() {//to save player data in txt file
        try {
            FileWriter writer = new FileWriter("player_Info.txt");
            writer.write("Player Name: " + player.getPlayerName() + "\n");
            writer.write(player.getPlayerName() + "He has won these Prizes  : | " );
            for (String prize: player.getWonPrizes()) {
                writer.write(prize + "  |   " );
            }
            writer.write("\n"+"Total Prize Worth:  $" + player.getTotalWorth() );
            writer.write("\n"+"Total Amount Spent: $" + player.getTotalSpending() );
            writer.close();
            System.out.println("Player data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving player data: " + e.getMessage());
        }
    }


    public void RunGame() { // to run the Game
        Scanner in = new Scanner(System.in);
        while (true) {// to display the menu again until press 5 to exit the program
            ViewMenu();
            System.out.print("Enter your choice (1-5): ");
            String choice = in.nextLine();
            switch (choice) {
                case "1":
                    if (!used) {
                        CreatePlayer();
                    }
                    else {
                            System.out.println("Do you want to delete the first player? (Y/N)");
                            String deleteChoice = in.nextLine();
                            if (deleteChoice.equalsIgnoreCase("Y")) {
                                deletePlayer();
                                used = false;
                            } else if (deleteChoice.equalsIgnoreCase("N")) {
                            } else {
                                System.out.println("Invalid choice. Please enter 'Y' or 'N'.");
                            }
                        }

                    break;

                case "2":
                    if (used) {
                        Guessing();
                    } else {
                        System.out.println("YOU HAVE NOT SET UP A PLAYER");
                    }
                    break;
                case "3":
                    if (used) {

                        PlayerStats();
                    } else {
                        System.out.println("YOU HAVE NOT SET UP A PLAYER");
                    }
                    break;
                case "4":
                    GameHelp();
                    break;
                case "5":
                    savePlayerInfo();
                    System.out.println("Goodbye, See you Soon.... :)");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
