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

package it.stefanomancini.codility.lesson1;

/**
 * Solution to Codility Lesson #1
 *
 * @author Stefano Mancini
 */
class Solution {

    public int solution(int N) {
        String binaryN = Integer.toBinaryString(N);
        System.out.println("The binary representaion of " + N + " is: " + binaryN);
        int i = 0;
        int binaryGap = 0;
        while (i < binaryN.length() && binaryN.charAt(i) != '1')
            i++;
        int count = 0;
        for (i++; i < binaryN.length(); i++) {
            if (binaryN.charAt(i) == '1') {
                if (count > 0)
                    System.out.println("Found binary gap of length: " + count);
                if (count > binaryGap)
                    binaryGap = count;
                count = 0;
            } else
                count++;
        }
        return binaryGap;
    }
}