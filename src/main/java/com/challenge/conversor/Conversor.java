package com.challenge.conversor;

import javax.swing.JOptionPane;

public class Conversor {

    public static void main(String[] args) {

        Controlador controlador = new Controlador();

        String opciones = (
            JOptionPane.showInputDialog (
                null, 
                "Slecciones una opcion de conversion ", 
                "menu", JOptionPane.QUESTION_MESSAGE, 
                null, new Object[] {"Conversor de monedas", "Conversos de temperatura"}, 
                "Selleccion"
            )
        ).toString();

        switch (opciones) {
            case "Conversor de monedas":
                controlador.convertirMonedas();
                break;
        
            case "Conversos de temperatura":
                controlador.convertirTemp();
                break;
        }
    }
}
