package loginGV;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class metodoLogin {
    private List<String[]> usersData;

    public metodoLogin() {
        usersData = new ArrayList<>();
        loadUsersData(); // Cargar usuarios al inicio
    }

    public void registerUser(String username, String password) {
        String[] user = { username, password };
        usersData.add(user);
        saveUsersData(); // Guardar usuarios después de cada registro
        JOptionPane.showMessageDialog(null, "Usuario agregado satisfactoriamente.");
    }

    public boolean loginUser(String username, String password) {
        for (String[] user : usersData) {
            if (user[0].equals(username) && user[1].equals(password)) {
                JOptionPane.showMessageDialog(null, "Ha iniciado sesión satisfactoriamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
        return false;
    }

    private void loadUsersData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.dat"))) {
            usersData = (List<String[]>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveUsersData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.dat"))) {
            oos.writeObject(usersData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







