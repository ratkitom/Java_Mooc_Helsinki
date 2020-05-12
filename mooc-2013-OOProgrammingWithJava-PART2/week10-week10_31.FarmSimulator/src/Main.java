/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */
import farmsimulator.*;
import java.util.LinkedList;
public class Main {
    
    public static void main(String[] args){
        
 Farm farm = new Farm("Esko", new Barn(new BulkTank()));
    MilkingRobot robot = new MilkingRobot();
    farm.installMilkingRobot(robot);
    
    farm.addCow(new Cow());
    farm.addCow(new Cow());
    farm.addCow(new Cow());


    farm.liveHour();
    farm.liveHour();

    farm.manageCows();

    System.out.println(farm);

    }
    

    
}
