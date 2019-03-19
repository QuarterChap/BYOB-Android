package com.cearleysoftware.byob.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

//  Copyright © 2019 Cearley Software. All rights reserved.

fun <T : View> LayoutInflater.inflateTo(
        @LayoutRes layoutRes: Int,
        parent: ViewGroup? = null,
        attachToRoot: Boolean = false
): T = inflate(layoutRes, parent, attachToRoot) as T

fun <T : ViewDataBinding> LayoutInflater.inflateWithBinding(
        @LayoutRes layoutRes: Int,
        parent: ViewGroup?,
        attachToRoot: Boolean = false
): T {
    return DataBindingUtil.inflate(this, layoutRes, parent, attachToRoot) as T
}