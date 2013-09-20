package kata1;

import java.util.Date;

public class Student {
    private String name;
    private Date birthday;
    
    public Student (String name, Date birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName(){
        return name;
    }
    
    public Date getBirthday(){
        return birthday;
    }
    
     private Date today(){
        return new Date();
    }
    
    public int getAge(){
        return (int)getYearsInDays(
                getDaysInHours(
                getHoursInMinutes(
                getMinutesInSeconds(
                getSecondsInMilliseconds(
                today().getTime() - birthday.getTime()
                )))));
    }
    
    private long getSecondsInMilliseconds(long milliseconds){
        return milliseconds/1000;
    }

    private long getMinutesInSeconds(long seconds){
        return seconds/60;
    }    

    private long getHoursInMinutes(long minutes){
        return minutes/60;
    }    
    
    private long getDaysInHours(long hours){
        return hours/24;
    }    
    
    private double getYearsInDays(long days){
        return days/365.25;
    }    
}
