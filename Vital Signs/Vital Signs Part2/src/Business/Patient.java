package Business;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javafx.print.Collation;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author India
 */
public class Patient {
    String firstName;
    
        String lastName;
        ArrayList<VitalSigns> vsh = new ArrayList<VitalSigns>();
        VitalSigns latest = new VitalSigns();
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Patient{" + "firstName=" + firstName + ", lastName=" + lastName + '}';
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
        
    public static void main(String args[]){
        
       
       Scanner s = new Scanner(System.in);
        
        Patient p = new Patient();
        
       
        System.out.println("Enter First Name");
        String firstName = s.nextLine();
        p.firstName = firstName;
        
        System.out.println("Enter Last Name");
        String lastName = s.nextLine();
        p.lastName = lastName;
        
        int menu = 0;
        do{
            System.out.println("Menu");
            System.out.println("1) Submit new Vital Sign\n2)View Vital Sign History \n3)Check if Patient's Vitals are normal or not \n4) Exit");
            menu = s.nextInt();
            switch(menu){
                case 1:{
                    p.addVitalSign();
                    break;
                }
                case 2:{
                    p.viewVitalSign();
                    break;
                }
                case 3:{
                    System.out.println(""+p.checkVitalSign());
                    break;
                }
            }
        }while(menu <= 3);
        
    }
    public void addVitalSign(){
        Scanner s = new Scanner(System.in);
        VitalSigns vs = new VitalSigns();
        System.out.println("Enter Year of Birth: ");
        int year = s.nextInt();
        vs.setYear(year);

        System.out.println("Enter Month of Birth: ");
        int month = s.nextInt();
        vs.setMonth(month);

        System.out.println("Enter Day of Birth: ");
        int day = s.nextInt();
        vs.setDay(day);

        System.out.println("Enter Respiratory Rate of the Patient: ");
        int resRate = s.nextInt();
        vs.setRespiratoryRate(resRate);

        System.out.println("Enter heartRate of the Patient: ");
        int heartRate = s.nextInt();
        vs.setHeartRate(heartRate);

        System.out.println("Enter Systolic Blood Pressure of the Patient: ");
        int sysBloodPressure = s.nextInt();
        vs.setSysBloodPressure(sysBloodPressure);

        System.out.println("Enter Weight in Kilos of the Paitent: ");
        double weightInKgs = s.nextInt();
        vs.setWeightKg(weightInKgs);

        System.out.println("Enter Weight in Pounds of the Patient: ");
        double weightInPounds = s.nextInt();
        vs.setWeightLb(weightInPounds);
        latest = vs;
        vsh.add(vs);
            

    }
    public void viewVitalSign(){
        Collections.reverse(vsh);
        for(VitalSigns var: vsh){
            System.out.println("");
            System.out.println(var.toString());
        }
    }
    public boolean checkVitalSign(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter which Vital you need to check: ");
        String vital = s.nextLine();
        LocalDate l = LocalDate.of(latest.getYear(), latest.getMonth(), latest.getDay()); //specify year, month, date directly
        LocalDate now = LocalDate.now(); //gets localDate
        Period diff = Period.between(l, now); //difference between the dates is calculated
        
        switch(vital){
            case "Heart Rate": {
                if(diff.getYears() == 0){
                    if(diff.getMonths()==0){
                        //Newborn
                        if (latest.getHeartRate() >= 120 && latest.getHeartRate() <= 160) {
                            System.out.println("Heart Rate is Normal");
                            return true;
                        }
                        else{
                            if(latest.getHeartRate() < 120){
                            System.out.println("Patient's Heart Rate less than 120");
                            return false;
                            }
                            else if(latest.getHeartRate() > 160){
                                System.out.println("Patient's Heart Rate is more than 160");
                                return false;
                            }  
                        }
                    }
                    else{
                        //Infant
                        if (latest.getHeartRate() >= 80 && latest.getHeartRate() <= 140) {
                            System.out.println("Heart Rate is Normal");
                            return true;
                        } else {
                            if (latest.getHeartRate() < 80) {
                                System.out.println("Patient's Heart Rate less than 80");
                                return false;
                            } else if (latest.getHeartRate() > 140) {
                                System.out.println("Patient's Heart Rate is more than 140");
                                return false;
                            }
                        }  
                    }
                }
                else if(diff.getYears() >= 1 && diff.getYears() < 3){
                  //Toodler  
                    if (latest.getHeartRate() >= 80 && latest.getHeartRate() <= 130) {
                        System.out.println("Heart Rate is Normal");
                        return true;
                    } else {
                        if (latest.getHeartRate() < 80) {
                            System.out.println("Patient's Heart Rate less than 80");
                            return false;
                        } else if (latest.getHeartRate() > 130) {
                            System.out.println("Patient's Heart Rate is more than 130");
                            return false;
                        }
                    }
                }
                else if (diff.getYears() >= 3 && diff.getYears() <= 5) {
                    //Preschooler
                    if (latest.getHeartRate() >= 80 && latest.getHeartRate() <= 120) {
                        System.out.println("Heart Rate is Normal");
                        return true;
                    } else {
                        if (latest.getHeartRate() < 80) {
                            System.out.println("Patient's Heart Rate less than 80");
                            return false;
                        } else if (latest.getHeartRate() > 120) {
                            System.out.println("Patient's Heart Rate is more than 120");
                            return false;
                        }
                    }
                }
                else if(diff.getYears() >= 6 && diff.getYears() <= 12){
                    //School Age
                    if (latest.getHeartRate() >= 70 && latest.getHeartRate() <= 110) {
                        System.out.println("Heart Rate is Normal");
                        return true;
                    } else {
                        if (latest.getHeartRate() < 120) {
                            System.out.println("Patient's Heart Rate less than 70");
                            return false;
                        } else if (latest.getHeartRate() > 160) {
                            System.out.println("Patient's Heart Rate is more than 110");
                            return false;
                        }
                    }
                }
                else if(diff.getYears() >= 13){
                    //Adolescent
                    if (latest.getHeartRate() >= 55 && latest.getHeartRate() <= 105) {
                        System.out.println("Heart Rate is Normal");
                        return true;
                    } else {
                        if (latest.getHeartRate() < 55) {
                            System.out.println("Patient's Heart Rate less than 55");
                            return false;
                        } else if (latest.getHeartRate() > 105) {
                            System.out.println("Patient's Heart Rate is more than 105");
                            return false;
                        }
                    }
                }
               
            }
            case "Respiratory Rate": {
                if(diff.getYears() == 0){
                    if(diff.getMonths()==0){
                        //Newborn
                        if (latest.getRespiratoryRate()>= 30 && latest.getRespiratoryRate()<= 50) {
                            System.out.println("Respiratory Rate is Normal");
                            return true;
                        }
                        else{
                            if(latest.getRespiratoryRate()< 30){
                            System.out.println("Patient's Respiratory Rate less than 30");
                            return false;
                            }
                            else if(latest.getRespiratoryRate()> 50){
                                System.out.println("Patient's Respiratory Rate is more than 50");
                                return false;
                            }  
                        }
                    }
                    else{
                        //Infant
                        if (latest.getRespiratoryRate() >= 20 && latest.getRespiratoryRate() <= 30) {
                            System.out.println("Respiratory Rate is Normal");
                            return true;
                        } else {
                            if (latest.getRespiratoryRate() < 20) {
                                System.out.println("Patient's Respiratory Rate less than 20");
                                return false;
                            } else if (latest.getRespiratoryRate() > 30) {
                                System.out.println("Patient's Respiratory Rate is more than 30");
                                return false;
                            }
                        }
                    }
                }
                else if(diff.getYears() >= 1 && diff.getYears() < 3){
                    //Toodler
                    if (latest.getRespiratoryRate() >= 20 && latest.getRespiratoryRate() <= 30) {
                        System.out.println("Respiratory Rate is Normal");
                        return true;
                    } else {
                        if (latest.getRespiratoryRate() < 20) {
                            System.out.println("Patient's Respiratory Rate less than 20");
                            return false;
                        } else if (latest.getRespiratoryRate() > 30) {
                            System.out.println("Patient's Respiratory Rate is more than 30");
                            return false;
                        }
                    }
                }
                else if (diff.getYears() >= 3 && diff.getYears() <= 5) {
                    //Preschooler
                    if (latest.getRespiratoryRate() >= 20 && latest.getRespiratoryRate() <= 30) {
                        System.out.println("Respiratory Rate is Normal");
                        return true;
                    } else {
                        if (latest.getRespiratoryRate() < 20) {
                            System.out.println("Patient's Respiratory Rate less than 20");
                            return false;
                        } else if (latest.getRespiratoryRate() > 30) {
                            System.out.println("Patient's Respiratory Rate is more than 30");
                            return false;
                        }
                    }
                }
                else if(diff.getYears() >= 6 && diff.getYears() <= 12){
                    if (latest.getRespiratoryRate() >= 20 && latest.getRespiratoryRate() <= 30) {
                        System.out.println("Respiratory Rate is Normal");
                        return true;
                    } else {
                        if (latest.getRespiratoryRate() < 20) {
                            System.out.println("Patient's Respiratory Rate less than 20");
                            return false;
                        } else if (latest.getRespiratoryRate() > 30) {
                            System.out.println("Patient's Respiratory Rate is more than 30");
                            return false;
                        }
                    }
                }
                else if(diff.getYears() >= 13){
                    if (latest.getRespiratoryRate() >= 12 && latest.getRespiratoryRate() <= 20) {
                        System.out.println("Respiratory Rate is Normal");
                        return true;
                    } else {
                        if (latest.getRespiratoryRate() < 10) {
                            System.out.println("Patient's Respiratory Rate less than 12");
                            return false;
                        } else if (latest.getRespiratoryRate() > 20) {
                            System.out.println("Patient's Respiratory Rate is more than 20");
                            return false;
                        }
                    }
                }
            }
            case "Systolic Blood Pressure":{
                if (diff.getYears() == 0) {
                    if (diff.getMonths() == 0) {
                        //Newborn
                        if (latest.getSysBloodPressure()>= 50 && latest.getSysBloodPressure() <= 70) {
                            System.out.println("Systolic Blood Pressure is Normal");
                            return true;
                        } else {
                            if (latest.getSysBloodPressure()< 50) {
                                System.out.println("Patient's Systolic Blood Pressure less than 50");
                                return false;
                            } else if (latest.getSysBloodPressure()  > 70) {
                                System.out.println("Patient's Systolic Blood Pressure is more than 70");
                                return false;
                            }
                        }
                    } else {
                        //Infant
                        if (latest.getSysBloodPressure() >= 70 && latest.getSysBloodPressure() <= 100) {
                            System.out.println("Systolic Blood Pressure is Normal");
                            return true;
                        } else {
                            if (latest.getSysBloodPressure() < 70) {
                                System.out.println("Patient's Systolic Blood Pressure less than 50");
                                return false;
                            } else if (latest.getSysBloodPressure() > 100) {
                                System.out.println("Patient's Systolic Blood Pressure is more than 70");
                                return false;
                            }
                        }
                    }
                } else if (diff.getYears() >= 1 && diff.getYears() < 3) {
                    //Toddler
                    if (latest.getSysBloodPressure() >= 80 && latest.getSysBloodPressure() <= 110) {
                        System.out.println("Systolic Blood Pressure is Normal");
                        return true;
                    } else {
                        if (latest.getSysBloodPressure() < 80) {
                            System.out.println("Patient's Systolic Blood Pressure less than 80");
                            return false;
                        } else if (latest.getSysBloodPressure() > 100) {
                            System.out.println("Patient's Systolic Blood Pressure is more than 110");
                            return false;
                        }
                    }
                } else if (diff.getYears() >= 3 && diff.getYears() <= 5) {
                    //Preschooler
                    if (latest.getSysBloodPressure() >= 80 && latest.getSysBloodPressure() <= 110) {
                        System.out.println("Systolic Blood Pressure is Normal");
                        return true;
                    } else {
                        if (latest.getSysBloodPressure() < 80) {
                            System.out.println("Patient's Systolic Blood Pressure less than 80");
                            return false;
                        } else if (latest.getSysBloodPressure() > 110) {
                            System.out.println("Patient's Systolic Blood Pressure is more than 110");
                            return false;
                        }
                    }
                } else if (diff.getYears() >= 6 && diff.getYears() <= 12) {
                    //School Age
                    if (latest.getSysBloodPressure() >= 80 && latest.getSysBloodPressure() <= 120) {
                        System.out.println("Systolic Blood Pressure is Normal");
                        return true;
                    } else {
                        if (latest.getSysBloodPressure() < 80) {
                            System.out.println("Patient's Systolic Blood Pressure less than 80");
                            return false;
                        } else if (latest.getSysBloodPressure() > 120) {
                            System.out.println("Patient's Systolic Blood Pressure is more than 120");
                            return false;
                        }
                    }

                } else if (diff.getYears() >= 13) {
                    //Adolescent
                    if (latest.getSysBloodPressure() >= 110 && latest.getSysBloodPressure() <= 120) {
                        System.out.println("Systolic Blood Pressure is Normal");
                        return true;
                    } else {
                        if (latest.getSysBloodPressure() < 110) {
                            System.out.println("Patient's Systolic Blood Pressure less than 110");
                            return false;
                        } else if (latest.getSysBloodPressure() > 120) {
                            System.out.println("Patient's Systolic Blood Pressure is more than 120");
                            return false;
                        }
                    }
                }
            }
            case "Weight in Kg":{
                if (diff.getYears() == 0) {
                    if (diff.getMonths() == 0) {
                        //Newborn
                        if (latest.getWeightKg()>= 2 && latest.getWeightKg() <= 3) {
                            System.out.println("Weight in Kg is Normal");
                            return true;
                        } else {
                            if (latest.getWeightKg() < 2) {
                                System.out.println("Patient's Weight in Kg less than 2");
                                return false;
                            } else if (latest.getWeightKg() > 3) {
                                System.out.println("Patient's Weight in Kg is more than 3");
                                return false;
                            }
                        }
                    } else {
                        //Infant
                        if (latest.getWeightKg() >= 4 && latest.getWeightKg() <= 10) {
                            System.out.println("Weight in Kg is Normal");
                            return true;
                        } else {
                            if (latest.getWeightKg() < 4) {
                                System.out.println("Patient's Weight in Kg less than 4");
                                return false;
                            } else if (latest.getWeightKg() > 10) {
                                System.out.println("Patient's Weight in Kg is more than 10");
                                return false;
                            }
                        }

                    }
                } else if (diff.getYears() >= 1 && diff.getYears() < 3) {
                    //Toodler
                    if (latest.getWeightKg() >= 10 && latest.getWeightKg() <= 14) {
                        System.out.println("Weight in Kg is Normal");
                        return true;
                    } else {
                        if (latest.getWeightKg() < 10) {
                            System.out.println("Patient's Weight in Kg less than 2");
                            return false;
                        } else if (latest.getWeightKg() > 14) {
                            System.out.println("Patient's Weight in Kg is more than 3");
                            return false;
                        }
                    }

                } else if (diff.getYears() >= 3 && diff.getYears() <= 5) {
                    //Preschooler
                    if (latest.getWeightKg() >= 14 && latest.getWeightKg() <= 18) {
                        System.out.println("Weight in Kg is Normal");
                        return true;
                    } else {
                        if (latest.getWeightKg() < 14) {
                            System.out.println("Patient's Weight in Kg less than 14");
                            return false;
                        } else if (latest.getWeightKg() > 18) {
                            System.out.println("Patient's Weight in Kg is more than 18");
                            return false;
                        }
                    }
                } else if (diff.getYears() >= 6 && diff.getYears() <= 12) {
                    //School Age
                    if (latest.getWeightKg() >= 20 && latest.getWeightKg() <= 42) {
                        System.out.println("Weight in Kg is Normal");
                        return true;
                    } else {
                        if (latest.getWeightKg() < 20) {
                            System.out.println("Patient's Weight in Kg less than 20");
                            return false;
                        } else if (latest.getWeightKg() > 42) {
                            System.out.println("Patient's Weight in Kg is more than 42");
                            return false;
                        }
                    }

                } else if (diff.getYears() >= 13) {
                    //Adolescent
                    if (latest.getWeightKg() > 50) {
                        System.out.println("Weight in Kg is Normal");
                        return true;
                    } else {
                        System.out.println("Patient's Weight in Kg is less than 50");
                            return false;
                    }
                }
            }
            case "Weight in Pounds":{
                if (diff.getYears() == 0) {
                    if (diff.getMonths() == 0) {
                        //Newborn
                        if (latest.getWeightLb()>= 4.5 && latest.getWeightLb() <= 7) {
                            System.out.println("Weight in Pounds is Normal");
                            return true;
                        } else {
                            if (latest.getWeightLb() < 4.5) {
                                System.out.println("Patient's Weight in Pounds is less than 4.5");
                                return false;
                            } else if (latest.getWeightLb() > 7) {
                                System.out.println("Patient's Weight in Pounds is more than 7");
                                return false;
                            }
                        }
                    } else {
                        //Infant
                        if (latest.getWeightLb() >= 9 && latest.getWeightLb() <= 12) {
                            System.out.println("Weight in Pounds is Normal");
                            return true;
                        } else {
                            if (latest.getWeightLb() < 9) {
                                System.out.println("Patient's Weight in Pounds is less than 9");
                                return false;
                            } else if (latest.getWeightLb() > 12) {
                                System.out.println("Patient's Weight in Pounds is more than 12");
                                return false;
                            }
                        }

                    }
                } else if (diff.getYears() >= 1 && diff.getYears() < 3) {
                    //Tooder
                    if (latest.getWeightLb() >= 22 && latest.getWeightLb() <= 31) {
                        System.out.println("Weight in Pounds is Normal");
                        return true;
                    } else {
                        if (latest.getWeightLb() < 22) {
                            System.out.println("Patient's Weight in Pounds is less than 22");
                            return false;
                        } else if (latest.getWeightLb() > 31) {
                            System.out.println("Patient's Weight in Pounds is more than 31");
                            return false;
                        }
                    }

                } else if (diff.getYears() >= 3 && diff.getYears() <= 5) {
                    //Preschooler
                    if (latest.getWeightLb() >= 31 && latest.getWeightLb() <= 40) {
                        System.out.println("Weight in Pounds is Normal");
                        return true;
                    } else {
                        if (latest.getWeightLb() < 31) {
                            System.out.println("Patient's Weight in Pounds is less than 31");
                            return false;
                        } else if (latest.getWeightLb() > 40) {
                            System.out.println("Patient's Weight in Pounds is more than 40");
                            return false;
                        }
                    }

                } else if (diff.getYears() >= 6 && diff.getYears() <= 12) {
                    //School Age
                    if (latest.getWeightLb() >= 41 && latest.getWeightLb() <= 92) {
                        System.out.println("Weight in Pounds is Normal");
                        return true;
                    } else {
                        if (latest.getWeightLb() < 41) {
                            System.out.println("Patient's Weight in Pounds is less than 41");
                            return false;
                        } else if (latest.getWeightLb() > 92) {
                            System.out.println("Patient's Weight in Pounds is more than 92");
                            return false;
                        }
                    }

                } else if (diff.getYears() >= 13) {
                    //Adolescent
                    if (latest.getWeightLb()> 110) {
                        System.out.println("Weight in Pounds is Normal");
                        return true;
                    } else {
                        System.out.println("Patient's Weight in Pounds is less than 50");
                        return false;
                    }

                }
            }
        }   
    return false;
    }
    
}
