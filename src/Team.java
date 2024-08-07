import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Team {
    private static final Map<String, List<Player>> teamPlayers = new HashMap<>();
    private static final String[] teams = 
    {
        "New York Mets", "Atlanta Braves", "Philadelphia Phillies", "Washington Nationals", "Miami Marlins",
        "Milwaukee Brewers", "Chicago Cubs", "Pittsburgh Pirates", "Cincinnati Reds", "St. Louis Cardinals",
        "Los Angeles Dodgers", "San Diego Padres", "Arizona Diamondbacks", "San Francisco Giants", "Colorado Rockies",
        "Baltimore Orioles", "New York Yankees", "Boston Red Sox", "Tampa Bay Rays", "Toronto Blue Jays",
        "Cleveland Guardians", "Minnesota Twins", "Kansas City Royals", "Detroit Tigers", "Chicago White Sox",
        "Texas Rangers", "Seattle Mariners", "Oakland Athletics", "Los Angeles Angels", "Houston Astros"
    };

    static {
        loadPlayersFromCSV("resources/players.csv");
    }

    private static void loadPlayersFromCSV(String filename) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) 
        {
            String line;
            br.readLine(); // Skipping the first line
            while ((line = br.readLine()) != null) 
            {
                String[] data = line.split(",");
                Player player = new Player( //creating the player all based on the player constructor in Player.java
                    data[0].trim(), // setting the position
                    data[1].trim(), // name
                    data[2].trim(), // team
                    Integer.parseInt(data[3].trim()), // # of at bats
                    Integer.parseInt(data[4].trim()), // batting average
                    Integer.parseInt(data[5].trim()), // # of home runs
                    Integer.parseInt(data[6].trim()), // on base percentage
                    Integer.parseInt(data[7].trim()), // slugging percentage
                    Double.parseDouble(data[8].trim()) // BWAR accumulated (stat that tries to assign a number to a player's worth)
                );
                teamPlayers.computeIfAbsent(player.getTeam(), k -> new ArrayList<>()).add(player);
            }
        }
        catch (IOException e) {e.printStackTrace();}
    }

    public static String selectRandomTeam() 
    {
        Random random = new Random();
        int randomIndex = random.nextInt(30);
        return teams[randomIndex];
    }

    public static List<Player> getPlayersForTeam(String teamName) 
    {
        return teamPlayers.getOrDefault(teamName, new ArrayList<>());
    }
}
