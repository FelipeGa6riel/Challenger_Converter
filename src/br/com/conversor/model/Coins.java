package br.com.conversor.model;

import java.text.DecimalFormat;

import javax.swing.*;

public class Coins {
    
    
    public static void reaisADolar(String type, Double value) { // possiveis melhorias
        
        DecimalFormat df = new DecimalFormat("0.00");

        if (type.equals("De Reais a Dólares")) {
            
            Double real = value / 4.98;
            String dolar = df.format(real);
            JOptionPane.showMessageDialog(null, "Total: $" + dolar + " Dólares");// passa o valor convertido.
        }
        if (type.equals("De Dólares a Reais")) {
            Double dolar = value / 0.20;
            String real = df.format(dolar);
            // JOptionPane.showConfirmDialog(null, "Total: $" + real + " Reais");
            JOptionPane.showMessageDialog(null, "Total: $" + real + " Reais");
        }

    }

    public static void reaisAEuro(String type, Double value) {

        DecimalFormat df = new DecimalFormat("0.00");

        Double real = value / 5.33;
        String euro = df.format(real);
        JOptionPane.showMessageDialog(null, "Total: $" + euro + " Euros");
    }

    public static void reaisAPesos(String type, Double value) {

        DecimalFormat df = new DecimalFormat("0.00");
        if (type.equals("De Reais a Pesos Argentinos")) {
            Double real = value / 0.0142;
            String pesos = df.format(real);
            JOptionPane.showMessageDialog(null, "Total: $" + pesos + " Pesos Argentinos");
        }

        if (type.equals("De Reais a Pesos Chilenos")) {
            Double real = value / 0.0056;
            String pesos = df.format(real);
            JOptionPane.showMessageDialog(null, "Total: $" + pesos + "Pesos Chileno");
        }
    }

    public static void reaisALibrasEsterlinas(String type, Double value) {

        DecimalFormat df = new DecimalFormat("0.00");
        Double real = value / 6.20;
        String librasEstelinas = df.format(real);
        JOptionPane.showMessageDialog(null, "Total: $" + librasEstelinas + " Libras Estalinas");

    }
}
