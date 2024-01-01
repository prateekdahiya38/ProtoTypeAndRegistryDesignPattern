package prototypeRegistryDesignPattern;

public class Cllient {
    public static void main(String[] args) {


        // Proto type of student of batch name April 2024
        Student protoApril2024 = new Student();
        protoApril2024.setBatchName("April24");
        protoApril2024.setAvgBatchPsp(90.00);
        protoApril2024.setInstructorName("Naman");
        protoApril2024.setMonthOfEnrollment("0424");
        protoApril2024.setCurrentModule("DSA");

        // Proto type of student of batch Name May 2024
        Student protoMay2024 = new Student();
        protoMay2024.setAvgBatchPsp(89.00);
        protoMay2024.setBatchName("May24");
        protoMay2024.setInstructorName("Sandeep");
        protoMay2024.setMonthOfEnrollment("0524");
        protoMay2024.setCurrentModule("DSA");





        // For multiple ProtoType Registery is here
        StudentRegistry streg = new StudentRegistry();
        streg.register("April24", protoApril2024);
        streg.register("May24", protoMay2024);






        // Student dharmesh object created of April 2024 batch;
        Student dharmeshApril24 = streg.get("April24").copy();
        dharmeshApril24.setName("Dharmesh");
        dharmeshApril24.setEmial("dharmesh@scaler.com");
        dharmeshApril24.setPhoneNo("123456789");

        // Student Prateek object created of April 2024 batch;
        Student prateekApril24 = streg.get("April24").copy();
        prateekApril24.setName("Prateek");
        prateekApril24.setEmial("prateekh@scaler.com");
        prateekApril24.setPhoneNo("987654321");






        // Student Dharmu object created of May 2024 batch;
        Student dharmuMay24 = streg.get("May24").copy();
        dharmuMay24.setName("Dharmu");
        dharmuMay24.setEmial("dharmu@scaler.com");
        dharmuMay24.setPhoneNo("915782018");

        // Student Pratu object created of May 2024 batch;
        Student pratuMay24 = streg.get("May24").copy();
        pratuMay24.setName("Dharmu");
        pratuMay24.setEmial("dharmu@scaler.com");
        pratuMay24.setPhoneNo("915782018");
    }
}
