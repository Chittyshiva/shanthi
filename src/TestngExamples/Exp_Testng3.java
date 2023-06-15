package TestngExamples;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exp_Testng3{
@BeforeMethod
public void login() {
System.out.println("login completed");
}
@AfterMethod
public void logout() {
System.out.println("logout completed");
}
@Test(priority=2)
public void addemp() {
System.out.println("Add new emp");
}
@Test(priority=1)
public void delemp() {
System.out.println("delete emp");
}

}
