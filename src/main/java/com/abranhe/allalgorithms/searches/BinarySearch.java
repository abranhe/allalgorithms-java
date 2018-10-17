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
package com.abranhe.allalgorithms.searches;

/**
 *  The <tt>BinarySearch</tt> class provides a static method for binary
 *  searching for an integer in a sorted array of integers.
 *  <p>
 *  The <em>rank</em> operations takes logarithmic time in the worst case.
 *  <p>
 *
 * @author  Carlos Abraham Hernandez
 * @since   0.0.1
 */

public class BinarySearch {

    /**
     * This class should not be instantiated.
     */
    private BinarySearch() { }

    /**
     * Searches for the integer key in the sorted array arr[].
     *
     * @param arr sorted array of integers
     * @param l index to start searching
     * @param r index to finish searching
     * @param x query (element  you are searching for)
     * @return index of key in array a[] if present; -1 if not present
     */
    public static int recursiveSearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return recursiveSearch(arr, l, mid-1, x);

            return recursiveSearch(arr, mid+1, r, x);
        }
        return -1;
    }
    /**
     * Searches for the integer key in the sorted array arr[].
     *
     * @param arr sorted array of integers
     * @param l index to start searching
     * @param r index to finish searching
     * @param x query (element  you are searching for)
     * @return index of key in array a[] if present; -1 if not present
     */
    public static int search(int arr[], int l, int r, int x) {
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                l = mid + 1;

            else
                r = mid - 1;
        }
        return -1;
    }

    /**
     * Searches for the integer key in the sorted array arr[].
     *
     * @param arr sorted array of integers
     * @param query element  you are searching for
     * @return index of key in array a[] if present; -1 if not present
     */
    public static  int recursiveSearch(int arr[], int query) {
        return recursiveSearch(arr, 0, arr.length - 1, query);
    }

    /**
     * Searches for the integer key in the sorted array arr[].
     *
     * @param arr sorted array of integers
     * @param query element  you are searching for
     * @return index of key in array a[] if present; -1 if not present
     */
    public static int search(int arr[], int query) {
        return search(arr, 0, arr.length - 1, query);
    }
}
