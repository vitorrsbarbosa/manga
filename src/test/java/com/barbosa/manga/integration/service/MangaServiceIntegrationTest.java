package com.barbosa.manga.integration.service;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import com.barbosa.manga.model.Manga;
import com.barbosa.manga.service.MangaService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MangaServiceIntegrationTest {
    @Autowired
    private MangaService mangaService;

    @Test
    public void testGetMangasByTitle() {
        List<Manga> mangasByTitle = mangaService.getMangasByTitle("ken");
        assertThat(mangasByTitle).isNotNull().isNotEmpty();
    }
}