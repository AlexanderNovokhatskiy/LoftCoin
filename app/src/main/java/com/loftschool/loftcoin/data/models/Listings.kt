package com.loftschool.loftcoin.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Listings(
    val data: List<Coin>
)