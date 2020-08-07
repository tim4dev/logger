
[![](https://jitpack.io/v/tim4dev/logger.svg)](https://jitpack.io/#tim4dev/logger)

# Simple and useful Android Logcat logger

# Gradle

    allprojects {
        repositories {
    	    maven { url 'https://jitpack.io' }
    	}
    }


    dependencies {
        implementation "com.github.tim4dev:logger:VERSION"
    }    

# Usage

    fun yourFunctionName() {
        Logger.d("Test log message.")
    }

Logcat output:

    D/com.your.package.name.YourClassName: yourFunctionName. Test log message.

# License

The MIT License

Copyright (c) 2020 tim4dev https://www.tim4.dev

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.