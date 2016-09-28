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

package it.stefanomancini.codility.TapeEquilibrium;

/**
 * Solution to Codility Lesson #3 Tape Equilibrium
 *
 * @author Stefano Mancini
 */
class Solution {

    int solution(int[] A) {
        int[] sums = new int[A.length];
        sums[0] = A[0];
        for (int i = 1; i < A.length; i++)
            sums[i] = sums[i - 1] + A[i];

        int minDifference = Math.abs(sums[0] - (sums[A.length - 1] - sums[0]));
        for (int p = 2; p < A.length; p++) {
            int difference = Math.abs(sums[p - 1] - (sums[A.length - 1] - sums[p - 1]));
            if (difference < minDifference)
                minDifference = difference;
        }
        return minDifference;
    }
}