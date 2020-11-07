import java.util.*;
public class magicSquare {
    public static void magicSquare(int a) {
        int[][] b = new int[a][a];
        int c = 0; // row number
        int d = b[0].length / 2; // column number
        for (int e = 1; e <= a*a; e++) {
            if (c < 0 && d > b[0].length - 1) {
                d--;
                c+=2;
            } 
            if (c < 0) {
                c = b.length - 1;
            }
            if (d > b[0].length - 1) {
                d = 0;
            }
            if (b[c][d] != 0) {
                c += 2;
                d--;
            }            
            b[c][d] = e;
            c--;
            d++;
        
       
        
    }
    for (int f = 0; f < b.length; f++) { // prints the array
        for (int g = 0; g < b[0].length; g++) {
            System.out.print(b[f][g] + " ");
            
        }
        System.out.println();
    }
    
}
}
