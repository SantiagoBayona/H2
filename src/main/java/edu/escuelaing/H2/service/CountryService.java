package edu.escuelaing.H2.service;

import edu.escuelaing.H2.model.Country;
import edu.escuelaing.H2.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country createCountry(Country country) {
        return countryRepository.save(country);
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountryById(Long id) {
        Optional<Country> country = countryRepository.findById(id);
        return country.orElse(null);
    }

    public Country updateCountry(Long id, Country updatedCountry) {
        Optional<Country> country = countryRepository.findById(id);
        if (country.isPresent()) {
            Country existingCountry = country.get();
            existingCountry.setName(updatedCountry.getName());
            return countryRepository.save(existingCountry);
        }
        return null;
    }

    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }
}