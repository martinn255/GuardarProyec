import java.util.Random;
public class Virus {
    Random random = new Random();
    public String nombre;
    private int adn = random.nextInt(10-1+1)+1;
    private boolean nocivo = true;

    public Virus(){
        this("nada");
    }
    public Virus(String nombre){
        this.nombre = nombre;
    }
    //no va
    public int getAdn(){
        return this.adn;
    }
    

    public boolean esNocivo(){
        return this.nocivo;
    }
    public void neutralizar(int adnNeu){
        if(getAdn() == adnNeu){
            this.nocivo = false;
        }
    }
    public String toString(){
        String cadena = ".";
        cadena+= "Nombre del viruz: " + this.nombre  + "  Es Nocivo: " + esNocivo() + " " + getAdn();
        return cadena;
    }
}
