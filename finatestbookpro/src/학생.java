public class �л� {
    public int studentNum;
    public String name;
    public �л� (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return studentNum;
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof �л�)) return false;
        �л� student = (�л�) obj;
        if(studentNum != student.studentNum) return false;
        return true;
    }
}