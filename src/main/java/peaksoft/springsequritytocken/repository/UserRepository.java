package peaksoft.springsequritytocken.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.springsequritytocken.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);

    @Override
    <S extends User> S save(S entity);

    @Override
    Optional<User> findById(Long aLong);

    @Override
    void deleteById(Long aLong);

    @Override
    List<User> findAll();
}
