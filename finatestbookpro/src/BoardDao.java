import java.util.ArrayList;
import java.util.List;

public class BoardDao {

    public List<Board> getBoardList(){
        List<Board> boards = new ArrayList<>();
        boards.add(new Board("力格1", "郴侩1"));
        boards.add(new Board("力格2", "郴侩2"));
        boards.add(new Board("力格3", "郴侩3"));
        return boards;
    }
}
