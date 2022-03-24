import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

class Pingip
{
    static ArrayList<Integer> list= new ArrayList<Integer>();
    static int median;
    static int getTime(String s){
        String[] time= s.split(" ");
        for(String str:time){
            if(str.contains("time")){
                String ms="";
                for(char c:str.toCharArray())
                    if(c-'0'>=0 && c-'0'<10)
                        ms+=c;
                return ms!=""?Integer.parseInt(ms):0;
            }
        }
        return 0;
    }
    public static void runSystemCommand(String Command){
        try{
            Process p=Runtime.getRuntime().exec(Command);
            BufferedReader InputStream=new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s="";
            int i=0;
            while((s=InputStream.readLine())!=null){
                System.out.println(s);
                list.add(getTime(s));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    static void getMedianTime(){
        Collections.sort(list);
        median=list.size()%2==1?list.get(list.size()/2):
                (list.get((list.size()/2)-1)+list.get(list.size()/2))/2;
        System.out.println("Median of time taken to ping = "+median+"ms");
    }

}