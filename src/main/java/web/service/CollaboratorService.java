package web.service;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;
import web.domain.Collaborator;

import java.time.LocalDate;
import java.util.List;

@Component
public class CollaboratorService {

    public List<Collaborator> getCollaborators() {
        final List<Collaborator> collaborators = Lists.newArrayList();
        collaborators.add(new Collaborator("Phil", "Taylor", LocalDate.of(1986, 12, 27)));
        collaborators.add(new Collaborator("Kat", "Browning", LocalDate.of(1988, 3, 12)));
        return collaborators;
    }
}
