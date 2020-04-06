package HomeWork3;

public class HillelHW3_13 {

    public static String[][] chess = new String[8][8];
    public static void main(String[] args) {

        int needWhiteOrBlack = 0;

        for(int i =0;i<chess.length;i++){
            if(needWhiteOrBlack == 1){

                needWhiteOrBlack = 0;
            } else if (needWhiteOrBlack == 0){

                needWhiteOrBlack = 1;
            }

            for(int j=0;j < chess[i].length;j++){
                if(needWhiteOrBlack == 1){
                    chess[i][j]=" W ";
                    needWhiteOrBlack = 0;
                } else if (needWhiteOrBlack == 0){
                    chess[i][j]=" B ";
                    needWhiteOrBlack = 1;
                }

            }

        }
        printChessBoard();
    }

    private static void printChessBoard() {
        for(int i =0;i<chess.length;i++){
            System.out.println(" ");
            for(int j=0;j < chess[i].length;j++){
                System.out.print(chess[i][j]);
            }

        }
    }




}
