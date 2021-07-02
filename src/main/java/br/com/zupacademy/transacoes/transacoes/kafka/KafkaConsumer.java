package br.com.zupacademy.transacoes.transacoes.kafka;

import br.com.zupacademy.transacoes.transacoes.models.Transacao;
import br.com.zupacademy.transacoes.transacoes.repositories.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.converter.JsonMessageConverter;

@Configuration
public class KafkaConsumer {

    @Autowired
    TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "transacoes")
    public void transacaoListener(TransacaoEvento transacaoEvent) {
        Transacao transacao = transacaoRepository.save(transacaoEvent.toModel());

    }

    @Bean
    JsonMessageConverter jsonMessageConverter() {
        return new JsonMessageConverter();
    }

}