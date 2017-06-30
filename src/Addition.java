/**
 * Creating a class Addition
 * @author Pri
 *
 */
public class Addition {
	
	public int add(int x,int y){
		int c=x+y;
		System.out.println("Sum of x & y is = ");
		return c;
	}
	//@overload
    public int add(int x,int y,int z){
    	int c=x+y+z;
    	this.add(x, y);
    	return c;
    }
	public static void main(String[] args) {
		Addition ad= new Addition();
		System.out.println(ad.add(9, 10));
		System.out.println(ad.add(1, 2, 3));
			
		}

	}


