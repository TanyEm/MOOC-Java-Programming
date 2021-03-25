
public class MagicSquareFactory {
    
    private int size;
    
    
    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        this.size = size;
        
        // implement the creation of a magic square with the Siamese method algorithm here
        // https://en.wikipedia.org/wiki/Siamese_method
        
        // set number one in the middle of first row
        int row = square.getHeight() - 1;
        int column = square.getWidth() / 2; //middle of collom
        square.placeValue(row, column, 1);

        for (int i = 2; i <= getSquareSize(); i++) {
            if (isCellFree(square, row, column)) {
                // move cell up and right 
                row = moveUp(row);
                column = moveUp(column);
            } else {
                row = moveDown(row);
            }
            square.placeValue(row, column, i);
        }
        
        return square;
    }
    
    private int getSquareSize() {
        return size * size;
    }

    
    private boolean isCellFree(MagicSquare square, int x, int y) {
        return square.readValue(moveUp(x), moveUp(y)) == 0;
    }
    
    private int moveUp(int value) {
         return (value + 1) % this.size;
    }
    
    private int moveDown(int value) {
        return (value - 1 + this.size) % this.size;
    }
    

}
