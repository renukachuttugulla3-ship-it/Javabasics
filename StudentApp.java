import java.util.ArrayList;
class Student{
		private int studentID;
		private String studentName;
		private double studentMarks;

		public Student(int studentID,String studentName, double studentMarks){
	            this.studentID=studentID;
	            this.studentName=studentName;
	            this.studentMarks=studentMarks;
	     }
	     public Student(){
	     }
	     public void setStudentID(int studentID){
	         this.studentID=studentID;
	     }
	     public void setStudentName(String studentName){
	         this.studentName=studentName;
	     }
	     public void setStudentMarks(double studentMarks){
	         this.studentMarks=studentMarks;
	     }

	     public void displayStudentInfo(){
	     System.out.println("StudentID: "+studentID);
	     System.out.println("Name: "+studentName);
	     System.out.println("Marks: "+studentMarks);
	     System.out.println("");
	     }
          }
          public class StudentApp{
              public static void main(String[] args){
	          Student s1=new Student(101, "Alice",87.5);
	          Student s2=new Student(102, "Bob",75.0);
	          Student s3=new Student(103, "Charlie",95.5);

                  Student s4=new Student();
	          s4.setStudentID(104);
	          s4.setStudentName("Renu");
	          s4.setStudentMarks(95.0);

	          Student s5=new Student();
	          s5.setStudentID(105);
	          s5.setStudentName("renn");
	          s5.setStudentMarks(90.0);

          ArrayList<Student> studentList=new ArrayList<>();

          studentList.add(s1);
          studentList.add(s2);
          studentList.add(s3);
          studentList.add(s4);
          studentList.add(s5);

          System.out.print(" ");
          for(Student student : studentList) {
              student.displayStudentInfo();
          }
     }
}




