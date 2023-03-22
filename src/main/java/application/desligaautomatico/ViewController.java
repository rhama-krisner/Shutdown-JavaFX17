package application.desligaautomatico;

import application.desligaautomatico.util.Comando;
import application.desligaautomatico.util.ConverteTempo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ViewController implements Initializable {
    @FXML
    private ComboBox<String> cbHora = new ComboBox<>();

    @FXML
    private ComboBox<String> cbMinuto = new ComboBox<String>();

    @FXML
    private Button btnDesligar;

    @FXML
    private Button btnReiniciar;

    @FXML
    private Button btnCancelar;

    @FXML
    private void BtnDesligarOnClick(){
        Comando.Desligar(String.valueOf(iniciaShutdown()));
    }

    @FXML
    private void BtnReiniciarOnClick(){
        Comando.Reiniciar(String.valueOf(iniciaShutdown()));
    }

    @FXML
    private void BtnCancelarOnClick(){
        Comando.Cancelar();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbHora.setValue("00");
        cbMinuto.setValue("00");
        Horas();
        Minutos();
    }

    private ArrayList<Integer> Horas() {
        ArrayList<Integer> listaHora = new ArrayList<Integer>();
        for (int i = 0; i <= 12; i++) {
            listaHora.add(i);
            cbHora.getItems().addAll(String.format("%02d", listaHora.get(i)));
        }
        return listaHora;
    }

    private ArrayList<Integer> Minutos() {
        ArrayList<Integer> listaMinutos = new ArrayList<Integer>();

        for (int i = 0; i <= 60; i++) {
            listaMinutos.add(i);
            cbMinuto.getItems().addAll(String.format("%02d", listaMinutos.get(i)));
        }
        return listaMinutos;
    }

    private Integer iniciaShutdown() {
        String hora = cbHora.getValue();
        String minuto = cbMinuto.getValue();
        String concatenacao = hora + ":" + minuto;
        System.out.println(concatenacao);

        System.out.println(ConverteTempo.converterParaSegundos(concatenacao));
        Integer tempoConvertido = ConverteTempo.converterParaSegundos(concatenacao);
        return tempoConvertido;
    }
}