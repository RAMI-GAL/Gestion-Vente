package com.emsi.salesmasterbe2.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "factures")
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "facture_id")
    private Long FactureId;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date_facturation")
    private Date DateFacturation;

    @NotBlank(message = "montant total est obligatoire")
    @Column(name = "montant_total")
    private double MontantTotal;

    @Enumerated(EnumType.STRING)
    @NotBlank(message = "statut paiement est obligatoire")
    @Column(name = "statut_paiement")
    private Statut StatutPaiement;

    @Length(max = 255)
    @Column(name = "pdf")
    private String PDF;

    @OneToOne
    @JoinColumn(name = "vente_id")
    private Vente vente;

}

