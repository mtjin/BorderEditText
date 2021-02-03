package com.mtjin.library

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.StateListDrawable
import android.util.AttributeSet
import android.util.StateSet
import com.mtjin.boardedittext.R


class BorderEditText(context: Context, attrs: AttributeSet?) :
    androidx.appcompat.widget.AppCompatEditText(context, attrs) {
    private var mContext: Context = context
    private var mBorderEditState: BorderEditState = BorderEditState()
    private var mFocusedBorderEditState: FocusedBorderEditState = FocusedBorderEditState()

    init {
        attrs?.let { initBorderState(it) }
        initShape()
    }

    // init BorderState class
    private fun initBorderState(atr: AttributeSet) {
        val typedArray =
            mContext.theme.obtainStyledAttributes(atr, R.styleable.BorderEditText, 0, 0)
        typedArray.run {
            //normal state
            val borderWidth =
                getDimension(R.styleable.BorderEditText_border_stroke_width, 0f).toInt()
            val borderRadius = getDimension(R.styleable.BorderEditText_border_corner_radius, 0f)
            val borderColor = getString(R.styleable.BorderEditText_border_stroke_color)
            val backGroundColor =
                getString(R.styleable.BorderEditText_border_background_color)
            mBorderEditState = BorderEditState(
                borderStrokeWidth = borderWidth,
                borderCornerRadius = borderRadius,
                borderStrokeColor = borderColor,
                backGroundColor = backGroundColor
            )

            //pressed state
            val pressedBorderWidth =
                getDimension(R.styleable.BorderEditText_border_focused_stroke_width, 0f).toInt()
            val pressedBorderRadius =
                getDimension(R.styleable.BorderEditText_border_focused_corner_radius, 0f)
            val pressedBorderColor =
                getString(R.styleable.BorderEditText_border_focused_stroke_color)
            val pressedBackGroundColor =
                getString(R.styleable.BorderEditText_border_focused_background_color)
            val pressedState =
                getBoolean(R.styleable.BorderEditText_border_focused_activated, false)
            mFocusedBorderEditState = FocusedBorderEditState(
                borderStrokeWidth = pressedBorderWidth,
                borderCornerRadius = pressedBorderRadius,
                borderStrokeColor = pressedBorderColor,
                backGroundColor = pressedBackGroundColor,
                pressedState = pressedState
            )
        }
    }

    // init and set shape drawable
    private fun initShape() {
        //pressed state border color (selector drawable xml)
        val stateShape = StateListDrawable()
        //pressed state
        if (mFocusedBorderEditState.mIsFocusedActivated) {
            stateShape.addState(
                intArrayOf(
                    android.R.attr.state_focused
                ), createPressedBorderEditState()
            )
        }
        //normal state
        stateShape.addState(
            StateSet.WILD_CARD, createBorderEditState()
        )
        //apply
        this.background = stateShape
        invalidate()
    }

    //normal state drawable
    private fun createBorderEditState(): GradientDrawable {
        val shape = GradientDrawable()
        //shape shape
        shape.shape = GradientDrawable.RECTANGLE
        //shape corner radius
        mBorderEditState.mBorderCornerRadius.let {
            shape.cornerRadii = floatArrayOf(it, it, it, it, it, it, it, it)
        }
        //shape stroke
        shape.setStroke(
            mBorderEditState.mBorderStrokeWidth,
            mBorderEditState.mBorderStrokeColor
        )
        //shape background color
        shape.setColor(mBorderEditState.mBackGroundColor)
        return shape
    }

    //pressed state drawable
    private fun createPressedBorderEditState(): GradientDrawable {
        val shape = GradientDrawable()
        //shape shape
        shape.shape = GradientDrawable.RECTANGLE
        //shape corner radius
        mFocusedBorderEditState.mBorderCornerRadius.let {
            shape.cornerRadii = floatArrayOf(it, it, it, it, it, it, it, it)
        }
        //shape stroke
        shape.setStroke(
            mFocusedBorderEditState.mBorderStrokeWidth,
            mFocusedBorderEditState.mBorderStrokeColor
        )
        //shape background color
        shape.setColor(mFocusedBorderEditState.mBackGroundColor)
        return shape
    }

    fun setBorderRadius(radius: Float) {
        mBorderEditState.mBorderCornerRadius = radius
        initShape()
    }

    fun getBorderRadius() = mBorderEditState.mBorderCornerRadius


    fun setBackgroundColor(color: String) {
        mBorderEditState.mBackGroundColor = Color.parseColor(color)
        initShape()
    }

    fun getBackgroundColor() = mBorderEditState.mBackGroundColor

    fun setBorderStrokeWidth(width: Int) {
        mBorderEditState.mBorderStrokeWidth = width
        initShape()
    }

    fun getBorderStrokeWidth() = mBorderEditState.mBorderStrokeWidth

    fun setBorderStrokeColor(color: String) {
        mBorderEditState.mBorderStrokeColor = Color.parseColor(color)
        initShape()
    }

    fun getBorderStrokeColor() = mBorderEditState.mBorderStrokeColor

    fun setFocusedBorderRadius(radius: Float) {
        mFocusedBorderEditState.mBorderCornerRadius = radius
        initShape()
    }

    fun getFocusedBorderRadius() = mFocusedBorderEditState.mBorderCornerRadius


    fun setFocusedBackgroundColor(color: String) {
        mFocusedBorderEditState.mBackGroundColor = Color.parseColor(color)
        initShape()
    }

    fun getFocusedBackgroundColor() = mFocusedBorderEditState.mBackGroundColor

    fun setFocusedBorderStrokeWidth(width: Int) {
        mFocusedBorderEditState.mBorderStrokeWidth = width
        initShape()
    }

    fun getFocusedBorderStrokeWidth() = mFocusedBorderEditState.mBorderStrokeWidth

    fun setFocusedBorderStrokeColor(color: String) {
        mFocusedBorderEditState.mBorderStrokeColor = Color.parseColor(color)
        initShape()
    }

    fun getFocusedBorderStrokeColor() = mFocusedBorderEditState.mBorderStrokeColor

    fun setFocusedState(state: Boolean) {
        mFocusedBorderEditState.mIsFocusedActivated = state
        initShape()
    }

    fun getFocusedState() = mFocusedBorderEditState.mIsFocusedActivated
}