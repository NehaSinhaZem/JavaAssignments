import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class IO{
    static HashMap<Character,Integer> getCharacterCount(File file){
        Scanner s = null ;
        HashMap<Character,Integer> hm = new HashMap<>();
		try  {  
			System.out.println("Reading the contents of the file ..."); 
			s =  new  Scanner ( file );
			while  ( s.hasNextLine())  { 
				String line = s.nextLine();  	// We keep the line on a String 
				for(char c:line.toCharArray()){
                    if(hm.containsKey(c))
                        hm.put(c,hm.get(c)+1);
                    else
                        hm.put(c,1);
                }
			}
		}  catch (Exception ex)  { 
			System.out.println("Message:" + ex.getMessage()); 
		}  finally  { 
			try  { 
				if ( s !=  null ) 
					s .close (); 
			}  catch  (Exception ex2)  { 
				System.out.println( "Message 2:"  + ex2 . getMessage()); 
			} 
		}
        return hm;
    }
    public static void main(String[] args) {
        File file = new File (args[0]); 
        HashMap<Character,Integer> hm= getCharacterCount(file);
		writeInFile(hm);   
    }
    static void writeInFile(HashMap<Character,Integer> hm){
        FileWriter fileWriter =  null ; 
		try  {
			fileWriter =  new  FileWriter ( "writtenfile.txt" );
            for  ( Entry<Character,Integer> e: hm.entrySet() )  { 
				fileWriter.write(e.getKey() + ":" +e.getValue() +"\n"); 
			}
            fileWriter.close();
		}  catch  ( Exception ex )  { 
			System.out.println ( "Message of exception:"  + ex . getMessage ()); 
		}  
    }
}