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

package it.stefanomancini.codility.TapeEquilibrium;

public class TapeEquilibrium {

    public static void main(String[] args) {

        class Test {
            private int[] A;
            private int result;

            private Test(int[] A, int result) {
                this.A = A;
                this.result = result;
            }
        }

        Solution solution = new Solution();

        //Prepare test data
        int[] test1 = {3, 1, 2, 4, 3};
        int result1 = 1;
        Test[] tests = {
                new Test(test1, result1),
        };

        //Run test
        int success = 0;
        for (int i = 0; i < tests.length; i++) {
            System.out.println("*** Test #" + i);
            int result = solution.solution(tests[i].A);
            if (result == tests[i].result) {
                System.out.println("=> Passed.");
                success++;
            } else {
                System.out.println("=> Failed.");
            }
        }
        System.out.println("Success rate: " + Math.round(success / tests.length * 100) + "%");
    }
}