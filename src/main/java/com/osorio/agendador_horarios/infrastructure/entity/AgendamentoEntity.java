package com.osorio.agendador_horarios.infrastructure.entity;

/*entity é o coração do crud
* vou iniciar importando os getter e setter do lombok*/
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
/*o hibernate vai pegar o noargsconstructor*/
@NoArgsConstructor
@AllArgsConstructor
@Entity
/*definindo o nome da tabela*/
@Table(name = "Agendamento")


public class AgendamentoEntity {
    @Id
    /*para gerar os Ids automaticamente*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
