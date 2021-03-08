
public class TelevisionProgram {

    private String name;
    private int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public boolean isAwesome() {
        return this.name.contains("MasterChef");
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }
    
    public void getMaxDuration(int maxDuration) {
                
        if (this.duration <= maxDuration) {
            System.out.println( this.name + ", " + this.duration + " minutes");;
        }
        
    }

    @Override
    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }
}
