package com.loftschool.loftcoin.utils.formatters

import android.content.Context
import javax.inject.Singleton
import javax.inject.Inject
import com.loftschool.loftcoin.utils.formatters.PriceFormatter
import androidx.core.os.LocaleListCompat
import androidx.core.os.ConfigurationCompat
import java.text.NumberFormat
import java.util.*

@Singleton
class PriceFormatter @Inject constructor(private val context: Context) : Formatter<Double> {

    companion object {
        private val LOCALES: MutableMap<String, Locale> = HashMap()

        init {
            LOCALES["EUR"] = Locale.GERMANY
            LOCALES["USD"] = Locale.US
            LOCALES["RUB"] = Locale("ru", "RU")
        }
    }

    fun format(currency: String, value: Double): String {
        var locale = LOCALES[currency]
        if (locale == null) {
            val locales = ConfigurationCompat.getLocales(
                context.resources.configuration
            )
            locale = locales[0]
        }
        return NumberFormat.getCurrencyInstance(locale).format(value)
    }

    override fun format(value: Double): String {
        return NumberFormat.getCurrencyInstance().format(value)
    }
}