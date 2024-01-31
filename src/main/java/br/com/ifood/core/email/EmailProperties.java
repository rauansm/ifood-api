package br.com.ifood.core.email;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
@Validated
@Getter
@Setter
@Component
@ConfigurationProperties("ifood.email")
public class EmailProperties {

    @NotNull
    private String remetente;
}
