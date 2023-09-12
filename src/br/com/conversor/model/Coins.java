package br.com.conversor.model;

import java.text.DecimalFormat;

import javax.swing.*;

public class Coins {
    private Double value = 0.0;
    private String type = "";

    public Coins(double value, String type) {
        this.value = value;
        this.type = type;
    }

    DecimalFormat df = new DecimalFormat("0.00");
    
    public void reaisADolar() { // possiveis melhorias
        
        if (this.type.equals("De Reais a Dólares")) {
            
            Double real = this.value / 4.98;
            String dolar = df.format(real);
            JOptionPane.showMessageDialog(null, "Total: $" + dolar + " Dólares");// passa o valor convertido.
        }
        if (this.type.equals("De Dólares a Reais")) {
            Double dolar = this.value / 0.20;
            String real = df.format(dolar);
            // JOptionPane.showConfirmDialog(null, "Total: $" + real + " Reais");
            JOptionPane.showMessageDialog(null, "Total: $" + real + " Reais");
        }

    }

    public void reaisAEuro() {
        Double real = this.value / 5.33;
        String euro = df.format(real);
        JOptionPane.showMessageDialog(null, "Total: $" + euro + " Euros");
    }

    public void reaisAPesos() {
        if (this.type.equals("De Reais a Pesos Argentinos")) {
            Double real = this.value / 0.0142;
            String pesos = df.format(real);
            JOptionPane.showMessageDialog(null, "Total: $" + pesos + " Pesos Argentinos");
        }

        if (this.type.equals("De Reais a Pesos Chilenos")) {
            Double real = this.value / 0.0056;
            String pesos = df.format(real);
            JOptionPane.showMessageDialog(null, "Total: $" + pesos + "Pesos Chileno");
        }
    }

    public void reaisALibrasEsterlinas() {
        Double real = this.value / 6.20;
        String librasEstelinas = df.format(real);
        JOptionPane.showMessageDialog(null, "Total: $" + librasEstelinas + " Libras Estalinas");

    }
}
