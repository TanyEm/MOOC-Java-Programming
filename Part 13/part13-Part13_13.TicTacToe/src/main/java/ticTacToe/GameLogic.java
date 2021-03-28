/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

/**
 *
 * @author tanyem
 */
public class GameLogic {
    

    
    private static char[][] grid;
    
    public GameLogic(int size){
        grid = new char[size][size];   
    }
    
    public boolean gameFinished(){              
        
        if (checkDiagonally() || checkVertically() || checkHorizontally()){
            return true;
        }
    
        return full();
    }
//    doesen't wok for tests FAIL: Compilation failed
//    but wkts in real life
//    [ERROR] /Users/tanyem/NetBeansProjects/mooc-java-programming-ii/part13-Part13_13.TicTacToe
//    /src/main/java/ticTacToe/GameLogic.java:[32,14] cannot find symbol [ERROR] symbol: class var
//    public static boolean full(){
//        for (var i : grid) {
//            for (int j = 0; j < grid[i].length; j++) {
//                if (i[j] == 0) {
//                    return false;
//                }
//            }
//        } 
//       
//        return true;
//    }
    
    public static boolean full(){
        
        for (int row =0; row<grid.length; row++){ 
            for (int col=0; col<grid[row].length; col++){
                if (grid[row][col] == 0){     
                    return false;
                }
            }
        } 
       
        return true;
    }
    
    public static boolean checkHorizontally(){
        
        for (char[] i : grid) {
            int x = 0;
            int o = 0;
            for (int j = 0; j < i.length; j++) {
                if (i[j] == ('X')) {
                    x++;
                }
                if (i[j] == ('O')) {
                    o++;
                }
                if (x == 3 || o ==3){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
    public static boolean checkVertically(){
        for (int row = 0; row < grid.length; row++){
            int x = 0;
            int o = 0;
            for (int col=0; col < grid[row].length; col++){
                if(grid[col][row] == ('X')){
                    x++;
                } if(grid[col][row] == ('O')){
                    o++;
                }
                if (x == 3 || o==3){
                    return true;
                }
            }
        }
        return false;
    }
        
    public static boolean checkDiagonally(){
        char dia1[] = new char[grid.length];
        char dia2[] = new char [grid.length];
        int i=0;
        
        for (int row=0; row<grid.length; row++){
            dia1[row] = grid[row][i];
            dia2[row] = grid[row][grid.length-1-i];
                
            i++;
        }
            
        boolean diagonal = false;
        int x = 0;            
        int o = 0;
        
        for (int xd =0; xd<dia1.length; xd++){          
            if (dia1[xd] == 'X'){
               x++;
            }
            
            if (dia2[xd] == 'O'){
               o++;
            }
        }
        
        if (x == 3 || o == 3){
           return true;
        }
        
        return false;    
    }

    public void add(int row, int col, char charcter){
        grid[row][col] = charcter;
    }
    
}
