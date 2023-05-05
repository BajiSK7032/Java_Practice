package Java_Pract;

public class Second_Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int arr[] = new int[n];
      
        arr[0] =5;
        arr[1] =5;
        arr[2]=6;
        arr[3]=5;
        arr[4]=5;
        arr[5]=5;
        		
        int res = secondLargest(n,arr);
        System.out.println(res);

	}
	
	static int secondLargest(int n,int arr[]){
		
		if (arr.length < 2) {
	        return -1; // Array has less than two elements, so 2nd largest doesn't exist
	    }
		
		
		int secondMax = 0;
        int firstMax=arr[0];
        boolean allsame=true;
        
        for(int i=1 ;i<arr.length;i++){
        	if(arr[i]>firstMax) {
        		secondMax=firstMax;
        		firstMax=arr[i];
        		allsame=false;
        		
        	} else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
                allsame=false;
            }else if(arr[i]!=firstMax) {
            	allsame=false;
            	
            }
           
        }
        if (allsame==true) {
        	return -1;
        }else {
        	return secondMax;
		}
        
    }

}
