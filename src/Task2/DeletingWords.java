package Task2;

import java.util.List;

public class DeletingWords {

     /*
       Завдання 2
       ------------
       1) У наборі: orange, plum, tomato, onion, grape, onion видаліть усі "onion".
       2) Виведіть оновлений набір слів у стовпець, із нумерацією пунктів.
       3) Окремі маніпуляції з даними (набором слів) робіть в окремих методах.

    */

    public static String deletingWords(List<String> list){
        StringBuilder stringBuilder = new StringBuilder();
        list.removeIf(word -> word.equals("onion"));
        int count = 1;
        for (String str: list ){
            stringBuilder.append(count)
                    .append(")")
                    .append(str)
                    .append("\n");
            count++;
        }
        return stringBuilder.toString();
    }
}
