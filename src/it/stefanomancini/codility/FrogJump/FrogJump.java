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

package it.stefanomancini.codility.FrogJump;

public class FrogJump {

    public static void main(String[] args) {

        class Test {
            private int X;
            private int Y;
            private int Z;
            private int result;

            private Test(int X, int Y, int Z, int result) {
                this.X = X;
                this.Y = Y;
                this.Z = Z;
                this.result = result;
            }
        }

        Solution solution = new Solution();

        //Prepare test data
        Test tests[] = {
                new Test(10, 85, 30, 3),
                new Test(10, 10, 30, 0),
                new Test(10, 100, 30, 3)
        };

        //Run tests
        int success = 0;
        for (int i = 0; i < tests.length; i++) {
            System.out.println("*** Test #" + i);
            int result = solution.solution(tests[i].X, tests[i].Y, tests[i].Z);
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