package sportapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sportapp.models.User;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
