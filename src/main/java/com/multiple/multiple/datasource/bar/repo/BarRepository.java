package com.multiple.multiple.datasource.bar.repo;

import com.multiple.multiple.datasource.bar.domain.Bar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarRepository extends JpaRepository<Bar, Long> {
}
