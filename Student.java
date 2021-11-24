public class Student extends Probationer{
    public int year_study;
    public String university;

    Student (String name, String ID, int exp,int year_study, String university){
        super(name,ID,exp);
        this.year_study = year_study;
        this.university = university;
    }


    public String print(){
         return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", id=" + ID +
                '}';
    }
}
