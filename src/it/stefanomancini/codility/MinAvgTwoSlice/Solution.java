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

package it.stefanomancini.codility.MinAvgTwoSlice;

import java.util.Arrays;

/**
 * Solution to Codility Lesson #2 Missing Integer
 *
 * @author Stefano Mancini
 */
class Solution {

    int solution(int[] A) {
        int N = A.length;
        float[] avg2elems = new float[N - 1];
        float[] avg3elems = new float[N - 2];
        for (int i = 0; i < N - 1; i++)
            avg2elems[i] = (float) (A[i] + A[i + 1]) / 2;
        System.out.println(Arrays.toString(avg2elems));
        for (int i = 0; i < N - 2; i++)
            avg3elems[i] = (float) (A[i] + A[i + 1] + A[i + 2]) / 3;
        System.out.println(Arrays.toString(avg3elems));
        int position = 0;
        float minAvg = avg2elems[0];
        for (int i = 1; i < N - 1; i++)
            if (avg2elems[i] < minAvg) {
                position = i;
                minAvg = avg2elems[i];
            }
        for (int i = 1; i < N - 2; i++)
            if (avg3elems[i] < minAvg) {
                position = i;
                minAvg = avg3elems[i];
            }
        return position;
    }
}