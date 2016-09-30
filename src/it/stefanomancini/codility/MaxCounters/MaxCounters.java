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

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {

        class Test {
            private int[] A;
            private int N;
            private int[] result;

            private Test(int[] A, int N, int[] result) {
                this.A = A;
                this.N = N;
                this.result = result;
            }
        }

        Solution solution = new Solution();

        //Prepare test data
        int[] test1 = {3, 4, 4, 6, 1, 4, 4};
        int[] result1 = {3, 2, 2, 4, 2};
        int[] test2 = {};
        int[] result2 = {};
        int[] test3 = {3, 4, 4, 6, 1, 6, 4, 6, 2};
        int[] result3 = {4, 5, 4, 4, 4};
        int[] test4 = {6, 6, 6, 1, 2, 3};
        int[] result4 = {1, 1, 1, 0, 0};
        Test[] tests = {
                new Test(test1, 5, result1),
                new Test(test2, 0, result2),
                new Test(test3, 5, result3),
                new Test(test4, 5, result4)
        };

        //Run test
        int success = 0;
        for (int i = 0; i < tests.length; i++) {
            System.out.println("*** Test #" + i);
            int[] result = solution.solution(tests[i].N, tests[i].A);
            if (Arrays.equals(result, tests[i].result)) {
                System.out.println("=> Passed.");
                success++;
            } else {
                System.out.println("=> Failed.");
            }
        }
        System.out.println("Success rate: " + Math.round(success / tests.length * 100) + "%");
    }
}