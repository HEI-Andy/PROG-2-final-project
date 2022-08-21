package school.hei.springSecurity.service;

import school.hei.springSecurity.repository.UserRepository;
import school.hei.springSecurity.model.User;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OtherService implements org.springframework.security.core.userdetails.UserDetailsService {

    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String pseudo) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(pseudo);
        if(user == null){
            throw new UsernameNotFoundException(pseudo);
        }
        return new FonctionService(user);
    }
}
