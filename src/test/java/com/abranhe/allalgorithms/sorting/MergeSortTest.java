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

	private byte[] bytesArr = {7, -3, 0, 30, 19, 27};
    private byte[] expectedBytesArr = {-3, 0, 7, 19, 27, 30};

    @Test public void sortBytes() {
        MergeSort.sort(bytesArr);
        assertArrayEquals("Sort Bytes", expectedBytesArr, bytesArr);

    }
	
    private char[] charsArr = {7, 3, 0, 30, 19, 27};
    private char[] expectedCharsArr = {0, 3, 7, 19, 27, 30};

    @Test public void sortChars() {
        MergeSort.sort(charsArr);
        assertArrayEquals("Sort Chars", expectedCharsArr, charsArr);

    }
    
    private short[] shortsArr = {7, -3, 0, 30, 19, 27};
    private short[] expectedShortsArr = {-3, 0, 7, 19, 27, 30};

    @Test public void sortShorts() {
        MergeSort.sort(shortsArr);
        assertArrayEquals("Sort Shorts", expectedShortsArr, shortsArr);

    }
    
    private long[] longsArr = {7, -3, 0, 30, 19, 27};
    private long[] expectedLongsArr = {-3, 0, 7, 19, 27, 30};

    @Test public void sortLongs() {
        MergeSort.sort(longsArr);
        assertArrayEquals("Sort Longs", expectedLongsArr, longsArr);

    }
    
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
    
    private String[] stringsArr = {"Dog", "Cat", "Car", "Tree", "House", "Java"};
    private String[] expectedStringsArr = {"Car", "Cat", "Dog", "House", "Java" , "Tree"};
    
    @Test public void sortStrings() {
    	MergeSort.sort(stringsArr);
    	assertArrayEquals("Sort Strings", stringsArr, expectedStringsArr);
    }
    
    private float[] floatsArr = {7f, 1f, 9f, 0f, 7f, -3f};
    private float[] expectedFloatsArr = {-3f, 0f, 1f, 7f, 7f, 9f};

    @Test public void sortFloats() {
        MergeSort.sort(floatsArr);
        assertArrayEquals("Sort Floats", expectedFloatsArr, floatsArr, 7);
    }
    
    
}
