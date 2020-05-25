import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private Pattern pattern;
    private Matcher matcher;
    private static final String ACCOUNT_REGEX ="^[_a-z0-9]{6,}$";

    public ValidateAccount() {
        pattern = pattern.compile(ACCOUNT_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
