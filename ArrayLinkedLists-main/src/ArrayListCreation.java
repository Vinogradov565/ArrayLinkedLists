import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCreation {
    public ArrayList<Integer> arrayList = new ArrayList<>(30);
    private final int[] array = new int[10];

    private void fillArray() {
        for (int i=0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 30) - 15);
            System.out.print(array[i] + " ");
        }

    }

    private void createArrayList() {
        fillArray();
        System.out.println(" ");

        for (int i : array) {
            if (i > 0) {
                arrayList.add(i);
            }
        }

        showArrayList(arrayList);

    }

    private void addNewValues() {
        createArrayList();
        System.out.println(" ");
        int sizeOfArrayList = arrayList.size();

        for (int j=0; j < sizeOfArrayList; j++) {
            arrayList.add(arrayList.get(j) * 10);
        }

        showArrayList(arrayList);
    }

    private void removeElements() {
        addNewValues();

        for (int h=0; h < arrayList.size(); h++) {
            if(arrayList.get(h) < 10) {
                arrayList.remove(h);
            }
        }

        showArrayList(arrayList);
    }

    public void sortArrayList() {
        removeElements();

        Collections.sort(arrayList);
        showArrayList(arrayList);
    }

    private void showArrayList(ArrayList<Integer> arrayList) {
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
    }
}