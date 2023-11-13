package co.MiguelAcevedo.EJEMPLOS;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int leftLimit = 100000000;
        int rightLimit = 900000000;
        int generatedLong = leftLimit + (int) (Math.random() * (rightLimit - leftLimit));
        JOptionPane.showMessageDialog(null,generatedLong);
    }
}
