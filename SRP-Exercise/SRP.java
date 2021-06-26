public class Employee {
    private String employeeId;
    private String employeeName;
    private String employeeAddress;
    private String contactNumber;
    private String employeeType; 

    public void save() {
        new EmployeeRepository().save(this);
    }

    public void calculateText() {
        new TaxCaclulator().calculateTax(this);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId() {
        this.employeeId = employeeId;
    }

    // other get set .... for other fields

}

class EmployeeRepository {
    public void saveEmployee(Employee employee) {
        // Serialize object into a string representation
        String objectStr = MyUtils.serializeIntoAString(this);
        Connection connection = null; 
        Statement stmt = null ;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost::3306/MyDb", "root", "password");
            stmt = connection.createStatement();
            stmt.execute("INSERT INTO EMPLOYEE VALUES (" + objectStr + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class TaxCaclulator {

    public void calculateTax(Employee employee) {
        if(employee.getEmployeeType().equals("fulltime")) {
            // Tax Calc for full time employee
        } 
        if(employee.getEmployeeType().equals("contract")) {
            // Tax Calc for contractors
        }
    }

}