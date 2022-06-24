package com.loftschool.loftcoin.data.service.currency

import androidx.lifecycle.LiveData
import com.loftschool.loftcoin.data.models.Currency

interface CurrencyRepo {
    fun availableCurrencies(): LiveData<List<Currency>>
    fun currency(): LiveData<Currency>
    fun updateCurrency(currency: Currency)
}