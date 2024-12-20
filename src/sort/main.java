package sort;

public class main {
    public static void main(String[] args) {
        Array<Person> persons = new Array<>(5);
        persons.insert(new Person("Иван", "Иванов", 25));
        persons.insert(new Person("Евгений", "Кузнецов", 30));
        persons.insert(new Person("Алиса", "Пушкина", 20));
        persons.insert(new Person("Александр", "Вильнюсов", 27));
        persons.insert(new Person("Чарли", "Круг", 22));

        System.out.println("Стартовый массив:");
        persons.display();

        System.out.println("\nПузырьковая сортировка:");
        persons.bubbleSort();
        persons.display();

        System.out.println("\nСортировка методом выбора:");
        persons.selectionSort();
        persons.display();

        System.out.println("\nМетодом вставки:");
        persons.insertionSort();
        persons.display();
    }
}

