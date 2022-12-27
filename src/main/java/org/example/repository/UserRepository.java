package org.example.repository;

import org.example.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    public User save(User user);

    public User findById(int id);

    public void deleteById(int id);
}
