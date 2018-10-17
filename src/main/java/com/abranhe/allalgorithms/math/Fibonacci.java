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
package com.abranhe.allalgorithms.math;

/**
 * The <tt>Fibonacci</tt> class provides a static method
 *  for generation of the fibonacci series
 *
 *  <p>
 *  The next number is found by adding up the two numbers before it.
 *  <p>
 *
 * @author  Carlos Abraham Hernandez
 * @since   0.0.1
 */

public class Fibonacci {

    /**
     * This class should not be instantiated.
     */
    private Fibonacci() { }

    /**
     * Returns the number is found by adding up the two numbers before it.
     *
     * @param   term the term you want to know in the fibonacci series
     * @return  fibonacci number found
     */
    public static long term(int term){
        return calculateFibonacci(term - 2, 1, 1);
    }

    /**
     * Recursive method to find fibonacci number
     *
     * @param a number
     * @param b number
     * @param c number
     * @return  fibonacci number found
     */
    private static long calculateFibonacci(int a, int b, int c){
        if(a <= 0){
            return c;
        }
        return calculateFibonacci(a - 1, c, c + b);
    }
}
