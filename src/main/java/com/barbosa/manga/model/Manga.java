package com.barbosa.manga.model;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Service
public class Manga {
    private String title;
    private String description;
    private Integer volumes;
    private Double score;

    public Manga() {}
    
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getVolumes() {
        return volumes;
    }

    public Double getScore() {
        return score;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVolumes(Integer volumes) {
        this.volumes = volumes;
    }

    public void setScore(Double score) {
        this.score = score;
    }

	public static Manga builder(String title, String description, Integer volumes, Double score) {
		return builder(title, description, volumes, score);
	}
}