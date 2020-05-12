
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    
    public static void printStudents(ArrayList<Student> list){
    
    int i=0;
         
        while(i<list.size()){
        
        
            System.out.println(list.get(i));
             i++;
        }
    
    
    }
    
    public static void addStudents(ArrayList<Student> list,Scanner reader){
    
         
        
        
        
        String name;
        String studentNumber;
         
         while(true){
        
        System.out.print("name:");     
        name=reader.nextLine();
         if(name.equals("")){
            break;
        }
        System.out.print("studentnumber:");
        studentNumber=reader.nextLine();
        
      
        
        
        list.add(new Student(name,studentNumber));
        
        
        
        }
         
    
    }
    
    public static void search(String term,ArrayList<Student> list){
        System.out.println("Give search term:");
    
    for(int i=0;i<list.size();i++){
    
        if(list.get(i).getName().contains(term))
            System.out.println(list.get(i));
    
    }
    
    }

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list=new ArrayList();
       
        
        addStudents(list,reader);
        printStudents(list);
        System.out.print("Give search term: ");
        String term;
        term=reader.nextLine();
        System.out.println("Result:");
        search(term,list);
        
        
        
        
        
         
         }
        
        
        
    }

