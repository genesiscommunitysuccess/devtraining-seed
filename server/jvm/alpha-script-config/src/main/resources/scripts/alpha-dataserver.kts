dataServer {
    query("ALL_TRADES", TRADE_VIEW)
    query("ALL_PRICES", TRADE){
        fields{
            TRADE.PRICE
            TRADE.SYMBOL
        }
        where { trade -> trade.price > 0.0 }
    }
    query("ALL_INSTRUMENTS", INSTRUMENT)
    query("ALL_COUNTERPARTIES", COUNTERPARTY)
}