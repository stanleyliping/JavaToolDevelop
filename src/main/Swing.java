package main;
import java.awt.*;
import javax.swing.*;
import swingListeners.firstListener;
public class Swing {

	    /**{
	     * 创建并显示GUI。出于线程安全的考虑，
	     * 这个方法在事件调用线程中调用。
	     */
	    private static void createAndShowGUI() {
	        // 确保一个漂亮的外观风格
	        JFrame.setDefaultLookAndFeelDecorated(false);

	        // 创建及设置窗口
	        JFrame frame = new JFrame("programmer_tool_beta_v0.9");
	        frame.setBounds(500,500,500,500);
	        frame.setSize(500, 500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //JPanel panel = new JPanel(); //功能类似div标签
	        //panel.setSize(500,500);
	        //frame.add(panel);
	        
	        //添加 "Hello World" 标签
	        //JLabel label = new JLabel("Hello World");
	        //frame.getContentPane().add(label);
	        
	        Button button = new Button("Press Me!");
	        button.addActionListener(new firstListener()); 
	        frame.add(button,BorderLayout.CENTER);
	        
	        // 显示窗口
	        //frame.pack();//根据窗口内现有组件，自动设置窗口大小
	        frame.setVisible(true);
	    }
	    
	    
	    public static void main(String[] args) {
	        // 显示应用 GUI
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
}


