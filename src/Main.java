import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Welcome to the Baseball Team Selector!");
        System.out.println("This program will randomly select a team for you.");

        System.out.print("Do you want to pick a randomly selected team? (Type Y to continue): ");
        System.out.flush();  // Ensure the prompt is displayed immediately

        while (true) 
        {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("Y")) {
                TeamSelector selectedTeam = new TeamSelector();
                System.out.println("Your randomly selected team is: " + selectedTeam.getTeam());
                System.out.println(); // Add a blank line for better readability
                break;
            } 
            else 
            {
                System.out.println("Invalid input. Please type Y for yes");
                System.out.flush();  // Ensure the prompt is displayed immediately
            }
        }

        scanner.close();
    }
}
