package be.vinci.domain;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = FilmImpl.class)
public interface Film {
    int getId();
    String getTitle();
    int getDuration();
    long getBudget();
    String getLink();

    void setId(int id);
    void setTitle(String title);
    void setDuration(int duration);
    void setBudget(long budget);
    void setLink(String link);
}
