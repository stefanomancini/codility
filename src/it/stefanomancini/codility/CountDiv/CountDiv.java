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

package it.stefanomancini.codility.CountDiv;

public class CountDiv {

    public static void main(String[] args) {
        Solution solution = new Solution();

        //Prepare test data
        int A[] = {6, 2, 1, 5, 0, 0};
        int B[] = {11, 3, 1, 15, 0, 2000000000};
        int K[] = {2, 4, 1, 1, 1, 2};
        int results[] = {3, 0, 1, 11, 0, 1000000000};

        //Run test
        int success = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println("*** Test #" + i);
            int result = solution.solution(A[i], B[i], K[i]);
            if (result == results[i]) {
                System.out.println("=> Passed.");
                success++;
            } else {
                System.out.println("=> Failed.");
            }
        }
        System.out.println("Success rate: " + Math.round((float) success / A.length * 100) + "%");
    }
}