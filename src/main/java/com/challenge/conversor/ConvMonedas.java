package com.challenge.conversor;

import javax.swing.JOptionPane;

public class ConvMonedas {

    public void mensaje (double resultado) {
        resultado = (double) Math.round(resultado * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + resultado);
    }

    public void conversorA(double valor1, double valor2) {
        double resultado = valor1 / valor2;
        mensaje(resultado);
    }

    public void conversorB(double valor1, double valor2) {
        double resultado = valor1 * valor2;
        mensaje(resultado);
    }

    public void dePesoA () {

        String input = JOptionPane.showInputDialog("Ingrese cant. de pesos");
        double valor1 = (double) Double.parseDouble(input);

        String opciones = (
            JOptionPane.showInputDialog (
                null, 
                "Elija la moneda a convertir", 
                "Conversor", JOptionPane.QUESTION_MESSAGE, 
                null, new Object[] {"USD", "EUR", "GBP", "JPY", "KRW"}, 
                "Seleccion"
            )
        ).toString();

        switch (opciones) {
            case "USD":
                conversorA(valor1, 185.02d);
                break;
            case "EUR":
                conversorA(valor1, 201.58d);
                break;
            case "GBP":
                conversorA(valor1, 228.55d);
                break;
            case "JPY":
                conversorA(valor1, 1.43d);
                break;
            case "KRW":
                conversorA(valor1, 0.15d);
                break;
        }
    }

    public void deAPeso () {

        String opciones = (
            JOptionPane.showInputDialog (
                null, 
                "Elija la moneda a convertir", 
                "Conversor", JOptionPane.QUESTION_MESSAGE, 
                null, new Object[] {"USD", "EUR", "GBP", "JPY", "KRW"}, 
                "Seleccion"
            )
        ).toString();

        String input = JOptionPane.showInputDialog("Ingrese cant. que desea convertir a pesos");
        double valor1 = (double) Double.parseDouble(input);

        switch (opciones) {
            case "USD":
                conversorB(valor1, 185.02d);
                break;
            case "EUR":
                conversorB(valor1, 201.58d);
                break;
            case "GBP":
                conversorB(valor1, 228.55d);
                break;
            case "JPY":
                conversorB(valor1, 1.43d);
                break;
            case "KRW":
                conversorB(valor1, 0.15d);
                break;
        }
    }
}
