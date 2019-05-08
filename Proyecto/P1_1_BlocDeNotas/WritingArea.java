import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javafx.scene.text.Text;
import java.io.*;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import java.awt.*;

import java.util.*;

public class WritingArea extends JFrame
{
    JTextArea writingArea=new JTextArea(40,40);
    protected String writingName;
    JPanel area=new JPanel();
    JFrame frameWritingArea=new JFrame();
    protected File dir;
    protected File dirf;
    JButton commitButton=new JButton("COMMIT");
    JButton pushButton=new JButton("PUSH");

    public void writingAreaDeployment()
    {
        JButton addButton=new JButton("ADD");
        JButton emptyButton=new JButton("EMPTY"); 
        JButton plainButton=new JButton("PLAIN");
        JButton boldButton=new JButton("BOLD");
        JButton italicButton=new JButton("ITALIC");
        JButton infoButton=new JButton("INFO");
        
        frameWritingArea.add(addButton);
        addButton.setBackground(Color.YELLOW);
        addButton.setSize(200,80);
        addButton.setBounds(640,130,100,60);
        addButton.addActionListener(new writingAreaActions());

        frameWritingArea.add(commitButton);
        commitButton.setBackground(Color.YELLOW);
        commitButton.setSize(200,80);
        commitButton.setBounds(640,230,100,60);
        commitButton.setVisible(false);
        commitButton.addActionListener(new writingAreaActions());

        frameWritingArea.add(pushButton);
        pushButton.setBackground(Color.YELLOW);
        pushButton.setSize(200,80);
        pushButton.setBounds(640,330,100,60);
        pushButton.setVisible(false);
        pushButton.addActionListener(new writingAreaActions());

        frameWritingArea.add(emptyButton);
        emptyButton.setBackground(Color.YELLOW);
        emptyButton.setSize(200,80);
        emptyButton.setBounds(640,430,100,60);
        emptyButton.addActionListener(new writingAreaActions());

        frameWritingArea.add(plainButton);
        plainButton.setBackground(Color.YELLOW);
        plainButton.setSize(200,80);
        plainButton.setBounds(16,130,100,60);
        plainButton.addActionListener(new writingAreaActions());
        
        frameWritingArea.add(boldButton);
        boldButton.setBackground(Color.YELLOW);
        boldButton.setSize(200,80);
        boldButton.setBounds(16,230,100,60);
        boldButton.addActionListener(new writingAreaActions());

        frameWritingArea.add(italicButton);
        italicButton.setBackground(Color.YELLOW);
        italicButton.setSize(200,80);
        italicButton.setBounds(16,330,100,60);
        italicButton.addActionListener(new writingAreaActions());

        frameWritingArea.add(infoButton);
        infoButton.setBackground(Color.YELLOW);
        infoButton.setSize(200,80);
        infoButton.setBounds(16,430,100,60);
        infoButton.addActionListener(new writingAreaActions());

        JLabel version= new JLabel("Version 1.0");
        frameWritingArea.add(version);
        version.setForeground(Color.WHITE);
        version.setBounds(684,620,70,40);

        frameWritingArea.add(area);
        area.setBackground(Color.DARK_GRAY);
        frameWritingArea.setSize(1100,1100);
        frameWritingArea.setVisible(true);
        frameWritingArea.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameWritingArea.setBounds(400,70,770,690);
        area.setLayout(new FlowLayout());

        area.add(writingArea);
    }
    protected class writingAreaActions implements ActionListener 
    {
        File note= new File(".txt");
        File notecommit=new File("C.txt");
        File notepush=new File("P.txt");
        File dir=new File("Temporal");
        File dirf=new File("");
        File dirp=new File("");
        String savedText="";
        int counter=0;
        public int commit=0;
        public int push=0;
        String fileName;
        String realName;
        String pushVersionName;
        String pushVerisonNameReal;
        public void actionPerformed(ActionEvent e)
        {
            String naame="";
            String indicator=e.getActionCommand();
            if(indicator.equals("PLAIN"))
            {
                Font plain=new Font("Serif",Font.PLAIN, 15);
                writingArea.setFont(plain);
            }
            else if(indicator.equals("BOLD"))
            {
                Font plain=new Font("Serif",Font.BOLD, 15);
                writingArea.setFont(plain);
            }
            else if(indicator.equals("ITALIC"))
            {
                Font plain=new Font("Serif",Font.ITALIC, 15);
                writingArea.setFont(plain);
            }
            else if(indicator.equals("INFO"))
            {
                JOptionPane.showMessageDialog(null, "Tu archivo tiene "+writingArea.getLineCount()+" lineas y "+writingArea.getText().length()+" caracteres (incluyendo espacios)");
            }
            else if(indicator.equals("EMPTY"))
            {
                writingArea.setText(null);
            }
            else if(indicator.equals("ADD"))
            {
                try
                {
                    if(counter==0)
                    {
                        commitButton.setVisible(true);
                        commit++;
                        fileName=JOptionPane.showInputDialog("Introduce el nombre que le quieras dar al archivo");
                        realName=fileName;
                        counter++;
                        savedText=writingArea.getText();
                        note=new File(realName+".txt");
                        note.createNewFile();
                        saveInfoInFile(savedText,note);
                        counter++;
                        //System.out.println(counter);
                    }
                    else
                    {
                        commit++;
                        counter++;
                        savedText=writingArea.getText();
                        saveInfoInFile(savedText,note);
                    }
                }
                catch(IOException f)
                {
                    f.printStackTrace();
                }
                //System.out.println(commit);
            }
            else if(indicator.equals("COMMIT"))
            {
                //System.out.println(commit);
                note.delete();
                if(commit==0)
                {
                    try
                    {
                        if(counter==0)
                        {
                            pushButton.setVisible(true);
                            push++;
                            note.delete();
                            fileName=JOptionPane.showInputDialog("Introduce el nombre que le quieras dar al archivo (Si deseas mantener el mismo nombre que escribiste en Add, vulevelo a escribir)");
                            realName=fileName;
                            counter++;
                            savedText=writingArea.getText();
                            dir=new File("TemporalCommitTexts");
                            dir.mkdirs();
                            notecommit=new File(realName+"C.txt");
                            notecommit.createNewFile();
                            notecommit.renameTo(new File(dir,realName+"C.txt"));
                            saveInfoInFile(savedText,(new File(dir,realName+"C.txt")));
                            notecommit.delete();
                            note.delete();
                            note.delete();
                        }
                        else
                        {
                            push++;
                            note.delete();
                            counter++;
                            savedText=writingArea.getText();
                            dir=new File("TemporalCommitTexts");
                            dir.mkdirs();
                            notecommit=new File(realName+"C.txt");
                            notecommit.createNewFile();
                            notecommit.renameTo(new File(dir,realName+"C.txt"));
                            saveInfoInFile(savedText,(new File(dir,realName+"C.txt")));
                            notecommit.delete();
                            note.delete();
                            note.delete();
                        }
                    }
                    catch(IOException g)
                    {
                        g.printStackTrace();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se ha podido realizar el commit debido a que no hay un add previo", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
            else if(indicator.equals("PUSH"))
            {
                dir.delete();
                if(push==0)
                {
                    try
                    {
                        if(counter==0)
                        {
                            pushVersionName=JOptionPane.showInputDialog("Introduce el nombre que le quieras dar al archivo (Si deseas mantener el mismo nombre que escribiste en Add y en Commit, vulevelo a escribir)");
                            pushVerisonNameReal=pushVersionName;
                            fileName=pushVerisonNameReal+"_Version"+Integer.toString(counter+1);
                            realName=fileName;
                            savedText=writingArea.getText();
                            dirp=new File("Master");
                            dirp.mkdir();
                            dirf=new File(realName);
                            dir.mkdir();
                            notepush=new File(pushVerisonNameReal);
                            notepush.createNewFile();
                            notepush.renameTo(new File(dir,pushVerisonNameReal));
                            saveInfoInFile(savedText,(new File(dir,pushVerisonNameReal)));
                            dir.renameTo(new File(dirp,realName));
                            dir.delete();
                            notepush.delete();
                            counter++;
                        }
                        else
                        {
                            fileName=pushVerisonNameReal+"_Version"+Integer.toString(counter+1);
                            realName=fileName;
                            savedText=writingArea.getText();
                            dir.mkdir();
                            notepush=new File(pushVerisonNameReal);
                            notepush.createNewFile();
                            notepush.renameTo(new File(dir,pushVerisonNameReal));
                            saveInfoInFile(savedText,(new File(dir,pushVerisonNameReal)));
                            dir.renameTo(new File(dirp,realName));
                            dir.delete();
                            notepush.delete();
                            counter++;
                        }
                    }
                    catch(IOException h)
                    {
                        h.printStackTrace();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se ha podido realizar el push debido a que no hay un commit previo", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
            note.delete();
        }
    }
    public String setText()
    {
        return writingArea.getText();
    }
    public void saveInfoInFile(String text, File fi)
    {
        try
        {
            FileWriter writer;
            writer=new FileWriter(fi);
            writer.write(text);
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}