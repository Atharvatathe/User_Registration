import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserValidationTest {
    @Test
    public void givenFisrtName_WhenProper_shouldReturnTrue() {
        UserValidationException user = new UserValidationException();
            boolean result = false;
            try {
                result = user.checkFirstName("Atharva");
            } catch (InvalidDetailsException e) {
                e.printStackTrace();
            }
            Assertions.assertTrue(result);

    }


    @Test
    public void givenLastName_WhenProper_shouldReturnTrue() {
        UserValidationException user = new UserValidationException();
        boolean result = false;
        try {
            result = user.checkLastName("Tathe");
        } catch (InvalidDetailsException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailID_WhenProper_shouldReturnTrue() {
        UserValidationException user = new UserValidationException();
        boolean result = false;
        try {
            result = user.checkEmailID("atharva55@gmail.com");
        } catch (InvalidDetailsException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_shouldReturnTrue() {
        UserValidationException user = new UserValidationException();
        boolean result = false;
        try {
            result = user.checkPhoneNumber("91 9912991299");
        } catch (InvalidDetailsException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenProper_shouldReturnTrue() {
        UserValidationException user = new UserValidationException();
        boolean result = false;
        try {
            result = user.checkPassword("Atharv(77");
        } catch (InvalidDetailsException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }
}
