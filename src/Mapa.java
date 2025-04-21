import java.util.*;
public class Mapa {
    public static final int N = 4;
    public static final int M = N*2;
    public void mostrarPosiciones() {
        System.out.println("Posiciones de la matriz:");
        for (int i = N; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("(" + i + ", " + j + ")");
            }
            System.out.println();
        }
    }

    public List<Esquina> encontrarCamino(Esquina inicio, Esquina fin) {
        boolean[][] visitado = new boolean[M][N];
        Queue<List<Esquina>> cola = new LinkedList<>();

        List<Esquina> inicioCamino = new ArrayList<>();
        inicioCamino.add(inicio);
        cola.add(inicioCamino);

        while (!cola.isEmpty()) {
            List<Esquina> caminoActual = cola.poll();
            Esquina actual = caminoActual.get(caminoActual.size() - 1);

            if (actual.equals(fin)) {
                return caminoActual;
            }

            if (visitado[actual.x][actual.y]) continue;
            visitado[actual.x][actual.y] = true;

            // Posibles movimientos según reglas
            for (Esquina vecino : vecinosPermitidos(actual)) {
                if (!visitado[vecino.x][vecino.y]) {
                    List<Esquina> nuevoCamino = new ArrayList<>(caminoActual);
                    nuevoCamino.add(vecino);
                    cola.add(nuevoCamino);
                }
            }
        }

        return new ArrayList<>();
    }

    private List<Esquina> vecinosPermitidos(Esquina e) {
        List<Esquina> vecinos = new ArrayList<>();

     /*    // Movimiento vertical (0 a 4)
    if (e.x >= 0 && e.x <= 4) {
        if (e.x - 1 >= 0) // Arriba
            vecinos.add(new Esquina(e.x - 1, e.y));
        if (e.x + 1 <= 4) // Abajo
            vecinos.add(new Esquina(e.x + 1, e.y));
    }

    // Movimiento horizontal (5 a 7)
    if (e.x >= 5 && e.x <= 7) {
        if (e.y - 1 >= 0) // Izquierda
            vecinos.add(new Esquina(e.x, e.y - 1));
        if (e.y + 1 < N) // Derecha
            vecinos.add(new Esquina(e.x, e.y + 1));
    }*/

        // Horizontal (fila define dirección)
        if (e.x % 2 == 0 && e.y + 1 < N) // fila par → derecha
            vecinos.add(new Esquina(e.x, e.y + 1));
        else if (e.x % 2 != 0 && e.y - 1 >= 0) // fila impar → izquierda
            vecinos.add(new Esquina(e.x, e.y - 1));

        // Vertical (columna define dirección)
        if (e.y % 2 == 0 && e.x - 1 >= 0) // columna par → arriba
            vecinos.add(new Esquina(e.x - 1, e.y));
        else if (e.y % 2 != 0 && e.x + 1 < N) // columna impar → abajo
            vecinos.add(new Esquina(e.x + 1, e.y));

        return vecinos;
    }

}
