import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class TestOne {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число");
//        int i = scanner.nextInt();
//        System.out.println(returnString(i));
//    }
    public static String returnString(int i){
        String string;
        if (i % 3 == 0 && i % 5 == 0){
            string = "TMS";
        } else if (i % 5 == 0){
            string = "M";
        } else if (i % 3 == 0) {
            string = "T";
        } else {
            string = "Nothing";
        }
        return string;
    }

    @Test
    public void tmsTest(){
        String result = returnString(6);

        Assert.assertEquals(result, "T");
    }

    @Test
    public void tmsTest2(){
        String result = returnString(5);

        Assert.assertEquals(result, "M");
    }

    @Test
    public void tmsTest3(){
        String result = returnString(15);

        Assert.assertEquals(result, "TMS");
    }

    @Test
    public void tmsTest4(){
        String result = returnString(0);

        Assert.assertEquals(result, "TMS");
    }

    @Test
    public void tmsTest5(){
        String result = returnString(10);

        Assert.assertEquals(result, "M");
    }

    @Test
    public void tmsTest6(){
        String result = returnString(99);

        Assert.assertEquals(result, "T");
    }

    @Test
    public void tmsTest7(){
        String result = returnString(-3);

        Assert.assertEquals(result, "T");
    }

    @Test
    public void tmsTest8(){
        String result = returnString(-5);

        Assert.assertEquals(result, "M");
    }

//    @Test
//    public void tmsTest9(){
//        String result = returnString(-5);
//
//        Assert.assertEquals(result, "M");
//    }

    @Test
    public void tmsTest10(){
        String result = returnString(-1);

        Assert.assertEquals(result, "Nothing");
    }

    @Test
    public void tmsTest11(){
        String result = returnString(1);

        Assert.assertEquals(result, "Nothing");
    }
}
