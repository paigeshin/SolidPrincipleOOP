public class Student {

    private String studentId;
    private Date studentDOB; 
    private String address; 

    //save() is tightly coupled to MYSQL
    public void save() {
        // Serialize object into a string representation
        String objectStr = MyUtils.serializeIntoAString(this);
        Connection connection = null; 
        Statement stmt = null; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
            stmt = connection.createStatement();
            stmt.execute("INSERT INTO STUDENT VALUES (" + objectStr + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}

