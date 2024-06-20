public class Tutor extends Teacher {
    private double salary;
    private String specialization;
    private String academicQualification;
    private int performanceIndex;
    private boolean isCertified;
    
    //constructor accepting 10 parameters
    public Tutor (int teacherId, String teacherName, String address, String workingType,String employmentStatus,
    int workingHours, double salary, String specialization,String academicQualification, int performanceIndex)
    {
        //calling super class constructor
        super (teacherId, teacherName, address, workingType, employmentStatus);
        
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualification = academicQualification;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;  //isCertified is initially assigned to false
        
    }
    
    //accessor methods fot all attributes
    public double getsalary(){
        return this.salary;
    }
    public String getspecialization(){
        return this.specialization;
        
    }
    public String getacademicQualification(){
        return this.academicQualification;
        
    }
    public int getperformanceIndex(){
        return this.performanceIndex;
        
    }
    public boolean getisCertified(){
        return this.isCertified;
        
    }
    //mutator method for salary
    public void setsalary ( double newsalary, int newperformanceIndex) {
        if(newperformanceIndex > 5 && getworkinghours()>20){
            double appraisal = 0.0;
            
            
            if (newperformanceIndex >=5 && newperformanceIndex<=7){
                appraisal = 0.05;
                
            }
            else if(newperformanceIndex >= 8 && newperformanceIndex <=9){
                appraisal = 0.10;
                
            }
            else if(newperformanceIndex == 10){
                appraisal = 0.20;
                
            }
            
            double updatedsalary = salary+(appraisal*salary);
            this.salary = updatedsalary;
            this.performanceIndex = newperformanceIndex;
            isCertified = true;
            
        }
        else {
            System.out.println("salary is not approved.");
            
        }
    }
    
    //method to remove tutor
    public void removeTutor() {
        if (isCertified) {
            this.salary = 0.0;
            this.specialization = "";
            this.academicQualification = "";
            this.performanceIndex = 0;
            this.isCertified = false ;
            
        }
        else {
            System.out.println("cannot remove the certified teacher.");
        }
    }
    
    //method overloading
    public void displaydetails(){
        if (this.isCertified){
            //calling display method of parent/super class
            super.displaydetails();
            System.out.println ("Salary:" +salary);
            System.out.println("Specialiazation:" +specialization);
            System.out.println("Academic Qualification:" +academicQualification);
            System.out.println("Performance Index:" +performanceIndex);
            
        }
        else {
            super.displaydetails();
            System.out.println("Salary:" +salary);
            System.out.println("Specialization:" +specialization);
            System.out.println("Academic qualification:" +academicQualification);
            System.out.println("Performance Index:" +performanceIndex);
            
        }
    }
}