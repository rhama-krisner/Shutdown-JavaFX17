package application.desligaautomatico.util;

import java.time.LocalTime;

public class ConverteTempo {
    public static int converterParaSegundos(String horas) {
        LocalTime tempo = LocalTime.parse(horas);
        int horasEmSegundos = (tempo.getHour() % 24) * 3600;
        int minutosEmSegundos = tempo.getMinute() * 60;
        int segundos = horasEmSegundos + minutosEmSegundos + tempo.getSecond();
        return segundos;
    }
}
