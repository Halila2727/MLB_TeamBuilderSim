import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TeamSelector 
{
    private enum Team 
    {
        METS, BRAVES, PHILLIES, NATIONALS, MARLINS, BREWERS, CUBS, PIRATES, REDS, CARDINALS,
        DODGERS, PADRES, DIAMONDBACKS, GIANTS, ROCKIES, ORIOLES, YANKEES, REDSOX, RAYS, JAYS,
        GUARDIANS, TWINS, ROYALS, TIGERS, WHITESOX, RANGERS, MARINERS, ATHLETICS, ANGELS, ASTROS
    }

    private Team team;
    private List<Team> pickedTeams;
    private static final Map<Team, String> teamToString = new HashMap<>();
    private static final Map<Team, Player[]> teamPlayers = new HashMap<>();

    static 
    {
        teamToString.put(Team.METS, "New York Mets");
        teamToString.put(Team.BRAVES, "Atlanta Braves");
        teamToString.put(Team.PHILLIES, "Philadelphia Phillies");
        teamToString.put(Team.NATIONALS, "Washington Nationals");
        teamToString.put(Team.MARLINS, "Miami Marlins");
        teamToString.put(Team.BREWERS, "Milwaukee Brewers");
        teamToString.put(Team.CUBS, "Chicago Cubs");
        teamToString.put(Team.PIRATES, "Pittsburgh Pirates");
        teamToString.put(Team.REDS, "Cincinnati Reds");
        teamToString.put(Team.CARDINALS, "St. Louis Cardinals");
        teamToString.put(Team.DODGERS, "Los Angeles Dodgers");
        teamToString.put(Team.PADRES, "San Diego Padres");
        teamToString.put(Team.DIAMONDBACKS, "Arizona Diamondbacks");
        teamToString.put(Team.GIANTS, "San Francisco Giants");
        teamToString.put(Team.ROCKIES, "Colorado Rockies");
        teamToString.put(Team.ORIOLES, "Baltimore Orioles");
        teamToString.put(Team.YANKEES, "New York Yankees");
        teamToString.put(Team.REDSOX, "Boston Red Sox");
        teamToString.put(Team.RAYS, "Tampa Bay Rays");
        teamToString.put(Team.JAYS, "Toronto Blue Jays");
        teamToString.put(Team.GUARDIANS, "Cleveland Guardians");
        teamToString.put(Team.TWINS, "Minnesota Twins");
        teamToString.put(Team.ROYALS, "Kansas City Royals");
        teamToString.put(Team.TIGERS, "Detroit Tigers");
        teamToString.put(Team.WHITESOX, "Chicago White Sox");
        teamToString.put(Team.RANGERS, "Texas Rangers");
        teamToString.put(Team.MARINERS, "Seattle Mariners");
        teamToString.put(Team.ATHLETICS, "Oakland Athletics");
        teamToString.put(Team.ANGELS, "Los Angeles Angels");
        teamToString.put(Team.ASTROS, "Houston Astros");
    }

    public TeamSelector() {
        pickedTeams = new ArrayList<>();
        Team selectedTeam = selectTeam();
        setTeam(selectedTeam);
        addToPickedTeams(selectedTeam);
    }

    public String getTeam() {
        return teamToString.get(team);
    }

    public Player[] getTeamPlayers() {
        return teamPlayers.get(team);
    }

    private void setTeam(Team team) {
        this.team = team;
    }

    private void addToPickedTeams(Team team) {
        pickedTeams.add(team);
    }

    private Team selectTeam() {
        Random random = new Random();
        int randomNumber = random.nextInt(30);
        return Team.values()[randomNumber];
    }
}