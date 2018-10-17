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
package com.abranhe.allalgorithms.strings;

/**
 *  The <tt>Palindrome</tt> class provides a static method for
 *  checking a word or other sequence of characters which reads
 *  the same backward as forward, such as madam or racecar
 *
 * @author  Carlos Abraham Hernandez
 * @since   0.0.1
 */

import java.lang.*;

public class Palindrome {

    /**
     * This class should not be instantiated.
     */
    private Palindrome() { }

    /**
     * Check if the string or word is a palindrome
     *
     * @param word string to check if is a palindrome
     * @return true if is palindrome otherwise false
     */
    public static boolean isPalindrome(String word) {

        String reverse = new StringBuffer(word).reverse().toString();

        if(word.replace(" ","").trim().equalsIgnoreCase(reverse.trim().replace(" ",""))) return true;
        else return false;
    }
}
