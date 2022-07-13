public class Main {
    public static void main(string[] args){
        int size = 5;
        int alpha = 65;

        for (int i=0; i <size; i++){
            for (int j =0; j<i; j++){
                System.out.print("");
            }
            for  (int k=0; k<(size-i)* 2 -1; k++){
                System.out.print((char)(alpha + k));
            }
            System.out.printIn();
        }
        for (int i =2; i<= size; i++){
            for (int j = size; j > i; k++){
                System.out.print((char)(alpha+k));
            }
            System.out.printIn();
        }
    }
}
