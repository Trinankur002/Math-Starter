package com.example.mathstarter.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "Question")
    val itemName: String,
    @ColumnInfo(name = "Answer")
    val itemPrice: Double,

)