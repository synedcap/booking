package com.example.renthouse.Repository;

import com.example.renthouse.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>  {
}
