package hospital.management.system;
import javax.swing.*;
import java.awt.*;

public class login extends JFrame{

    JTextField textField;
    JPasswordField jPasswordField;
    login(){
        JLabel namelabel = new JLabel("username");
        namelabel.setBounds(40,20,100,30);
        namelabel.setFont(new Font("tahoma",Font.BOLD,20));
        namelabel.setBackground(new Color(1));
        add(namelabel);


        JLabel password = new JLabel("password");
        password.setBounds(40,70,100,30);
        password.setFont(new Font("tahoma",Font.BOLD,20));
        add(password);

        textField = new JTextField();
        textField.setBounds(150,20,150,30);
        textField.setFont(new Font("tahoma", Font.PLAIN,20));

        add(textField);

        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150,70,150,30);
        jPasswordField.setFont(new Font("tahoma",Font.PLAIN,20));
        add(jPasswordField);





        getContentPane().setBackground(new Color(100,100,100));

        setSize(  750,   300);
        setLocation(400,270);
        setLayout(null);
        setVisible(true);


    }
    public static void main(String[]args){
        new login();
    }

}
