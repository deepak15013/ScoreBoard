package in.deepaksood.scoreboard.model_package;

import java.io.Serializable;

/**
 * Created by ciso on 11-03-2017.
 */

public class CricketerModel implements Serializable {
    String id;
    String name;
    String image;
    String total_score;
    String description;
    String matches_played;
    String country;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTotal_score() {
        return total_score;
    }

    public void setTotal_score(String total_score) {
        this.total_score = total_score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMatches_played() {
        return matches_played;
    }

    public void setMatches_played(String matches_played) {
        this.matches_played = matches_played;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
