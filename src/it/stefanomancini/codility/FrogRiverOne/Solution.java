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

package it.stefanomancini.codility.FrogRiverOne;

/**
 * Solution to Codility Lesson #2 Cyclic Rotation
 *
 * @author Stefano Mancini
 */
class Solution {

    int solution(int X, int[] A) {
        //Initialise tracking variables
        boolean[] covered = new boolean[X];
        int allCovered = X * (X + 1) / 2;
        //Find solution
        for (int i = 0; i < A.length; i++) {
            if (!covered[A[i] - 1]) {
                covered[A[i] - 1] = true;
                allCovered -= A[i];
                if (allCovered == 0)
                    return i;
            }
        }
        return -1;
    }
}