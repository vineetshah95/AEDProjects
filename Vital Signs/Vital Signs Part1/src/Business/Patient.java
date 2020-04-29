package Business;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


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
    public static void main(String args[]){
    
      //Patient 1(Adolesent)
      VitalSigns vs1 = new VitalSigns();
      vs1.setYear(1995);
      vs1.setMonth(5);
      vs1.setDay(29);
      vs1.setHeartRate(200);
      vs1.setRespiratoryRate(20);
      vs1.setSysBloodPressure(110);
      vs1.setWeightKg(60);
      vs1.setWeightLb(110);
      boolean isNormal = isPatientNormal(vs1);
      System.out.println("Patient 1: "+vs1);
      if(isNormal == true){
          System.out.println("Paitent 1 is Normal");
      }
      else{
          System.out.println("Paitent 1 is Abnormal");
      }
      
      //Patient 2 (Newborn)
      VitalSigns vs2 = new VitalSigns();
      vs2.setYear(2020);
      vs2.setMonth(1);
      vs2.setDay(15);
      vs2.setHeartRate(150);
      vs2.setRespiratoryRate(40);
      vs2.setSysBloodPressure(80);
      vs2.setWeightKg(1);
      vs2.setWeightLb(5);
      isNormal = isPatientNormal(vs2);
      System.out.println("Patient 2: "+vs2);
      if(isNormal == true){
          System.out.println("Paitent 2 is Normal");
      }
      else{
          System.out.println("Paitent 2 is Abnormal");
      }
      
      //Patient 3 (Infant)
      VitalSigns vs3 = new VitalSigns();
      vs3.setYear(2019);
      vs3.setMonth(11);
      vs3.setDay(15);
      vs3.setHeartRate(120);
      vs3.setRespiratoryRate(25);
      vs3.setSysBloodPressure(80);
      vs3.setWeightKg(5);
      vs3.setWeightLb(20);
      isNormal = isPatientNormal(vs3);
      System.out.println("Patient 3: "+vs3);
      if(isNormal == true){
          System.out.println("Paitent 3 is Normal");
      }
      else{
          System.out.println("Paitent 3 is Abnormal");
      }
      
      //Patient 4 (Toodler)
      VitalSigns vs4 = new VitalSigns();
      vs4.setYear(2018);
      vs4.setMonth(8);
      vs4.setDay(15);
      vs4.setHeartRate(90);
      vs4.setRespiratoryRate(25);
      vs4.setSysBloodPressure(90);
      vs4.setWeightKg(13);
      vs4.setWeightLb(25);
      isNormal = isPatientNormal(vs4);
      System.out.println("Patient 4: "+vs4);
      if(isNormal == true){
          System.out.println("Paitent 4 is Normal");
      }
      else{
          System.out.println("Paitent 4 is Abnormal");
      }
      
      
      //Patient 5 (Preschooler)
      VitalSigns vs5 = new VitalSigns();
      vs5.setYear(2015);
      vs5.setMonth(8);
      vs5.setDay(15);
      vs5.setHeartRate(90);
      vs5.setRespiratoryRate(25);
      vs5.setSysBloodPressure(100);
      vs5.setWeightKg(15);
      vs5.setWeightLb(35);
      isNormal = isPatientNormal(vs5);
      System.out.println("Patient 5: "+vs5);
      if(isNormal == true){
          System.out.println("Paitent 5 is Normal");
      }
      else{
          System.out.println("Paitent 5 is Abnormal");
      }
      
      //Patient 6 (Schoolage)
      VitalSigns vs6 = new VitalSigns();
      vs6.setYear(2011);
      vs6.setMonth(8);
      vs6.setDay(15);
      vs6.setHeartRate(100);
      vs6.setRespiratoryRate(25);
      vs6.setSysBloodPressure(110);
      vs6.setWeightKg(30);
      vs6.setWeightLb(65);
      isNormal = isPatientNormal(vs6);
      System.out.println("Patient 6: "+vs6);
      if(isNormal == true){
          System.out.println("Paitent 6 is Normal");
      }
      else{
          System.out.println("Paitent 6 is Abnormal");
      }
      
      //Patient 7 (User Input)
      VitalSigns vs7 = new VitalSigns();
      Scanner s = new Scanner(System.in);
      
        System.out.println("Enter Year of Birth: ");
        int year = s.nextInt();
        vs7.setYear(year);
        
        System.out.println("Enter Month of Birth: ");
        int month = s.nextInt();
        vs7.setMonth(month);
        
        System.out.println("Enter Day of Birth: ");
        int day = s.nextInt();
        vs7.setDay(day);
        
        System.out.println("Enter Respiratory Rate of the Patient: ");
        int resRate = s.nextInt();
        vs7.setRespiratoryRate(resRate);
      
       System.out.println("Enter heartRate of the Patient: ");
        int heartRate = s.nextInt();
        vs7.setHeartRate(heartRate);
        
       System.out.println("Enter Systolic Blood Pressure of the Patient: ");
        int sysBloodPressure = s.nextInt();
        vs7.setSysBloodPressure(sysBloodPressure);
        
       System.out.println("Enter Weight in Kilos of the Paitent: ");
        double weightInKgs = s.nextInt();
        vs7.setWeightKg(weightInKgs);
        
       System.out.println("Enter Weight in Pounds of the Patient: ");
        double weightInPounds = s.nextInt();
        vs7.setWeightLb(weightInPounds);
      
      isNormal = isPatientNormal(vs7);
      System.out.println("Patient 7: "+vs7);
      if(isNormal == true){
          System.out.println("Paitent 7 is Normal");
      }
      else{
          System.out.println("Paitent 7 is Abnormal");
      }
      
    }
    private static boolean isPatientNormal(VitalSigns vs){
        LocalDate l = LocalDate.of(vs.getYear(), vs.getMonth(), vs.getDay()); //specify year, month, date directly
        LocalDate now = LocalDate.now(); //gets localDate
        Period diff = Period.between(l, now); //difference between the dates is calculated
        //System.out.println(diff.getYears() + "years" + diff.getMonths() + "months");
        if(diff.getYears() == 0){
            if(diff.getMonths() == 0){
                //NEWBORN
                System.out.println("The Patient is a Newborn");
                if (vs.getRespiratoryRate() >= 30 && vs.getRespiratoryRate() <= 50) {
                    if (vs.getHeartRate() >= 120 && vs.getHeartRate() <= 160) {
                        if (vs.getSysBloodPressure() >= 50 && vs.getSysBloodPressure() <= 70) {
                            if (vs.getWeightKg() >= 2 && vs.getWeightKg() <= 3) {
                                if (vs.getWeightLb() >= 4.5 && vs.getWeightLb() <= 7){
                                    System.out.println("Patient is a New Born and Vital Signs are Normal");
                                    return true;
                                }
                                else{
                                   if(vs.getWeightLb() < 4.5){
                                       System.out.println("Patient weighs less than 4.5 Pounds");
                                   }
                                   else if(vs.getWeightLb() > 7){
                                       System.out.println("Patient weighs more than 7 Pounds");
                                   }
                                   return false;
                                }
                            }
                            else {
                                if(vs.getWeightKg() < 2){
                                    System.out.println("Patient weighs less than 2 kgs");
                                }
                                else if(vs.getWeightKg() > 3){
                                    System.out.println("Patient weighs more than 3 kgs");
                                }
                                return false;
                            }
                        } 
                        else {
                            if(vs.getSysBloodPressure() < 50){
                                System.out.println("Patient's Blood Pressure is less than 50");
                            }
                            else if(vs.getSysBloodPressure() > 70){
                                System.out.println("Patient's Blood Pressure is more than 70");
                            }
                            return false;
                        }
                    } 
                    else {
                        if(vs.getHeartRate() < 120){
                            System.out.println("Patient's Heart Rate less than 120");
                        }
                        else if(vs.getHeartRate() > 160){
                            System.out.println("Patient's Heart Rate is more than 160");
                        }
                        return false;
                    }
                } 
                else {
                    if(vs.getRespiratoryRate() < 30){
                        System.out.println("Patient's Respiratory Rate is less than 30");
                    }
                    else if(vs.getRespiratoryRate() > 50){
                        System.out.println("Patient's Respiratory Rate is more than 50");
                    }
                    return false;
                }
            }
            else{
                //INFANT
                System.out.println("The Patient is an Infant");
                if (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <= 30) {
                    if (vs.getHeartRate() >= 80 && vs.getHeartRate() <= 140) {
                        if (vs.getSysBloodPressure() >= 70 && vs.getSysBloodPressure() <= 100) {
                            if (vs.getWeightKg() >= 4 && vs.getWeightKg() <= 10) {
                                if (vs.getWeightLb() >= 9 && vs.getWeightLb() <= 22){
                                    System.out.println("Patient is an Infant and Vital Signs are Normal");
                                    return true;
                                }
                                else{
                                   if(vs.getWeightLb() < 9){
                                       System.out.println("Patient weighs less than 9 Pounds");
                                   }
                                   else if(vs.getWeightLb() > 22){
                                       System.out.println("Patient weighs more than 22 Pounds");
                                   }
                                   return false;
                                }
                            }
                            else {
                                if(vs.getWeightKg() < 4){
                                    System.out.println("Patient weighs less than 4 kgs");
                                }
                                else if(vs.getWeightKg() > 10){
                                    System.out.println("Patient weighs more than 10 kgs");
                                }
                                return false;
                            }
                        } 
                        else {
                            if(vs.getSysBloodPressure() < 70){
                                System.out.println("Patient's Blood Pressure is less than 70");
                            }
                            else if(vs.getSysBloodPressure() > 100){
                                System.out.println("Patient's Blood Pressure is more than 100");
                            }
                            return false;
                        }
                    } 
                    else {
                        if(vs.getHeartRate() < 80){
                            System.out.println("Patient's Heart Rate less than 80");
                        }
                        else if(vs.getHeartRate() > 140){
                            System.out.println("Patient's Heart Rate is more than 140");
                        }
                        return false;
                    }
                } 
                else {
                    if(vs.getRespiratoryRate() < 20){
                        System.out.println("Patient's Respiratory Rate is less than 20");
                    }
                    else if(vs.getRespiratoryRate() > 30){
                        System.out.println("Patient's Respiratory Rate is more than 30");
                    }
                    return false;
                }
                
            }
        }
        else if(diff.getYears() >= 1 && diff.getYears() < 3){
            //TOODLER
            System.out.println("The Patient is a Toodler");
            if (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <= 30) {
                if (vs.getHeartRate() >= 80 && vs.getHeartRate() <= 130) {
                    if (vs.getSysBloodPressure() >= 80 && vs.getSysBloodPressure() <= 110) {
                        if (vs.getWeightKg() >= 10 && vs.getWeightKg() <= 14) {
                            if (vs.getWeightLb() >= 22 && vs.getWeightLb() <= 31) {
                                System.out.println("Patient is a Toodler and Vital Signs are Normal");
                                return true;
                            } else {
                                if (vs.getWeightLb() < 22) {
                                    System.out.println("Patient weighs less than 22 Pounds");
                                } 
                                else if (vs.getWeightLb() > 31) {
                                    System.out.println("Patient weighs more than 31 Pounds");
                                }
                                return false;
                            }
                        } else {
                            if (vs.getWeightKg() < 10) {
                                System.out.println("Patient weighs less than 10 kgs");
                            } else if (vs.getWeightKg() > 14) {
                                System.out.println("Patient weighs more than 14 kgs");
                            }
                            return false;
                        }
                    } else {
                        if (vs.getSysBloodPressure() < 80) {
                            System.out.println("Patient's Blood Pressure is less than 80");
                        } else if (vs.getSysBloodPressure() > 110) {
                            System.out.println("Patient's Blood Pressure is more than 110");
                        }
                        return false;
                    }
                } else {
                    if (vs.getHeartRate() < 80) {
                        System.out.println("Patient's Heart Rate less than 80");
                    } else if (vs.getHeartRate() > 130) {
                        System.out.println("Patient's Heart Rate is more than 130");
                    }
                    return false;
                }
            } else {
                if (vs.getRespiratoryRate() < 20) {
                    System.out.println("Patient's Respiratory Rate is less than 20");
                } else if (vs.getRespiratoryRate() > 30) {
                    System.out.println("Patient's Respiratory Rate is more than 30");
                }
                return false;
            }
        }
        else if(diff.getYears() >= 3 && diff.getYears() <= 5){
            //PRESCHOOLER
            System.out.println("The Patient is a Preschooler");
            if (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <= 30) {
                if (vs.getHeartRate() >= 80 && vs.getHeartRate() <= 120) {
                    if (vs.getSysBloodPressure() >= 80 && vs.getSysBloodPressure() <= 110) {
                        if (vs.getWeightKg() >= 14 && vs.getWeightKg() <= 18) {
                            if (vs.getWeightLb() >= 31 && vs.getWeightLb() <= 40) {
                                System.out.println("Patient is a Preschooler and Vital Signs are Normal");
                                return true;
                            } else {
                                if (vs.getWeightLb() < 31) {
                                    System.out.println("Patient weighs less than 22 Pounds");
                                } else if (vs.getWeightLb() > 40) {
                                    System.out.println("Patient weighs more than 31 Pounds");
                                }
                                return false;
                            }
                        } else {
                            if (vs.getWeightKg() < 14) {
                                System.out.println("Patient weighs less than 14 kgs");
                            } else if (vs.getWeightKg() > 18) {
                                System.out.println("Patient weighs more than 18 kgs");
                            }
                            return false;
                        }
                    } else {
                        if (vs.getSysBloodPressure() < 80) {
                            System.out.println("Patient's Blood Pressure is less than 80");
                        } else if (vs.getSysBloodPressure() > 110) {
                            System.out.println("Patient's Blood Pressure is more than 110");
                        }
                        return false;
                    }
                } else {
                    if (vs.getHeartRate() < 80) {
                        System.out.println("Patient's Heart Rate less than 80");
                    } else if (vs.getHeartRate() > 120) {
                        System.out.println("Patient's Heart Rate is more than 120");
                    }
                    return false;
                }
            } else {
                if (vs.getRespiratoryRate() < 20) {
                    System.out.println("Patient's Respiratory Rate is less than 20");
                } else if (vs.getRespiratoryRate() > 30) {
                    System.out.println("Patient's Respiratory Rate is more than 30");
                }
                return false;
            }
        }
        else if(diff.getYears() >= 6 && diff.getYears() <= 12){
            //SCHOOLAGE
            System.out.println("The Patient is in Schoolage");
            if (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <= 30) {
                if (vs.getHeartRate() >= 70 && vs.getHeartRate() <= 110) {
                    if (vs.getSysBloodPressure() >= 80 && vs.getSysBloodPressure() <= 120) {
                        if (vs.getWeightKg() >= 20 && vs.getWeightKg() <= 42) {
                            if (vs.getWeightLb() >= 41 && vs.getWeightLb() <= 92) {
                                System.out.println("Patient is in School Age and Vital Signs are Normal");
                                return true;
                            } else {
                                if (vs.getWeightLb() < 41) {
                                    System.out.println("Patient weighs less than 41 Pounds");
                                } else if (vs.getWeightLb() > 92) {
                                    System.out.println("Patient weighs more than 92 Pounds");
                                }
                                return false;
                            }
                        } else {
                            if (vs.getWeightKg() < 20) {
                                System.out.println("Patient weighs less than 20 kgs");
                            } else if (vs.getWeightKg() > 42) {
                                System.out.println("Patient weighs more than 42 kgs");
                            }
                            return false;
                        }
                    } else {
                        if (vs.getSysBloodPressure() < 80) {
                            System.out.println("Patient's Blood Pressure is less than 80");
                        } else if (vs.getSysBloodPressure() > 120) {
                            System.out.println("Patient's Blood Pressure is more than 120");
                        }
                        return false;
                    }
                } else {
                    if (vs.getHeartRate() < 70) {
                        System.out.println("Patient's Heart Rate less than 70");
                    } else if (vs.getHeartRate() > 110) {
                        System.out.println("Patient's Heart Rate is more than 110");
                    }
                    return false;
                }
            } else {
                if (vs.getRespiratoryRate() < 20) {
                    System.out.println("Patient's Respiratory Rate is less than 20");
                } else if (vs.getRespiratoryRate() > 30) {
                    System.out.println("Patient's Respiratory Rate is more than 30");
                }
                return false;
            }
        }
        else if(diff.getYears() >= 13){
            //ADOLESCENT
            System.out.println("The Patient is an Adolescent");
            if (vs.getRespiratoryRate() >= 12 && vs.getRespiratoryRate() <= 20) {
                if (vs.getHeartRate() >= 55 && vs.getHeartRate() <= 105) {
                    if (vs.getSysBloodPressure() >= 110 && vs.getSysBloodPressure() <= 120) {
                        if (vs.getWeightKg() >= 50) {
                            if (vs.getWeightLb() >= 110) {
                                System.out.println("Patient is an Adolescent and Vital Signs are Normal");
                                return true;
                            } 
                            else {
                                if (vs.getWeightLb() < 110) {
                                    System.out.println("Patient weighs less than 110 Pounds");
                                }
                                return false;
                            }
                        } else {
                            if (vs.getWeightKg() < 50) {
                                System.out.println("Patient weighs less than 50 kgs");
                            }
                            return false;
                        }
                    } else {
                        if (vs.getSysBloodPressure() < 110) {
                            System.out.println("Patient's Blood Pressure is less than 110");
                        } else if (vs.getSysBloodPressure() > 120) {
                            System.out.println("Patient's Blood Pressure is more than 120");
                        }
                        return false;
                    }
                } else {
                    if (vs.getHeartRate() < 55) {
                        System.out.println("Patient's Heart Rate less than 55");
                    } else if (vs.getHeartRate() > 105) {
                        System.out.println("Patient's Heart Rate is more than 105");
                    }
                    return false;
                }
            } else {
                if (vs.getRespiratoryRate() < 12) {
                    System.out.println("Patient's Respiratory Rate is less than 12");
                } else if (vs.getRespiratoryRate() > 20) {
                    System.out.println("Patient's Respiratory Rate is more than 20");
                }
                return false;
            }
        }
        else{
            System.out.println("Enter a proper date of birth");
        }    
        return false;
    }
}
