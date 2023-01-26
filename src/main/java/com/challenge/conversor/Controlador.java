package com.challenge.conversor;

import javax.swing.JOptionPane;

public class Controlador {

    private ConvMonedas monedas = new ConvMonedas();
    private ConvTermperaturas temperatura = new ConvTermperaturas();
    
    public void convertirMonedas () {

        String opciones = (
            JOptionPane.showInputDialog (
                null, 
                "Elije el modo a convertir ", 
                "Conversor", JOptionPane.QUESTION_MESSAGE, 
                null, new Object[] {"De Peso Arg a ...", "De ... a Peso Arg"}, 
                "Seleccion"
            )
        ).toString();

        switch (opciones) {
            case "De Peso Arg a ...":
                monedas.dePesoA();
                break;
            case "De ... a Peso Arg":
                monedas.deAPeso();
                break;
        }
    }

    public void convertirTemp() {

        String opciones = (
            JOptionPane.showInputDialog (
                null, 
                "Elije el tipo que deseas convertir ", 
                "Conversor", JOptionPane.QUESTION_MESSAGE, 
                null, new Object[] {"Celcius", "Fahrenheit", "kelvin"}, 
                "Seleccion"
            )
        ).toString();

        switch (opciones) {
            case "Celcius":
                temperatura.conversor("Celcius");
                break;
            case "Fahrenheit":
                temperatura.conversor("Fahrenheit");
                break;
            case "kelvin":
                temperatura.conversor("kelvin");
                break;
        }
    }
}
