package in.sp.SpringResistrationLoginUsingThymeleaf.Services;

import in.sp.SpringResistrationLoginUsingThymeleaf.Entities.User;

public interface UserService {
    public boolean registerUser(User user);
    public User loginUser(String email, String password);
}
