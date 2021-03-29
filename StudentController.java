

public class StudentController {

	public StudentController(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param name
	 * @param age
	 * @param dob
	 * @param ca
	 * @param pa
	 * @param cnic
	 * @param phone
	 * @param gender
	 * @param email
	 * @param regno
	 * @param busPassID
	 * @param gn
	 * @param gc
	 * @param cgpa
	 * @param semester
	 * @param batch
	 * @param ch
	 * @param dp
	 * @param scholarship
	 */
	public void addStudent(String name, int age, String dob, String ca, String pa, String cnic, String phone, String gender, String email, String regno, String busPassID, String gn, String gc, double cgpa, int semester, String batch, int ch, String dp, String scholarship, String department){
		Student s = new Student();
                s.setName(name);
                s.setAge(age);
                s.setDob(dob);
                s.setCurrentAddress(ca);
                s.setPermanentAddress(pa);
                s.setCnic(cnic);
                s.setPhone(phone);
                s.setGender(gender);
                s.setEmail(email);
                s.setRegNo(regno);
                s.setBusPassID(busPassID);
                s.setGuardian(gn);
                s.setGuardianContact(gc);
                s.setCgpa(0.0);
                s.setSemester(1);
                s.setBatch(batch);
                s.setCreditHours(0);
                s.setDegreeProgram(dp);
                s.setUsername(regno);
                s.setPassword("123");
                s.setScholarship(scholarship);
                s.setDepartment(department);
                 System.out.println("Controller");
                
                 
                 s.addStudent(s);
	}
        
        public void updateStudent(String name, int age, String dob, String ca, String pa, String cnic, String phone, String gender, String email, String regno, String busPassID, String gn, String gc, double cgpa, int semester, String batch, int ch, String dp, String scholarship, String department){
		Student s = new Student();
                s.setName(name);
                s.setAge(age);
                s.setDob(dob);
                s.setCurrentAddress(ca);
                s.setPermanentAddress(pa);
                s.setCnic(cnic);
                s.setPhone(phone);
                s.setGender(gender);
                s.setEmail(email);
                s.setRegNo(regno);
                s.setBusPassID(busPassID);
                s.setGuardian(gn);
                s.setGuardianContact(gc);
                s.setCgpa(0.0);
                s.setSemester(1);
                s.setBatch(batch);
                s.setCreditHours(0);
                s.setDegreeProgram(dp);
                s.setUsername(regno);
                s.setPassword("123");
                s.setScholarship(scholarship);
                s.setDepartment(department);
                 System.out.println("Controller");
                
                 
                 s.updateStudent(s);
	}
        public void deleteStudent(String regno)
        {
            Student s = new Student();
            s.deleteStudent(regno);
        }
        
        
        public Student findStudentByRegNo(String regno)
        {
            StudentDAO sta = new StudentDAO();
            Student s = sta.getStudentById(regno);
            return s;
        }
        public Student findStudentByName(String name)
        {
            System.out.println("CONTROLLER");
            StudentDAO sta = new StudentDAO();
            Student s = sta.getStudentByName(name);
            return s;
        }

}