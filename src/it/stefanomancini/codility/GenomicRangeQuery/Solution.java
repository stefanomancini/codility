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
        int[] A = new int[N + 1];
        int[] C = new int[N + 1];
        int[] G = new int[N + 1];
        int[] T = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            A[i] = A[i - 1];
            C[i] = C[i - 1];
            G[i] = G[i - 1];
            T[i] = T[i - 1];
            char nucleotide = S.charAt(i - 1);
            switch (nucleotide) {
                case 'A':
                    A[i]++;
                    break;
                case 'C':
                    C[i]++;
                    break;
                case 'G':
                    G[i]++;
                    break;
                case 'T':
                    T[i]++;
                    break;
            }
        }
        int M = P.length;
        int[] R = new int[M];
        for (int i = 0; i < M; i++) {
            int left = P[i];
            int right = Q[i];
            int countA = A[right + 1] - A[left];
            int countC = C[right + 1] - C[left];
            int countG = G[right + 1] - G[left];
            int countT = T[right + 1] - T[left];
            if (countA > 0)
                R[i] = 1;
            else if (countC > 0)
                R[i] = 2;
            else if (countG > 0)
                R[i] = 3;
            else if (countT > 0)
                R[i] = 4;
        }
        return R;
    }
}