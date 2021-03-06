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

package it.stefanomancini.codility.BinaryGap;

/**
 * Solution to Codility Lesson #1 Binary Gap
 *
 * @author Stefano Mancini
 */
class Solution {

    int solution(int N) {
        int binaryGap = 0;
        int count = -1;
        while (N > 0) {
            if (N % 2 == 1) {
                if (count > binaryGap)
                    binaryGap = count;
                count = 0;
            } else if (count >= 0)
                count++;
            N = N / 2;
        }
        return binaryGap;
    }
}