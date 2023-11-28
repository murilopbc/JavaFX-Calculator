package br.com.calculadora.controller;

import br.com.calculadora.model.Calculos;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;

public class JFXCalculadora {
    public TextField tfNumero1;
    public Button bCalcular;
    public TextField tfNumero2;
    public Button bSair;
    public TextField tfResultado;

    Calculos calculos = new Calculos();

    public void calcular(ActionEvent actionEvent) {
        double n1 = Double.parseDouble(tfNumero1.getText());
        double n2 = Double.parseDouble(tfNumero2.getText());

        tfResultado.setText(String.valueOf(calculos.somar(n1, n2)));
        tfResultado.setText(String.valueOf(calculos.subtrair(n1, n2)));
        tfResultado.setText(String.valueOf(calculos.multiplicar(n1,n2)));
        tfResultado.setText(String.valueOf(calculos.dividir(n1, n2)));

    }

    public void sair(ActionEvent actionEvent) {
        System.exit(0);
    }
}
