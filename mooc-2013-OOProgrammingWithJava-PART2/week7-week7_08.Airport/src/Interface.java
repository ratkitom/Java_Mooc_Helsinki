/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Interface {
    
    private Scanner reader;
    
    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;
  
    public Interface(Scanner reader){
        
        this.planes=new ArrayList();
        this.flights=new ArrayList();
        this.reader=reader;
        
        
    }
    
    public void startAirportPanel(){
    
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        
        
        
        String command;
        
        while(true){
        printPanelMenu();
        System.out.print(">");
        command=reader.nextLine();
        
        if(command.equals("1")){
        
            System.out.print("Give plane ID: ");
            String planeID=reader.nextLine();
            System.out.print("Give plane capacity: ");
            int planeCapacity=Integer.parseInt(reader.nextLine());
            
            planes.add(new Plane(planeID,planeCapacity));
            
            
        
        }   else if(command.equals("2")){
                
            System.out.print("Give plane ID: ");
            String planeID=reader.nextLine();
            Plane plane=searchPlane(planeID);
            System.out.print("Give departure airport code: ");
            String departure=reader.nextLine();
            System.out.print("Give destination airport code: ");
            String destination=reader.nextLine();
            
            flights.add(new Flight(departure,destination,plane));
            
            
        
        }   else if(command.equals("x")){
            
            break;
        
        }   
        
        
            
        
        
        }
        
        
        
   
    
    }
    
    
    private void printPanelMenu(){
        
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
    
    
    }
    
    
    public void startFlightService(){
        System.out.println("");
        System.out.println("Flight service");
        System.out.println("------------\n");
        
        
        String command;
        while(true){
        
        printServiceMenu();
        System.out.print(">");
        command=reader.nextLine();
        
        if(command.equals("1")){
            
            printPlanes();
            
        
            
        }   else if(command.equals("2")){
        
            printFlights();
        
        
        }   else if(command.equals("3")){
        
            System.out.print("Give plane ID: ");
            String planeID=reader.nextLine();
            
            Plane plane=searchPlane(planeID);
            System.out.println(plane);
            
        
        
        }   else if(command.equals("x")){
        
            break;
        
        }
        
        
        
        }
        
    
    
    
    
    }
    
    private void printServiceMenu(){
    
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
    
    
    }
    
    
    
    
    
    
    
    
    
    private Plane searchPlane(String planeID){
    
        Plane plane=null;
        for(Plane searched:planes){
        
        if(searched.getPlaneID().equals(planeID)){
        
            plane=searched;
            
            return plane;
        
        }
        
        }
    
        return plane;
    
    }
    
    
    private void printPlanes(){
    
    for(Plane plane:planes){
    
        System.out.println(plane);
        
        
        
    
    }
    
    
    }
    
    public void printFlights(){
    
    
    for(Flight flight:flights){
            
        
            System.out.println(flight);
    
        
    }
    
    }
    
    
    
}
