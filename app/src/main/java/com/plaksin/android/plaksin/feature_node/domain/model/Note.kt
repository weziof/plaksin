package com.plaksin.android.plaksin.feature_node.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plaksin.android.plaksin.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)