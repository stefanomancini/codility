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

/**
 * Solution to Codility Lesson #2 Missing Integer
 *
 * @author Stefano Mancini
 */
class Solution {

    int solution(int[] A) {
        int position = 0;
        float minAvg = (float) (A[0] + A[1]) / 2;
        for (int i = 2; i < A.length; i++) {
            float avg = (float) (A[i - 1] + A[i]) / 2;
            if (avg < minAvg) {
                position = i - 1;
                minAvg = avg;
            }
            avg = (float) (A[i - 2] + A[i - 1] + A[i]) / 3;
            if (avg < minAvg) {
                position = i - 2;
                minAvg = avg;
            }
        }
        return position;
    }
}