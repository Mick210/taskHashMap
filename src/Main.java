import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

         /*Задача
        Дан массив пар названий книг и авторов,
        необходимо привести каждую пару в строку вида:
        «Название книги» Имя Отчество Фамилия автора.*/

        HashMap<String, String> nameBookAuthor = new HashMap<>();

        nameBookAuthor.put("Война и мир", "Л.Н. Толстой");
        nameBookAuthor.put("Мертвые души", "Н.В. Гоголь");
        nameBookAuthor.put("Ревизор", "Н.В. Гоголь");
        nameBookAuthor.put("Сказка о рыбаке и рыбке", "А.С. Пушкин");

        nameBookAuthor.forEach((key, value) -> System.out.println("\"" + key + "\" " + value));
    }
}