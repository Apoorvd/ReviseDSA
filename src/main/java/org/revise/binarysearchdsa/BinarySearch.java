package org.revise.binarysearchdsa;

import java.util.List;

public class BinarySearch {

    public int binarySearch(List<Integer> list, int target) {

        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (list.get(mid) == target) {
                return mid;
            }
            else if (list.get(mid) < target) {
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return -1;
    }
}
