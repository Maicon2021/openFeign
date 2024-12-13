package br.gs.openfeign.api.client;

import br.gs.openfeign.api.response.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "ViaCepAPI")
public interface ViaCepClient {

    @GetMapping("{cep}/json")
    EnderecoResponse getEnderecoByCEP(@PathVariable("cep") String cep);
}
