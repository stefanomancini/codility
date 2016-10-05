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

package it.stefanomancini.codility.GenomicRangeQuery;

import java.util.Arrays;

public class GenomicRangeQuery {

    public static void main(String[] args) {

        class Test {
            private String S;
            private int[] P;
            private int[] Q;
            private int[] R;

            private Test(String S, int[] P, int[] Q, int[] R) {
                this.S = S;
                this.P = P;
                this.Q = Q;
                this.R = R;
            }
        }

        Solution solution = new Solution();

        //Prepare test data
        String S1 = "CAGCCTA";
        int[] P1 = {2, 5, 0};
        int[] Q1 = {4, 5, 6};
        int[] R1 = {2, 4, 1};
        Test[] tests = {
                new Test(S1, P1, Q1, R1)
        };

        //Run test
        int success = 0;
        for (int i = 0; i < tests.length; i++) {
            System.out.println("*** Test #" + i);
            int[] result = solution.solution(tests[i].S, tests[i].P, tests[i].Q);
            if (Arrays.equals(result, tests[i].R)) {
                System.out.println("=> Passed.");
                success++;
            } else {
                System.out.println("=> Failed.");
            }
        }
        System.out.println("Success rate: " + Math.round(success / tests.length * 100) + "%");
    }
}