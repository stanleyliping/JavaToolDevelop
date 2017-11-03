package main;
import java.awt.*;
import javax.swing.*;
import swingListeners.firstListener;
public class Swing {

	    /**{
	     * ��������ʾGUI�������̰߳�ȫ�Ŀ��ǣ�
	     * ����������¼������߳��е��á�
	     */
	    private static void createAndShowGUI() {
	        // ȷ��һ��Ư������۷��
	        JFrame.setDefaultLookAndFeelDecorated(false);

	        // ���������ô���
	        JFrame frame = new JFrame("programmer_tool_beta_v0.9");
	        frame.setBounds(500,500,500,500);
	        frame.setSize(500, 500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //JPanel panel = new JPanel(); //��������div��ǩ
	        //panel.setSize(500,500);
	        //frame.add(panel);
	        
	        //��� "Hello World" ��ǩ
	        //JLabel label = new JLabel("Hello World");
	        //frame.getContentPane().add(label);
	        
	        Button button = new Button("Press Me!");
	        button.addActionListener(new firstListener()); 
	        frame.add(button,BorderLayout.CENTER);
	        
	        // ��ʾ����
	        //frame.pack();//���ݴ���������������Զ����ô��ڴ�С
	        frame.setVisible(true);
	    }
	    
	    
	    public static void main(String[] args) {
	        // ��ʾӦ�� GUI
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
}


