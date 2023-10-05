package org.example.app;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeChecker {

        public static boolean isUser18OrOlder(String dateOfBirth) {
            // Define the date format
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Parse the date of birth
            LocalDate birthDate = LocalDate.parse(dateOfBirth, dateFormat);

            // Calculate the age
            LocalDate currentDate = LocalDate.now();
            Period age = Period.between(birthDate, currentDate);

            // Check if the user is 18 or older
            return age.getYears() >= 18;
        }
    }


