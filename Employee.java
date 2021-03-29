

/**
 * @author NAC
 * @version 1.0
 * @created 31-Dec-2020 11:17:35 PM
 */
public class Employee extends Person {

	private String employeeID;
	private double salary;
	private String shift;
	private String status;
	private String jobTitle;
	private String maritalStatus;
	private String taxIdNumber;
        private String username;
        private String password;
        private String department;
        EmployeeDAO ead = new EmployeeDAO();
	public Employee(){

	}
        
        public void addEmployee(Employee e)
        {
            ead.insertEmployee(e);
        }
        public void updateEmployee(Employee e)
        {
            ead.updateEmployeeRecord(e);
        }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
        
        
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public void setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }
        
	public void finalize() throws Throwable {
		super.finalize();
	}

}