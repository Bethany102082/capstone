package org.launchcode.capstone.models.data;

import org.launchcode.capstone.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface LogDao extends CrudRepository<Log, Integer> {
}
