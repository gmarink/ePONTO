package br.com.eponto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder //teste de softeware ou passagem de dados
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;
}
