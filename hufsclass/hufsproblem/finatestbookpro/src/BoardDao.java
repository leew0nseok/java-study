import java.util.ArrayList;
import java.util.List;

public class BoardDao {

    public List<Board> getBoardList(){
        List<Board> boards = new ArrayList<>();
        boards.add(new Board("����1", "����1"));
        boards.add(new Board("����2", "����2"));
        boards.add(new Board("����3", "����3"));
        return boards;
    }
}
