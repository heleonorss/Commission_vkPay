import org.junit.Test

import org.junit.Assert.*

internal class Commission_vKtTest {


    @Test
    fun payment_visa() {
        val amount = 12500_00
        val sumAmount= 0
        val card = "VISA"
        val result = payment (12500_00, sumAmount, card)
        assertEquals(9375,result)
    }
    @Test
    fun payment_visa_min() {
        val amount = 2500_00
        val sumAmount= 0
        val card = "VISA"
        val result = payment (2500_00, sumAmount, card)
        assertEquals(3500,result)
    }
    @Test
    fun payment_mir() {
        val amount = 12500_00
        val sumAmount= 0
        val card = "MIR"
        val result = payment (12500_00, sumAmount, card)
        assertEquals(9375,result)
    }

    @Test
    fun payment_vk() {
        val amount = 12500_00
        val sumAmount= 0

        val result = payment (12500_00, sumAmount)
        assertEquals(0,result)
    }
    @Test
    fun payment_maestro() {
        val amount = 12500_00
        val sumAmount= 80000_00
        val card = "Maestro"
        val result = payment (12500_00, sumAmount, card)
        assertEquals(2750,result)
    }
    @Test
    fun payment_maestro_min() {
        val amount = 2500_00
        val sumAmount= 0
        val card = "Maestro"
        val result = payment (2500_00, sumAmount, card)
        assertEquals(0,result)
    }

    @Test
    fun payment_default() {
        val result = payment (7)
        assertEquals( 0,result)
    }


    @Test
    fun payment_default_special() {
        val result = payment (7)
        assertEquals( 0,result)
    }
}
