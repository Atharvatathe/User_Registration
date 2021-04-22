import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Collection;
import  java.util.Arrays;

@RunWith(Parameterized.class)
public class ValidEmailTest {
   private String emailTest ;
   private boolean expectResult;

   public ValidEmailTest(String email,boolean expectResult){
       this.emailTest = email;
       this.expectResult = expectResult ;
   }

   @Parameterized.Parameters
    public static Collection data(){
       return Arrays.asList(new Object[][] { {"abc@yahoo.com",true},{"abc-100@yahoo.com",true},
               {"abc.100@yahoo.com",true},{"abc111@avc.com",true},{"abc-100@abc.net",true},
               {"abc.100@abc.com.au",true},{"abc@1.com",true},{"abc@gmail.com.com",true}
                });
   }

   @Test
   public void givenEmailID_Whenvalid_shouldReturnAsper_parameterizedResult(){
       UserValidation validator = new UserValidation();
       boolean result =validator.validEmailAddress(this.emailTest);
       Assert.assertEquals(this.expectResult,result);

   }
}
