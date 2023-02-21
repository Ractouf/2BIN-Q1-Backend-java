package be.vinci.domain;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = UserImpl.class)
public interface User {
    int getId();
    String getLogin();
    String getPassword();
    Integer getAge();
    Boolean isMarried();

    void setId(int id);
    void setLogin(String login);
    void setPassword(String password);
    void setAge(Integer age);
    void setMarried(Boolean married);

    boolean checkPassword(String password);

    String hashPassword(String password);
}
