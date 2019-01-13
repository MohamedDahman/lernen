package com.lernen.math.Repository;

import com.lernen.math.Dao.Dict;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DictRepository extends MongoRepository<Dict,String> {
}
