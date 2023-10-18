package medeiros.felipe.service;

import medeiros.felipe.domain.model.User;

public interface UserService {

    public User findById(Long id);

    public User create(User userToCreate);
}
