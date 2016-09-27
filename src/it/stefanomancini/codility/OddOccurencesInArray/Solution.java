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

package it.stefanomancini.codility.OddOccurencesInArray;

import java.util.Arrays;

/**
 * Solution to Codility Lesson #2 Cyclic Rotation
 *
 * @author Stefano Mancini
 */
class Solution {

    int solution(int[] A) {
        //A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println("Input: " + Arrays.toString(A));
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                boolean paired = false;
                for (int j = i + 1; j < A.length; j++)
                    if (A[i] == A[j]) {
                        A[i] = A[j] = 0;
                        paired = true;
                        break;
                    }
                if (!paired)
                    return A[i];
            }
        }
        return 0;
    }
}