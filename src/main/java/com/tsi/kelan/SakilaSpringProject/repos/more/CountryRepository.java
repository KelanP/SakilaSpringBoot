package com.tsi.kelan.SakilaSpringProject.repos.more;

import com.tsi.kelan.SakilaSpringProject.entities.more.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}