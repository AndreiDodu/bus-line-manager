package com.andreidodu.blm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andreidodu.blm.db.BusPathStepDB;

@Repository
public interface BusPathStepDao extends CrudRepository<BusPathStepDB, Long> {

	Iterable<BusPathStepDB> findByBusPathId(Long busPathId);

}
