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

package it.stefanomancini.codility.MaxCounters;

/**
 * Solution to Codility Lesson #2 Max Counters
 * Note: looked for the solution online :-(
 *
 * @author Stefano Mancini
 */
class Solution {

    int[] solution(int N, int[] A) {
        int[] count = new int[N];
        int currentMax = 0;
        int totalMax = 0;
        for (int value : A) {
            if (value == N + 1) {
                totalMax = currentMax;
            } else {
                count[value - 1] = Math.max(count[value - 1], totalMax);
                count[value - 1]++;
                currentMax = Math.max(currentMax, count[value - 1]);
            }
        }
        for (int i = 0; i < N; i++)
            count[i] = Math.max(count[i], totalMax);
        return count;
    }
}