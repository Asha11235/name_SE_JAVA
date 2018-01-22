package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import entity.Users;
import repository.UserRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Users save(Users user) {
        return userRepository.save(user);
    }

}
