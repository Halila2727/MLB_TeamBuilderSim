public class Player 
{
    private String position;
    private String name;
    private String team;
    private int ab;
    private int avg;
    private int hr;
    private int obp;
    private int slg;
    private double bwar;

    public Player(String position, String name, String team, int ab, int avg, int hr, int obp, int slg, double bwar) 
    {
        this.position = position;
        this.name = name;
        this.team = team;
        this.ab = ab;
        this.avg = avg;
        this.hr = hr;
        this.obp = obp;
        this.slg = slg;
        this.bwar = bwar;
    }

    // Getters
    public String getName() { return name; }
    public String getPosition() { return position; }
    public String getTeam() { return team; }
    public int getAB() { return ab; }
    public int getAvg() { return avg; }
    public int getHR() { return hr; }
    public int getObp() { return obp; }
    public int getSlg() { return slg; }
    public double getBwar() { return bwar; }

    public String printAttributes()
    {
        return (
            getName() + ", " + getPosition() + ", in " + getAB() + 
            " at bats, had a slashline of ." + getAvg() + "/." +
            getObp() + "/." + getSlg() +  " and hit for " + 
            getHR() + " homeruns!");
    }
}
