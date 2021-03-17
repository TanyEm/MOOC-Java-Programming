import java.util.HashMap;
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;
    private HashMap<String, String> dict;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    public int hashCode() {
        if (this.toString() == null){
            return 0;
        }
        
        return this.toString().hashCode();
    }
    
    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        if (object == this) {
            return true;
        }
        
        if (!(object instanceof LicensePlate)){
            return false;
        }
        
        LicensePlate compare = (LicensePlate) object;
        if (this.liNumber.equals(compare.liNumber) &&
                this.country.equals(compare.country)) {
            return true;
       }
        

        return false;
    }

}
