/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class Statistic {
    
    private String team;
    private String guest;
    private int teamPoints;
    private int guestPoints;
    
    public Statistic(String team, String guest, int teamPoints, int guestPoints) {
        this.team = team;
        this.guest = guest;
        this.teamPoints = teamPoints;
        this.guestPoints = guestPoints;
    }
    
    public int getGames (String searchTeam) {
        
        int count = 0;
        
        if (this.team.equals(searchTeam) || this.guest.equals(searchTeam)){
            count++;
        }
        
        return count;
    }
    
    public int getWins(String searchTeam) {
        
        int count = 0;
        
        if (this.team.equals(searchTeam) && (this.teamPoints > this.guestPoints)) {
            count++;
        }
      
        if (this.guest.equals(searchTeam) && (this.teamPoints < this.guestPoints)) {
            count++;
        }
        
        return count;
    }
    
    public int getLosses(String searchTeam) {
        
        int count = 0;
        
        if (this.team.equals(searchTeam) && (this.teamPoints < this.guestPoints)) {
            count++;
        }
      
        if (this.guest.equals(searchTeam) && (this.teamPoints > this.guestPoints)) {
            count++;
        }
        
        return count;
    }
    
}
