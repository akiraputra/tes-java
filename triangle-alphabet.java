public class Main {
    public static void main(String[] args){
        int size = 5;
        int alpha = 65;
        for (int i=1; i <= size; i++){
            for (int j=0; j<i; j++){
                if (i !==size){
                    if(j == 0 || j == i -1){
                        System.out.print((char)(alpha + j));
                    }else {
                        System.out.print("");
                    }
                }
                else {
                    System.out.print((char)(alpha + j));
                }
            }
            System.out.printIn();
        }
    }
}
