
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        
        
        StringBuilder builder=new StringBuilder();
        
        builder.append(" {\n");
        
        for(int i=0;i<t.length;i++){
            
            if(i==t.length-1){
                builder.append(" "+t[i]);
            
                for(int j=0;j<4-i;j++){
                
                builder.append(" ");
                }
                builder.append("\n }");
                break;
            }
            
            if((i+1)%4==0){
            builder.append(" "+t[i]).append(",");    
            builder.append("\n");
            } else builder.append(" "+t[i]).append(",");
            
          
        
        }
        
        return builder.toString();
    }
}
