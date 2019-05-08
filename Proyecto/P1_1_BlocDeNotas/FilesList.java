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

public class FilesList extends JFrame
{
    public FilesList()
    {

        JFrame versions;
        versions=this;
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setSize(900,900);
        this.setBounds(380,185,800,500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ArrayList<JButton> buttonList=new ArrayList<JButton>();

        
        File folder=new File("C:/Users/Esteban Manrique/Documents/Orientada a Objetos/TC2016-A01027077/Proyecto/P1_1_BlocDeNotas/Master");
        File[] listOfFiles=folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                int g=i;
                SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                JButton button=new JButton("Nombre: "+listOfFiles[i].getName()+"   Ultima fecha de modificacion: "+format.format(listOfFiles[i].lastModified()));
                buttonList.add(button);
                versions.add(button);
                button.setBackground(Color.YELLOW);
                button.setSize(11,40);
                button.setBounds(150,((g+1)*39),500,30);
            } else if (listOfFiles[i].isDirectory()) {
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
                    public void actionPerformed(ActionEvent h)
                    {
                        String indicator=h.getActionCommand();
                        if(indicator.equals("Nombre: "+listOfFiles[g].getName()+"   Ultima fecha de modificacion: "+format.format(listOfFiles[g].lastModified())))
                        {
                            try
                            {
                            File folder=new File(listOfFiles[g].getCanonicalPath());
                            File[] listOfFiles=folder.listFiles();
                            for (int i = 0; i < listOfFiles.length; i++) {
                                if (listOfFiles[i].isFile()) {
                                    JFrame versions=new JFrame();
                                    versions.getContentPane().setBackground(Color.DARK_GRAY);
                                    versions.setSize(900,900);
                                    versions.setBounds(510,385,600,100);
                                    versions.setLayout(new FlowLayout());
                                    versions.setVisible(true);
                                    versions.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                    int g=i;
                                    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                                    JButton button=new JButton("Nombre: "+listOfFiles[g].getName()+"   Ultima fecha de modificacion: "+format.format(listOfFiles[g].lastModified()));
                                    buttonList.add(button);
                                    versions.add(button);
                                    button.setBackground(Color.YELLOW);
                                    button.setSize(11,40);
                                    button.setBounds(150,1,500,30);
                                    button.addActionListener(new ActionListener()
                                    {
                                        public void actionPerformed(ActionEvent j)
                                        {
                                            String indicator=h.getActionCommand();
                                            if(indicator.equals("Nombre: "+listOfFiles[g].getName()+"   Ultima fecha de modificacion: "+format.format(listOfFiles[g].lastModified())));
                                            {
                                                DisplayVersionsArea versions=new DisplayVersionsArea();
                                                versions.displayVersionsAreaDeployment(listOfFiles[g].getAbsolutePath());
                                            } 
                                        }
                                    });
                                    
                                    }
                                }
                            }
                            catch(IOException j)
                            {
                                j.printStackTrace();
                            }
                        }
                    }
                });
            }
          }
    } 
}