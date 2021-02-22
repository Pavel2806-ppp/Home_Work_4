package Sign_in;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class RegistrationsFormOne extends BestTest{

    @Test
    public void testCanFindJava(){
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        driver.findElement(By.id("email_create")).sendKeys("test+1@gmail.com");
        driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();
    }

    @Test
    public void testTitle(){
        driver.findElement(By.xpath("//label[normalize-space()='Mr.']")).click();
    }

    @Test
    public void testFirstName(){
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Paul");
    }
    @Test
    public void testLastName(){
        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Walker");
    }

    @Test
    public void testPassword (){
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");
    }

    @Test
    public void testDateOfBird () {
        driver.findElement(By.xpath("//select[@id='days']")).sendKeys("12");
        driver.findElement(By.xpath("//select[@id='months']")).sendKeys("September");
        driver.findElement(By.xpath("//select[@id='years']")).sendKeys("1973");
    }

    @Test
    public void testNewsletter () {
        driver.findElement(By.id("newsletter")).click();
    }

    @Test
    public void testCompany () {

        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Hollywood");
    }

    @Test
    public void testAddress () {
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("90069,\n" +
               " Paul,\n" + " Walker,\n" + " Company Hollywood,\n" +  " United States");
    }


    @Test
    public void testCity () {

        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Los Angeles");
    }
    @Test
    public void testState () {

        driver.findElement(By.xpath("//select[@id='id_state']")).sendKeys("California");
    }

    @Test
    public void testZip () {
        driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("90069");
    }

    @Test
    public void testCountry () {
        driver.findElement(By.xpath("//select[@id='id_country']")).sendKeys("United States");
    }

   /** @Test
    public void testOther (){

        driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("\tjprang@weho.org "
                + " +1 323-848-6400");
    }*/

    @Test
    public void testHomePhone () {
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("+1 323-848-6400");
    }

    @Test
    public void testMobilPhone () {
        driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("+1 323-848-6400");
    }

    @Test
    public void testAlias () {
        driver.findElement(By.xpath("//input[@id='alias']")).sendKeys(" Lion");
    }

    @Test
    public void testRegister () {
        driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();
    }

}
