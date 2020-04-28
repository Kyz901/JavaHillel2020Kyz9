package HomeWork20;

public class Buffer {

    static Integer[] buffer = new Integer[10];
    static Integer indexOfLast = buffer.length-1;

    static private int current = 0;

    public  static int getCurrent() {
        return current;
    }

    public  synchronized static void setCurrent(int current) {
        Buffer.current = current;
    }

    public static boolean isFull(){
        for(int i = 0;i<=indexOfLast;i++){
            if(buffer[i] == null)
                return false;
        }
        return true;
    }
    public static boolean isEmpty(){
        for(int i = 0;i<indexOfLast;i++){
            if(buffer[i] != null)
                return false;
        }
        return true;
    }

    public static synchronized void printBuffer(){
        System.out.print("BUFFER { ");
        for (int i = 0; i < Buffer.buffer.length; i++) {

            System.out.print("["+Buffer.buffer[i]+"], ");
        }
        System.out.println(" }");

    }

    public static void trim(){
        for(int i = buffer.length-1;i>=1;i--){
            for(int j = 0;j<i;++j){
                if(buffer[j] ==null){
                    Integer temp = buffer[j];
                    buffer[j] = buffer[j+1];
                    buffer[j+1] = temp;

                }

            }
        }
    }
}
