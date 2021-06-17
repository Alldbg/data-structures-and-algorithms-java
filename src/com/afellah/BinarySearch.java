package com.afellah;

public class BinarySearch {

    /*
       return index of the searched value , -1 if not found
    */
    private static int binarySearch_Imperatively(int[] inputs, int target) {
        if (inputs != null && inputs.length != 0) {
            int med;
            int left = 0;
            int right = inputs.length - 1;// error  right = inputs.length
            while (left <= right) {  // error left != right or  left < right
                med = (left + right) / 2;
                if (inputs[med] == target) return med;
                else {
                    if (inputs[med] > target) {
                        right = med - 1;  //error  right = med;
                    } else {
                        left = med + 1;   //error  left = med;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] tab = {-23, -3, 4, 9, 22, 30, 32, 899, 11110, 34343}; //order array
        int index_found = binarySearch_Imperatively(tab, -23);
        System.out.println("Index of searched value is: " + index_found);

        index_found = binarySearch_Imperatively(tab, 9);
        System.out.println("Index of searched value is: " + index_found);
    }
}
