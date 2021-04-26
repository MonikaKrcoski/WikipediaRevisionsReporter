package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.view.ProjectInterface;
import edu.bsu.cs.view.RevisionFormatter;

public class RevisionInterfaceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ProjectInterface.class).to(RevisionFormatter.class);
    }
}
