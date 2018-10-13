import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Button extends Frame 
{
  private static JFrame frame;
  private static Knowledge students;

  public static void main(String[] args) 
    {
    students = new Knowledge<Student>();//goes in constructor
        button();
        System.out.println(students.toString());
    }
  private static void button()
    {
     frame = new JFrame();
     frame.setLayout(new FlowLayout());
    
     frame.setTitle("Mix"); 
     frame.setSize(900, 250);           
     frame.setVisible(true);
     
     Label lbl= new Label("Get Help!"); 
     
     frame.setLayout(new BorderLayout());  
      
      Panel pnlbtn = new Panel(new GridLayout(1, 1));
      Panel pnltxt = new Panel(new GridLayout(5, 2));
      
      TextField txtName, txtPN, txtMajor, txtIssue, txtGNum;
      txtName = new TextField(10); 
      txtPN = new TextField(10); 
      txtMajor = new TextField(10); 
      txtIssue = new TextField(10); 
      txtGNum = new TextField(10); 

      Label lblName, lblPN, lblMajor, lblIssue, lblGNum;
      lblName = new Label("Name: "); 
      lblPN = new Label("Phone-Number (###-###-####): "); 
      lblMajor = new Label("Major:"); 
      lblIssue = new Label("Issue: "); 
      lblGNum = new Label("G-number (G########): "); 
  
      
      JButton btn = new JButton("Press");
        btn.addActionListener(new ActionListener() 
        {
         public void actionPerformed(ActionEvent e) 
         {
           String name, number, major, issue, gnumber;
           name =  txtName.getText();
           number =  txtPN.getText();
           major =  txtMajor.getText();
           issue =  txtIssue.getText();
           gnumber =  txtGNum.getText();
           
           Student std = new Student(name, number, major, issue, gnumber);
           System.out.println(name+number+major+issue+gnumber);
           
           //send message
           /*while()//while they are waiting for the message
           {
             frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
          
             frame = new JFrame();
             frame.setLayout(new FlowLayout());
             frame.setTitle("Results"); 
             frame.setSize(500, 200);           
             frame.setVisible(true);
     
             Label lbl1 = new Label("Please Wait.");
    
             frame.setLayout(new BorderLayout());  
             frame.add(lbl1, BorderLayout.CENTER); 
         }*/
          
          frame = new JFrame();
          frame.setLayout(new FlowLayout());
          frame.setTitle("Results"); 
          frame.setSize(500, 200);           
          frame.setVisible(true);
     
          Label lbl2 = new Label("___will be with you shortly");
    
          frame.setLayout(new BorderLayout());  
          frame.add(lbl2, BorderLayout.CENTER); 
         }
        }
        );


      
      pnlbtn.add(btn);
      
      
      pnltxt.add(lblName);
      pnltxt.add(txtName);
      
      pnltxt.add(lblPN);
      pnltxt.add(txtPN);
      
      pnltxt.add(lblMajor);
      pnltxt.add(txtMajor);
      
      pnltxt.add(lblIssue);
      pnltxt.add(txtIssue);
      
      pnltxt.add(lblGNum);
      pnltxt.add(txtGNum);

      frame.add(pnltxt, BorderLayout.CENTER);
      frame.add(lbl, BorderLayout.NORTH);
      frame.add(pnlbtn, BorderLayout.SOUTH);
      
    }
    
}