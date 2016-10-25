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

package it.stefanomancini.codility.Triangle;

import java.util.Arrays;

/**
 * Solution to Codility Lesson #6 Triangle
 *
 * @author Stefano Mancini
 */
class Solution {

    int solution(int[] A) {
        int triangle = 0;
        if (A.length >= 3) {
            Arrays.sort(A);
            int P = 0;
            int Q = 1;
            int R = 2;
            while (R < A.length && triangle != 1) {
                if ((long) A[P] + A[Q] > (long) A[R])
                    triangle = 1;
                else {
                    P++;
                    Q++;
                    R++;
                }
            }
        }
        return triangle;
    }
}