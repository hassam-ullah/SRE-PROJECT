
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
private final Database db;

     public EmployeeDAO(){
        db=new Database();
        db.init();
     }
    public void insertEmployee(Employee e)
    {
        System.out.println("DOA");
        String query,status;
        query="insert into employee(name, age, dob, currentAddress, permanentAddress, cnic, phone, gender, email, employeeID, salary, shift, status, jobTitle, department, maritalStatus, taxID, username, password) "
                + "values"+"('"+e.getName()+"',"+e.getAge()+",'"+e.getDob()+"','"+e.getCurrentAddress()+"','"+e.getPermanentAddress()+"','"+e.getCnic()+"','"+e.getPhone()+"','"+e.getGender()+"','"+e.getEmail()+"','"+e.getEmployeeID()+"',"+e.getSalary()+",'"+e.getShift()+"','"+e.getStatus()+"','"+e.getJobTitle()+"','"+e.getDepartment()+"','"+e.getMaritalStatus()+"',"+e.getTaxIdNumber()+",'"+e.getUsername()+"','"+e.getPassword()+"')";
        System.out.println(query);
        status=db.insertRecord(query);
        System.out.println(status);
    }
    public List<Employee> viewAllEmployees()
    {
        String query;
        query="select * from employee";
        List<Employee> eList = new ArrayList<>();
        
        ResultSet rs = db.getAllRecords(query);
        
        
        try{
            while(rs.next())
            {
                Employee e = new Employee();
                e.setName(rs.getString(1));
                e.setAge(rs.getInt(2));
                e.setDob(rs.getString(3));
                e.setCurrentAddress(rs.getString(4));
                e.setPermanentAddress(rs.getString(5));
                e.setCnic(rs.getString(6));
                e.setPhone(rs.getString(7));
                e.setGender(rs.getString(8));
                e.setEmail(rs.getString(9));
                e.setEmployeeID(rs.getString(10));
                e.setSalary(rs.getDouble(11));
                e.setShift(rs.getString(12));
                e.setStatus(rs.getString(13));
                e.setJobTitle(rs.getString(14));
                e.setDepartment(rs.getString(15));
                e.setMaritalStatus(rs.getString(16));
                e.setTaxIdNumber(rs.getString(17));
                e.setUsername(rs.getString(18));
                
                eList.add(e);
            }
            return eList;
        }catch(Exception e){
            return null;
        }
        
    }
    
    public Employee getEmployeeByID(String id)
    {
        String query="select * from employee WHERE employeeID='"+id+"'";
        System.out.println(query);
        ResultSet rs = db.getById(query);

            try{
                Employee e = new Employee();
                    while(rs.next())
                    {
                       e.setName(rs.getString(1));
                       e.setAge(rs.getInt(2));
                       e.setDob(rs.getString(3));
                       e.setCurrentAddress(rs.getString(4));
                       e.setPermanentAddress(rs.getString(5));
                       e.setCnic(rs.getString(6));
                       e.setPhone(rs.getString(7));
                       e.setGender(rs.getString(8));
                       e.setEmail(rs.getString(9));
                       e.setEmployeeID(rs.getString(10));
                       e.setSalary(rs.getDouble(11));
                       e.setShift(rs.getString(12));
                       e.setStatus(rs.getString(13));
                       e.setJobTitle(rs.getString(14));
                       e.setDepartment(rs.getString(15));
                       e.setMaritalStatus(rs.getString(16));
                       e.setTaxIdNumber(rs.getString(17));
                       e.setUsername(rs.getString(18));
                       
                    }
                return e;
                }catch(Exception e){
                    return null;
        }
    }
    
    public Employee getEmployeeByName(String name)
    {
        String query="select * from employee WHERE name='"+name+"'";
        System.out.println(query);
        ResultSet rs = db.getById(query);

            try{
                Employee e = new Employee();
                    while(rs.next())
                    {
                       e.setName(rs.getString(1));
                       e.setAge(rs.getInt(2));
                       e.setDob(rs.getString(3));
                       e.setCurrentAddress(rs.getString(4));
                       e.setPermanentAddress(rs.getString(5));
                       e.setCnic(rs.getString(6));
                       e.setPhone(rs.getString(7));
                       e.setGender(rs.getString(8));
                       e.setEmail(rs.getString(9));
                       e.setEmployeeID(rs.getString(10));
                       e.setSalary(rs.getDouble(11));
                       e.setShift(rs.getString(12));
                       e.setStatus(rs.getString(13));
                       e.setJobTitle(rs.getString(14));
                       e.setDepartment(rs.getString(15));
                       e.setMaritalStatus(rs.getString(16));
                       e.setTaxIdNumber(rs.getString(17));
                       e.setUsername(rs.getString(18));
                       
                    }
                return e;
                }catch(Exception e){
                    return null;
        }
    }
    public void updateEmployeeRecord(Employee e)
    {
        String query,status;
        query="UPDATE employee SET name='"+e.getName()+"', age="+Integer.toString(e.getAge())+", dob='"+e.getDob()+"', currentAddress='"+e.getCurrentAddress()+"', permanentAddress='"+e.getPermanentAddress()+"', cnic='"+e.getCnic()+"', phone='"+e.getPhone()+"', gender='"+e.getGender()+"', email='"+e.getEmail()+"', employeeID='"+e.getEmployeeID()+"', salary="+e.getSalary()+", shift='"+e.getShift()+"', status='"+e.getStatus()+"', jobTitle='"+e.getJobTitle()+"', department='"+e.getDepartment()+"', maritalStatus='"+e.getMaritalStatus()+"', taxID='"+e.getTaxIdNumber()+", username='"+e.getUsername()+"' WHERE username='"+e.getEmployeeID()+"'";                                                    
        
        
        System.out.println(query);
        status=db.updateRecord(query);
        System.out.println(status);
    }
}
