package latihan6;

public class Latihan6b {

    public static void main(String[] args) {
        System.out.println("=========== Latihan 6b  ===========");
        
        int matriksA  [] [] = {{1, 3}, {2, 4}};
        int matriksB  [] [] = {{4, 2}, {3,1}};
        
        int hasilKurang [] [] = new int [2][2];
        
        System.out.println("\nMatriks B - Matriks A");
        
        for(int m = 0; m < 2; m++){
            for(int n = 0; n < 2; n++){
                hasilKurang[m][n] = matriksB[m][n] - matriksA[m][n];
                System.out.print(hasilKurang[m][n] + "  ");
            }
                System.out.println("  ");
        }
    }
    
}
