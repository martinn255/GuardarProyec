import java.util.Scanner;

public class VentasSemanal {
     private double[] ventas;  


    public VentasSemanal(){
        this.ventas = new double[1];
        this.ventas[1] = 0;
    }

    public VentasSemanal(int tam){
        tam = Math.abs(tam);
        if(tam > 6){
            this.ventas = new double[7];
        }
        else{
            this.ventas = new double[tam];
        }
    }

    public VentasSemanal(double[] ventas){

        if(ventas.length == this.ventas.length){
          this.ventas = ventas;  
        }else if(ventas.length >this.ventas.length){
            for(int i = 0; i < this.ventas.length; i++){
                this.ventas[i] = ventas[i];
            }
        }else{
            int index = this.ventas.length - ventas.length;
            this.ventas = ventas;
            for (int i = index; i < this.ventas.length; i++){
                this.ventas[i] = 0;
            }
        }

        //int i = ventas.length;
        //ventas = new double[i];
        //this.ventas = ventas;
    }

    public void cargaVentas(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < ventas.length; i++ ){
            System.out.println("Ingresa la venta del dia " + (i+1) + " :");
            ventas[i] = sc.nextDouble();
        }
        sc.close();
    }

    public double totalVentaSemanal(){
        double total = 0;
        for(int i = 0; i < ventas.length; i++){
            total+=ventas[i];
        }
        return Math.round(total * 1000.0)/1000.0;
    }

    public double promedioVentaSemanal(){
        return Math.round(totalVentaSemanal()/ventas.length * 1000.0)/1000.0;
    }

    public String diaConMasVentas(){
        int i = 0;
        for(int j = 1; j < ventas.length; j++){
            if(ventas[i] < ventas[j]){
                i=j;
            }
        }
        String cad = "El dia " + (i+1) + " fue el con mas ventas, con una venta total de $" + Math.round(ventas[i] * 1000.0)/1000.0;
        return cad;
    }

}
