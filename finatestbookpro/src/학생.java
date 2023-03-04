public class 切积 {
    public int studentNum;
    public String name;
    public 切积 (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return studentNum;
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof 切积)) return false;
        切积 student = (切积) obj;
        if(studentNum != student.studentNum) return false;
        return true;
    }
}