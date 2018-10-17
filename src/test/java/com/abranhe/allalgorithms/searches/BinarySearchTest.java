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

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private int[] arr = {-3, 0, 7, 19, 27, 30};

    @Test public void recursiveBinarySearch() {
        assertEquals(0, BinarySearch.search(arr, 0, arr.length - 1, -3));
        assertEquals(1, BinarySearch.search(arr, 0, arr.length - 1, 0));
        assertEquals(2, BinarySearch.search(arr, 0, arr.length - 1, 7));
        assertEquals(3, BinarySearch.search(arr, 0, arr.length - 1, 19));
        assertEquals(4, BinarySearch.search(arr, 0, arr.length - 1, 27));
        assertEquals(5, BinarySearch.search(arr, 0, arr.length - 1, 30));
    }

    @Test public void binarySearch() {
        assertEquals(0, BinarySearch.search(arr, 0, arr.length - 1, -3));
        assertEquals(1, BinarySearch.search(arr, 0, arr.length - 1, 0));
        assertEquals(2, BinarySearch.search(arr, 0, arr.length - 1, 7));
        assertEquals(3, BinarySearch.search(arr, 0, arr.length - 1, 19));
        assertEquals(4, BinarySearch.search(arr, 0, arr.length - 1, 27));
        assertEquals(5, BinarySearch.search(arr, 0, arr.length - 1, 30));
    }

    @Test public void recursiveBinarySearchShort() {
        assertEquals(0, BinarySearch.search(arr, -3));
        assertEquals(1, BinarySearch.search(arr,0));
        assertEquals(2, BinarySearch.search(arr,7));
        assertEquals(3, BinarySearch.search(arr,19));
        assertEquals(4, BinarySearch.search(arr,27));
        assertEquals(5, BinarySearch.search(arr,30));
    }

    @Test public void binarySearchShort() {
        assertEquals(0, BinarySearch.search(arr, -3));
        assertEquals(1, BinarySearch.search(arr,0));
        assertEquals(2, BinarySearch.search(arr,7));
        assertEquals(3, BinarySearch.search(arr,19));
        assertEquals(4, BinarySearch.search(arr,27));
        assertEquals(5, BinarySearch.search(arr,30));
    }
}