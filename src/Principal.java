import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Mapa mapa = new Mapa();
        Auto auto = new Auto();
        mapa.mostrarPosiciones();
        System.out.println("Ingrese fila y columna de inicio:");
        int x1 = scanner.nextInt(), y1 = scanner.nextInt();

        System.out.println("Ingrese fila y columna de destino:");
        int x2 = scanner.nextInt(), y2 = scanner.nextInt();

        Esquina inicio = new Esquina(x1, y1);
        Esquina destino = new Esquina(x2, y2);

        auto.camino = mapa.encontrarCamino(inicio, destino);

        if (auto.camino.isEmpty()) {
            System.out.println("No hay camino posible.");
        } else {
            System.out.println("Camino más corto:");
            auto.imprimirCamino();
        }
        scanner.close();

        /*VentasSemanal v = new VentasSemanal(7);
        v.cargaVentas();
        System.out.println("El total de ventas es: " + v.totalVentaSemanal());
        System.out.println("El promedio semanal es: " + v.promedioVentaSemanal());
        System.out.println(v.diaConMasVentas());*/

        /*Virus p = new Virus("paro");
        Scanner tecl = new Scanner(System.in);
        int cont=0,val,bn=0;
       while (cont<5 && bn==0) {
            System.out.println("Ingrese Neutralizante entre (1,10):");
            val= tecl.nextInt();
            p.neutralizar(val);
            if(!p.esNocivo()){
                bn=1;
            }
            cont++;
       }
       System.out.println(p);*/

        /*Juego p = new Juego();
        int opc,mon;
        double apu;
        Scanner tecl = new Scanner(System.in);
        p.setSaldo(400);
        System.out.println(p.getSaldo());
        do{
            System.out.println("Ingrese moneda: ");
            mon = tecl.nextInt();
            System.out.println("Ingrese valor a apostar: ");
            apu = tecl.nextDouble();
            p.Inicio(apu, mon);
            p.termina();


            System.out.println("Quieres Seguir Apostar?");
            opc = tecl.nextInt();
        }while(opc!=0);*/
        


        /*Punto p1, p2;
        p1 = new Punto(2, 3);
        p2 = new Punto(5, 8);
        
        System.out.println(p1.Distancia(p2));
        System.out.println(p1.DentrodeRadio(p2,5));*/

        //tecl.close();
    }
}
