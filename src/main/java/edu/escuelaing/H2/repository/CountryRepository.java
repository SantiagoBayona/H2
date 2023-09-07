package edu.escuelaing.H2.repository;

import edu.escuelaing.H2.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}