/*************************************************************************************************
 * CLASS: Sorter (Sorter.java)
 *
 * DESCRIPTION
 * This is the sorter class which sorts.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, Spring 2022
 * Project Number: Project 3
CSE205 Object Oriented Programming and Data Structures Programming Project 3 :: 25 Points
 *
 * AUTHOR: Xander Arnspiger, xarnspig, 1220789908, xarnspig@asu.edu
 ******************************************************************************************************/

package proj3;

import java.util.ArrayList;

public class Sorter {
    public static void sort(ArrayList<Student> pList) {
        quickSort(pList, 0, pList.size() - 1);
    }

    private static void quickSort(ArrayList<Student> pList, int pFromIdx, int pToIdx) {
        if (pFromIdx >= pToIdx) { return; }

        /* pi is partitioning index, arr[p] is now
        at right place */
        int pi = partition(pList, pFromIdx, pToIdx);

        // Separately sort elements before
        // partition and after partition
        quickSort(pList, pFromIdx, pi - 1);
        quickSort(pList, pi + 1, pToIdx);
    }

    private static int partition(ArrayList<Student> pList, int pFromIdx, int pToIdx){
        Student pivot = pList.get(pFromIdx);

        int leftIndex = pFromIdx - 1;
        int rightIndex = pToIdx + 1;

        while (leftIndex < rightIndex){
            leftIndex++;
            while(pList.get(leftIndex).compareTo(pivot) < 0){
                leftIndex++;
            }
            rightIndex--;
            while(pList.get(rightIndex).compareTo(pivot)>0){
                rightIndex--;
            }
            if(leftIndex<rightIndex){
                swap(pList,leftIndex,rightIndex);
            }
        }
        return rightIndex;
    }

    private static void swap(ArrayList<Student> pList, int pldx1, int pldx2) {
        Student value1 = pList.get(pldx1);
        Student value2 = pList.get(pldx2);

        pList.set(pldx1, value2);
        pList.set(pldx2, value1);
    }
}