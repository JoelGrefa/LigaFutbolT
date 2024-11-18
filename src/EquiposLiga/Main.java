package EquiposLiga;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de sorteos de la liga profesional.");
        List<Equipo> equipos = ingresarEquipos(scanner);

        // Simular etapas del torneo
        int ronda = 1;
        while (equipos.size() > 1) {
            String etapa = determinarEtapa(equipos.size());
            System.out.println("\nEtapa " + ronda + ": " + etapa + " (Equipos: " + equipos.size() + ")");

            List<String> partidos = Sorteo.sortearPartidos(new ArrayList<>(equipos));
            for (String partido : partidos) {
                System.out.println(partido);
            }

            equipos = Sorteo.avanzarEtapa(equipos);
            ronda++;
        }

        // Determinar campeón
        System.out.println("\n¡El campeón de la liga es: " + equipos.get(0).getNombre() + "!");
        scanner.close();
    }

    private static List<Equipo> ingresarEquipos(Scanner scanner) {
        System.out.println("Ingrese los nombres de los 16 equipos:");
        List<Equipo> equipos = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            System.out.print("Equipo " + (i + 1) + ": ");
            equipos.add(new Equipo(scanner.nextLine()));
        }
        return equipos;
    }

    private static String determinarEtapa(int cantidadEquipos) {
        switch (cantidadEquipos) {
            case 16:
                return "Octavos de Final";
            case 8:
                return "Cuartos de Final";
            case 4:
                return "Semifinales";
            case 2:
                return "Final";
            default:
                return "Desconocida";
        }
    }
}


