
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.GridLayout;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        
        frame=new JFrame("Calculator");
        
        frame.setPreferredSize(new Dimension(400,500));
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        
        frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        
        container.setLayout(new GridLayout(3,1));
        
        JTextField output=new JTextField("0");
        output.setEnabled(false);
        JTextField input=new JTextField();
        container.add(output);
        container.add(input);
        
        JButton b1=new JButton("+");
        JButton b2=new JButton("-");
        JButton b3=new JButton("Z");
        
        b3.setEnabled(false);
        
        b1.addActionListener(new ButtonsListener(b1,b3,input,output));
        b2.addActionListener(new ButtonsListener(b2,b3,input,output));
        b3.addActionListener(new ButtonsListener(b3,b3,input,output));
        
        
        
        JPanel panel=new JPanel(new GridLayout(1,3));
        
        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        
        container.add(panel);
        
        
        
        
        
        
    }
    


    public JFrame getFrame() {
        
        
        
        return frame;
    }
    
    
}
