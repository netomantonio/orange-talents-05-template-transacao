package br.com.zupacademy.transacoes.transacoes.controllers;

import br.com.zupacademy.transacoes.transacoes.models.Cartao;
import br.com.zupacademy.transacoes.transacoes.models.Transacao;
import br.com.zupacademy.transacoes.transacoes.repositories.CartaoRepository;
import br.com.zupacademy.transacoes.transacoes.repositories.TransacaoRepository;
import br.com.zupacademy.transacoes.transacoes.responses.TransacaoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ConsultaTransacoesController {

    @Autowired
    CartaoRepository cartaoRepository;

    @Autowired
    TransacaoRepository transacaoRepository;

    @GetMapping("/api/cartoes/transacoes")
    public ResponseEntity<?> consultar(@PathParam("idCartao") String idCartao, @PageableDefault(sort = "efetivadaEm", direction = Sort.Direction.DESC, page = 0, size = 10) Pageable paginacao){
        Optional<Cartao> cartaoRequest = cartaoRepository.findById(idCartao);
        if (cartaoRequest.isEmpty()) return ResponseEntity.notFound().build();

        Page<Transacao> pageTransacoes = transacaoRepository.findByCartaoId(idCartao, paginacao);

        List<TransacaoResponse> transacoes = new ArrayList<>();
        pageTransacoes.forEach(transacao -> {
           transacoes.add(new TransacaoResponse(transacao));
        });

        return ResponseEntity.ok().body(transacoes);
    }
}
