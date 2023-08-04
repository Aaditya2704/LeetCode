class Solution {
    public int largestAltitude(int[] gain) {
         int current = 0;
         int highestPoint = current;

         for (int i: gain) {
      current += i;
      highestPoint = Math.max(highestPoint, current);
    }

    return highestPoint;
    }
}