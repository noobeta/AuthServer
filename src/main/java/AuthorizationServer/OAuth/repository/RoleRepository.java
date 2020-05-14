package AuthorizationServer.OAuth.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import AuthorizationServer.OAuth.models.ERole;
import AuthorizationServer.OAuth.models.Role;



public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
