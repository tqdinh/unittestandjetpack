package com.example.unittestandjetpack.di

import android.app.Application
import androidx.room.Room

import com.example.unittestandjetpack.feature_note.data.data_source.NoteDatabase
import com.example.unittestandjetpack.feature_note.data.repository.NoteRepositoryImpl
import com.example.unittestandjetpack.feature_note.domain.repository.NoteRepository
import com.example.unittestandjetpack.feature_note.domain.use_case.AddNote
import com.example.unittestandjetpack.feature_note.domain.use_case.DeleteNote
import com.example.unittestandjetpack.feature_note.domain.use_case.GetNote
import com.example.unittestandjetpack.feature_note.domain.use_case.GetNotes
import com.example.unittestandjetpack.feature_note.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TestAppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app:Application):NoteDatabase{
        return Room.inMemoryDatabaseBuilder(app,NoteDatabase::class.java).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db:NoteDatabase):NoteRepository{
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUsecases(repository: NoteRepository):NoteUseCases{
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }

}