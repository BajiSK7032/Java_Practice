package Qcalc;



	public class StandardCalculator {
	    private int result;

	    public static void getVersion(){
	        System.out.println("Standard Calculator 1.0");
	    }
	    
	public void add(int num1, int num2){
	    result=num1+num2;
	    setResult(result);
	    //return sum;
	}

	public void subtract(int num1, int num2){
	   result=num1-num2;
	   setResult(result);
	   // return difference;
	}


	public void multiply(int num1, int num2){
	    result=num1*num2;
	    setResult(result);
	   // return multiplication;
	}


	public void divide(int num1, int num2){
	   result=num1/num2;
	   setResult(result);
	    //return moduler;
	}
	private void setResult(int value) {
	    this.result = value;

	 }

	public int getResult() {
	    return result;
	}

	public void clearResult(){

	   result=0;
	}

	public void printResult(String oparation){
	    System.out.println(oparation+" :"+getResult());
	}




	}



