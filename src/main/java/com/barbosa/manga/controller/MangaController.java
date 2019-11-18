package com.barbosa.manga.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.barbosa.manga.service.MangaService;
import com.barbosa.manga.model.Manga;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/manga")
public class MangaController {
    Logger logger = LoggerFactory.getLogger(MangaController.class);
    @Autowired
    private MangaService mangaService;   
    @RequestMapping(value = "/async/{title}", method = RequestMethod.GET)
    @Async
    public CompletableFuture<List<Manga>> searchASync(@PathVariable(name = "title") String title) {
        return CompletableFuture.completedFuture(mangaService.getMangasByTitle(title));
    }
    @RequestMapping(value = "/sync/{title}", method = RequestMethod.GET)
    public @ResponseBody List<Manga> searchSync(@PathVariable(name = "title") String title) {
        return mangaService.getMangasByTitle(title);
    }
}