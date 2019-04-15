import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class TestFrame extends JFrame
{
    public TestFrame()
    {
        JFrame thisFrame;
        thisFrame=this;
        this.setSize(300,300);
        this.setBounds(100,100,300,300);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton boton=new JButton("Click");
        this.add(boton);
        boton.setBounds(10,10,90,60);
        boton.addActionListener(new ButtonAction());

        JButton button= new JButton("Move");
        this.add(button);
        button.setSize(100,30);
        button.setBounds(80,80,90,60);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                thisFrame.setLocation(50,50);
            }
        }
        );
    }
    public static void main(String[] args) 
    {
        TestFrame frame=new TestFrame();   
    }

    private class ButtonAction implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            System.exit(0);
        }
    }
}