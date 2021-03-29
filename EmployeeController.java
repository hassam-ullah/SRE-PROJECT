public class EmployeeController {
    public EmployeeController()
    {
        
    }
    public void addEmployee(String name,String email,String phone,String cnic,String ca,String pa,String date,
            String gender,int age,String ms,String jt,String eid,String ws,String js,String dept,double salary,String tin)
    {
        Employee e = new Employee();
                e.setName(name);
                e.setEmail(email);
                e.setPhone(phone);
                e.setCnic(cnic);
                e.setCurrentAddress(ca);
                e.setPermanentAddress(pa);
                e.setDob(date);
                e.setGender(gender);
                e.setAge(age);
                e.setMaritalStatus(ms);
                e.setJobTitle(jt);
                e.setEmployeeID(eid);
                e.setShift(ws);
                e.setStatus(js);
                e.setDepartment(dept);
                e.setSalary(salary);
                e.setTaxIdNumber(tin);
                e.setUsername(eid);
                e.setPassword("123");

        e.addEmployee(e);
    }
        public Employee findEmployeeByID(String id)
        {
            EmployeeDAO eta = new EmployeeDAO();
            Employee e = eta.getEmployeeByID(id);
            return e;
        }
        public Employee findEmployeeByName(String name)
        {
            EmployeeDAO eta = new EmployeeDAO();
            Employee e = eta.getEmployeeByName(name);
            return e;
        }
        
        public void updateEmployee(
                String name, 
                int age, 
                String dob, 
                String ca, 
                String pa, 
                String cnic, 
                String phone, 
                String gender, 
                String email, 
                String eid,
                double salary,
                String shift,
                String status,
                String jt,
                String dept,
                String ms,
                String tin,
                String username
                ){
		Employee e = new Employee();
                e.setName(name);
                e.setAge(age);
                e.setDob(dob);
                e.setCurrentAddress(ca);
                e.setPermanentAddress(pa);
                e.setCnic(cnic);
                e.setPhone(phone);
                e.setGender(gender);
                e.setEmail(email);
                e.setEmployeeID(eid);
                e.setSalary(salary);
                e.setShift(shift);
                e.setStatus(status);
                e.setJobTitle(jt);
                e.setDepartment(dept);
                e.setMaritalStatus(ms);
                e.setTaxIdNumber(tin);
                e.setUsername(username);
                
                 System.out.println("Controller");
                
                 
                 e.updateEmployee(e);
	}
}
