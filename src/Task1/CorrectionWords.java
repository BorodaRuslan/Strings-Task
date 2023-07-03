package Task1;

public class CorrectionWords {

     /*
      Завдання 1
------------
     1) У наборі: brange, plum, tomato, onibn, grape виправте слова з помилками.
     2) Виведіть виправлений набір слів у стовпець із нумерацією пунктів.
     3) Окремі маніпуляції з даними (набором
     слів) робіть в окремих методах.
     */
    public static String correctionWords(String [] arr){
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 0; i < arr.length; i++){
            stringBuilder.append(count).append(")")
                    .append(arr[i].replace('b', 'o'))
                    .append("\n");
            count++;
        }
        return stringBuilder.toString();
    }
}
