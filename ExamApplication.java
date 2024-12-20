import java.util.*;
class Question
{
  private int id;
  private String op1,op2,op3,op4;
  private String ans;
 
  public void setId(int Id)
  {
   id=Id;
  }
  public int getId()
  {
    return id;
  }

  public void setOp1(String Op1)
  {
    op1=Op1;
  }
  public String getOp1()
  {
    return op1;
  }

  public void setOp2(String Op2)
  {
    op2=Op2;
  }
  public String getOp1()
  {
    return op2;
  }

  public void setOp3(String Op3)
  {
    op3=Op3;
  }
  public String getOp1()
  {
    return op3;
  }

  public void setOp4(String Op4)
  {
    op4=Op4;
  }
  public String getOp1()
  {
    return op4;
  }

  public void setAnswer(String Ans)
  {
    ans=Ans;
  }
  public String getOp1()
  {
    return ans;
  }
}


class Exam
{
  private int id;
  private String examname;
  private Question q[];
 
  public void setId(int Id)
  {
    id=Id;
  }
  public int getId()
  {
    return Id;
  }

  public void setexamname(String examnm)
  {
    examname=examnm;
  }
  public String getexamname()
  {
    return examname;
  }

   
  public void setQuestions(Question questions[])
  { 
    q= questions; 
  }
  public Question[] getQuestions() 
  { 
    return q;
  }
}

class Student
 {
    int id;
    String name, email, contact;
    float marks;
    Exam e;

    public void setId(int Id)
    { 
      id = Id; 
    }
    public int getId() 
    { 
      return id; 
    }

    
    public void setName(String Name) 
    { 
      name = Name;
    }
    public String getName()
    { 
      return name;
    }

    
    public void setEmail(String Email)
    { 
      email = Email;
    }
    public String getEmail() 
    { 
      return email;
    }

    
    public void setContact(String Contact)
    { 
      contact = Contact;
    }
    public String getContact() 
    { 
      return contact;
    }

   
    public void setMarks(float Marks) 
    { 
      marks = Marks;
    }
    public float getMarks() 
    { 
      return marks; 
    }

    
    public void setExam(Exam E)
    { 
      e = E; 
    }
    public Exam getExam() 
    { 
      return e; 
    }
}

public class ExamApplication
{
  public static void main(String x[])
   {
     Student[] st=new Student[5];
     for(int i=0;i<st.length;i++)
       {
          student(i)=new Student();
          st[i].setId(i + 1);
          st[i].setName("Student " +(i + 1));
          st[i].setEmail("student" +(i + 1) +"@example.com");
          st[i].setContact("123456789" +i);
          st[i].setMark(i*10);
       }
   

     Question[] q = new Question[10]; 
        q[0] = new Question();
        q[0].setId(1);
        q[0].setName("What is 2 + 2?");
        q[0].setOp1("2");
        q[0].setOp2("3");
        q[0].setOp3("4");
        q[0].setOp4("5");
        q[0].setAnswer("4");

        q[1] = new Question();
        q[1].setId(2);
        q[1].setName("What is 1 + 1?");
        q[1].setOp1("2");
        q[1].setOp2("3");
        q[1].setOp3("4");
        q[1].setOp4("5");
        q[1].setAnswer("2");

      
        q[2] = new Question();
        q[2].setId(3);
        q[2].setName("What is 1 + 0?");
        q[2].setOp1("2");
        q[2].setOp2("3");
        q[2].setOp3("4");
        q[2].setOp4("1");
        q[2].setAnswer("1");

     
        q[3] = new Question();
        q[3].setId(4);
        q[3].setName("What is 4 + 2?");
        q[3].setOp1("2");
        q[3].setOp2("3");
        q[3].setOp3("4");
        q[3].setOp4("6");
        q[3].setAnswer("6");

        
        q[4] = new Question();
        q[4].setId(5);
        q[4].setName("What is 0+3?");
        q[4].setOp1("2");
        q[4].setOp2("3");
        q[4].setOp3("4");
        q[4].setOp4("5");
        q[4].setAnswer("3");


         Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setId(i + 1);
            students[i].setName("Student " + (i + 1));
            students[i].setEmail("student" + (i + 1) + "@example.com");
            students[i].setContact("123456789" + i);
            students[i].setE(exam); // Set the same exam for all students
            // Set marks for each student, you can randomly generate or set manually
            students[i].setMarks(70 + i * 5); // Example marks
        }

      
        // 1. show student wise result
        System.out.println("Student-wise Result:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Marks: " + student.getMarks());
        }

        // 2. show topper student
        Student topper = students[0];
        for (Student student : students) {
            if (student.getMarks() > topper.getMarks()) {
                topper = student;
            }
        }
        System.out.println("Topper: " + topper.getName() + ", Marks: " + topper.getMarks());

        // 3. show first three toppers
        Arrays.sort(students, Comparator.comparingDouble(Student::getMarks).reversed());
        System.out.println("Top Three Toppers:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Rank " + (i + 1) + ": " + students[i].getName() + ", Marks: " + students[i].getMarks());
        }

        // 4. show failed student
        System.out.println("Failed Students:");
        for (Student student : students) {
            if (student.getMarks() < 35) {
                System.out.println(student.getName() + ", Marks: " + student.getMarks());
            }
        }
    }
}

