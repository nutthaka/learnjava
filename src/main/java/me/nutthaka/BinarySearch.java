package me.nutthaka;

public class BinarySearch {

    public static int chop(int target, int[] sourceArray) {
        return chop(target, sourceArray, 0, sourceArray.length);
    }

    public static int chop(int target, int[] sourceArray, int leftIndex, int length) {
        if (length == 0) {
            return -1;
        }

        int arrayMidPosition = leftIndex+(length/2);
        int midValue = sourceArray[arrayMidPosition];

        if (midValue == target){
            return arrayMidPosition;
        }

        if (length == 1) {
            return -1;
        }

        if (target < midValue){
            return chop(target, sourceArray, leftIndex, arrayMidPosition-leftIndex);
        }
        else {
            return chop(target, sourceArray, arrayMidPosition+1, sourceArray.length-arrayMidPosition-1);
        }

    }
}
