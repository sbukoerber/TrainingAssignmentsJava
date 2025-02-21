package com.bookapp.services;

import com.bookapp.entities.JournalEntry;
import com.bookapp.entities.User;
import com.bookapp.exceptions.ResourceNotFoundException;
import com.bookapp.repo.JournalEntryRepo;
import com.bookapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalServiceImpl implements JournalService{

    private JournalEntryRepo journalRepo;
    private UserRepo userRepo;

    @Autowired
    public JournalServiceImpl(JournalEntryRepo journalRepo, UserRepo userRepo) {
        this.journalRepo = journalRepo;
        this.userRepo = userRepo;
    }

    @Override
    public List<JournalEntry> getAll() {
        return journalRepo.findAll();
    }

    @Override
    public JournalEntry save(JournalEntry journalEntry) {
        return null;
    }

    @Override
    public JournalEntry update(String id, JournalEntry journalEntry) {
        journalEntry.setId(id);
        journalRepo.save(journalEntry);
        return journalEntry;
    }

    @Override
    public void delete(String id) {
        journalRepo.deleteById(id);

    }

    @Override
    public JournalEntry getById(String id) {
        return journalRepo.findById(id).orElseThrow(()->
                new ResourceNotFoundException("ResourceNotFound"));
    }

    @Override
    public List<JournalEntry> getByUserId(String id) {
        User user=userRepo.findById(id).orElseThrow(()->
                new ResourceNotFoundException("ResourceNotFound"));
        return user.getJournalEntries();
    }
}
