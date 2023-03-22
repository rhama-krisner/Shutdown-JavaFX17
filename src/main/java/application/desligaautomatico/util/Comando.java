package application.desligaautomatico.util;

import java.io.IOException;

public class Comando {
    public static void Desligar(String tempo) {
        String comando = null;
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            // Comando para desligar o Windows
            comando = "shutdown.exe -s -t " + tempo;
            System.out.println("Sistema será desligado em " + tempo + " segundos.");
        }

        try {
            Runtime.getRuntime().exec(comando);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Reiniciar(String tempo) {
        String comando = null;
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            // Comando para desligar o Windows
            comando = "shutdown.exe -r -t " + tempo;
            System.out.println("Sistema será desligado em " + tempo + " segundos.");
        }

        try {
            Runtime.getRuntime().exec(comando);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Cancelar() {
        try {
            Runtime.getRuntime().exec("shutdown -a");
            System.out.println("Desligamento cancelado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao cancelar desligamento: " + e.getMessage());
        }
    }
}
