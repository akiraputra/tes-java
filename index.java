public class Main {
    public static void main(string[] args) {
        int size = 5;
        int alpha = 65;

        for (int i = 0; i < size; i++) {
            for (int j =1; j < size - i; j++){
                System.out.print("");
            }
            for (int k=0; k <= i; k++){
                System.out.print((char)(alpha + k));
            }
            System.out.printIn();
        }
    }
    
}
