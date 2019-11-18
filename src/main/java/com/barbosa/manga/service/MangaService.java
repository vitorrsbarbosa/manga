package com.barbosa.manga.service;

import java.util.List;

import com.barbosa.manga.model.Manga;
import com.barbosa.manga.model.MangaResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MangaService {
    Logger logger = LoggerFactory.getLogger(MangaService.class);
    private static final String MANGA_SEARCH_URL = "http://api.jikan.moe/search/manga/";

    // @Autowired
    RestTemplate restTemplate;

    public List<Manga> getMangasByTitle(String title) {
        return restTemplate.getForEntity(MANGA_SEARCH_URL + title, MangaResult.class).getBody().getResult();
    }
}