import java.text.*;  
import java.util.Date; 
import java.time.*;
public class DateManipulation {   
    static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); 
    static SimpleDateFormat fday = new SimpleDateFormat("dd");            
    static SimpleDateFormat fmonth = new SimpleDateFormat("MM");            
    static SimpleDateFormat fyear = new SimpleDateFormat("yyyy");
    static void wholeYear(Date dateSignup, Date dateCurr){
            String d1=String.valueOf(Integer.parseInt(fday.format(dateSignup))+1);              
            String m1=String.valueOf(Integer.parseInt(fmonth.format(dateSignup))-1);    
            String y1=fyear.format(dateCurr);               
            Date date1=formatter.parse(String.valueOf(d1)+"-"+String.valueOf(m1)+"-"+String.valueOf(y1));              
            System.out.println(formatter.format(date1)+" "+formatter.format(dateCurr));
    }
    static void approachingYear(Date dateSignup, Date dateCurr){
            String d1=String.valueOf(Integer.parseInt(fday.format(dateSignup))+1);         
            String m1=fmonth.format(dateCurr);                
            String y1=fyear.format(dateCurr);                
            Date date1=formatter.parse(String.valueOf(d1)+"-"+String.valueOf(m1)+"-"+String.valueOf(y1));                
            System.out.println(formatter.format(date1)+" "+formatter.format(dateCurr));            
    }
    static void farYear(Date dateSignup, Date dateCurr){
            String d1=String.valueOf(Integer.parseInt(fday.format(dateSignup))+1);   
            String m1=String.valueOf(Integer.parseInt(fmonth.format(dateSignup))-1);               
            String y1=String.valueOf(Integer.parseInt(fyear.format(dateSignup))+1);            
            Date date1=formatter.parse(String.valueOf(d1)+"-"+String.valueOf(m1)+"-"+String.valueOf(y1));         
            String d2=String.valueOf(Integer.parseInt(d1)+1);                
            String m2=String.valueOf(Integer.parseInt(fmonth.format(dateSignup))+1);      
            String y2=fyear.format(dateCurr);                
            Date date2=formatter.parse(String.valueOf(d2)+"-"+String.valueOf(m2)+"-"+y2);                
            System.out.println(formatter.format(date1)+" "+formatter.format(date2));              
    }

    public static void main(String[] args) throws ParseException{        
        String[] arr= new String[]{"16-07-1998 27-06-2017","04-02-2016 04-04-2017","04-05-2017 04-04-2017",                    "04-04-2015 04-04-2016","04-04-2015 15-03-2016"};   
                  
            for(String i:arr){            
                String[] dates=i.split(" ");         
                String signup=dates[0];   
                String curr=dates[1]; 
                Date dateSignup = formatter.parse(signup);  
                Date dateCurr = formatter.parse(curr);           
                Period p=Period.between(dateSignup.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),dateCurr.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                int year=p.getYears();            
                int month=p.getMonths();            
                int day=p.getDays();          
                        
                if(year>0 && month==0)               
        		  wholeYear(dateSignup,dateCurr);
                else if(month>10 || month==0)         
                    approachingYear(dateSignup,dateCurr);
                else if(year>=1 && month>=1)  
			  farYear(dateSignup,dateCurr);
                else if(month<1)               
                    System.out.println("No range");         
            }  
        }  
}