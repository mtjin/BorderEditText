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

There is also sample code in this repository. (https://github.com/mtjin/BorderEditText/tree/main/BorderEditText/app)
