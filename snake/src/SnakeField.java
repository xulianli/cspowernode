/**
 * @Author 徐联理
 * @Date 2023/3/31 20:07
 * @Description
 */
public class SnakeField {
    final int x = 10;
    final int y = 20;
    int size;
    Snake snake;

    void print(){
        for (int i = 0; i < x; i++) {
            if (i>0 && i<9) {
                for (int j = 0; j < y; j++) {
                    System.out.print(j > 0 && j < 19 ? " " : "*");
                }
            }else{
                for (int j = 0; j < y; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
