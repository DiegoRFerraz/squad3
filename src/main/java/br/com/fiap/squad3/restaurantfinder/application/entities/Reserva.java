package br.com.fiap.squad3.restaurantfinder.application.entities;

import br.com.fiap.squad3.restaurantfinder.application.entities.enums.StatusReserva;

import java.time.LocalDateTime;

public class Reserva {
    private final int QUANTIDADE_PESSOAS_MINIMA = 1;

    private Long id;
    private Long idUsuario;
    private Long idRestaurante;
    private Integer quantidadePessoas;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private StatusReserva status;

    public Reserva(
            Long idUsuario,
            Long idRestaurante,
            Integer quantidadePessoas,
            LocalDateTime dataHoraInicio,
            LocalDateTime dataHoraFim
    ) {
        this.idUsuario = idUsuario;
        this.idRestaurante = idRestaurante;
        this.quantidadePessoas = quantidadePessoas;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
    }

    public Reserva(
            Long idUsuario,
            Long idRestaurante,
            Integer quantidadePessoas,
            LocalDateTime dataHoraInicio,
            LocalDateTime dataHoraFim,
            StatusReserva status
    ) {
        this.idUsuario = idUsuario;
        this.idRestaurante = idRestaurante;
        this.quantidadePessoas = quantidadePessoas;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.status = status;
    }

    public Reserva(
            Long id,
            Long idUsuario,
            Long idRestaurante,
            Integer quantidadePessoas,
            LocalDateTime dataHoraInicio,
            LocalDateTime dataHoraFim,
            StatusReserva status
    ) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idRestaurante = idRestaurante;
        this.quantidadePessoas = quantidadePessoas;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        if (idUsuario == null || idUsuario <= 0) {
            throw new IllegalArgumentException("Id de usuário inválido.");
        }

        this.idUsuario = idUsuario;
    }

    public Long getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(Long idRestaurante) {
        if (idRestaurante == null || idRestaurante <= 0) {
            throw new IllegalArgumentException("Id de restaurante inválido.");
        }

        this.idRestaurante = idRestaurante;
    }

    public Integer getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(Integer quantidadePessoas) {
        if (quantidadePessoas == null || quantidadePessoas < QUANTIDADE_PESSOAS_MINIMA) {
            throw new IllegalArgumentException(
                    "Quantidade mínima de pessoas deve ser pelo menos " +
                            QUANTIDADE_PESSOAS_MINIMA + "."
            );
        }

        this.quantidadePessoas = quantidadePessoas;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        if (dataHoraInicio.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Data de início da reserva não pode estar no passado.");
        }

        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        if (dataHoraFim.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Data de fim da reserva não pode estar no passado.");
        }

        this.dataHoraFim = dataHoraFim;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }
}
