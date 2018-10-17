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

import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {

    private int[] integersArr = {7, -3, 0, 30, 19, 27};
    private int[] expectedIntegersArr = {-3, 0, 7, 19, 27, 30};

    @Test public void sortIntegers() {
        MergeSort.sort(integersArr);
        assertArrayEquals("Sort Integers", expectedIntegersArr, integersArr);

    }

    private double[] doublesArr = {7.0, 1.0, 9.0, 0.0, 7.7, -3.0};
    private double[] expectedDoublesArr = {-3, 0, 1, 7, 7, 9};

    @Test public void sortDoubles() {
        MergeSort.sort(doublesArr);
        assertArrayEquals("Sort Doubles", expectedDoublesArr, doublesArr, 7);
    }
}