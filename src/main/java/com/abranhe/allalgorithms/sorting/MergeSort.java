/*
 * MIT License
 * Copyright (c) 2018 Carlos Abraham Hernandez <abraham@abranhe.com> (abranhe.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.abranhe.allalgorithms.sorting;

/**
 * The class {@code MergeSort} contains methods for performing
 * a poor :( merge sort algorithm of Integers and Doubles
 *
 * @author  Carlos Abraham Hernandez
 * @since   0.0.1
 */
public class MergeSort {

    /**
     * This class should not be instantiated.
     */
    private MergeSort() { }

    /**
     * Merges two subarrays of arr[].
     * First subarray is arr[l..m]
     * Second subarray is arr[m+1..r]
     *
     * @param arr array
     * @param l index to start sorting
     * @param m index of the middle of the array
     * @param r index to finish sorting
     */
    private static void merge(int arr[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int [n1];
        int R[] = new int [n2];

        System.arraycopy(arr, l + 0, L, 0, n1);

        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Merges two subarrays of arr[]. type double
     * First subarray is arr[l..m]
     * Second subarray is arr[m+1..r]
     *
     * @param arr array
     * @param l index to start sorting
     * @param m index of the middle of the array
     * @param r index to finish sorting
     */
    private static void merge(double arr[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        double L[] = new double [n1];
        double R[] = new double [n2];

        System.arraycopy(arr, l + 0, L, 0, n1);

        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Sort array of integers
     * @param arr array
     * @param l index to start sorting
     * @param r index to finish sorting
     */
    private static void sort(int arr[], int l, int r) {
        if (l < r) {

            int m = (l+r)/2;

            sort(arr, l, m);
            sort(arr , m+1, r);

            merge(arr, l, m, r);
        }
    }

    /**
     * Sort array of doubles
     * @param arr array
     * @param l index to start sorting
     * @param r index to finish sorting
     */
    private static void sort(double arr[], int l, int r) {
        if (l < r) {

            int m = (l+r)/2;

            sort(arr, l, m);
            sort(arr , m+1, r);

            merge(arr, l, m, r);
        }
    }

    /**
     * The sort method of the {@code MergeSort} class
     * takes an array of {@code Integers} an sort it.
     *
     * @param arr array of integers to be sorted
     */
    public static void sort(int arr[]) {
        int l = 0;
        int r = arr.length-1;
        sort(arr, l, r);
    }

    /**
     * The sort method of the {@code MergeSort} class
     * takes an array of {@code Double} an sort it.
     *
     * @param arr array of doubles to be sorted
     */
    public static void sort(double arr[]) {
        int l = 0;
        int r = arr.length-1;
        sort(arr, l, r);
    }
}
