package pl.wsb.students.repository.impl;

import pl.wsb.students.api.model.Actor;
import pl.wsb.students.repository.AbstractRepository;

public class ActorRepository extends AbstractRepository<Actor, Integer> {

    @Override
    protected  Class<Actor> getPersistentClass() {
        return Actor.class;
    }

}
