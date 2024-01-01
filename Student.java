package prototypeRegistryDesignPattern;

public class Student {
    // Attributes block start here -----------------------------------------------------
    private String batchName;
    private double avgBatchPsp;
    private String instructorName;
    private String monthOfEnrollment;
    private String currentModule;
    private String name;
    private String phoneNo;
    private String emial;

    // ---------------------------------------------------------------------------------------

    // Constructor Block start here -------------------------------------------------

    public Student(String batchName, double avgBatchPsp, String instructorName, String monthOfEnrollment, String currentModule, String name, String phoneNo, String emial) {
        this.batchName = batchName;
        this.avgBatchPsp = avgBatchPsp;
        this.instructorName = instructorName;
        this.monthOfEnrollment = monthOfEnrollment;
        this.currentModule = currentModule;
        this.name = name;
        this.phoneNo = phoneNo;
        this.emial = emial;
    }


    public Student(){
        // empty Constructor
    }

    // -------------------------------------------------------------------------------------------------

    // Methods block start here ------------------------------------------------------------------------
    public Student copy(){
        Student st = new Student();
        st.batchName = this.batchName;
        st.avgBatchPsp = this.avgBatchPsp;
        st.instructorName = this.instructorName;
        st.monthOfEnrollment = this.monthOfEnrollment;
        st.currentModule = this.currentModule;
        return st;
    }
    //------------------------------------------------------------
    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
    //------------------------------------------------------------
    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }
    //------------------------------------------------------------
    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    //------------------------------------------------------------
    public String getMonthOfEnrollment() {
        return monthOfEnrollment;
    }

    public void setMonthOfEnrollment(String monthOfEnrollment) {
        this.monthOfEnrollment = monthOfEnrollment;
    }
    //------------------------------------------------------------
    public String getCurrentModule() {
        return currentModule;
    }

    public void setCurrentModule(String currentModule) {
        this.currentModule = currentModule;
    }
    //------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //------------------------------------------------------------
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    //------------------------------------------------------------
    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

}
