/**
 * System              : Genesis Business Library
 * Sub-System          : multi-pro-code-test Configuration
 * Version             : 1.0
 * Copyright           : (c) Genesis
 * Date                : 2022-03-18
 * Function : Provide event handler config for multi-pro-code-test.
 *
 * Modification History
 */

eventHandler {

    eventHandler<Trade>(name = "TRADE_INSERT") {
        schemaValidation = false
        onCommit { event ->
            val trade = event.details

            if (trade.quantity!! > 0) {
                entityDb.insert(event.details)
                ack()
            } else {
                nack("Quantity must be positive")
            }
        }
    }

    eventHandler<Trade>(name = "TRADE_MODIFY") {
        onCommit { event ->
            entityDb.modify(event.details)
            ack()
        }
    }

    eventHandler<Trade>(name = "TRADE_DELETE") {
        onCommit { event ->
            entityDb.delete(event.details)
            ack()
        }
    }

    eventHandler<Counterparty>(name = "COUNTERPARTY_INSERT") {
        onCommit { event ->
            entityDb.insert(event.details)
            ack()
        }
    }

    eventHandler<Counterparty>(name = "COUNTERPARTY_MODIFY") {
        onCommit { event ->
            entityDb.modify(event.details)
            ack()
        }
    }

    eventHandler<Counterparty>(name = "COUNTERPARTY_DELETE") {
        onCommit { event ->
            entityDb.delete(event.details)
            ack()
        }
    }

    eventHandler<Instrument>(name = "INSTRUMENT_INSERT") {
        onCommit { event ->
            entityDb.insert(event.details)
            ack()
        }
    }

    eventHandler<Instrument>(name = "INSTRUMENT_MODIFY") {
        onCommit { event ->
            entityDb.modify(event.details)
            ack()
        }
    }

    eventHandler<Instrument>(name = "INSTRUMENT_DELETE") {
        onCommit { event ->
            entityDb.delete(event.details)
            ack()
        }
    }

}