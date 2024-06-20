public class Lecturer extends Teacher {
    //attributes
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    String result;
    
    //constructors
    public Lecturer (int teacherid, String teachername, String address, String workingtype, String employmentstatus,String department,
                      int yearsOfExperience)
    {
        //calling super class constructor with setter method
        super (teacherid, teachername, address, workingtype, employmentstatus);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;       //graded score is initially assigned to 0
        this.hasGraded = false;    //has graded is initially assigned to boolean value: false
    }
    
    //accessor methods for all attributes
    public String getdepartment(){
        return this.department;
        
    }
    public int  getyearsofexperience(){
        return this.yearsOfExperience;
        
    }
    public int getgradedscore(){
        return this.gradedScore;
        
    }
    public boolean hasgraded(){
        return this.hasGraded;
        
    }
    
    //mutator(setter) method for gradedscore
    public void setgradedscore (int gradedscore){
        this.gradedScore = gradedScore;
    }
    
    //method to grade assignment for students who submitted their assignments on time
    public void gradeAssignment (int gradedScore, String department, int yearsOfExperience){
        //using if condition to check yearsOfExperience and department
        
        if (yearsOfExperience >= 5 && department.equals("IT")){
               if (gradedScore >= 70){
                    this.result= "A";
                    
                }
                else if (gradedScore >= 60){
                    this.result = "B";
                }
                else if(gradedScore >= 50) {
                    this.result = "C";
                    
                }
                else if(gradedScore >= 40) {
                    this.result = "D";
                     
                }
                else
                {
                    this.result = "E";
                }
               hasGraded = true;
               
            }
            else {
                System.out.println("not graded by the lecturer.");
            }
            }
            
           
    //display method for lecturer
    public void displaydetails(){
        //calling display method of teacher class
        super.displaydetails();
        System.out.println("Department:" + department);
        System.out.println("Years of experience:" + yearsOfExperience);
                
        if (hasGraded) {
            System.out.println("Graded score:" +this.result);
                    
        }
        else {
             System.out.println("assignment has not been graded yet.");
                    
        }
    }
}
