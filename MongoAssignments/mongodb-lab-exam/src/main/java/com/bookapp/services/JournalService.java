package com.bookapp.services;

import com.bookapp.entities.JournalEntry;

import java.util.List;

public interface JournalService {
    public List<JournalEntry> getAll();
    public JournalEntry save(JournalEntry journalEntry);
    public JournalEntry update(String id, JournalEntry journalEntry);
    public void delete(String id);
    public JournalEntry getById(String id);
    public List<JournalEntry> getByUserId(String id);
}
