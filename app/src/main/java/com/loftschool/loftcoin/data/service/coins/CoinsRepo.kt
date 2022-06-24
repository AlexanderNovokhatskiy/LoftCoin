package com.loftschool.loftcoin.data.service.coins

import androidx.annotation.WorkerThread
import com.loftschool.loftcoin.data.models.Coin

interface CoinsRepo {

    @WorkerThread
    fun listings(currency: String): List<Coin>

}