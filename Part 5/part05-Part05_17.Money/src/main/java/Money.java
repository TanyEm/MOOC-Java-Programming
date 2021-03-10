
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(addition.euros()+this.euros,addition.cents()+this.cents);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        Money comparedMoney = (Money) compared;
        
        return this.euros < comparedMoney.euros || 
                this.euros == comparedMoney.euros && this.cents < compared.cents;
        
    }
    
    public Money minus(Money decreaser) {
        
        int newEuro = 0;
        int newCent = 0;
        
        if (this.cents >= decreaser.cents && newEuro >= decreaser.euros) {
            newEuro = this.euros - decreaser.euros;
            newCent = this.cents - decreaser.cents;
            
            return new Money(newEuro,newCent);
        }
        
        newCent = 100 - decreaser.cents;
        newEuro = this.euros - decreaser.euros - 1;
        
        if (newEuro > 0){
            return new Money(newEuro,newCent);
        }
        
        newEuro = this.euros - decreaser.euros;
        
        if (newEuro == 0){
            return new Money(newEuro,this.cents);
        }

       
        return new Money(0,0);

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
