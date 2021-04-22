import java.util.regex.Pattern;

public class UserValidationException {

        private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$" ;
        private static final String LAST_NAME_PATTERN =  "^[A-Z]{1}[a-z]{2,}$" ;
        private static final String EMAILID_PATTERN = "^[a-zA-z]{1,}[.]?[a-zA-z]{1,}?[@]+[a-zA-z]{1,}[.]+[a-z]{1,}[.]?[a-z]{1,}?$";
        private static final String PHONE_NUMBE_PATTERN = "^[0-9]{2}[\\s][789]{1}[0-9]{9}$";
        private static final String PASSWORD_PATTERN = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";


        public boolean checkFirstName(String fname) throws InvalidDetailsException {
            Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
            if (pattern.matcher(fname).matches() == true)
                return pattern.matcher(fname).matches();
            else

            throw new InvalidDetailsException("Invalid First Name");
        }


        public boolean checkLastName(String lname)throws InvalidDetailsException {
            Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
            if( pattern.matcher(lname).matches() == true)
                return pattern.matcher(lname).matches();
            else
                throw new InvalidDetailsException("Invalid Last name");
        }

        public boolean checkEmailID(String email)throws InvalidDetailsException  {
            Pattern pattern = Pattern.compile(EMAILID_PATTERN);
            if(pattern.matcher(email).matches() == true)
              return pattern.matcher(email).matches();
            else
                throw new InvalidDetailsException("Invalid Email ID");
        }

        public boolean checkPhoneNumber(String phoneNumber)throws InvalidDetailsException {
            Pattern pattern = Pattern.compile(PHONE_NUMBE_PATTERN);
            if(pattern.matcher(phoneNumber).matches() == true)
                return pattern.matcher(phoneNumber).matches();
            else
                throw new InvalidDetailsException("Invalid Phone Number");
        }

        public boolean checkPassword(String password)throws InvalidDetailsException {
            Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
            if(pattern.matcher(password).matches() == true)
                return pattern.matcher(password).matches();
            else
                throw new InvalidDetailsException("Invalid Password");
        }



}
