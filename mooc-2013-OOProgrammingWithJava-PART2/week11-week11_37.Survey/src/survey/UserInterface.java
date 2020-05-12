package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame=new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200,300));
        
        frame.setDefaultCloseOperation(3);
        
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        
    }
    
    private void createComponents(Container container){
        
        BoxLayout layout=new BoxLayout(container,BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        JLabel l1=new JLabel("Are you?");
        
        JCheckBox c1=new JCheckBox("Yes!");
        JCheckBox c2=new JCheckBox("No!");
        
        ButtonGroup buttonGroup1 = new ButtonGroup();
        
        buttonGroup1.add(c1);
        buttonGroup1.add(c2);
        
         JLabel l2=new JLabel("Why?");
         
         JRadioButton r1 = new JRadioButton("No reason.");
         JRadioButton r2 = new JRadioButton("Because it is fun!");
         
         ButtonGroup buttonGroup2 = new ButtonGroup();
         
         buttonGroup2.add(r1);
         buttonGroup2.add(r2);
         
         JButton button=new JButton("Done!");
         
         container.add(l1);
         container.add(c1);
         container.add(c2);
         container.add(l2);
         container.add(r1);
         container.add(r2);
         container.add(button);
         
        
        
    
    
    }


    public JFrame getFrame() {
        return frame;
    }
}
