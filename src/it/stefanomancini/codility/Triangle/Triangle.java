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

package it.stefanomancini.codility.Triangle;

public class Triangle {

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
        int[] test1 = {10, 2, 5, 1, 8, 20};
        int result1 = 1;
        int[] test2 = {10, 50, 5, 1};
        int result2 = 0;
        int[] test3 = {2147483647, 2147483647, 2147483647};
        int result3 = 0;
        Test[] tests = {
                new Test(test1, result1),
                new Test(test2, result2),
                new Test(test3, result3)
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
        System.out.println("Success rate: " + Math.round((float) success / tests.length * 100) + "%");
    }
}