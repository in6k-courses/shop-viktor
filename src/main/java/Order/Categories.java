package Order;

// Создавать пустой класс с вложеным enum нет никакого смысла.
// Это только усложняет код. Боло бы верно создать только enum.
// Элементы enum прринято называть как константы - в верхнем регистре.
public class Categories {
    public enum category{
        clothes,
        medicament,
        food,
        nothing
    }
}
