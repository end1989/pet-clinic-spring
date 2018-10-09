package guruspring.springframework.petclinicspring.services;

import guruspring.springframework.petclinicspring.model.Vet;

import java.util.Set;

public interface VetServices {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
