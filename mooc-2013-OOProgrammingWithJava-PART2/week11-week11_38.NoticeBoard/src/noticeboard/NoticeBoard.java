package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        
        frame=new JFrame();
        frame.setPreferredSize(new Dimension(400,200));
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        
        frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        
        
        container.setLayout(new GridLayout(3,1));
        
        JButton button=new JButton("Copy!");
        JTextField f1=new JTextField();
        JLabel l1=new JLabel();
        
        button.addActionListener(new ActionEventListener(f1,l1));
        
        container.add(f1);
        container.add(button);
        container.add(l1);
        
        
        
        
        
        
        
    }
}
