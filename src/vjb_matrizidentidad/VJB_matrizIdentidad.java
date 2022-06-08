/*
  Programa elaborado por: Brandon Vazquez Juarez
  Matriz identidad
*/
package vjb_matrizidentidad;

public class VJB_matrizIdentidad {

    public static void main(String[] args) {
        int matriz[][]=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==j) {
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("En la posicion ["+i+"]["+j+"] de la matriz se encuentra "+matriz[i][j]);
            }
            
        }
    }
    
}
