package swingListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstListener implements ActionListener   {
    @Override  
    public void actionPerformed(ActionEvent e)  
    {  
        //�¼�������  
  
        System.out.println("Button is pressed!");  
          
        String label = e.getActionCommand();  
        System.out.println(label);  
    }  
}  