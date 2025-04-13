import java.util.Random;
import java.util.Scanner;
public class Juego {
    Scanner tec = new Scanner(System.in);
    private double saldo;
    private double apuesta;
    private int moneda;
    private int rand;

    public Juego(){
    }
    public Juego(double saldo){
        setSaldo(saldo);   // se utiliza si tengo ya un setter si no tengo utlizo los de abajo
    }
    public Juego(double apuesta,int moneda){
        this.apuesta = apuesta;
        this.moneda = moneda;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public double getApuesta(){
        return this.apuesta;
    }
    public double getMoneda(){
        return this.moneda;
    }
    public int getRando(){
        return this.rand;
    }
    public void setRando(int rand){
        this.rand = rand;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setApuesta(double apuesta){
        this.apuesta = apuesta;
    }        
    public void setMoneda(int moneda){
        if(moneda>0 && moneda<=3){
            this.moneda = moneda;
        }else{
            System.out.println("Valor de la moneda elegido incorrecto entre (1 y 3)");
            System.out.println("Ingrese moneda: ");
            moneda = tec.nextInt();
            setMoneda(moneda);

        }
        
    }

    public void Inicio(double apuesta,int moneda){
        Random random = new Random();
        int val;
        val = random.nextInt(3)+1 ;
        System.out.println(val);
        if(getSaldo()>= apuesta){
            setRando(val);
            setApuesta(apuesta);
            setMoneda(moneda);
        }else{
            System.out.println("No se puede hacer la apuesta Saldo insuficiente: " + getSaldo());
        }
    }
    public void termina(){
        double gana;
        if(getRando() == getMoneda()){
            gana = getApuesta() *2; 
            this.saldo = this.saldo + gana;
            System.out.println("Ganaste:" + gana + "  Saldo actual :"+ getSaldo());
        }else{
            this.saldo = this.saldo - getApuesta();
            System.out.println("Perdiste saldo actual: " + getSaldo());
        }
    }
}
