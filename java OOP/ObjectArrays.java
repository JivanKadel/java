public class ObjectArrays {
    public static void main(String[] args) {
        Subject[] subs = new Subject[3];
        subs[0] = new Subject();
        subs[0].setName("John");
        subs[1] = new Subject();
        subs[1].setName("Cena");
        subs[2] = new Subject();
        subs[2].setName("Undertaker");
         for(Subject s : subs){
             System.out.println(s.getName());
         }
    }
}
class Subject{
    private String name;
    private int subjectCode;
    private final int totalMarks = 60;
    private int obtainedMarks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
    }

    public int getObtainedMarks() {
        return obtainedMarks > totalMarks ? 60 : obtainedMarks;
    }

    public void setObtainedMarks(int obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }
}
