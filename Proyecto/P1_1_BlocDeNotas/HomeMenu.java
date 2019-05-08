import javax.swing.*;
import java.io.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.io.IOException;

public class HomeMenu extends JFrame
{
    private static HomeMenu instace=null;
    protected static String fileName;
    protected String realName;
    public HomeMenu()
    {
        JFrame homePage;
        homePage=this;
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setSize(900,900);
        this.setBounds(400,170,700,500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton newNote=new JButton("NUEVA NOTA");
        this.add(newNote);
        newNote.setBackground(Color.YELLOW);
        newNote.setSize(300,80);
        newNote.setBounds(200,45,300,80);
        newNote.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent f)
            {
                WritingArea writing=new WritingArea();
                writing.writingAreaDeployment();
            }
        });
        
        JButton versionReview=new JButton("REVISAR VERSIONES");
        this.add(versionReview);
        versionReview.setBackground(Color.YELLOW);
        versionReview.setSize(300,80);
        versionReview.setBounds(200,189,300,80);
        versionReview.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent g)
            {
                FilesList list=new FilesList();
            }
        });

        JButton generalPush=new JButton("EDITAR NOTA");
        this.add(generalPush);
        generalPush.setBackground(Color.YELLOW);
        generalPush.setSize(300,80);
        generalPush.setBounds(200,330,300,80);
        generalPush.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent g)
            {
                FilesListEditNote list=new FilesListEditNote();
                list.FilesListEditNote();
            }
        });

        JLabel version= new JLabel("Version 1.0");
        this.add(version);
        version.setForeground(Color.WHITE);
        version.setBounds(620,433,70,40);
    }
    public static HomeMenu getInstance()
    {
        if(instace==null)
        {
            instace=new HomeMenu();
        }
        return instace;
    }
    public String getName()
    {
        return realName;
    }
    private class eliminateAction implements ActionListener
    {
        public void actionPerformed(ActionEvent f)
        {
            fileName=JOptionPane.showInputDialog("Introduce el nombre que le del archivo que deseas elminar");
            realName=fileName;
            File note= new File(realName+".txt");
            if(note.exists())
            {
                boolean b=note.delete();
                JOptionPane.showMessageDialog(null, "El archivo ha sido eliminado correctamente");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No fue posible encontrar el archivo indicado para eliminar", null, JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}