
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //read params
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<Statistic> records = readRecordsFromFile(file);
        
        // calculate games
        int games = 0;
        int wins = 0;
        int losses = 0;
        for (Statistic record : records) {
            games = games + record.getGames(team);
            wins = wins + record.getWins(team);
            losses = losses + record.getLosses(team);
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    
    public static ArrayList<Statistic> readRecordsFromFile(String file) {
        ArrayList<Statistic> statistic = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                
                if (row.equals("")) {
                    break;
                }
                String[] list = row.split(",");
                String team = list[0];
                String guest = list[1];
                int teamPoints = Integer.valueOf(list[2]);
                int guestPoints = Integer.valueOf(list[3]);
                
                statistic.add(new Statistic(team, guest, teamPoints, guestPoints));
            }
        } catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        
        return statistic;

    }

}
