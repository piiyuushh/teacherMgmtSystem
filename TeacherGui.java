import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
import java.util.ArrayList;


public class TeacherGui{
    
    ArrayList<Teacher> teacherLecturerTutorArrayList = new ArrayList<>();// array list for both lecturer and tutor of type teacher class
    
    // constructor for teacher GUI
    public TeacherGui(){
        JFrame welcome = new JFrame();
        welcome.setVisible(true);
        welcome.setSize(1790,900);
        welcome.setLayout(null);
        welcome.getContentPane().setBackground(new Color(28, 74,13));
        welcome.setTitle("Welcome");
    
        //setting an image as background
        ImageIcon image = new ImageIcon("front.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(image);
        imageLabel.setBounds(-90,0,1790,900);
        welcome.add(imageLabel);
        
        // JButton for enterning into the lecturer system
        JButton lecturerButton = new JButton("Lecturer");
        lecturerButton.setBounds(600,600,100,50);
        lecturerButton.setBackground(Color.white);
        lecturerButton.setForeground(Color.black);
        lecturerButton.setFont(new Font("Arial", Font.BOLD, 12));
        welcome.add(lecturerButton);
        
        // JButton for entering into tutor system
        JButton tutorButton = new JButton("Tutor");
        tutorButton.setBounds(800,600,100,50);
        tutorButton.setBackground(Color.white);
        tutorButton.setForeground(Color.black);
        tutorButton.setFont(new Font("Arial", Font.BOLD, 12));
        welcome.add(tutorButton);
    
    lecturerButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent L){
        //jframme for gui
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(1790,1000);
        frame.setTitle("Lecturer GUI");
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        //Jpanel
        JPanel lecturerSidePanel = new JPanel();
        lecturerSidePanel.setBounds(0,0,200,900);
        lecturerSidePanel.setBackground(new Color(28, 74,13));
        frame.add(lecturerSidePanel);
        
        // JLabel for heading
        JLabel heading = new JLabel("Lecturer GUI");
        heading.setBounds(220,100,500,100);
        heading.setFont(new Font("Arial",Font.BOLD,26));
        heading.setForeground(Color.RED);
        frame.add(heading);
        
        // jlabel and jTextField for teacher ID
        JLabel teacherId = new JLabel("Teacher Id:");
        teacherId.setBounds(250,200,500,50);
        teacherId.setSize(250,30);
        teacherId.setForeground(Color.black); 
        frame.add(teacherId);
        JTextField teacherIdField = new JTextField();
        teacherIdField.setBounds(400,200,500,10);
        teacherIdField.setSize(250,30);
        frame.add(teacherIdField);
        
        // JLabel and JTextArea for teacher name
        JLabel teacherName = new JLabel("Teacher Name:");
        teacherName.setBounds(250,280,500,50);
        teacherName.setSize(250,30);
        teacherName.setForeground(Color.black);
        frame.add(teacherName);
        JTextField teacherNameField = new JTextField();
        teacherNameField.setBounds(400,280,500,50);
        teacherNameField.setSize(250,30);
        frame.add(teacherNameField);
        
        // JLabel and JTextArea for address
        JLabel address = new JLabel("Address:");
        address.setBounds(250,360,500,50);
        address.setSize(250,30);
        address.setForeground(Color.black);
        frame.add(address);
        JTextField addressField = new JTextField();
        addressField.setBounds(400,360,500,50);
        addressField.setSize(250,30);
        frame.add(addressField);
        // JLabel and JTextField for working type
        JLabel workingType = new JLabel("Working Type:");
        workingType.setBounds(250,450,500,50);
        workingType.setSize(250,30);
        workingType.setForeground(Color.black);
        frame.add(workingType);
        JTextField workingTypeField = new JTextField();
        workingTypeField.setBounds(400,450,500,50);
        workingTypeField.setSize(250,30);
        frame.add(workingTypeField);
        
        // JLabel and JTextField for employment status
        JLabel employmentStatus = new JLabel("Employment Status:");
        employmentStatus.setBounds(250,540,500,50);
        employmentStatus.setSize(250,30);
        employmentStatus.setForeground(Color.black);
        frame.add(employmentStatus);
        JTextField employmentStatusField = new JTextField();
        employmentStatusField.setBounds(400,550,500,50);
        employmentStatusField.setSize(250,30);
        frame.add(employmentStatusField);
        //JLabel and JTextField for YearsOfExperience
        JLabel yearsOfExperience = new JLabel("Years of experience:");
        yearsOfExperience.setBounds(250,630,500,50);
        yearsOfExperience.setSize(250,30);
        yearsOfExperience.setForeground(Color.black);
        frame.add(yearsOfExperience);
        JTextField yearsOfExperienceField = new JTextField();
        yearsOfExperienceField.setBounds(400,630,500,50);
        yearsOfExperienceField.setSize(250,30);
        frame.add(yearsOfExperienceField);
        // Jlabel and JText area for department
        JLabel DepartmentLabel= new JLabel("Department");
        DepartmentLabel.setBounds(250,750,250,30);
        DepartmentLabel.setForeground(Color.black);
        frame.add(DepartmentLabel);
        JTextField departmentField= new JTextField();
        departmentField.setBounds(400,750,250,30);
        frame.add(departmentField);
        // JButton to add a lecturer
        JButton addALecturerButton = new JButton("Add a Lecturer");
        addALecturerButton.setBounds(700,280,150,80);
        addALecturerButton.setBackground(Color.red);
        addALecturerButton.setForeground(Color.WHITE);
        addALecturerButton.setFocusPainted(false);
        addALecturerButton.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(addALecturerButton);
        
        JLabel WorkingHoursLabel= new JLabel("Working hours");
        WorkingHoursLabel.setBounds(250,700,500,50);
        WorkingHoursLabel.setForeground(Color.black);
        frame.add(WorkingHoursLabel);
        JTextField WorkingHoursField= new JTextField();
        WorkingHoursField.setBounds(400,700,250,30);
        frame.add(WorkingHoursField);
        
        
        
         addALecturerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (teacherIdField.getText().isEmpty() || teacherNameField.getText().isEmpty() || addressField.getText().isEmpty() || workingTypeField.getText().isEmpty() || 
                            employmentStatusField.getText().isEmpty() || WorkingHoursField.getText().isEmpty() || departmentField.getText().isEmpty() || yearsOfExperienceField.getText().isEmpty()){
                            JOptionPane.showMessageDialog(frame,"Empty fields detected. Fill all the text fields.","Error",JOptionPane.WARNING_MESSAGE);
                            }
                            else{
                                try{
                                    int teacherId = Integer.parseInt(teacherIdField.getText());
                            
                                    for(Teacher teacher: teacherLecturerTutorArrayList){
                                    if(teacher.getteacherid() == teacherId && teacher instanceof Lecturer){
                                        JOptionPane.showMessageDialog(frame,"Tutor is added succesfully.","invalid input",JOptionPane.INFORMATION_MESSAGE);
                                        return;
                                        }
                                    }
                                    
                                }
                                catch(NumberFormatException rr){
                                    JOptionPane.showMessageDialog(frame,"Invalid input for teacher ID.Please enter Integer value.","Alert",JOptionPane.WARNING_MESSAGE);
                                }
                                
                                try{
                                        int workingHours = Integer.parseInt(WorkingHoursField.getText());
                                        
                                        
                                    }
                                    catch(NumberFormatException uu){
                                        JOptionPane.showMessageDialog(frame,"Invalid input for Working Hours. Please enter a integer value.","invalid Input",JOptionPane.WARNING_MESSAGE);
                                    }
                                    
                                try{
                                            int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());
                                        }
                                        catch(NumberFormatException yy){
                                            JOptionPane.showMessageDialog(frame,"Invalid input for years of experice. Please input a Integer value.","invalid input",JOptionPane.WARNING_MESSAGE);
                                        }
                                        
                            }   
                                int teacherId = Integer.parseInt(teacherIdField.getText());
                                String teacherName = teacherNameField.getText();
                                String address = addressField.getText();
                                String workingType = workingTypeField.getText();
                                String employmentStatus = employmentStatusField.getText();
                                int workingHours = Integer.parseInt(WorkingHoursField.getText());
                                String department = departmentField.getText();
                                int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());
                                
                                Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus, department, yearsOfExperience);
                                teacherLecturerTutorArrayList.add(lecturer);
                                
            }
        });


        
        //JButton to grade assignment
        JButton gradeAssignmentButton = new JButton("Grade assignment");
        gradeAssignmentButton.setBounds(700,380,150,80);
        gradeAssignmentButton.setBackground(Color.white);
        gradeAssignmentButton.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(gradeAssignmentButton);
        //creating annother jFrame for grade assignment section
        gradeAssignmentButton.addActionListener(new ActionListener(){
           public void actionPerformed (ActionEvent grd){
               
               // creating another JFrame to grade assignment
               JFrame gradeAssignmentFrame = new JFrame();
               gradeAssignmentFrame.setVisible(true);
               gradeAssignmentFrame.setSize(1790,900);
               gradeAssignmentFrame.setTitle("Grade Assignment");
               gradeAssignmentFrame.setLayout(null);
               gradeAssignmentFrame.getContentPane().setBackground(Color.white);
               //JPanel
               JPanel grdAssignmentPanel = new JPanel();
               grdAssignmentPanel.setBackground(new Color(28, 74,13));
               grdAssignmentPanel.setBounds(0,0,200,900);
               gradeAssignmentFrame.add(grdAssignmentPanel);
               
               //Jlabel for heading
               JLabel gradeAssignmentHeading = new JLabel("Grade Assignment");
               gradeAssignmentHeading.setBounds(220,100,500,100);
               gradeAssignmentHeading.setFont(new Font("Arial",Font.BOLD,26));
               gradeAssignmentHeading.setForeground(Color.RED);
               gradeAssignmentFrame.add(gradeAssignmentHeading);
                
               // JLabel and JTextField for teacher Id in grade assignment
               JLabel teacherIdGrd = new JLabel("Teacher Id:");
               teacherIdGrd.setBounds(250,200,500,50);
               teacherIdGrd.setSize(250,30);
               teacherIdGrd.setForeground(Color.black);
               gradeAssignmentFrame.add(teacherIdGrd);
               JTextField teacherIdGrdField = new JTextField();
               teacherIdGrdField.setBounds(400,200,300,10);
               teacherIdGrdField.setSize(250,30);
               gradeAssignmentFrame.add(teacherIdGrdField);
               
               // JLabel and JTextField for gradedScore in grade assignment
               JLabel gradedScoregrd = new JLabel("Graded score:");
               gradedScoregrd.setBounds(250,280,300,50);
               gradedScoregrd.setSize(250,30);
               gradedScoregrd.setForeground(Color.black);
               gradeAssignmentFrame.add(gradedScoregrd);
               JTextField gradedScoregrdField = new JTextField();
               gradedScoregrdField.setBounds(400,280,300,50);
               gradedScoregrdField.setSize(250,30);
               gradeAssignmentFrame.add(gradedScoregrdField);
               
               // JLabel and JTextField for department in grade assignment
               JLabel departmentgrd = new JLabel("Department");
               departmentgrd.setBounds(250,380,500,50);
               departmentgrd.setSize(250,30);
               departmentgrd.setForeground(Color.black);
               gradeAssignmentFrame.add(departmentgrd);
               JTextField departmentgrdField = new JTextField();
               departmentgrdField.setBounds(400,380,500,50);
               departmentgrdField.setSize(250,30);
               gradeAssignmentFrame.add(departmentgrdField);
                
               //JLabel and JTextField for Years of experience
               JLabel yearsOfExperiencegrd = new JLabel("Years of experience:");
               yearsOfExperiencegrd.setBounds(250,480,300,50);
               yearsOfExperiencegrd.setSize(250,30);
               yearsOfExperiencegrd.setForeground(Color.black);
               gradeAssignmentFrame.add(yearsOfExperiencegrd);
               JTextField yearsOfExperiencegrdField = new JTextField();
               yearsOfExperiencegrdField.setBounds(400,480,300,50);
               yearsOfExperiencegrdField.setSize(250,30);
               gradeAssignmentFrame.add(yearsOfExperiencegrdField);
               // grade assignment button
               JButton gradeAssignmentgrd = new JButton("Grade Assignment");
               gradeAssignmentgrd.setBounds(800,280,300,50);
               gradeAssignmentgrd.setSize(170,50);
               gradeAssignmentgrd.setBackground(Color.red);
               gradeAssignmentgrd.setForeground(Color.white);
               gradeAssignmentgrd.setFont(new Font("Arial",Font.BOLD,12));
               gradeAssignmentFrame.add(gradeAssignmentgrd);
               gradeAssignmentgrd.addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent hh){
                       if(teacherIdField.getText().isEmpty() || teacherNameField.getText().isEmpty() || addressField.getText().isEmpty() || workingTypeField.getText().isEmpty() || employmentStatusField.getText().isEmpty() || yearsOfExperienceField.getText().isEmpty() || departmentField.getText().isEmpty()){
                           JOptionPane.showMessageDialog(frame,"Add lecturer first.","Error",JOptionPane.WARNING_MESSAGE);
                       }
                       else{
                           int teacherId = Integer.parseInt(teacherIdField.getText());
                           String department = departmentField.getText();
                           int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());
                           
                           for (Teacher t:teacherLecturerTutorArrayList){
                              if (t.getteacherid() == teacherId){
                                int gradedScore = Integer.parseInt(gradedScoregrdField.getText());
                                
                                if(t instanceof Lecturer){
                                    Lecturer lecturer = (Lecturer) t;
                                    
                                    lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);
                                    JOptionPane.showMessageDialog(frame,"Assignment is graded."+"\nTeacher Id:"+ teacherId + "\nGraded score:"+ gradedScore ,"Assignment graded succesfully.",JOptionPane.INFORMATION_MESSAGE);
                                    
                                }
                              }
                            }
                       }
                   }
               });
               // clear button
               JButton clearButton = new JButton("clear");
               clearButton.setBounds (800,380,170,50);
               clearButton.setBackground(Color.white);
               clearButton.setForeground(Color.black);
               clearButton.setFont(new Font("Arial",Font.BOLD,12));
               gradeAssignmentFrame.add(clearButton);
               clearButton.addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent jj){
                       int response = JOptionPane.showConfirmDialog(frame,"Are you sure you want to clear?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                       if (response == JOptionPane.YES_OPTION){
                           teacherIdGrdField.setText("");
                           gradedScoregrdField.setText("");
                           departmentgrdField.setText("");
                           yearsOfExperiencegrdField.setText("");
                           
                       }
                       else{
                           JOptionPane.showMessageDialog(frame,"Nothing was cleared.");
                       }
                   }
               });
           }
        });
        //JButton to clear textfields
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(700,480,150,80);
        clearButton.setBackground(Color.white);
        clearButton.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(clearButton);
        clearButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent clr){
               int response = JOptionPane.showConfirmDialog(frame,"Are you sure you want to clear?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
               
               if(response == JOptionPane.YES_OPTION){
                   teacherIdField.setText("");
                   teacherNameField.setText("");
                   addressField.setText("");
                   workingTypeField.setText("");
                   employmentStatusField.setText("");
                   yearsOfExperienceField.setText("");
                   departmentField.setText("");
                   WorkingHoursField.setText("");
               
               }
               else{
                   JOptionPane.showMessageDialog(frame,"Nothing was cleared.");
                   
               }
            }
        });
        //Display button
        JButton displayButton = new JButton("Display");
        displayButton.setBounds(700,580,150,80);
        displayButton.setBackground(Color.red);
        displayButton.setForeground(Color.white);
        displayButton.setFont(new Font("Arial", Font.BOLD, 12));
        displayButton.setFocusPainted(false);
        frame.add(displayButton);
        displayButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent r){
                try{
                int teacherId = Integer.parseInt(teacherIdField.getText());
                String teacherName = teacherNameField.getText();
                String teacherAddress = addressField.getText();
                String workingType = workingTypeField.getText();
                String employmentStatus = employmentStatusField.getText();
                int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());
                String department = departmentField.getText();
                
                if(teacherLecturerTutorArrayList.isEmpty()){
                    JOptionPane.showMessageDialog(frame,"Please add lecturer first.","Error",JOptionPane.WARNING_MESSAGE);
                    
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Teacher Id:"+teacherId+"\nTeacher Name:"+teacherName+"\nAddress:"+teacherAddress+"\nWorking Type:"+workingType+"\nEmployment Status:"+employmentStatus+"\nYears of experience:"+yearsOfExperience,"Lecturer info",JOptionPane.INFORMATION_MESSAGE);
                    
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(frame, "Please add lecturer first. Then proceed to display.", "Error", JOptionPane.WARNING_MESSAGE);
            }
            }
        });
    }
    });
    
    
    //Another JFrame for tutor
    tutorButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent L){
            
        // jframe for GUI
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(1790,1000);
        frame.setTitle("Tutor GUI");
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        //JPanel
        JPanel tutorSidePanel = new JPanel();
        tutorSidePanel.setBounds(0,0,200,900);
        tutorSidePanel.setBackground(new Color(28, 74,13));
        frame.add(tutorSidePanel);
        
        // jlabel for heading
        JLabel heading = new JLabel("Tutor GUI");
        heading.setBounds(220,100,500,100);
        heading.setFont(new Font("Arial",Font.BOLD,26));
        heading.setForeground(Color.red);
        frame.add(heading);
        
        // jlabel and jTextField for teacher ID
        JLabel teacherId = new JLabel("Teacher Id:");
        teacherId.setBounds(250,200,500,50);
        teacherId.setSize(250,30);
        teacherId.setForeground(Color.black);
        frame.add(teacherId);
        JTextField teacherIdField = new JTextField();
        teacherIdField.setBounds(400,200,500,10);
        teacherIdField.setSize(250,30);
        frame.add(teacherIdField);
        
        // JLabel and JTextArea for teacher name
        JLabel teacherName = new JLabel("Teacher Name:");
        teacherName.setBounds(250,280,500,50);
        teacherName.setSize(250,30);
        teacherName.setForeground(Color.black);
        frame.add(teacherName);
        JTextField teacherNameField = new JTextField();
        teacherNameField.setBounds(400,280,500,50);
        teacherNameField.setSize(250,30);
        frame.add(teacherNameField);
        
        // JLabel and JTextArea for address
        JLabel address = new JLabel("Address:");
        address.setBounds(250,360,500,50);
        address.setSize(250,30);
        address.setForeground(Color.black);
        frame.add(address);
        JTextField addressField = new JTextField();
        addressField.setBounds(400,360,500,50);
        addressField.setSize(250,30);
        frame.add(addressField);
        // JLabel and JTextField for working type
        JLabel workingType = new JLabel("Working Type:");
        workingType.setBounds(250,450,500,50);
        workingType.setSize(250,30);
        workingType.setForeground(Color.black);
        frame.add(workingType);
        JTextField workingTypeField = new JTextField();
        workingTypeField.setBounds(400,450,500,50);
        workingTypeField.setSize(250,30);
        frame.add(workingTypeField);
        // JLabel and JTextField for employment status
        JLabel employmentStatus = new JLabel("Employment Status:");
        employmentStatus.setBounds(250,540,500,50);
        employmentStatus.setSize(250,30);
        employmentStatus.setForeground(Color.black);
        frame.add(employmentStatus);
        JTextField employmentStatusField = new JTextField();
        employmentStatusField.setBounds(400,540,500,50);
        
        employmentStatusField.setSize(250,30);
        frame.add(employmentStatusField);
        
        // JLabel and JTextField for salary of tutor
        JLabel salaryLabel = new JLabel("Salary:");
        salaryLabel.setBounds(250,640,500,50);
        salaryLabel.setSize(250,30);
        salaryLabel.setForeground(Color.black);
        frame.add(salaryLabel);
        JTextField salaryField = new JTextField();
        salaryField.setBounds(400,640,500,50);
        salaryField.setSize(250,30);
        frame.add(salaryField);
        
        // JLabel and JTextField for specialization
        JLabel specialization = new JLabel("Specialization:");
        specialization.setBounds(250,740,500,50);
        specialization.setSize(250,30);
        specialization.setForeground(Color.black);
        frame.add(specialization);
        JTextField specializationField = new JTextField();
        specializationField.setBounds(400,740,500,50);
        specializationField.setSize(250,30);
        frame.add(specializationField);
        
        // JLabel and JTextField for academic qualification
        JLabel academicQualification = new JLabel("Academic Qualification:");
        academicQualification.setBounds(660,200,500,50);
        academicQualification.setSize(250,30);
        academicQualification.setForeground(Color.black);
        frame.add(academicQualification);
        JTextField academicQualificationField = new JTextField();
        academicQualificationField.setBounds(800,200,500,50);
        academicQualificationField.setSize(250,30);
        frame.add(academicQualificationField);
        
        //JLabel and JTextField for performance index
        JLabel performanceIndex = new JLabel("Performance index:");
        performanceIndex.setBounds(660,300,500,50);
        performanceIndex.setSize(250,30);
        performanceIndex.setForeground(Color.black);
        frame.add(performanceIndex);
        JTextField performanceIndexField = new JTextField();
        performanceIndexField.setBounds(800,300,500,50);
        performanceIndexField.setSize(250,30);
        frame.add(performanceIndexField);
        
        JLabel WorkingHoursLabel = new JLabel("Working hours:");
        WorkingHoursLabel.setBounds(660,400,250,30);
        JTextField WorkingHoursField = new JTextField();
        WorkingHoursField.setBounds(800,400,250,30);
        frame.add(WorkingHoursLabel);
        frame.add(WorkingHoursField);
        // JButton to add a tutor
        JButton addTutorButton = new JButton("Add Tutor");
        addTutorButton.setBounds(1100,200,150,50);
        addTutorButton.setBackground(Color.red);
        addTutorButton.setForeground(Color.black);
        addTutorButton.setFocusPainted(false);
        addTutorButton.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(addTutorButton);
        addTutorButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent b){
                if(teacherIdField.getText().isEmpty() || teacherNameField.getText().isEmpty() || addressField.getText().isEmpty() || workingTypeField.getText().isEmpty() || 
                            employmentStatusField.getText().isEmpty() || WorkingHoursField.getText().isEmpty() || salaryField.getText().isEmpty() || specializationField.getText().isEmpty() ||
                             academicQualificationField.getText().isEmpty() || performanceIndexField.getText().isEmpty()){
                                JOptionPane.showMessageDialog(frame,"Empty field detected. Please fill all the Text Fields.","Invalid Input",JOptionPane.WARNING_MESSAGE);
                             }
                             
                             
                            else{
                                try{
                                    int teacherId = Integer.parseInt(teacherIdField.getText());
                                    for(Teacher teacher: teacherLecturerTutorArrayList){
                                        if(teacher.getteacherid() == teacherId && teacher instanceof Tutor){
                                            JOptionPane.showMessageDialog(frame,"Teacher ID "+ teacherId +" already exists. Please enter another Tutor.","Invalid ID",JOptionPane.WARNING_MESSAGE);
                                            return;
                                        }
                                        
                                    }
                                    
                                    try{
                                        double salary = Double.parseDouble(salaryField.getText());
                                          
                                    }
                                    catch(NumberFormatException e){
                                        JOptionPane.showMessageDialog(frame,"Invalid input for salary. Please enter a Integer value.","Invalid Input",JOptionPane.WARNING_MESSAGE);
                                    }
                                    try{
                                            int workingHours = Integer.parseInt(WorkingHoursField.getText());
                                            
                                        
                                        }
                                        catch(NumberFormatException e){
                                            JOptionPane.showMessageDialog(frame,"Invalid Input for working hours. Please enter a INteger value.","Invalid Input",JOptionPane.WARNING_MESSAGE);

                                        }
                                    try{
                                                int performanceIndex = Integer.parseInt(performanceIndexField.getText());
                                                JOptionPane.showMessageDialog(frame,"Tutor added successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            catch(NumberFormatException e){
                                                JOptionPane.showMessageDialog(frame,"Invalid input for performace index. Please enter a Integer value.","Invalid Input",JOptionPane.WARNING_MESSAGE);
                                            }
                                }
                                catch(NumberFormatException e){
                                    JOptionPane.showMessageDialog(frame,"Invalid input for teacher ID. Please enter a Integer value.","Invalid Inp",JOptionPane.WARNING_MESSAGE);
                                    return;
                                }
                            }
                            
                            int teacherId = Integer.parseInt(teacherIdField.getText());
                            String teacherName = teacherNameField.getText();
                            String address = addressField.getText();
                            String workingType = workingTypeField.getText();
                            String employmentStatus = employmentStatusField.getText();
                            int workingHours = Integer.parseInt(WorkingHoursField.getText());
                            double salary = Double.parseDouble(salaryField.getText());
                            String specialization = specializationField.getText();
                            String academicQualifications = academicQualificationField.getText();
                            int performanceIndex = Integer.parseInt(performanceIndexField.getText());
                                
                            Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualifications, performanceIndex);
                            teacherLecturerTutorArrayList.add(tutor);
                            

            }
        });
 
        //JButton to clear textfields
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(1100,600,150,50);
        clearButton.setBackground(Color.red);
        clearButton.setForeground(Color.black);
        clearButton.setFocusPainted(false);
        clearButton.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(clearButton);
        clearButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent clr){
               int response = JOptionPane.showConfirmDialog(frame,"Are you sure you want to clear?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
               
               if (response == JOptionPane.YES_OPTION){
                   teacherIdField.setText("");
                   teacherNameField.setText("");
                   addressField.setText("");
                   workingTypeField.setText("");
                   workingTypeField.setText("");
                   employmentStatusField.setText("");
                   salaryField.setText("");
                   specializationField.setText("");
                   academicQualificationField.setText("");
                   performanceIndexField.setText("");
                   WorkingHoursField.setText("");
               }
               else{
                   JOptionPane.showMessageDialog(frame,"Nothing was cleared.");
               }
            }
        });
        //set salary button for tutor
        JButton setSalaryButton = new JButton("Set salary");
        setSalaryButton.setBounds(1100,500,150,50);
        setSalaryButton.setBackground(Color.white);
        setSalaryButton.setForeground(Color.black);
        frame.add(setSalaryButton);
        setSalaryButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aa){
                if(teacherIdField.getText().isEmpty() || teacherNameField.getText().isEmpty() || addressField.getText().isEmpty() || workingTypeField.getText().isEmpty() || 
                            employmentStatusField.getText().isEmpty() || WorkingHoursField.getText().isEmpty() || salaryField.getText().isEmpty() || specializationField.getText().isEmpty() ||
                             academicQualificationField.getText().isEmpty() || performanceIndexField.getText().isEmpty()){
                                JOptionPane.showMessageDialog(frame,"Please fill all the Text Fields.","Invalid Input",JOptionPane.WARNING_MESSAGE);
                             }
                else{
                    try{
                        int teacherId = Integer.parseInt(teacherIdField.getText());
                    }
                    catch(NumberFormatException err){
                        JOptionPane.showMessageDialog(frame,"Please enter correct value for techerId.");
                    }
                    try{
                        int workingHours = Integer.parseInt(WorkingHoursField.getText());
                    }
                    catch(NumberFormatException ee){
                        JOptionPane.showMessageDialog(frame,"Please enter correct value for working hours.");
                    }
                    
                    try{
                        double salary = Double.parseDouble(salaryField.getText());
                    } catch(NumberFormatException gg){
                        JOptionPane.showMessageDialog(frame,"Please enter correct value for salary.");
                    }
                    try{
                        int performanceIndex = Integer.parseInt(performanceIndexField.getText());
                        double salary = Double.parseDouble(salaryField.getText());
                        for(Teacher teacher : teacherLecturerTutorArrayList){
                            if(teacher instanceof Tutor){
                                    Tutor tutor = (Tutor) teacher;
                                    tutor.setsalary(salary, performanceIndex);
                                    
                                    double salaryTutor = tutor.getsalary();
                                    int performanceIndextutor = tutor.getperformanceIndex();
                                    JOptionPane.showMessageDialog(frame,"\nSalary is set to: " + salaryTutor + "\nPerformance index:"+ performanceIndextutor);
                                    break;
                                }
                            else{
                                JOptionPane.showMessageDialog(frame,"LLLLL");
                                
                            }
                        }
                    }
                    catch(NumberFormatException ff){
                        JOptionPane.showMessageDialog(frame,"Please enter correct value for performance index.");
                    }
                }
            }
        });
        
        // remove tutor button
        JButton removeTutorButton = new JButton("Remove Tutor");
        removeTutorButton.setBounds(1100,300,150,50);
        removeTutorButton.setBackground(Color.white);
        removeTutorButton.setForeground(Color.black);
        frame.add(removeTutorButton);
        removeTutorButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ff){
                try{
                    if(teacherIdField.getText().isEmpty() || teacherNameField.getText().isEmpty() || addressField.getText().isEmpty() || workingTypeField.getText().isEmpty() || 
                            employmentStatusField.getText().isEmpty() || WorkingHoursField.getText().isEmpty() || salaryField.getText().isEmpty() || specializationField.getText().isEmpty() ||
                             academicQualificationField.getText().isEmpty() || performanceIndexField.getText().isEmpty()){
                                JOptionPane.showMessageDialog(frame,"Tutor is not added yet.","Error",JOptionPane.WARNING_MESSAGE);
                             }
                    int teachertutorId = Integer.parseInt(teacherIdField.getText());
                    
                    for(Teacher teaceherremove : teacherLecturerTutorArrayList){
                        if(teaceherremove.getteacherid() == teachertutorId){
                            if(teaceherremove instanceof Tutor){
                                Tutor tutor = (Tutor) teaceherremove;
                                tutor.removeTutor();
                                double totalSalary = tutor.getsalary();
                                String specialization = tutor.getspecialization();
                                String academicQualification = tutor.getacademicQualification();
                                int performanceIndex = tutor.getperformanceIndex();
                                boolean isCertified = tutor.getisCertified();
                                
                                if(!isCertified){
                                    JOptionPane.showMessageDialog(frame,"Tutor removed succesfully.","\nSalary:"+totalSalary+"\nSpecialization:"+specialization+"\nAcademic Qualification:"+academicQualification+"Performance Index:"+performanceIndex,JOptionPane.INFORMATION_MESSAGE);
                                    
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame,"Tutor is certified hence cannot be removed.","Tutor not removed",JOptionPane.INFORMATION_MESSAGE);
                                    
                                }
                                teacherIdField.setText("");
                               teacherNameField.setText("");
                               addressField.setText("");
                               workingTypeField.setText("");
                               workingTypeField.setText("");
                               employmentStatusField.setText("");
                               salaryField.setText("");
                               specializationField.setText("");
                               academicQualificationField.setText("");
                               performanceIndexField.setText("");
                               WorkingHoursField.setText("");
                               
                            }
                        }
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(frame,"An exception occured.");
                }
            }
        });
        //Display button
        JButton displayButton = new JButton("Display");
        displayButton.setBounds(1100,700,150,50);
        displayButton.setBackground(Color.red);
        displayButton.setForeground(Color.white);
        displayButton.setFont(new Font("Arial", Font.BOLD, 12));
        displayButton.setFocusPainted(false);
        frame.add(displayButton);
        displayButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent rf){
                try{
                int teacherId = Integer.parseInt(teacherIdField.getText());
                String teacherName = teacherNameField.getText();
                String teacherAddress = addressField.getText();
                String workingType = workingTypeField.getText();
                String employmentStatus = employmentStatusField.getText();
                Double salary = Double.parseDouble(salaryField.getText());
                String specialization = specializationField.getText();
                String academicQualification = academicQualificationField.getText();
                int performanceIndex = Integer.parseInt(performanceIndexField.getText());
                
                if(teacherLecturerTutorArrayList.isEmpty()){
                    JOptionPane.showMessageDialog(frame,"Please fill all the details. Then proceed to display.");
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Teacher Id:"+teacherId+"\nTeacher Name:"+teacherName+"\nAddress:"+teacherAddress+"\nWorking Type:"+workingType+"\nEmployment Status:"+employmentStatus+"\nSalary:"+salary+"\nSpecialization:"+specialization+"\nAcademic Qualification:"+academicQualification+"\nPerformance Index:"+performanceIndex,"Tutor Info",JOptionPane.INFORMATION_MESSAGE);
                }
                }
                catch(Exception n){
                    JOptionPane.showMessageDialog(frame, "Empty fields detected. Please complete filling all the text fields.", "Error", JOptionPane.WARNING_MESSAGE);
                }
                
            }
        });
            }
    });
            }
            
    
    public static void main(String []args){
        new TeacherGui();
    }
    }