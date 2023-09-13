package br.com.conversor.model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Coins> coins = new HashMap<>(){{
                put("De Reais a Dólares", valor -> valor / 4.98);
                put("De Dólares a Reais", valor -> valor / 0.20);
                put("De Reais a Euros", valor -> valor / 5.33);
                put("De Reais a Pesos Argentinos", valor -> valor / 0.0142);
                put("De Reais a Pesos Chilenos", valor -> valor / 0.0056);
                put("De Reais a libras", valor -> valor / 6.20);
        }};

        // Coins[] coins = new Coins[]{
        //         valor -> valor / 4.98, //Reais para Dolar.
        //         valor -> valor / 0.20  // Dolares para Reais.
        // };

        String[] converter = { "Conversor de moedas", "Conversor de temperaturas" };
        String [] options = {"De Reais a Dólares", "De Reais a Euros", "De Reais a Pesos Argentinos",
                "De Reais a Pesos Chilenos",
                "De Reais a libras", "De Dólares a Reais"};
        
        boolean isContinue = true;
        

        while (isContinue) {
            

            String menu = JOptionPane.showInputDialog(null, "Escolha um opção", "Menu", JOptionPane.DEFAULT_OPTION,
                    null, converter, converter[0]).toString();

            String choice = JOptionPane
                    .showInputDialog(null, "Escolha a conversão", "Menu", JOptionPane.QUESTION_MESSAGE,
                            null, options,options[0])
                    .toString();

            if (menu.equals("Conversor de moedas")) {

                double input = Double
                        .parseDouble(JOptionPane.showInputDialog(null, "Insira a quantia a ser convertida", "Menu",JOptionPane.DEFAULT_OPTION));
                
                Coins typeCoins = coins.get(choice);

                if(typeCoins != null) {
                        DecimalFormat df = new DecimalFormat("0.00");
                        Double coin = typeCoins.converter(input);
                        String coinCoverter = choice.substring(choice.lastIndexOf("a"));
                        JOptionPane.showMessageDialog(null, "Total: $" + df.format(coin) +" "+ coinCoverter);

                }else {
                        JOptionPane.showMessageDialog(null, "Moeda não suportada.");
                }
                // coins = new Coins(input, choice);
                // if(choice.equals())coins.reaisADolar();

                // if(options.stream().anyMatch(option -> option.equals(choice)))coins.reaisADolar();
                

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
