package pl.com.nur.pracadomowatydzien9mongodbmysql.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.nur.pracadomowatydzien9mongodbmysql.model.MockarooSql;

@Repository
public interface MockarooSqlRepo extends JpaRepository<MockarooSql, Long> {
}
