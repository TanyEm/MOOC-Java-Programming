public class Statistics {
    
    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        this.sum = sum + number;
        this.count = count + 1;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {        
        return this.sum;
    }
    
    public double average() {
        // write code here
        
        double avg = 0;
        
        for (int i = 0; i < count; i++) {
            if (getCount() == 0) {
              avg = 0;
            } else {
                avg = 1.0 * this.sum / getCount();
            }
        }        
        return avg;
    }
}
