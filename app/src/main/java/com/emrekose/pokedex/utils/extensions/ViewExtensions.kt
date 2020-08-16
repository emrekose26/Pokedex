package com.emrekose.pokedex.utils.extensions

import android.content.Context
import android.view.View
import android.widget.Toast

fun View.visible() { this.visibility = View.VISIBLE }

fun View.gone() { this.visibility = View.GONE }

fun visibleAll(vararg views: View) = views.forEach { it.visible() }

fun goneAll(vararg views: View) = views.forEach { it.gone() }

fun View.enable() { this.isEnabled = true }

fun View.disable() { this.isEnabled = false }

fun enableAll(vararg views: View) = views.forEach { it.enable() }

fun disableAll(vararg views: View) = views.forEach { it.disable() }

fun Context.toast(message: CharSequence?, duration: Int = Toast.LENGTH_SHORT) =
    Toast.makeText(this, message, duration).show()