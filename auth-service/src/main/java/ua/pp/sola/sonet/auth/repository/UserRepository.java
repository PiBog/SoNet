package ua.pp.sola.sonet.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.pp.sola.sonet.auth.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
