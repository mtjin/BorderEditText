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
	implementation 'com.github.mtjin:BorderEditText:1.0.0'
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
        android:id="@+id/et_has_pressed_state"
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
etFocusedBorderStrokeColor() : Int

setFocusedState(state: Boolean) 
getFocusedState() : Boolean
```


