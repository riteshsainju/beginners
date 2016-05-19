package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  String[] strings = new String[] {
          "hello",
          "mello",
          "mell",
          "1mell",
          "hmmm",
          "h2mmm",
          "zxcvb",
          "asdf",
          "%$compli"
  };

  public Main() {
	    // Write your code here
		  for(int j=0; j<strings.length;j++)
		  {
		      for (int i=j+1 ; i<strings.length; i++)
		      {
		          if(strings[i].compareTo(strings[j])<0)
		          {
		              String temp= strings[j];
		              strings[j]= strings[i]; 
		              strings[i]=temp;


		          }
		      }
		      //Arrays.sort(strings);
			   //  for(String a:strings){
			    //	 System.out.println(strings);
			     // System.out.println(strings[strings.length-1]);
			      
			     }
		  String last = strings[strings.length-1];
		  System.out.println(last);
		  
		  String max = strings[0];
		  boolean last1 = true;
		  for(int i=1;i<strings.length;i++){
			 if(last.compareTo(strings[i])>0){
				 last1=false;
				
				 }
				  }
			
		 System.out.println(last1);
			 
		 }

  public static void main(String[] args) {
    new Main();
  }
}
