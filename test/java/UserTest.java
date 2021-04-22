import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

        @Test
        public void givenFisrtName_WhenProper_shouldReturnTrue() {
            UserValidation user = new UserValidation();
            boolean result = user.checkFirstName("Atharva");
            Assertions.assertTrue(result);
        }


        @Test
        public void givenLastName_WhenProper_shouldReturnTrue() {
            UserValidation user = new UserValidation();
            boolean result = user.checkLastName("Tathe");
            Assertions.assertTrue(result);
        }

        @Test
        public void givenEmailID_WhenProper_shouldReturnTrue() {
            UserValidation user = new UserValidation();
            boolean result = user.checkEmailID("atharva55@gmail.com");
            Assertions.assertTrue(result);
        }

        @Test
        public void givenPhoneNumber_WhenProper_shouldReturnTrue() {
            UserValidation user = new UserValidation();
            boolean result = user.checkPhoneNumber("91 9912991299");
            Assertions.assertTrue(result);
        }

        public void givenPassword_WhenProper_shouldReturnTrue() {
            UserValidation user = new UserValidation();
            boolean result = user.checkPassword("Atharva&77");
            Assertions.assertTrue(result);
        }
}


