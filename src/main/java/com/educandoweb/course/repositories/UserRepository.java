package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

// Utiliza a entidade que vc precisa e o tipo do id dela, que neste caso é Long
public interface UserRepository extends JpaRepository<User, Long>{

}
