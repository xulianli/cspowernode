/**
 * @Author 徐联理
 * @Date 2023/3/31 20:07
 * @Description
 */
public class SnakeField {
    public static final int MAX_X = 10;
    public static final int MAX_Y = 20;
    Snake snake;

    void print(){
        for (int i = 0; i < MAX_X; i++) {
            if (i>0 && i<9) {
                for (int j = 0; j < MAX_Y; j++) {
                    System.out.print(j > 0 && j < 19 ? " " : "*");
                }
            }else{
                for (int j = 0; j < MAX_Y; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
