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

public class BubbleSortTest {

  private Byte[] bytesArr = { 7, -3, 0, 30, 19, 27 };
  private Byte[] expectedBytesArr = { -3, 0, 7, 19, 27, 30 };

  @Test
  public void sortBytes() {
    assertArrayEquals("Sort Bytes", expectedBytesArr, BubbleSort.sort(bytesArr));

  }

  private Character[] charsArr = { 7, 3, 0, 30, 19, 27 };
  private Character[] expectedCharsArr = { 0, 3, 7, 19, 27, 30 };

  @Test
  public void sortChars() {
    assertArrayEquals("Sort Chars", expectedCharsArr, BubbleSort.sort(charsArr));

  }

  private Short[] shortsArr = { 7, -3, 0, 30, 19, 27 };
  private Short[] expectedShortsArr = { -3, 0, 7, 19, 27, 30 };

  @Test
  public void sortShorts() {
    assertArrayEquals("Sort Shorts", expectedShortsArr, BubbleSort.sort(shortsArr));
  }

  private Integer[] integersArr = { 7, -3, 0, 30, 19, 27 };
  private Integer[] expectedIntegersArr = { -3, 0, 7, 19, 27, 30 };

  @Test
  public void sortIntegers() {
    assertArrayEquals("Sort Integers", expectedIntegersArr, BubbleSort.sort(integersArr));
  }

  private Long[] longsArr = { 7L, -3L, 0L, 30L, 19L, 27L };
  private Long[] expectedLongsArr = { -3L, 0L, 7L, 19L, 27L, 30L };

  @Test
  public void sortLongs() {
    assertArrayEquals("Sort Longs", expectedLongsArr, BubbleSort.sort(longsArr));
  }

  private Double[] doublesArr = { 7.0, 1.0, 9.0, 7.7, -3.0 };
  private Double[] expectedDoublesArr = { -3.0, 1.0, 7.0, 7.7, 9.0 };

  @Test
  public void sortDoubles() {
    assertArrayEquals("Sort Doubles", expectedDoublesArr, BubbleSort.sort(doublesArr));
  }

  private String[] stringsArr = { "Dog", "Cat", "Car", "Tree", "House", "Java" };
  private String[] expectedStringsArr = { "Car", "Cat", "Dog", "House", "Java", "Tree" };

  @Test
  public void sortStrings() {
    assertArrayEquals("Sort Strings", expectedStringsArr, BubbleSort.sort(stringsArr));
  }

  private Float[] floatsArr = { 7f, 1f, 9f, 0f, 7f, -3f };
  private Float[] expectedFloatsArr = { -3f, 0f, 1f, 7f, 7f, 9f };

  @Test
  public void sortFloats() {
    assertArrayEquals("Sort Floats", expectedFloatsArr, BubbleSort.sort(floatsArr));
  }

}
