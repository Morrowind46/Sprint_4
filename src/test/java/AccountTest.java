import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final Boolean expected;

    public AccountTest (String name, Boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Тимоти Шаламе", true},
                {"Т Ш", true},
                {"Ти", false},
                {"Тимоти ШаламеШаламеШаламе", false},
                {"Тимоти ШаламеШаламе", true},
                {" Тимоти Шаламе", false},
                {"Тимоти Шаламе ", false},
                {"Тимот и Шаламе", false},
                {"", false},
                {null, false}
        };
    }

    @Test
    public void AccountParameterizedTest() {
        Account account = new Account (name);
        Boolean actual = account.checkNameToEmboss ();
        assertEquals(expected, actual);
    }

}
//    в строке не меньше 3 и не больше 19 символов,
//        в строке есть только один пробел,
//        пробел стоит не в начале и не в конце строки.
