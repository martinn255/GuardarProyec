
public class Punto {
    private double x;
    private double y;
    //public Punto(){
    //}
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    //getter
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    //setter
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double Distancia(Punto otro){
       double distancia;
       distancia = Math.sqrt(Math.pow(getX() - otro.x , 2) + Math.pow(getY() - otro.y , 2)) ;
       return distancia;
    }
    public boolean DentrodeRadio(Punto otro ,double radio){
        return (Distancia(otro) <= radio);
    }
}
