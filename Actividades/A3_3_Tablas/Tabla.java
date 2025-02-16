import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.ArrayList;

public class Tabla extends JPanel
{
    protected Object[][] dataFields;
    public Tabla()
    {
        super(new GridLayout(1,1));
        String line=null;
        List<String> dataLines=new ArrayList<>();
        try
        {
            BufferedReader br=new BufferedReader(new FileReader("file.txt"));
            while((line=br.readLine())!=null)
            {
                dataLines.add(line);
            }
            br.close();
            dataFields=new Object[dataLines.size()][4];
            for(int i=0;i<dataLines.size();i++)
            {
                dataFields[i]=dataLines.get(i).split(",");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
            
        String[] titles=new String[]{"Name","Last Name","Phone number","Genre"};
        JTable data=new JTable(dataFields,titles);

        JScrollPane scroll=new JScrollPane(data);
        add(scroll);
        repaint();
    }

    public static void main(String[] args) 
    {
        JFrame window=new JFrame("Tablita");
        Tabla tablita=new Tabla();
        window.setContentPane(tablita);
        window.pack();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}