package com.colak.springjpachangedatabasetutorial.repository;

import com.colak.springjpachangedatabasetutorial.jpa.Country;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

@Profile("mysql")
public interface CountryMySQLRepository extends JpaRepository<Country, Long> {
}
