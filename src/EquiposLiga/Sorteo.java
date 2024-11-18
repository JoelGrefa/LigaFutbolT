package EquiposLiga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteo {

    public static List<String> sortearPartidos(List<Equipo> equipos) {
        if (equipos.size() <= 1) {
            throw new IllegalArgumentException("Debe haber al menos 2 equipos para hacer un sorteo.");
        }

        List<String> partidos = new ArrayList<>();
        realizarSorteo(equipos, partidos);
        return partidos;
    }

    private static void realizarSorteo(List<Equipo> equipos, List<String> partidos) {
        // Caso base: si no quedan equipos, finaliza el sorteo
        if (equipos.size() < 2) {
            return;
        }

        // Mezclar equipos aleatoriamente
        Collections.shuffle(equipos);

        // Emparejar dos equipos
        Equipo equipo1 = equipos.remove(0);
        Equipo equipo2 = equipos.remove(0);
        partidos.add(equipo1 + " vs " + equipo2);

        // Llamada recursiva para el resto de los equipos
        realizarSorteo(equipos, partidos);
    }

    public static List<Equipo> avanzarEtapa(List<Equipo> equipos) {
        List<Equipo> ganadores = new ArrayList<>();
        Collections.shuffle(equipos);

        for (int i = 0; i < equipos.size(); i += 2) {
            Equipo ganador = (Math.random() > 0.5) ? equipos.get(i) : equipos.get(i + 1);
            ganadores.add(ganador);
        }

        return ganadores;
    }
}

