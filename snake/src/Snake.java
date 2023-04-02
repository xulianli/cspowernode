import java.util.LinkedList;
import java.util.Objects;

/**
 * @Author 徐联理
 * @Date 2023/3/31 19:47
 * @Description
 */
public class Snake {
    public static final int UP = -1;
    public static final int DOWN = 1;
    public static final int LEFT = -10;
    public static final int RIGHT = 10;
    String dir;
    LinkedList<Node> body;

    public Snake(LinkedList<Node> body) {
        this.body = body;
    }

    public void setBody(LinkedList<Node> body) {
        this.body = body;
    }

    public void move(String dir){
        Node oldHead = body.getFirst();
    }
}

