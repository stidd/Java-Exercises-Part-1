public class Reformatory {
    private int timesMeasured;
    
    public Reformatory(){
        this.timesMeasured = 0;
    }
    
    public int weight(Person person) {
        // return the weight of the person
        timesMeasured++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        int weightBeforeEating = person.getWeight();
        person.setWeight(weightBeforeEating + 1);
    }
    
    public int totalWeightsMeasured(){
        return this.timesMeasured;
    }

}
