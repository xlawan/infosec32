import javax.swing.*;
import java.awt.event.*;

public class login implements ActionListener {
   // private static JLabel employeeIDLabel;
//    private static JLabel firstNameLabel;
//    private static JLabel lastNameLabel;
//    private static JLabel middleNameLabel;
//    private static JLabel DOBLabel;
//    private static JTextField employeeIDText;
//    private static JTextField firstNameText;
//    private static JTextField lastNameText;
//    private static JTextField middleNameText;
//    private static JTextField DOBText;
//    private static JButton save;
//    private static JButton clear;
//    private static JButton close;

   private static JLabel userLabel;
   private static JLabel passwordLabel;
   private static JTextField userText;
   private static JPasswordField passwordText;
   private static JButton button;
   private static JLabel result;

   public static void main(String[] args){
   
      
      JFrame frame = new JFrame("Login Form");
      frame.setSize(350,200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel panel = new JPanel();
      frame.add(panel);
      panel.setLayout(null);
      
      userLabel = new JLabel("User");
      userLabel.setBounds(10,20,80,25);
      panel.add(userLabel);
      
      userText = new JTextField(20);
      userText.setBounds(100,20,165,25);
      panel.add(userText);
      
      passwordLabel = new JLabel("Password");
      passwordLabel.setBounds(10,50,80,25);
      panel.add(passwordLabel);
      
      passwordText = new JPasswordField();
      passwordText.setBounds(100,50,165,25);
      panel.add(passwordText);
      
      button = new JButton("Login");
      button.setBounds(10,80,80,25);
      button.addActionListener(new login());
      panel.add(button);
      
      result = new JLabel("");
      result.setBounds(10,110,80,25);
      panel.add(result);
      
      frame.setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e){
      //System.out.println("HI");
      String user = userText.getText();
      String pass = passwordText.getText();
      System.out.println(user +", "+ pass);
      
      if(user.equals("admin") && pass.equals("user")){
         result.setText("Login Sucess!");
      }
      else result.setText("Login Failed :(");
   }
}