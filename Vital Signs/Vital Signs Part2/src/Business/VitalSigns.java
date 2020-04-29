/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author India
 */
public class VitalSigns {

    static String toString(VitalSigns vs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int year;
    private int month;
    private int day;
    private int respiratoryRate;
    private int heartRate;
    private int sysBloodPressure;
    private double weightKg;
    private double weightLb;
    

   

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getSysBloodPressure() {
        return sysBloodPressure;
    }

    public void setSysBloodPressure(int sysBloodPressure) {
        this.sysBloodPressure = sysBloodPressure;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public double getWeightLb() {
        return weightLb;
    }

    public void setWeightLb(double weightLb) {
        this.weightLb = weightLb;
    }

        @Override
    public String toString() {
        return "Patient's Vital Signs{" + "Date of Birth="  + day + "/" + month + "/"+ year +", Respiratory Rate=" + respiratoryRate + ", Heart Rate=" + heartRate + ", Systolic Blood Pressure=" + sysBloodPressure + ", Weight in kg=" + weightKg + ", Weight in Pounds=" + weightLb + '}';
    }
    

    
}
