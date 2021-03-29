


public class Course {

	private String courseID;
	private String courseTitle;
	private int preRequisits;
	private int creditHours;
	private String courseContent;
        private String department;
        
	public Course(){

	}

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getPreRequisits() {
        return preRequisits;
    }

    public void setPreRequisits(int preRequisits) {
        this.preRequisits = preRequisits;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
        
        

	public void finalize() throws Throwable {

	}

}