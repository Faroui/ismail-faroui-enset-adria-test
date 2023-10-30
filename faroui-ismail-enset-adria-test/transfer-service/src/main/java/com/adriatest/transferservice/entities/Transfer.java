package com.adriatest.transferservice.entities;

import com.adriatest.transferservice.enums.TransferStatus;
import com.adriatest.transferservice.model.Wallet;

import java.util.Date;

public class Transfer {
    private Long id;
    private Date date;
    private Wallet sourceWallet;
    private Wallet destinationWallet;
    private double amount;
    private TransferStatus status;
}
