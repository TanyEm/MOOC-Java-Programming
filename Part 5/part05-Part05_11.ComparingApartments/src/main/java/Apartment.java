
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        
        if (this.squares < compared.squares) {
            return false;
        }
        
        return true;
    }
    
    public int priceDifference(Apartment compared) {
        int difference  = 0;
        
        int firstApartment = this.princePerSquare * this.squares;
        int secondApartment = compared.princePerSquare * compared.squares;
        
        if (firstApartment > secondApartment) {
            difference = firstApartment - secondApartment;
        } else {
            difference = secondApartment - firstApartment;
        }
        
        return difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        
        int firstApartment = this.princePerSquare * this.squares;
        int secondApartment = compared.princePerSquare * compared.squares;
        
        if (firstApartment < secondApartment){
            return false;
        }
        
        return true;
    }

}
