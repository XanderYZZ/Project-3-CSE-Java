/*************************************************************************************************
 * CLASS: Searcher (Searcher.java)
 *
 * DESCRIPTION
 * This is the Searcher class which does a binary search.
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

public class Searcher {
    public static int search(ArrayList<Student> pList, String pKey) {
        int high = pList.size() - 1;
        int low = 0;
    
        while (low <= high) {
            int middle = (low + high) / 2;
            int compare = pKey.compareTo(pList.get(middle).getLastName());
            if (compare == 0){
                return middle;
            } else if (compare < 0){
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}