/**
 * Creating a class Addition
 * @author Pri
 *
 */
public class Addition {
	// creating a method add and passing two arguments of type integer and it returns sum of that two integers
	public int add(int x,int y){
		int c=x+y;
		System.out.println("Sum of x & y is = ");
		return c;
	}
	//Overloading the add method
	//@overload
    public int add(int x,int y,int z){
    	int c=x+y+z;
	    //calling the add method using this keyword
    	this.add(x, y);
    	return c;
    }
	// main method
	public static void main(String[] args) {
		//Creating object of class addition
		Addition ad= new Addition();
		//printlines and calling the methods
		System.out.println(ad.add(9, 10));
		System.out.println(ad.add(1, 2, 3));
			
		}

	}


