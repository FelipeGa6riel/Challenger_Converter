package br.com.conversor.model;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String[] converter = { "Conversor de moedas", "Conversor de temperaturas" };
        ArrayList<String> options = new ArrayList<>(Arrays.asList("De Reais a Dólares", "De Reais a Euros", "De Reais a Pesos Argentinos",
                "De Reais a Pesos Chilenos",
                "De Reais a libras", "De Dólares a Reais"));

        Object[] optionObjects = options.toArray();
        
        boolean isContinue = true;
        
        Coins coins = null;

        while (isContinue) {
            

            String menu = JOptionPane.showInputDialog(null, "Escolha um opção", "Menu", JOptionPane.DEFAULT_OPTION,
                    null, converter, converter[0]).toString();

            String choice = JOptionPane
                    .showInputDialog(null, "Escolha a conversão", "Menu", JOptionPane.QUESTION_MESSAGE,
                            null, optionObjects,optionObjects[0])
                    .toString();

            if (menu.equals("Conversor de moedas")) {

                double input = Double
                        .parseDouble(JOptionPane.showInputDialog(null, "Insira a quantia a ser convertida", "Menu",
                                JOptionPane.DEFAULT_OPTION));

                coins = new Coins(input, choice);
                // if(choice.equals())coins.reaisADolar();

                if(options.stream().anyMatch(option -> option.equals(choice)))coins.reaisADolar();
                

                // Function function = new Function();
                // Double coin = Double.parseDouble(input);
                // function.converterCoin(coin, Choice);
            }

            if (menu.equals("Conversor de temperatura")) {
                JOptionPane.showInputDialog(null, "Insira um a temperatura", "Menu",
                        JOptionPane.DEFAULT_OPTION);
            }

            Integer outPut = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Menu", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (outPut == 1) {
                isContinue = false;
            }

        }

        // String input = JOptionPane.showInputDialog("Insira um valor");teste

        // if(menu.equals("Conversor de moedas")){ //equals compara o que esta dentro da
        // variavel.
        // System.out.println("Funciona");
        // }teste

    }
}
