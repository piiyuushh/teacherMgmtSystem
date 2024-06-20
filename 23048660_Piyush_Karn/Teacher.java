public class Teacher {
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    
    //constructors
    public Teacher (int teacherId, String teacherName, String address,String workingType, String employmentStatus){
        this.teacherId = teacherId;
        this.teacherName=teacherName;
        this.address=address;
        this.workingType=workingType;
        this.employmentStatus=employmentStatus;
        
    }
    
    //accessor methods
    public int getteacherid(){
        return this.teacherId;
        
    }
    public String getteachername(){
        return this.teacherName;
        
    }
    public String getaddress(){
        return this.address;
        
    }
    public String getworkingtype(){
        return this.workingType;
    }
    public String getemploymentstatus(){
        return this.employmentStatus;
        
    }
    public int getworkinghours(){
        return this.workingHours;
        
    }
    //setter method for working hours
    public void setworkingHours(int workingHours){
        this.workingHours=workingHours;
    }
    
    //display method
    public void displaydetails(){
        System.out.println("Teacher Id:"+ teacherId);
        System.out.println("Teacher name:"+  teacherName);
        System.out.println("Address:"+  address);
        System.out.println("Working type:"+ workingType);
        System.out.println("Employment status:"+ employmentStatus);
        System.out.println("Working hours:"+ workingHours);
        //using conditional statement to working hours according to the question
        if (workingHours > 0) {
            System.out.println("Working hours:" + workingHours);
        }
        else {
            System.out.println("Working hours: not assigned.");
        }
    }
}