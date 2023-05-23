package com.example.carbase;

import com.example.carbase.domain.Owner;
import com.example.carbase.domain.OwnerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class OwnerRepositoryTest {
    @Autowired
    private OwnerRepository ownerRepository;

    @Test
    void saveOwner() {
        ownerRepository.save(new Owner("Lucy", "Smith"));
        assertThat(ownerRepository.findByFirstName("Lucy").isPresent()).isTrue();
    }

    @Test
    void deleteOwners() {
        ownerRepository.save(new Owner("Lisa", "Morrison"));
        ownerRepository.deleteAll();
        assertThat(ownerRepository.count()).isEqualTo(0);
    }
}
