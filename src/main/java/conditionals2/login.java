package conditionals2;

import javax.swing.*;

public class login {
    public static void main(String[] args) {
        String user;
        user= JOptionPane.showInputDialog("Introduce user");
        String password;
        password=JOptionPane.showInputDialog("Introduce your password");
        if(user.equals("Occidente") && password.equals("Occidente*2023")){
            JOptionPane.showMessageDialog(null,"Your access have been successfull");
        }else{
            JOptionPane.showMessageDialog(null, "User or password are wrong",
                    "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }

    }
}
