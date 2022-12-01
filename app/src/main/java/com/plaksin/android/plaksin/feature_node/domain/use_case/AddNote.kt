package com.plaksin.android.plaksin.feature_node.domain.use_case

import com.plaksin.android.plaksin.feature_node.domain.model.InvalidNoteException
import com.plaksin.android.plaksin.feature_node.domain.model.Note
import com.plaksin.android.plaksin.feature_node.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("Заголовок не может быть пустым.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("Заметка не может содержать менее одного символа.")
        }
        repository.insertNote(note)
    }
}