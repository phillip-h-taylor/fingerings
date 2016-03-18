package web.service;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;
import web.domain.Collaborator;

import java.util.List;

@Component
public class CollaboratorService {

    public List<Collaborator> getCollaborators() {
        final List<Collaborator> collaborators = Lists.newArrayList();
        collaborators.add(new Collaborator("Phil", "Taylor"));
        collaborators.add(new Collaborator("Kat", "Browning"));
        return collaborators;
    }
}
