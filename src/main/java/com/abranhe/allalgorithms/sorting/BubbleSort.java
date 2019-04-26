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
 * The class {@code BubbleSort} contains the methods to perform a sorting with
 * the <b>Bubble Sort Algorithm</b>. For more information about bubble sort
 * algorithm you can read on line or visit the documentation on
 * <a href="https://en.wikipedia.org/wiki/Bubble_sort">Wikipedia</a>.
 *
 * @author Carlos Abraham Hernandez
 * @since 0.0.2
 */
public class BubbleSort {

  /**
   * This class should not be instantiated.
   */
  private BubbleSort() {
  }

  /**
   * Sort an array of Generic Type in acending order. Returns an array with the
   * values already sorted.
   * 
   * @param arr an input array with unsorted items
   * @return array of type <pre><E></pre> with items already sorted.
   */
  @SuppressWarnings("unchecked")
  public static <E> E[] sort(E[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        int diff = ((Comparable<Object>) arr[j]).compareTo(((Comparable<Object>) arr[j + 1]));
        if (diff > 0) {
          E temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }
}