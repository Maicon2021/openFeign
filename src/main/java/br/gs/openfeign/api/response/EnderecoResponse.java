package br.gs.openfeign.api.response;

public record EnderecoResponse(
        String cep,
        String logradouro,
        String complemento,
        String bairro,
        String localidade,
        String uf
) {
}
