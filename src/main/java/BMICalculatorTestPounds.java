import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BMICalculatorTestPounds {
    @Test
    public void calcTest1(){
        open("https://healthunify.com/bmicalculator/");
//        $(By.name("opt1")).click();
        $(By.name("opt1")).selectOption("pounds");
        $(By.name("wg")).sendKeys("50");
        $(By.name("ht")).sendKeys("150");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Normal");
    }
    @Test
    public void calcTest2(){
        open("https://healthunify.com/bmicalculator/");
//        $(By.name("opt1")).click();
        $(By.name("opt1")).selectOption("pounds");
        $(By.name("wg")).sendKeys("60");
        $(By.name("ht")).sendKeys("150");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Overweight");
    }
    @Test
    public void calcTest3(){
        open("https://healthunify.com/bmicalculator/");
//        $(By.name("opt1")).click();
        $(By.name("opt1")).selectOption("pounds");
        $(By.name("wg")).sendKeys("30");
        $(By.name("ht")).sendKeys("150");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Starvation");
    }
    @Test
    public void calcTest4(){
        open("https://healthunify.com/bmicalculator/");
//        $(By.name("opt1")).click();
        $(By.name("opt1")).selectOption("pounds");
        $(By.name("wg")).sendKeys("40");
        $(By.name("ht")).sendKeys("150");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Underweight");
    }
    @Test
    public void calcTest5(){
        open("https://healthunify.com/bmicalculator/");
//        $(By.name("opt1")).click();
        $(By.name("opt1")).selectOption("pounds");
        $(By.name("wg")).sendKeys("80");
        $(By.name("ht")).sendKeys("150");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Obese");
    }
}
