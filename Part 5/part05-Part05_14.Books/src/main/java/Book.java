
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public boolean equals(Object compared) {
        Book comparedBook = (Book) compared;
        
        return this.name.equals(comparedBook.name) &&
                this.publicationYear == comparedBook.publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

}
