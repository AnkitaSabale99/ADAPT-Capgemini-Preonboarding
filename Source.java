import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Source {
	public static void main(String args[] ) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		
		for(int i = 0; i < 5; i++){
		    if(sc.hasNextLine())		
		    	list.add(sc.nextLine());

		}
		    
		Collections.sort(list);   		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
		    System.out.println(itr.next());
		}

	}
}