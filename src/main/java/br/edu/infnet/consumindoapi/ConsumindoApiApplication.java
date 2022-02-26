package br.edu.infnet.consumindoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Scanner;

@EnableFeignClients
@SpringBootApplication
public class ConsumindoApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConsumindoApiApplication.class, args);
    }

    @Autowired
    private IClienteAPI clienteAPI;

    @Override
    public void run(String... args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o filme a consultar: ");
        String filme = entrada.nextLine();
        System.out.println(clienteAPI.buscarFilmePor(filme));
    }
}
