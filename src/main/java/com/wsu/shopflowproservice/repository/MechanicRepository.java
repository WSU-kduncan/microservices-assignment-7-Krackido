package com.wsu.shopflowproservice.repository;

import com.wsu.workorderproservice.model.Technician;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MechanicRepository extends JpaRepository<Mechanic, String> {

    @Query(nativeQuery = true, value = "")

    Page<Object[]> findBySearch(String search, Pageable pageable)

}
