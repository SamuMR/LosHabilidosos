package los.habilidosisimos.habil2.service;

import los.habilidosisimos.habil2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import los.habilidosisimos.habil2.model.User;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> listUser(){return userRepository.findAll();}
    public void saveUser(User user){userRepository.save(user);}
    public User listById(Integer id){ return userRepository.findById(id.longValue()).get(); }
    

}
