import java.util.*;

public class ZigZagGridPath {

    static class Point {
        int x, y;
        List<Point> path;

        Point(int x, int y, List<Point> path) {
            this.x = x;
            this.y = y;
            this.path = new ArrayList<>(path);
            this.path.add(this);
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    static int N = 4;

    public static List<Point> shortestPath(Point start, Point end) {
        boolean[][] visited = new boolean[N][N];
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(start.x, start.y, new ArrayList<>()));

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.x == end.x && current.y == end.y)
                return current.path;

            if (visited[current.x][current.y])
                continue;

            visited[current.x][current.y] = true;

            // Movimiento horizontal
            if (current.x % 2 == 0 && current.y + 1 < N) // →
                queue.add(new Point(current.x, current.y + 1, current.path));
            else if (current.x % 2 != 0 && current.y - 1 >= 0) // ←
                queue.add(new Point(current.x, current.y - 1, current.path));

            // Movimiento vertical
            if (current.y % 2 == 0 && current.x - 1 >= 0) // ↑
                queue.add(new Point(current.x - 1, current.y, current.path));
            else if (current.y % 2 != 0 && current.x + 1 < N) // ↓
                queue.add(new Point(current.x + 1, current.y, current.path));
        }

        return new ArrayList<>(); // No se encontró camino
    }

    public static void mostrarCuadricula() {
        System.out.println("Cuadrícula 4x4 con coordenadas:");
        for (int i = 4; i < N*2; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        mostrarCuadricula();

        System.out.print("Ingresa fila de inicio (0-3): ");
        int startX = scanner.nextInt();
        System.out.print("Ingresa columna de inicio (0-3): ");
        int startY = scanner.nextInt();

        System.out.print("Ingresa fila de destino (0-3): ");
        int endX = scanner.nextInt();
        System.out.print("Ingresa columna de destino (0-3): ");
        int endY = scanner.nextInt();

        Point start = new Point(startX, startY, new ArrayList<>());
        Point end = new Point(endX, endY, new ArrayList<>());

        List<Point> path = shortestPath(start, end);

        if (path.isEmpty()) {
            System.out.println("No hay camino disponible.");
        } else {
            System.out.println("Camino más corto:");
            for (Point p : path) {
                System.out.print(p + " ");
            }
        }
    }
}
