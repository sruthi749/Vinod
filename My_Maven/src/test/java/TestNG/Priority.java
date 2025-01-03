package TestNG;

import org.testng.annotations.Test;

public class Priority {
  @Test(priority = 1)//priority is used to set order of testcases
  public void testCase1() 
  {
	  System.out.println("Testcase 1 executed");
  }
  @Test //without priority = 0, it TestNG consider it as first priority //multiple without priority its consider based on alphabetic order
  public void testCase2() 
  {
	  System.out.println("Testcase 2 executed");
  }
  @Test(priority = 5)
  public void testCase3() 
  {
	  System.out.println("Testcase 3 executed");
  }
  @Test
  public void testCase4() 
  {
	  System.out.println("Testcase 4 executed");
  }
  @Test(priority = 2)
  public void testCase5() 
  {
	  System.out.println("Testcase 5 executed");
  }
}
