public class ForLoopDemo {
    public static void main(String[] args){

        for(int i = 1; i < 7; i++){ //i: 2
            //int number = 2;
            int number = (int)(Math.pow(2, i));
            System.out.println(i + number); //i: 2
        }
    }
}
