package danial.demo.user.service;

import danial.demo.user.entity.User;
import danial.demo.user.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void createUser(User user) {
        user.setPassWord(passwordEncoder.encode(user.getPassWord()));
        userRepository.save(user);
    }

    public boolean login(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getUserName());
        return optionalUser.isPresent() && passwordEncoder.matches(user.getPassWord(), optionalUser.get().getPassWord());
    }
}
