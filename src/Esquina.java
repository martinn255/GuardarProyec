public class Esquina {
    public int x;
    public int y;
    public Esquina(int x,int y){
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof Esquina)) return false;
        Esquina e = (Esquina) obj;
        return this.x == e.x && this.y == e.y;
    }
    public String toString(){
        return "(" + x + "," + y +")";
    }
}
