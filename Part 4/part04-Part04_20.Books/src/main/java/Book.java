/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanyem
 */
public class Book {
    private int pages;
    private String title;
    private int publicated;
    
    public Book (String bookTitle, int pageAmount, int bookPublicated) {
        this.title = bookTitle;
        this.pages = pageAmount;
        this.publicated = bookPublicated;
    }
    
    public String toString(String info){
        
        String response = "";
        
        if (info.equals("name")){
            response = this.title;
        } else if (info.equals("everything")){
            response = this.title + ", " + this.pages + " pages, " + this.publicated;
        }
        return response;
    }
    
}
