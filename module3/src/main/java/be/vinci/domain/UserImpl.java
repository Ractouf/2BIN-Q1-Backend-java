package be.vinci.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.mindrot.jbcrypt.BCrypt;

class UserImpl implements User {
    private int id;
    private String login;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private Integer age;
    private Boolean married;

    @Override
    public int getId() {
        return id;
    }
    @Override
    public String getLogin() {
        return login;
    }
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public Integer getAge() {
        return age;
    }
    @Override
    public Boolean isMarried() {
        return married;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public void setLogin(String login) {
        this.login = login;
    }
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public void setMarried(Boolean married) {
        this.married = married;
    }

    @Override
    public boolean checkPassword(String password) {
        return BCrypt.checkpw(password, this.password);
    }

    @Override
    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    @Override
    public String toString() {
        return "{id:" + id + ", login:" + login + ", password:" + password + "}";
    }
}
