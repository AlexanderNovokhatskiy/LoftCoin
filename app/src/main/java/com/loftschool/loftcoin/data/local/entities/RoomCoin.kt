package com.loftschool.loftcoin.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.loftschool.loftcoin.data.remote.models.Quote
import com.loftschool.loftcoin.data.remote.models.Coin


@Entity
class RoomCoin(
    @PrimaryKey
    val id: Int,
    val name: String,
    val symbol: String,
    val rank: String,
    val price: Double,
    val change24h: Double,
    val currencyCode: String
)