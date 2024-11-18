# Sistema de Sorteo de Liga Profesional de Fútbol ⚽

Este proyecto es una aplicación en Java que organiza de manera aleatoria los partidos de una liga profesional de fútbol, desde los octavos de final hasta la final, determinando finalmente al campeón del torneo. 

## Características
- **Ingreso de Equipos**: Permite al usuario ingresar los nombres de los 16 equipos participantes.
- **Sorteo Aleatorio**: Los enfrentamientos de cada etapa (octavos, cuartos, semifinales, final) se asignan de manera aleatoria.
- **Recursividad**: El sorteo se realiza utilizando recursividad para emparejar a los equipos.
- **Avance de Etapas**: Se simula el progreso del torneo seleccionando aleatoriamente un equipo ganador en cada partido.
- **Determinación del Campeón**: Al final, se muestra qué equipo se coronó campeón de la liga.

## Estructura del Proyecto
El código está organizado en tres clases principales:

### 1. `Equipo`
Clase que representa un equipo de fútbol.
- **Atributos**: 
  - `nombre`: Nombre del equipo.
- **Métodos**: 
  - `getNombre()`: Retorna el nombre del equipo.
  - `toString()`: Devuelve el nombre del equipo como representación de cadena.

### 2. `Sorteo`
Clase que maneja la lógica del sorteo y la simulación de las etapas del torneo.
- **Métodos principales**:
  - `sortearPartidos(List<Equipo>)`: Empareja equipos aleatoriamente para una etapa usando recursividad.
  - `avanzarEtapa(List<Equipo>)`: Selecciona aleatoriamente los ganadores de los partidos para avanzar a la siguiente etapa.

### 3. `Main`
Clase principal que controla el flujo del programa.
- **Flujo**:
  1. Solicita al usuario ingresar los equipos.
  2. Realiza el sorteo y muestra los enfrentamientos de cada etapa.
  3. Simula los ganadores hasta llegar a la final.
  4. Declara al campeón.

## Requisitos Previos
- **Java**: Versión 8 o superior. (https://www.oracle.com/java/technologies/downloads/)
- **Entorno de Desarrollo**: Cualquier IDE como IntelliJ IDEA, Eclipse, o el compilador `javac`. (https://eclipseide.org)
