import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main 
{
    private static final Map<String, String> fantasyTeam = new HashMap<>();
    private static Set<String> positions = new HashSet<>();
    private static Set<String> positionsLeft = new HashSet<>();
    public static double gameScore = 0;
    
    public static void main(String[] args) throws InterruptedException 
    {
        populateSet();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        final DecimalFormat df = new DecimalFormat("0.0");

        while (true) 
        {
            if(fantasyTeam.size() >= 9) { break; }

            System.out.print("\nPick a randomly selected team? (Type Y if yes): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("Y")) 
            {
                String selectedTeam = Team.selectRandomTeam();
                System.out.println("Your team is the " + selectedTeam);

                List<Player> players = Team.getPlayersForTeam(selectedTeam);

                for(Player player : players)
                {
                    System.out.println(player.printAttributes());
                    System.out.println();
                }

                System.out.println("\nFollowing positions are not filled in your team: " + positionsLeft);
                System.out.print("Please enter the position of the player you would like to add to your team (e.g.: ss for shortstop): ");

                input = scanner.nextLine();

                while(!positions.contains(input.toLowerCase()) || fantasyTeam.containsKey(input.toUpperCase()))
                {
                    System.out.print("You either did not enter a valid position or have already selected a player for this positions. Try again: ");
                    input = scanner.nextLine();
                }
                
                for(Player player : players)
                {
                    if(player.getPosition().equalsIgnoreCase(input))
                    {
                        positionsLeft.remove(input.toLowerCase());
                        fantasyTeam.put(input.toUpperCase(), player.getName());
                        addGameScore(player.getBwar());

                        System.out.println("Added " + player.getName() + " to your team.");
                    }
                }

            } else {
                if(input.equalsIgnoreCase("N")) { break; }

                System.out.println("Not a valid input!");
            }
        }

        scanner.close();

        System.out.println("\nYour Fantasy Team:");
        printFantasyTeam();
        System.out.println("\nYour game score: " + df.format(gameScore));

        System.out.println("Congratulations!\n\nTerminating Program...");
        TimeUnit.SECONDS.sleep(3);

        System.exit(0);
    }

    private static void populateSet()
    {
        String[] pos = {"c", "1b", "2b", "3b", "ss", "lf", "cf", "rf", "dh"};
        for(String p : pos)
        {
            positions.add(p);
            positionsLeft.add(p);
        }
    }

    private static void addGameScore(double war)
    {
        gameScore += war;
    }

    public static void printFantasyTeam()
    {
        System.out.println("Catcher: " + fantasyTeam.get("C"));
        System.out.println("First Baseman: " + fantasyTeam.get("1B"));
        System.out.println("Second Baseman: " + fantasyTeam.get("2B"));
        System.out.println("Shortstop: " + fantasyTeam.get("SS"));
        System.out.println("Third Baseman: " + fantasyTeam.get("3B"));
        System.out.println("Left Fielder: " + fantasyTeam.get("LF"));
        System.out.println("Center Fielder: " + fantasyTeam.get("CF"));
        System.out.println("Right Fielder: " + fantasyTeam.get("RF"));
        System.out.println("Designated Hitter: " + fantasyTeam.get("DH"));
    }
}
