package com.rizki.utdiberita.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Berita(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
