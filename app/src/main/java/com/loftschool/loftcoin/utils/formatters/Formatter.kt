package com.loftschool.loftcoin.utils.formatters

interface Formatter<T> {
    fun format(value: T): String
}