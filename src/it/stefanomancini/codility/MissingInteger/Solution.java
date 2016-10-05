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

package it.stefanomancini.codility.MissingInteger;

/**
 * Solution to Codility Lesson #2 Missing Integer
 *
 * @author Stefano Mancini
 */
class Solution {

    int solution(int[] A) {
        int N = A.length;
        int[] count = new int[N];
        for (int value : A)
            if (value > 0 && value < N + 1)
                count[value - 1]++;
        for (int i = 0; i < count.length; i++)
            if (count[i] == 0)
                return i + 1;
        return N + 1;
    }
}