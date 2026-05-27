package com.srilankagem.gembackend.trade.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trades")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Trade {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String tradeNumber;

    @OneToMany(mappedBy = "trade" , cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<TradeItem> items = new ArrayList<>();




}
