
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Virus p = new Virus("paro");
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
       System.out.println(p);

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
        tecl.close();


        /*Punto p1, p2;
        p1 = new Punto(2, 3);
        p2 = new Punto(5, 8);
        
        System.out.println(p1.Distancia(p2));
        System.out.println(p1.DentrodeRadio(p2,5));*/
        
    }
}
