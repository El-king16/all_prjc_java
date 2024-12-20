package sort;

import java.util.ArrayList;
import java.util.List;

class Array<T extends Comparable<T>> {
    private List<T> array;

    // Конструктор с указанием количества элементов
    public Array(int size) {
        array = new ArrayList<>(size);
    }

    // Метод для вставки элемента
    public void insert(T value) {
        array.add(value);
    }

    // Метод для вывода элементов массива
    public void display() {
        for (T value : array) {
            System.out.println(value);
        }
    }

    // Пузырьковая сортировка
    public void bubbleSort() {
        int n = array.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array.get(j).compareTo(array.get(j + 1)) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    // Сортировка выбором
    public void selectionSort() {
        int n = array.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array.get(j).compareTo(array.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            swap(i, minIndex);
        }
    }

    // Сортировка вставками
    public void insertionSort() {
        int n = array.size();
        for (int i = 1; i < n; i++) {
            T key = array.get(i);
            int j = i - 1;
            while (j >= 0 && array.get(j).compareTo(key) > 0) {
                array.set(j + 1, array.get(j));
                j--;
            }
            array.set(j + 1, key);
        }
    }

    // Вспомогательный метод для обмена элементов
    private void swap(int i, int j) {
        T temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
}

