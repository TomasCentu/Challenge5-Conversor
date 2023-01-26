package com.challenge.conversor;

import javax.swing.JOptionPane;

public class ConvTermperaturas {

    public void mensaje (double resultado) {
        resultado = (double) Math.round(resultado * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }

    public void conversor(String tipoTemp) {

        String opciones = (
            JOptionPane.showInputDialog (
                null, 
                "Elije el tipo a convertir ", 
                "Conversor", JOptionPane.QUESTION_MESSAGE, 
                null, new Object[] {"Celcius", "Fahrenheit", "kelvin"}, 
                "Seleccion"
            )
        ).toString();

        switch (tipoTemp) {
            case "Celcius":
                switch (opciones) {
                    case "Celcius":
                        JOptionPane.showMessageDialog(null, "Converción al mismo tipo de unidad", "Error", JOptionPane.PLAIN_MESSAGE);;
                        break;
                    case "Fahrenheit":
                        celciusA("F");
                        break;
                    case "kelvin":
                        celciusA("K");
                        break;
                }
                break;
        
            case "Fahrenheit":
                switch (opciones) {
                    case "Fahrenheit":
                        JOptionPane.showConfirmDialog(null, "Conversion a la misma unidad");
                        break;
                    case "Celcius":
                        fahrenheitA("C");
                        break;
                    case "kelvin":
                        fahrenheitA("K");
                        break;
                }
                break;

            case "kelvin":
                switch (opciones) {
                    case "kelvin":
                        JOptionPane.showConfirmDialog(null, "Conversion a la misma unidad");
                        break;
                    case "Fahrenheit":
                        kelvinA("F");
                        break;
                    case "Celcius":
                        kelvinA("C");
                        break;
                }
                break;
        }
    }

    public void celciusA(String tipo) {
        double resultado = 0d;

        String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
        double valor = (double) Double.parseDouble(input);

        if (tipo == "K") {
            resultado = valor + 273.15;
        } else if (tipo == "F") {
            resultado = (valor * 9/5) + 32;
        }

        mensaje(resultado);
    }

    public void fahrenheitA(String tipo) {
        double resultado = 0d;

        String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
        double valor = (double) Double.parseDouble(input);

        if (tipo == "C") {
            resultado = (valor - 32) * 5/9;
        } else if (tipo == "K") {
            resultado = (valor - 32) * 5/9 + 273.15;
        }

        mensaje(resultado);
    }

    public void kelvinA(String tipo) {
        double resultado = 0d;

        String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
        double valor = (double) Double.parseDouble(input);

        if (tipo == "F") {
            resultado = (valor - 273.15) * 9/5 + 32;
        } else if (tipo == "C") {
            resultado = valor - 273.15;
        }

        mensaje(resultado);
    }
}
