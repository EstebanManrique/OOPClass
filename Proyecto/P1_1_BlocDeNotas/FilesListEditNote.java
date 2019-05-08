import javax.swing.*;
import java.io.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.awt.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FilesListEditNote extends JFrame
{
    public void FilesListEditNote()
    {
        JFrame versions=new JFrame();
        versions.getContentPane().setBackground(Color.DARK_GRAY);
        versions.setSize(900,900);
        versions.setBounds(380,185,800,500);
        versions.setLayout(new FlowLayout());
        versions.setVisible(true);
        versions.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ArrayList<JButton> buttonList=new ArrayList<JButton>();
        
        File folder=new File("C:/Users/Esteban Manrique/Documents/Orientada a Objetos/TC2016-A01027077/Proyecto/P1_1_BlocDeNotas/TemporalCommitTexts");
        File[] listOfFiles=folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) 
        {
            if (listOfFiles[i].isFile()) 
            {
                int g=i;
                SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                JButton button=new JButton("Nombre: "+listOfFiles[i].getName()+"   Ultima fecha de modificacion: "+format.format(listOfFiles[i].lastModified()));
                buttonList.add(button);
                versions.add(button);
                button.setBackground(Color.YELLOW);
                button.setSize(11,40);
                button.setBounds(150,((g+1)*39),500,30);
                JLabel version= new JLabel("Version 1.0");
                versions.add(version);
                version.setForeground(Color.WHITE);
                version.setBounds(705,419,180,60);
                button.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent k)
                    {
                        String indicator=k.getActionCommand();
                        if((indicator.equals("Nombre: "+listOfFiles[g].getName()+"   Ultima fecha de modificacion: "+format.format(listOfFiles[g].lastModified()))));
                        {
                            EditNoteArea edits=new EditNoteArea();
                            edits.editNoteAreaDeployment(listOfFiles[g].getAbsolutePath());   
                        }
                    }
                });    
            } 
            else if (listOfFiles[i].isDirectory()) {
                System.out.println("H");
                int g=i;
                SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                JButton button=new JButton("Nombre: "+listOfFiles[i].getName()+"   Ultima fecha de modificacion: "+format.format(listOfFiles[i].lastModified()));
                buttonList.add(button);
                versions.add(button);
                button.setBackground(Color.YELLOW);
                button.setSize(11,40);
                button.setBounds(150,((g+1)*39),500,30);
            }
        }
    }
}