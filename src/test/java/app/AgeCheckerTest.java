package app;

import org.example.app.AgeChecker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testIsUser18OrOlder() {
        // Test with a date of birth that is 18 years ago
        String dateOfBirth1 = "2005-03-15";
        Assert.assertTrue(AgeChecker.isUser18OrOlder(dateOfBirth1));
        System.out.println("User is under 18");

        // Test with a date of birth that is less than 18 years ago
        String dateOfBirth2 = "2010-08-20";
        Assert.assertFalse(AgeChecker.isUser18OrOlder(dateOfBirth2));
        System.out.println("User is over 18");
    }
}

