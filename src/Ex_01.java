// 1. Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.
// Постараться не обращаться к листу по индексам.

import java.util.LinkedList;

public class Ex_01 {
    public static void main(String[] args) {
        int[] myArr = createArray(10);

        LinkedList<Integer> myLinkList = addToLinkList(myArr);
        showLinkList(myLinkList);

        LinkedList<Integer> myLinkList1 = addToMirrorList(myArr);
        showLinkList(myLinkList1);
    }

    static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    static LinkedList<Integer> addToLinkList(int[] array) {
        LinkedList<Integer> linkList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            linkList.addLast(array[i]);
        }
        return linkList;
    }

    static LinkedList<Integer> addToMirrorList(int[] array) {
        LinkedList<Integer> linkList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            linkList.addFirst(array[i]);
        }
        return linkList;
    }

    static void showLinkList(LinkedList<Integer> linkList) {
        for (Integer integer : linkList) {
            System.out.print(integer + "  ");
        }
        System.out.println();
    }
}
