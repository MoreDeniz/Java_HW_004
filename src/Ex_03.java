// 3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
// Используйте итератор

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Ex_03 {
    public static void main(String[] args) {
        int[] myArr = createArray(10, 20, 5);

        LinkedList<Integer> myLinkList = addToLinkList(myArr);
        System.out.print("LinkedList: \n");
        showLinkList(myLinkList);
        Iterator<Integer> col = myLinkList.iterator();
        int summa = getSum(myLinkList);
        System.out.printf("Сумма элементов: %d\n", summa);
    }

    static int[] createArray(int from, int to, int size) {
        Random rand = new Random();
        int[] randomNumbers = new int[size];
        for(int i = 0; i < size; i++){
            randomNumbers[i] = rand.nextInt(to) + from;
        }
        return randomNumbers;
    }

    static LinkedList<Integer> addToLinkList(int[] array) {
        LinkedList<Integer> linkList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            linkList.addLast(array[i]);
        }
        return linkList;
    }

    static void showLinkList(LinkedList<Integer> linkList) {
        for (Integer integer : linkList) {
            System.out.print(integer + "  ");
        }
        System.out.println();
    }

    static int getSum(LinkedList<Integer> linkList) {
        Iterator<Integer> col = linkList.iterator();
        int sum = 0;
        while (col.hasNext()) {
            sum += col.next();
        }
        return sum;
    }
}
