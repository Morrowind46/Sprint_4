import org.apache.commons.lang3.StringUtils;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

// Посчитать количество вхождений символа в строку 1ый способ:
//        int i = name.indexOf(" ");
//        int count = 0;
//        while (i != -1) {
//            i = name.indexOf(" ", i + 1);
//            count += 1;
//        }

// количество вхождений символа в строку 2ой способ: StringUtils.countMatches(строка, знак, который считаем);

        return
                name.length () >= 3 && // в строке не меньше 3 символов
                name.length () <= 19 && // в строке не больше 19 символов
                StringUtils.countMatches(name, " ") == 1 && // в строке есть только один пробел
                !(name.startsWith (" ")) && // пробел стоит не в начале строки
                !(name.endsWith (" ")); // пробел стоит не в конце строки
    }

// Проверить все условия с помощью регулярных выражений и метода matches():
//    public boolean checkNameToEmbossMatches() {
//        return name.matches ("");
//    }

}