
import java.util.ArrayList;
import java.util.List;



/**
 * @author NAC
 * @version 1.0
 * @created 30-Dec-2020 10:19:09 PM
 */
public class Student extends Person {

	private String regNo;
	private String busPassID;
	private String guardian;
	private String guardianContact;
	private double cgpa;
	private int semester;
	private String batch;
	private int creditHours;
	private String degreeProgram;
        private String scholarship;
	private String department;
        
	private List<String> taskList = new ArrayList<>();
	private List<Notification> notificationList = new ArrayList<>();
	private List<Course> currentCourses = new ArrayList<>();

        StudentDAO sd = new StudentDAO();
        
	public Student(){
            
	}
        
        public void addStudent(Student s)
        {
             System.out.println("Student");
            sd.insertStudent(s);
        }
        public void updateStudent(Student s)
        {
            sd.updateStudent(s);
        }
        public void deleteStudent(String regno)
        {
            sd.deleteStudentRecord(regno);
        }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String deprartment) {
        this.department = deprartment;
    }
        
        
    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getBusPassID() {
        return busPassID;
    }

    public void setBusPassID(String busPassID) {
        this.busPassID = busPassID;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    public String getGuardianContact() {
        return guardianContact;
    }

    public void setGuardianContact(String guardianContact) {
        this.guardianContact = guardianContact;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    public String getScholarship() {
        return scholarship;
    }

    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }
        
        
        
	public void finalize() throws Throwable {
		super.finalize();
	}

}