package guruspring.springframework.petclinicspring.services;

import guruspring.springframework.petclinicspring.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
