/*
 * Copyright 2016 Stefano Mancini
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.stefanomancini.codility.MaxProductOfThree;

/**
 * Solution to Codility Lesson #2 Missing Integer
 *
 * @author Stefano Mancini
 */
class Solution {

    int solution(int[] A) {
        int N = A.length;
        mergesort(A, 0, A.length - 1); //O(n log n)
        return A[N - 1] * A[N - 2] * A[N - 3]; //O(1): Only works for positive numbers
    }

    /**
     * Sort the vector given in input in ascending order.
     *
     * @param ints The vector to be sorted.
     */
    private void mergesort(int[] ints, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergesort(ints, left, center);
            mergesort(ints, center + 1, right);
            merge(ints, left, center, right);
        }
    }

    /**
     * Merge two contiguous sorted segments in a vector keeping the elements sorted.
     * The segments to be merged are the ones delimited by: left - center, center+1 - right.
     *
     * @param ints   The input vector containing the segments to be merged, both segments must be already sorted.
     * @param left   The starting point of the first segment in the vector.
     * @param center The ending point of the first segment in the vector. The second segment starts at center + 1
     * @param right  The ending point of the second segment in the vector.
     */
    private void merge(int[] ints, int left, int center, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = center + 1;
        int k = 0;
        while (i <= center && j <= right) {
            if (ints[i] < ints[j]) {
                temp[k] = ints[i];
                i++;
            } else {
                temp[k] = ints[j];
                j++;
            }
            k++;
        }
        while (i <= center) {
            temp[k] = ints[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = ints[j];
            j++;
            k++;
        }
        for (k = left; k <= right; k++)
            ints[k] = temp[k - left];
    }
}