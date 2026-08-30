class Student{
    int rollno;
    String name;
    int marks;
}
public class demo6
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.rollno=101;
        s1.name="John";
        s1.marks=90;

        Student s2 = new Student();
        s2.rollno=102;
        s2.name="Smith";
        s2.marks=80;
        
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;

        for(Student s:students)
        {
            if(s!=null)
            {
                System.out.println(s.rollno+" "+s.name+" "+s.marks);
            }
        }
    }
}