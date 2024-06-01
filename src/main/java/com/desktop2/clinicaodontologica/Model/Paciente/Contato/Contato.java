package com.desktop2.clinicaodontologica.Model.Paciente.Contato;


import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Uf;
import jakarta.persistence.*;

@Entity
@Table(name = "contato")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String informacao;

    @ManyToOne
    @JoinColumn(name = "tipocontato", referencedColumnName = "tipo")
    private TipoContato tipoContato;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }
}
