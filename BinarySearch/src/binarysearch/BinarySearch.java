package binarysearch;

//ToDo UPDATE: Test new algorithm and look for bugs with an odd-index array.
public class BinarySearch {
    public String search(int[] arr, int value) {
        if (arr.length == 0){
            return "The array is empty.";
        }
        if (arr.length == 1){
            if (arr[0] == value){
                return "Element " + arr[0] + " is at index " + 1;
            }
            else {
                return "Element is not in the array.";
            }
        }
        int midInd;
        int leftInd = 0;
        int rightInd = arr.length-1; 
        while (leftInd <= rightInd) {
            midInd = (leftInd + rightInd)/2; //Starts at 3
            if (value == arr[midInd]){
                return "Element is at index " + midInd + ".";
            }
            if (value < arr[midInd]){
                rightInd = midInd - 1;
            }
            else {
                leftInd = midInd + 1;
            }
        }
        return "Element is not in the array.";
    }
}
