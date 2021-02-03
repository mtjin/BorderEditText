package com.mtjin.boardedittext

import android.graphics.Color

class FocusedBorderEditState() {
    var mBorderCornerRadius: Float = 0f
    var mBorderStrokeColor: Int = Color.parseColor("#00000000")
    var mBorderStrokeWidth: Int = 0
    var mBackGroundColor: Int = Color.parseColor("#00000000")
    var mIsFocusedActivated: Boolean = false // is user applied pressed state

    constructor(
        borderCornerRadius: Float,
        borderStrokeColor: String?,
        borderStrokeWidth: Int,
        backGroundColor: String?,
        pressedState: Boolean
    ) : this() {
        this.mBorderCornerRadius = borderCornerRadius
        borderStrokeColor?.let { this.mBorderStrokeColor = Color.parseColor(it) }
        this.mBorderStrokeWidth = borderStrokeWidth
        backGroundColor?.let { this.mBackGroundColor = Color.parseColor(it) }
        this.mIsFocusedActivated = pressedState
    }

}