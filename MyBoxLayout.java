import java.awt.*;  
import javax.swing.*;  
  
public class MyBoxLayout extends Frame
{    
 public MyBoxLayout ()
  {  
    Button b=new Button("1");  
    add(b);    
    Button b1=new Button("2");  
    add(b1); 
    Button b2=new Button("3");  
    add(b2); 
  
    setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));  
    setSize(400,400);  
    setVisible(true);  
  }    
public static void main(String args[])
  {  
    MyBoxLayout bl=new MyBoxLayout();  
  }  
}  