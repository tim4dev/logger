/*
 * The MIT License
 *
 * Copyright (c) 2020 https://www.tim4.dev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies
 * or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE
 * AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package dev.tim4.logger

import android.util.Log
import android.util.Pair

enum class LogLevel {
    DEBUG,
    INFO,
    NONE
}

object Logger {

    /**
     * STACK_TRACE_LEVEL is a magic number used to determine the offset on the call stack of the
     * calling class and method so the names can be used in log messages.
     */
    private const val STACK_TRACE_LEVEL = 4

    @JvmStatic
    var logLevel: LogLevel = if (BuildConfig.DEBUG) {
        LogLevel.DEBUG
    } else {
        LogLevel.NONE
    }

    @JvmStatic
    fun v(message: String) {
        if (logLevel != LogLevel.NONE) {
            val classAndMethod = getClassAndMethod()
            Log.v(classAndMethod.first, "${classAndMethod.second}. $message")
        }
    }

    @JvmStatic
    fun v(throwable: Throwable) {
        if (logLevel != LogLevel.NONE) {
            val classAndMethod = getClassAndMethod()
            Log.v(classAndMethod.first, "${classAndMethod.second}. $throwable")
        }
    }

    @JvmStatic
    fun d(message: String) {
        if (logLevel != LogLevel.NONE) {
            val classAndMethod = getClassAndMethod()
            Log.d(classAndMethod.first, "${classAndMethod.second}. $message")
        }
    }

    @JvmStatic
    fun d(throwable: Throwable) {
        if (logLevel != LogLevel.NONE) {
            val classAndMethod = getClassAndMethod()
            Log.d(classAndMethod.first, "${classAndMethod.second}. $throwable")
        }
    }

    @JvmStatic
    fun i(message: String) {
        if (logLevel == LogLevel.INFO || logLevel == LogLevel.DEBUG) {
            val classAndMethod = getClassAndMethod()
            Log.i(classAndMethod.first, "${classAndMethod.second}. $message")
        }
    }

    @JvmStatic
    fun i(throwable: Throwable) {
        if (logLevel == LogLevel.INFO || logLevel == LogLevel.DEBUG) {
            val classAndMethod = getClassAndMethod()
            Log.i(classAndMethod.first, "${classAndMethod.second}. $throwable")
        }
    }

    @JvmStatic
    fun w(message: String) {
        if (logLevel != LogLevel.NONE) {
            val classAndMethod = getClassAndMethod()
            Log.w(classAndMethod.first, "${classAndMethod.second}. $message")
        }
    }

    @JvmStatic
    fun w(throwable: Throwable) {
        if (logLevel != LogLevel.NONE) {
            val classAndMethod = getClassAndMethod()
            Log.w(classAndMethod.first, "${classAndMethod.second}. $throwable")
        }
    }

    @JvmStatic
    fun e(message: String) {
        if (logLevel == LogLevel.INFO || logLevel == LogLevel.DEBUG) {
            val classAndMethod = getClassAndMethod()
            Log.e(classAndMethod.first, "${classAndMethod.second}. $message")
        }
    }

    @JvmStatic
    fun e(throwable: Throwable) {
        if (logLevel == LogLevel.INFO || logLevel == LogLevel.DEBUG) {
            val classAndMethod = getClassAndMethod()
            Log.e(classAndMethod.first, "${classAndMethod.second}. $throwable")
        }
    }

    @JvmStatic
    private fun getClassAndMethod(): Pair<String, String> {
        val stackTraceElements = Thread.currentThread().stackTrace
        return Pair(
                stackTraceElements[STACK_TRACE_LEVEL].className,
                stackTraceElements[STACK_TRACE_LEVEL].methodName
        )
    }
}
