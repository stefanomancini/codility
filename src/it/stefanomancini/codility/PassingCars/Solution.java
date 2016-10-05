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

package it.stefanomancini.codility.PassingCars;

/**
 * Solution to Codility Lesson #5 Passing Cars
 * Note: looked for the solution online :-(
 *
 * @author Stefano Mancini
 */
class Solution {

    int solution(int[] A) {
        int goingEastSoFar = 0;
        int passingCars = 0;
        for (int value : A)
            if (value == 1) {//Car going West
                passingCars += goingEastSoFar;
                if (passingCars > 1000000000)
                    return -1;
            } else {//Car going East
                goingEastSoFar++;
            }
        return passingCars;
    }
}