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

package it.stefanomancini.codility.NumberOfDiscIntersections;

/**
 * Solution to Codility Lesson #6 NumberOfDiscIntersections
 *
 * @author Stefano Mancini
 */
class Solution {

    int solution(int[] A) {
        int N = A.length;
        int[] left = new int[N];
        int[] right = new int[N];
        int intersections = 0;
        for (int i = 0; i < N; i++) {
            left[i] = i - A[i];
            right[i] = i + A[i];
        }
        for (int j = 0; j < N - 1; j++)
            for (int k = j + 1; k < N; k++) {
                if (right[j] >= left[k] && right[k] >= left[j])
                    intersections++;
            }
        return intersections;
    }
}