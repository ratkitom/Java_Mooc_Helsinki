package clicker.ui;
import clicker.applicationlogic.*;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator counter;

    public UserInterface(){
    
        counter=new PersonalCalculator();
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        GridLayout layout=new GridLayout(2,0);
        
        container.setLayout(layout);
        
        JLabel label=new JLabel(Integer.toString(counter.giveValue()));
        JButton button=new JButton("Click!");
        button.addActionListener(new ClickListener(counter,label));
        
        container.add(label);
        container.add(button);
        
        
        
        
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
