
public class HealthStation {
    private int count;
    
    public HealthStation(){
        this.count = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        count++;
        weighings();
        return person.getWeight();
    }
    
    public void feed(Person person) {
        count--;
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return count;
    }

}
