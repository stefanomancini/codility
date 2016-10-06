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

/**
 * Solution to Codility Lesson #5: Genomic Range Query
 *
 * @author Stefano Mancini
 */
class Solution {

    int[] solution(String S, int[] P, int[] Q) {
        int N = S.length();
        int M = P.length;
        int[] A = new int[N + 1];
        int[] C = new int[N + 1];
        int[] G = new int[N + 1];
        int[] results = new int[M];

        for (int i = 1; i < N + 1; i++) {
            char genome = S.charAt(i - 1);
            A[i] = A[i - 1] + ((genome == 'A') ? 1 : 0);
            C[i] = C[i - 1] + ((genome == 'C') ? 1 : 0);
            G[i] = G[i - 1] + ((genome == 'G') ? 1 : 0);
        }

        for (int i = 0; i < M; i++) {
            int countA = A[Q[i] + 1] - A[P[i]];
            int countC = C[Q[i] + 1] - C[P[i]];
            int countG = G[Q[i] + 1] - G[P[i]];
            if (countA > 0)
                results[i] = 1;
            else if (countC > 0)
                results[i] = 2;
            else if (countG > 0)
                results[i] = 3;
            else
                results[i] = 4;
        }
        return results;
    }
}