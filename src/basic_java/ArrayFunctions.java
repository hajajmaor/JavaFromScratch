package basic_java;

import java.util.LinkedList;

public class ArrayFunctions {
    /**
     * this function should return the maximum number from given array.
     */
    public static int getMax(int[] arr) {
        // arr=[-1,-3,-5]
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    /**
     * this function should return the 2nd maximum number from given array.
     */
    public static int getSecMax(int[] arr) {
        // arr=[7,3,5,4,6]
        int max = getMax(arr);
        int secMax;
        if (arr[0] < max)
            secMax = arr[0];
        else
            secMax = arr[1];

        for (int i = 0; i < arr.length; i++)
            if (arr[i] < max && arr[i] > secMax)
                secMax = arr[i];

        /**
         * משתנה מקס מכיל את אינדקס 0 ועוד משתנה מקס-משני מקבל את הערך 0 לולאה שתרוץ על
         * המערך בדיקה של אינדקס מול מקס-משני וקטן ממקס מקס משני מקבל את המספר באינדקס
         */
        return secMax;
    }

    /**
     * this function should return the minimum number from given array.
     */
    public static int getMin(int[] arr) {

        // arr=[-1,-3,-5]
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return min;
    }

    /**
     * this function should return True if array id sort is ascending order, else
     * False
     */
    public static boolean isOrderedAscending(int[] arr) {
        /*
         * 4,2,3,5,7,9,10 סשה מציע לבדוק אחד ואת זה שאחריו אם המספר באינדקס קטן-שווה מזל
         * שאחריו
         */
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * this function should return True if array id sort is descending order, else
     * False
     */
    public static boolean isOrderedDescending(int[] arr) {
        // 10,6,5,3,2,1
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * this function should return true if arr1 is equal to arr2, order of elements
     * is not relevant, else False
     */
    public static boolean isEquals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        boolean flag;
        for (int i = 0; i < arr1.length; i++) {
            flag = false;
            for (int j = 0; j < arr2.length; j++)
                if (arr1[i] == arr2[j]) {
                    flag = true;
                    break;
                }
            if (!flag)
                return false;
        }
        // if arr1 = [1,2,3,4,5,1], arr2 = [1,2,3,4,5,6]
        // length is the same, but the elements not - comparing arr2 to arr1
        for (int i = 0; i < arr2.length; i++) {
            flag = false;
            for (int j = 0; j < arr1.length; j++)
                if (arr2[i] == arr1[j]) {
                    flag = true;
                    break;
                }
            if (!flag)
                return false;
        }
        return true;
    }

    public static int[] deleteDuplicates(int[] arr) {
        // arr=[3,2,5,6,4,5,6,7]
        // int[] tempArray = new int[arr.length]; // [8]
        LinkedList<Integer> temp = new LinkedList<Integer>();

        /// passing one by one, if list containing the number, do not add, else add
        for (int i = 0; i < arr.length; i++)
            if (temp.indexOf(arr[i]) == -1)
                temp.add(arr[i]);

        // create new array of size (size of the linked list)
        int[] result = new int[temp.size()];
        // fill the new array
        for (int i = 0; i < temp.size(); i++)
            result[i] = temp.get(i);
        return result;
    }

}
