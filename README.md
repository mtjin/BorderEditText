# BorderEditText
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![](https://jitpack.io/v/mtjin/BorderEditText.svg)](https://jitpack.io/#mtjin/BorderEditText)


It is an Android Custom EditText Library that allows you to easily set the background color of EditText, the color of the border, the thickness, the radius, and the state when it is focused.
It can replace the selector and shape of the existing Drawable resource!

## Prerequisites
Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.mtjin:BorderEditText:1.0.1'
}
```

## Usage

* **border_?_?** The default values ​​are **transparent**. So, if you don't set it, it's the same as a regular EditText.

* If you want to set the EditText foucsed state as well, you must set **border_focused_activated** to **true**.

* There is also sample code in this repository. (https://github.com/mtjin/BorderEditText/tree/main/BorderEditText/app)

### XML
```
<attr name="border_stroke_color" format="color" />
<attr name="border_stroke_width" format="dimension" />
<attr name="border_corner_radius" format="dimension" />
<attr name="border_background_color" format="color" />
<attr name="border_focused_stroke_color" format="color" />
<attr name="border_focused_stroke_width" format="dimension" />
<attr name="border_focused_corner_radius" format="dimension" />
<attr name="border_focused_background_color" format="color" />
<attr name="border_focused_activated" format="boolean" />
```
### XML example

```
<com.mtjin.library.BorderEditText
        android:id="@+id/et_normal"
        android:layout_width="300dp"
        android:layout_height="200dp"
        android:layout_marginTop="16dp"
        android:gravity="center"
        android:padding="20dp"
        android:text="EXAMPLE NORMAL EDIT TEXT"
        android:textColor="@color/black"
        android:textSize="20dp"
        app:border_background_color="@android:color/holo_orange_light"
        app:border_corner_radius="32dp"
        app:border_stroke_color="@android:color/holo_blue_light"
        app:border_stroke_width="10dp"/>

    <com.mtjin.library.BorderEditText
        android:id="@+id/et_has_focused_state"
        android:layout_width="300dp"
        android:layout_height="200dp"
        android:layout_marginTop="16dp"
        android:gravity="center"
        android:padding="20dp"
        android:text="HAS FOCUSED STATE EDIT TEXT"
        android:textColor="@android:color/black"
        android:textSize="20dp"
        app:border_focused_activated="true"
        app:border_focused_background_color="@android:color/holo_green_light"
        app:border_focused_corner_radius="12dp"
        app:border_focused_stroke_color="@android:color/holo_blue_bright"
        app:border_focused_stroke_width="10dp"
        app:border_stroke_color="@android:color/darker_gray"
        app:border_stroke_width="10dp" />
```

### Functions (setter()/getter())
```
// Normal State EditText

setBorderRadius(radius: Float) 
getBorderRadius() : Float

setBackgroundColor(color: String)
getBackgroundColor() : Int

setBorderStrokeWidth(width: Int)
getBorderStrokeWidth() : Int
 
setBorderStrokeColor(color: String)
getBorderStrokeColor() : Int


// Focused State EditText => you must set border_focused_activated to true for operation.

setFocusedBorderRadius(radius: Float)
getFocusedBorderRadius() : Float

setFocusedBackgroundColor(color: String)
getFocusedBackgroundColor() : Int

setFocusedBorderStrokeWidth(width: Int)
getFocusedBorderStrokeWidth() : Int

setFocusedBorderStrokeColor(color: String)
getFocusedBorderStrokeColor() : Int

setFocusedState(state: Boolean) 
getFocusedState() : Boolean
```

## Preview
![Preview](https://user-images.githubusercontent.com/37071007/106751477-8e9bac00-666c-11eb-9494-cc8b4183687e.gif)

## Other My Libraries
[DrawView](https://github.com/mtjin/DrawView)

## License
```
MIT License

Copyright (c) 2021 JackJackE

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
