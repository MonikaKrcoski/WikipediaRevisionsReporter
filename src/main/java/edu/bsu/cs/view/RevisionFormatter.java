package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.format.DateTimeFormatter;

public final class RevisionFormatter implements ProjectInterface{
    @Override
    public String format(Revision revision) {
        return String.format("At timestamp %s , a change was made by %s",
                DateTimeFormatter.ISO_INSTANT.format(revision.timestamp),
                revision.name);
    }
    
}
