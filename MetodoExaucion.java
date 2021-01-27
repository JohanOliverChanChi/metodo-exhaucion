package metodoexaucion;

import javax.swing.JOptionPane;

public class MetodoExaucion {

    public static void main(String[] args) {
        
        double A = 6;
        double B = 1;
        
        for(int i=1; i<=100 ;i++){
        
        double C = B/2;
        double D = Math.sqrt((1-C*C));
        double E = 1-D;
        double F = Math.sqrt((C*C + E*E));
        double G = A * B;
        double H = G/2;
        System.out.println(H);
        A=A*2;
        B=F;
        
    }
    }
    
}
