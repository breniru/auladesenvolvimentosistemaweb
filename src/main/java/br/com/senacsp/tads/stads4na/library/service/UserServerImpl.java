package br.com.senacsp.tads.stads4na.library.service;

import br.com.senacsp.tads.stads4na.library.domainmodel.User;
import br.com.senacsp.tads.stads4na.library.domainmodel.repository.NonPersistentUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServerImpl implements UserService{

    private final NonPersistentUserRepository userRepository;

    @Override
    public List<User> findall() {
        List<User> resultset = new ArrayList<>();
        resultset.addAll(this.userRepository.findAll());
        return resultset;
    }
}
