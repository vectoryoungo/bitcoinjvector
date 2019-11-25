package com.vector.bitcoinj.explorer.wallet;

import org.bitcoinj.core.Coin;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.TestNet3Params;
import org.bitcoinj.utils.BriefLogFormatter;

public class BitcoinjCastle {

    static {
        NetworkParameters networkParameters = TestNet3Params.get();
        networkParameters.getId();
        Coin maxMoneyCoin = networkParameters.getMaxMoney();
        String maxMoneyStr = maxMoneyCoin.toFriendlyString();
        System.out.println(" max money " + maxMoneyStr);
    }

    public static void main(String[] args) {
        BriefLogFormatter.init();
    }
}
