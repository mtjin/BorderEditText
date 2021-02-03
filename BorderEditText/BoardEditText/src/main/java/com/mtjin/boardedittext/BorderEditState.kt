package com.mtjin.boardedittext

import android.graphics.Color

class BorderEditState() {
    var mBorderCornerRadius: Float = 0f
    var mBorderStrokeColor: Int = Color.parseColor("#00000000")
    var mBorderStrokeWidth: Int = 0
    var mBackGroundColor: Int = Color.parseColor("#00000000")

    constructor(
        borderCornerRadius: Float,
        borderStrokeColor: String?,
        borderStrokeWidth: Int,
        backGroundColor: String?
    ) : this() {
        this.mBorderCornerRadius = borderCornerRadius
        borderStrokeColor?.let { this.mBorderStrokeColor = Color.parseColor(it) }
        this.mBorderStrokeWidth = borderStrokeWidth
        backGroundColor?.let { this.mBackGroundColor = Color.parseColor(it) }
    }


}