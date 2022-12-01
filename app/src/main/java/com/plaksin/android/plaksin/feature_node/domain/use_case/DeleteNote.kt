package com.plaksin.android.plaksin.feature_node.domain.use_case

import com.plaksin.android.plaksin.feature_node.domain.model.Note
import com.plaksin.android.plaksin.feature_node.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}