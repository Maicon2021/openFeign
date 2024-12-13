package br.gs.openfeign.api.controller;

import br.gs.openfeign.api.client.ViaCepClient;
import br.gs.openfeign.api.response.EnderecoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/endereco")
public class ViaCepController {

    private  final ViaCepClient viaCepClient;

    public ViaCepController(ViaCepClient viaCepClient) {
        this.viaCepClient = viaCepClient;
    }

    @GetMapping("/cep/{cep}")
    public ResponseEntity<EnderecoResponse> getEnderecoByCEP(@PathVariable("cep") String cep) {
        return ResponseEntity.ok().body(viaCepClient.getEnderecoByCEP(cep));
    }

}
