
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private final Database db;

     public StudentDAO(){
        db=new Database();
        db.init();
     }
    public void insertStudent(Student s)
    {
        System.out.println("DOA");
        String query,status;
        query="insert into student(name, age, dob, currentAddress, permanentAddress, cnic, phone, gender, email, regNo, busPassID, guardian, guardianContact, cgpa, semester, batch, creditHours, degreeProgram, username, password, scholarship, department) "
                + "values"+"('"+s.getName()+"',"+s.getAge()+",'"+s.getDob()+"','"+s.getCurrentAddress()+"','"+s.getPermanentAddress()+"','"+s.getCnic()+"','"+s.getPhone()+"','"+s.getGender()+"','"+s.getEmail()+"','"+s.getRegNo()+"','"+s.getBusPassID()+"','"+s.getGuardian()+"','"+s.getGuardianContact()+"',"+s.getCgpa()+","+s.getSemester()+",'"+s.getBatch()+"',"+s.getCreditHours()+",'"+s.getDegreeProgram()+"','"+s.getUsername()+"','"+s.getPassword()+"','"+s.getScholarship()+"','"+s.getDepartment()+"');";
        System.out.println(query);
        status=db.insertRecord(query);
        System.out.println(status);
    }
    public void updateStudent(Student s)
    {
        System.out.println("DOA");
        String query,status;
        query="UPDATE student SET name='"+s.getName()+"', age="+Integer.toString(s.getAge())+", dob='"+s.getDob()+"', currentAddress='"+s.getCurrentAddress()+"', permanentAddress='"+s.getPermanentAddress()+"', cnic='"+s.getCnic()+"', phone='"+s.getPhone()+"', gender='"+s.getGender()+"', email='"+s.getEmail()+"', busPassID='"+s.getBusPassID()+"', guardian='"+s.getGuardian()+"', guardianContact='"+s.getGuardianContact()+"', cgpa="+Double.toString(s.getCgpa())+" , semester="+Integer.toString(s.getSemester())+", batch='"+s.getBatch()+"', creditHours="+Integer.toString(s.getCreditHours())+", username='"+s.getRegNo()+"', scholarship='"+s.getScholarship()+"', department='"+s.getDepartment()+"', degreeProgram='"+s.getDegreeProgram()+"' WHERE username='"+s.getUsername()+"'";
        
        
        System.out.println(query);
        status=db.updateRecord(query);
        System.out.println(status);
    }
    public void deleteStudentRecord(String regno)
    {
        String status, query="DELETE FROM student WHERE regno='"+regno+"'";
        status=db.deleteRecord(query);
        System.out.println(status);
    }
    
    public List<Student> viewAllStudents()
    {
        String query ="select * from student";
        
        ResultSet rs = db.getAllRecords(query);
        List<Student> sList = new ArrayList<>();
        
        try{
            while(rs.next())
            {
                Student s = new Student();
                s.setName(rs.getString(1));
                s.setAge(rs.getInt(2));
                s.setDob(rs.getString(3));
                s.setCurrentAddress(rs.getString(4));
                s.setPermanentAddress(rs.getString(5));
                s.setCnic(rs.getString(6));
                s.setPhone(rs.getString(7));
                s.setGender(rs.getString(8));
                s.setEmail(rs.getString(9));
                s.setRegNo(rs.getString(10));
                s.setBusPassID(rs.getString(11));
                s.setGuardian(rs.getString(12));
                s.setGuardianContact(rs.getString(13));
                s.setCgpa(rs.getDouble(14));
                s.setSemester(rs.getInt(15));
                s.setBatch(rs.getString(16));
                s.setCreditHours(rs.getInt(17));
                s.setDegreeProgram(rs.getString(18));
                s.setUsername(rs.getString(19));
                s.setPassword(rs.getString(20));
                s.setScholarship(rs.getString(21));
                s.setDepartment(rs.getString(22));
                
                sList.add(s);
            }
            
            return sList;
        }catch(Exception e){
            return null;
        }
    }
    
    public Student getStudentById(String regno)
    {
        String query="select * from student WHERE regno='"+regno+"'";
        System.out.println(query);
        ResultSet rs = db.getById(query);

            try{
                Student s = new Student();
                    while(rs.next())
                    {
                       s.setName(rs.getString(1));
                       s.setAge(rs.getInt(2));
                       s.setDob(rs.getString(3));
                       s.setCurrentAddress(rs.getString(4));
                       s.setPermanentAddress(rs.getString(5));
                       s.setCnic(rs.getString(6));
                       s.setPhone(rs.getString(7));
                       s.setGender(rs.getString(8));
                       s.setEmail(rs.getString(9));
                       s.setRegNo(rs.getString(10));
                       s.setBusPassID(rs.getString(11));
                       s.setGuardian(rs.getString(12));
                       s.setGuardianContact(rs.getString(13));
                       s.setCgpa(rs.getDouble(14));
                       s.setSemester(rs.getInt(15));
                       s.setBatch(rs.getString(16));
                       s.setCreditHours(rs.getInt(17));
                       s.setDegreeProgram(rs.getString(18));
                       s.setUsername(rs.getString(19));
                       s.setPassword(rs.getString(20));
                       s.setScholarship(rs.getString(21));
                    }
                return s;
                }catch(Exception e){
                    return null;
        }
    }
    
        public Student getStudentByName(String name)
    {
        System.out.println("DOA");
        String query="select * from student WHERE name='"+name+"'";
        System.out.println(query);
        ResultSet rs = db.getById(query);

            try{
                Student s = new Student();
                    while(rs.next())
                    {
                       s.setName(rs.getString(1));
                       s.setAge(rs.getInt(2));
                       s.setDob(rs.getString(3));
                       s.setCurrentAddress(rs.getString(4));
                       s.setPermanentAddress(rs.getString(5));
                       s.setCnic(rs.getString(6));
                       s.setPhone(rs.getString(7));
                       s.setGender(rs.getString(8));
                       s.setEmail(rs.getString(9));
                       s.setRegNo(rs.getString(10));
                       s.setBusPassID(rs.getString(11));
                       s.setGuardian(rs.getString(12));
                       s.setGuardianContact(rs.getString(13));
                       s.setCgpa(rs.getDouble(14));
                       s.setSemester(rs.getInt(15));
                       s.setBatch(rs.getString(16));
                       s.setCreditHours(rs.getInt(17));
                       s.setDegreeProgram(rs.getString(18));
                       s.setUsername(rs.getString(19));
                       s.setPassword(rs.getString(20));
                       s.setScholarship(rs.getString(21));
                       s.setDepartment(rs.getString(22));
                    }
                return s;
                }catch(Exception e){
                    return null;
        }
    }
}
