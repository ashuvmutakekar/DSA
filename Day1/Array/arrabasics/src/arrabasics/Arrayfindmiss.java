package arrabasics;

public class Arrayfindmiss {

	public static void main(String[] args) {
		int[] nums = new int[]{0, 2};

		  int x=0;
	      int i=0;
	        while(i<=nums.length)
	        {
	              int con=0;
	           for(int j=0;j<nums.length;j++)
	        {
	           if(i==nums[j]){
	            break;
	           }
	           else
	           {
	             con=1;
	             x=i;
	           }
	          
	        }
	           i++;
	        }
	      
	           
	        
	      System.out.println(x);
	}

}
