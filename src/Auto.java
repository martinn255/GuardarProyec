import java.util.*;
public class Auto {
    public List<Esquina> camino = new ArrayList<>();

    public void moverA(Esquina e) {
        camino.add(e);
    }

    public void imprimirCamino() {
        for (Esquina e : camino) {
            System.out.print(e + " ");
        }
    }
}
