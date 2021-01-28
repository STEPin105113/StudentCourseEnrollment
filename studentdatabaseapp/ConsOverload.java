
package studentdatabaseapp;
public class ConsOverload
{
	  private String name;

	// Method overloading
	  public ConsOverload(String n){
	    name = n;
	  }
	  public ConsOverload(){
	    name = "\t\tEnrollment App";
	  }

	  public void printName(){
	    System.out.println(name);
	  }
}
