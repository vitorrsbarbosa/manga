package com.barbosa.manga.model;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Service
public class MangaResult {
	private List<Manga> result;

	public List<Manga> getResult() {
		return null;
	}

	public void setResult(List<Manga> result) {
		this.result = result;
	}
}