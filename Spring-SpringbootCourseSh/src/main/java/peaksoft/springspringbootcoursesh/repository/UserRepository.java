package peaksoft.springspringbootcoursesh.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.springspringbootcoursesh.entity.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Override
    List<User> findAllById(Iterable<Integer> integers);

    @Override
    <S extends User> S save(S entity);

    @Override
    List<User> findAll();

    @Override
    User getById(Integer integer);

}

