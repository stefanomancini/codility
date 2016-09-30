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
        Test[] tests = {
                new Test(test1, 5, result1),
                new Test(test2, 0, result2)
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