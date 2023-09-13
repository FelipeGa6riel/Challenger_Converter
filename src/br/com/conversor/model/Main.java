package br.com.conversor.model;

import java.text.DecimalFormat;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Main {
        public static void main(String[] args) {

                HashMap<String, Converter> coins = new HashMap<>() {{
                                put("De Reais a Dólares", valor -> valor / 4.98);
                                put("De Dólares a Reais", valor -> valor / 0.20);
                                put("De Reais a Euros", valor -> valor / 5.33);
                                put("De Euros a Reais", valor -> valor / 0.19);
                                put("De Reais a Peso Argentino", valor -> valor / 0.0142);
                                put("De Peso Argentino a Reais", valor -> valor / 70.43);
                                put("De Reais a Peso Chileno", valor -> valor / 0.0056);
                                put("De Peso Chileno a Reais", valor -> valor / 179.57 * 100 );
                                put("De Reais a libras", valor -> valor / 6.20);
                                put("De Libras a Reais", valor -> valor / 0.163);

                        }
                };

                HashMap<String, Converter> degrees = new HashMap<>() {{
                                // IMplementação
                                put("Celsius para Fahrenheit °F", valor -> (valor * 1.8) + 32);
                                put("Fahrenheit para Celsius °C", valor -> (valor - 32) * 0.55);

                        }
                };

                String[] converter = { "Conversor de moedas", "Conversor de temperaturas" };
                String[] celsius = { "Celsius para Fahrenheit °F", "Fahrenheit para Celsius °C" };
                String[] options = { "De Reais a Dólares","De Dólares a Reais","De Reais a Euros","De Euros a Reais",
                                "De Reais a Peso Argentino","De Peso Argentino a Reais",
                                "De Reais a Peso Chileno","De Peso Chileno a Reais",
                                "De Reais a libras","De Libras a Reais"};

                boolean isContinue = true;

                while (isContinue) {

                        String menu = JOptionPane
                                        .showInputDialog(null, "Escolha um opção", "Menu", JOptionPane.DEFAULT_OPTION,
                                                        null, converter, converter[0])
                                        .toString();

                        if (menu.equals("Conversor de moedas")) {

                                String choice = JOptionPane
                                                .showInputDialog(null, "Escolha a conversão", "Menu",
                                                                JOptionPane.QUESTION_MESSAGE,
                                                                null, options, options[0])
                                                .toString();
                                try {
                                        double input = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a quantia a ser convertida", "Menu",JOptionPane.DEFAULT_OPTION));
                                        
                                        Converter typeCoins = coins.get(choice);
        
                                        if (typeCoins != null) {
                                                DecimalFormat df = new DecimalFormat("0.00");
                                                Double coin = typeCoins.converter(input);
                                                String coinCoverter = choice.substring(choice.lastIndexOf("a "));
                                                JOptionPane.showMessageDialog(null,
                                                                "Total: $" + df.format(coin) + " " + coinCoverter.substring(1));
        
                                        } else {
                                                JOptionPane.showMessageDialog(null, "Moeda não suportada.");
                                        }
                                } catch (Exception e) {
                                        JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um valor numérico válido.");
                                }


                                // if(options.stream().anyMatch(option ->
                                // option.equals(choice)))coins.reaisADolar();
                        }

                        if (menu.equals("Conversor de temperaturas")) {
                                String choice = JOptionPane.showInputDialog(null, "Escolha a conversão", "menu", 1, null, celsius,celsius[0]).toString();
                                
                                try {

                                        Double input = Double.parseDouble(JOptionPane.showInputDialog(null,"Inisra a temperatura"));
        
                                        Converter typeConverter = degrees.get(choice);
        
                                        if(typeConverter != null) {
                                                Double degreeConverter = typeConverter.converter(input);
                                                String stringConverter = choice.substring(choice.lastIndexOf("para"));
                                                JOptionPane.showMessageDialog(null, "Coversão "+stringConverter +" é igual a: "+ degreeConverter +" "+ choice.substring(choice.lastIndexOf("°"))); 
                                        }
                                }catch(Exception e){
                                        JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um valor numérico válido.");

                                }
                                
                                
                        }

                        Integer outPut = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Menu",
                                        JOptionPane.YES_NO_OPTION,
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
