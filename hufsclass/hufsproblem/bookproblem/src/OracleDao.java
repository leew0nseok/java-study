public class OracleDao extends DataAccessObject{
    void select(){
        System.out.println("Oracle DB에서 검색");
    }
    void insert(){
        System.out.println("Oracle DB에서 삽입");
    }
    void update(){
        System.out.println("Oracle DB에서 수정");
    }
    void delete(){
        System.out.println("Oracle DB에서 삭제");
    }
}
