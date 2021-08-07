package latihan6;

public class Latihan6A {

    public static void main(String[] args) {
        System.out.println("=========== Latihan 6a ===========");
        int matriksA  [] [] = {{1, 3}, {2, 4}};
        int matriksB  [] [] = {{4, 2}, {3,1}};
       
        int hasilTambah [] [] = new int [2][2];
        
        System.out.println("Matriks A + Matriks B");
        
        for(int i = 0;  i < 2;  i++){
            for(int j = 0;  j < 2; j++){
                hasilTambah[i][j] = matriksA[i][j] + matriksB[i][j];
                System.out.print(hasilTambah[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
    
}
