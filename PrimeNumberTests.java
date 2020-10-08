package interviewProgram;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PrimeNumberTests {
  @Test (dataProvider="data-provider")
  public void PrimeNumberTest(Object start, Object end) throws Exception {
	 try {
		 System.out.println("Prime numbers between "+start+" and "+end+" are : ");
		 if(start.equals(null)||end.equals(null))
		 {
			throw new Exception("Start or End numbers are null");
		 }
		 else if((int)start==(int)end)
		 {
			 System.out.println("Start and End Numbers are same.. Kindly provide positive Integer numbers");
			 System.out.println("*************************************");
		 }
		 else if((int)start>(int)end)
		 {
			 System.out.println("End Number is less than start number. Kindly provide positive Integer numbers");
			 System.out.println("*************************************");
		 }
		 else
		 {
			 PrimeNosInaGivenRange.primeNumberList((int)start, (int)end);
		 }
	 }
	 catch(Exception ex)
	 {
		 System.out.println("Invalid datatype has been provided for either start or end numbers. Try to provide only positive integers");
		 System.out.println("*************************************");
	 }
  }
  
  @DataProvider (name = "data-provider")
  public Object[][] dpMethod(){
  return new Object[][] {{20, 0},{0,10},{0,0},{7, 7},{10, 20},{-10, 20},{10, -40},{null,30},{10,null},{10.5, 30},{4, 35.5},{"5","30"},{5,"30"},{"6",40}};
  }
	}
