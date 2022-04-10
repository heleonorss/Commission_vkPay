const val MAX_FREE = 75000_00
const val COMMISSION_MC = 6
const val DEFAULT_COMMISSION_MC = 20_00
const val COMMISSION_VISA = 75
const val MIN_COMMISSION_VISA = 35_00

const val CARD_MASTER_CARD = "Master Card"
const val CARD_MAESTRO = "Maestro"
const val CARD_VISA = "VISA"
const val CARD_MIR = "MIR"
const val CARD_VK_PAY = "VK PAY"

fun main() {
    val amount = 2500_00
    var sumAmount = 0
    val card = CARD_VISA
    val sumCommission = payment(2500_00, sumAmount, card)
    print("Размер комиссии: $sumCommission копеек")

}

fun payment(
    amount: Int,
    sumAmount: Int = 0,
    card: String = CARD_VK_PAY
) = when (card) {
    CARD_MASTER_CARD, CARD_MAESTRO -> if (sumAmount <= MAX_FREE) 0 else (amount * COMMISSION_MC) / 10000 + DEFAULT_COMMISSION_MC

    CARD_VISA, CARD_MIR -> {
        val a = (amount * COMMISSION_VISA) / 10000
        if (a > MIN_COMMISSION_VISA) a else MIN_COMMISSION_VISA
    }
    CARD_VK_PAY -> 0
    else -> error("Данная карта не поддерживается")
}