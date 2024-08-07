import java.util.*;

public class Main 
{
    private static final Map<String, String> fantasyTeam = new HashMap<>();

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) 
        {
            System.out.print("Pick a randomly selected team? (Type Y if yes): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("Y")) 
            {
                String selectedTeam = Team.selectRandomTeam();
                System.out.println("Your team is " + selectedTeam);

                List<Player> players = Team.getPlayersForTeam(selectedTeam);     
            } 
            else { break; }
        }

        scanner.close();
    }
}
