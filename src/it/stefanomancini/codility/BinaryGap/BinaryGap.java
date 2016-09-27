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

public class BinaryGap {

    public static void main(String[] args) {
        Solution solution = new Solution();

        //Prepare test data
        int tests[] = {9, 529, 20, 15, 0};
        int results[] = {2, 4, 1, 0, 0};
        int success = 0;

        //Run test
        for (int i = 0; i < tests.length; i++) {
            System.out.println("*** Test #" + i);
            int result = solution.solution(tests[i]);
            if (result == results[i]) {
                System.out.println("=> Passed.");
                success++;
            } else {
                System.out.println("=> Failed.");
            }
        }

        System.out.println("Success rate: " + Math.round(success / tests.length * 100) + "%");
    }
}