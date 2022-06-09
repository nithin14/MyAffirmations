package com.example.myaffirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Single Affirmation object instance will contain a resource ID for
 * the text of the affirmation and a resource ID for the image of the affirmation.
 */
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)