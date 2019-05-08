import java.awt.Color;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.FlowLayout;

import java.io.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.IOException;

import java.util.*;
import java.text.SimpleDateFormat;

public class DisplayVersionsArea
{
    Scanner scan;
    String textFromFile;
    JTextArea displayArea=new JTextArea(35,70);
    JPanel area=new JPanel();
    JFrame frameDisplayArea=new JFrame();

    public void displayVersionsAreaDeployment(String filePath)
    {
        JButton infoButton=new JButton("INFO CONTENIDO");
        JButton fileInfoButton=new JButton("INFO ARCHIVO");

        frameDisplayArea.add(infoButton);
        infoButton.setBackground(Color.YELLOW);
        infoButton.setSize(200,80);
        infoButton.setBounds(190,570,180,60);
        infoButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent f)
            {
                String indicator=f.getActionCommand();
                if(indicator.equals("INFO CONTENIDO"))
                {
                    JOptionPane.showMessageDialog(null, "Tu archivo tiene "+displayArea.getLineCount()+" lineas y "+displayArea.getText().length()+" caracteres (incluyendo espacios)");
                }
            }
        });

        frameDisplayArea.add(fileInfoButton);
        fileInfoButton.setBackground(Color.YELLOW);
        fileInfoButton.setSize(200,80);
        fileInfoButton.setBounds(390,570,180,60);
        fileInfoButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent g)
            {
                String indicator=g.getActionCommand();
                if(indicator.equals("INFO ARCHIVO"))
                {
                    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                    JOptionPane.showMessageDialog(null, "El nombre de tu archivo es "+ new File(filePath).getName()+ " ,el absolute path "+ new File(filePath).getAbsolutePath()+ " y la ultima fecha de modificacion es "+format.format(new File(filePath).lastModified()));
                }
            }
        });

        JLabel version= new JLabel("Version 1.0");
        frameDisplayArea.add(version);
        version.setForeground(Color.WHITE);
        version.setBounds(685,610,180,60);

        frameDisplayArea.add(area);
        area.setBackground(Color.DARK_GRAY);
        frameDisplayArea.setSize(1100,1100);
        frameDisplayArea.setVisible(true);
        frameDisplayArea.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameDisplayArea.setBounds(400,70,770,690);
        area.setLayout(new FlowLayout());

        area.add(displayArea);
        displayArea.setEditable(false);

        try
        {
            FileReader reader=new FileReader(new File(filePath));
            BufferedReader br=new BufferedReader(reader);
            displayArea.read(br,null);
            br.close();
            displayArea.requestFocus();
        }
        catch(IOException i)
        {
            System.out.println("No funciona");
        }
    }
}