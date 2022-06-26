package com.loftschool.loftcoin.data.local.database

import androidx.room.Database
import com.loftschool.loftcoin.data.local.entities.RoomCoin
import androidx.room.RoomDatabase
import com.loftschool.loftcoin.data.local.dao.CoinsDao

@Database(entities = [RoomCoin::class], version = 1)
abstract class LoftDatabase : RoomDatabase() {

    abstract fun coins(): CoinsDao
}