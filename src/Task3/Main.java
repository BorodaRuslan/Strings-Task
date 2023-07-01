package Task3;
import java.util.Scanner;

public class Main {
    /*

     Завдання 3
     ------------
     1) У переліку: Bob, Alice, Tom, Lucy, Bob, Lisa зробіть пошук імені та підрахунок кількості однакових імен.
     2) Введення пошуку імені реалізуйте через Scanner.
     3) Реалізуйте виведення знайденого імені та його кількості в списку. Також реалізуйте можливість виводу
     повідомлення про відсутність даних, якщо такого імені у списку немає.
     4) Окремі маніпуляції із даними виконуйте в окремих методах.

    */
    public static void main(String[] args) {
        String result = searchName();
        System.out.println(result);

    }
    public static String searchName(){
        Scanner scanner = new Scanner(System.in);
        String [] dataName = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
        int countName = 0;

        System.out.println("Enter a name to search!");
        String search = scanner.next();

        for (int i = 0; i < dataName.length; i++){
            if (dataName[i].equals(search)) {
                countName++;
            }
        }

        return countName > 0 ? "Name: " + search + " Was found: " + countName : "Name: " + search+" not found!";






    }
}
