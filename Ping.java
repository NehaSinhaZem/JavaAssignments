
public class Ping
{
	public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        String Ip=s.nextLine();
        Pingip.runSystemCommand("ping " +Ip);
        Pingip.getMedianTime();
    }
}

