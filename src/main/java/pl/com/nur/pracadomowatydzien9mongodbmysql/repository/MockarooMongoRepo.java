package pl.com.nur.pracadomowatydzien9mongodbmysql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.com.nur.pracadomowatydzien9mongodbmysql.model.MockarooMongo;

@Repository
public interface MockarooMongoRepo extends MongoRepository<MockarooMongo, String>{

}
