public class Reformatory {

    
    private int totalWeightsMeasured;
    public int weight(Person person) {
        // return the weight of the person
        this.totalWeightsMeasured++;
        return person.getWeight();
    }
    
    public void feed(Person person){
    int weight=person.getWeight()+1;
        
    person.setWeight(weight);
    
    }
    
    
    public int totalWeightsMeasured(){
    
    
        return this.totalWeightsMeasured;
    
    
    }
    
    
    
    

}
