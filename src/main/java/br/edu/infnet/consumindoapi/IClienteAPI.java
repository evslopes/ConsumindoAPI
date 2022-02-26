package br.edu.infnet.consumindoapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://www.omdbapi.com/", name = "OmdbService")
public interface IClienteAPI {

    @GetMapping("?t={filme}")
    Filme buscarFilmePor(@PathVariable("filme") String filme);
}
