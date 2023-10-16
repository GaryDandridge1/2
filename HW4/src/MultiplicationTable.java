public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i = 1; i < 8; i+= 1 ){
            for(int j =1; j <= 7; j++){
                System.out.printf("%-4d",i*j); //how to line using left ("%-4d",) and right margans ("%4d",) f= decimal s=char type d=integer
            }
            System.out.println();
        }
    }
}
