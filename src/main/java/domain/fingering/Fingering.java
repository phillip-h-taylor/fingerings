package domain.fingering;

import domain.key.Key;

import java.util.List;

public class Fingering {

    private List<Key> keysUsed;

    public Fingering(final List<Key> keysUsed) {
        this.keysUsed = keysUsed;
    }

    public List<Key> getKeysUsed() {
        return keysUsed;
    }
}
