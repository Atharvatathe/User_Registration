import java.util.regex.Pattern;

public class UserValidation {
   private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$" ;
   private static final String LAST_NAME_PATTERN =  "^[A-Z]{1}[a-z]{2,}$" ;
   private static final String EMAILID_PATTERN = "^[a-zA-z]{1,}[.]?[a-zA-z]{1,}?[@]+[a-zA-z]{1,}[.]+[a-z]{1,}[.]?[a-z]{1,}?$";
   private static final String PHONE_NUMBE_PATTERN = "^[0-9]{2}[\\s][789]{1}[0-9]{9}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
   public boolean checkFirstName(String fname)
   {
       Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
       return pattern.matcher(fname).matches();
   }

    public boolean checkLastName(String lname) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }

    public boolean checkEmailID(String email)
    {
        Pattern pattern = Pattern.compile(EMAILID_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean checkPhoneNumber(String phoneNumber)
    {
        Pattern pattern = Pattern.compile(PHONE_NUMBE_PATTERN);
        return pattern.matcher(phoneNumber).matches();
    }

    public boolean checkPassword(String password)
    {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }

    public boolean validEmailAddress(String email){
       Pattern pattern = Pattern.compile(EMAILID_PATTERN);
       return pattern.matcher(email).matches();
    }
}
