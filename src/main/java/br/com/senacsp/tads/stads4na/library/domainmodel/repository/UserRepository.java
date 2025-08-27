package br.com.senacsp.tads.stads4na.library.domainmodel.repository;

import br.com.senacsp.tads.stads4na.library.domainmodel.User;

import java.util.List;

public interface UserRepository<T, ID> {
    List<User> findAll();
}
