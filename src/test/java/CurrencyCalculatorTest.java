import L7Z6.Currency;
import L7Z6.CalcCurrency;
import L7Z6.CurrentValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

class CurrencyCalculatorTest {
    CalcCurrency calcCurrency;
    CurrentValue currentValue;

    @BeforeEach
    void setup() {
        currentValue = Mockito.mock(CurrentValue.class);
        calcCurrency = new CalcCurrency(currentValue);
    }

    @Test
    void shouldCalculateBuyValueInUSD() {
        //given
        double pln = 12;
        //when
        when(currentValue.getBuy(Currency.USD)).thenReturn(4.00);
        double buyValue = calcCurrency.calculateBuyValue(pln, Currency.USD);
        //then
        Assertions.assertEquals(3, buyValue);
    }

    @Test
    void shouldCalculateSellValueInUSD() {
        //given
        double amount = 10;
        //when
        when(currentValue.getSell(Currency.USD)).thenReturn(4.00);
        double sellValue = calcCurrency.calculateSellValueInPln(amount, Currency.USD);
        //then
        Assertions.assertEquals(40, sellValue);
    }

    @Test
    void shouldCalculateBuyValueInEUR() {
        //given
        double pln = 25;
        //when
        when(currentValue.getBuy(Currency.EUR)).thenReturn(5.0);
        double buyValue = calcCurrency.calculateBuyValue(pln, Currency.EUR);
        //then
        Assertions.assertEquals(5, buyValue);
    }

    @Test
    void shouldCalculateSellValueInEUR() {
        //given
        double amount = 10;
        //when
        when(currentValue.getSell(Currency.EUR)).thenReturn(5.0);
        double sellValue = calcCurrency.calculateSellValueInPln(amount, Currency.EUR);
        //then
        Assertions.assertEquals(50, sellValue);
    }

    @Test
    void shouldCalculateBuyValueInGBP() {
        //given
        double pln = 11;
        //when
        when(currentValue.getBuy(Currency.GBP)).thenReturn(5.5);
        double buyValue = calcCurrency.calculateBuyValue(pln, Currency.GBP);
        //then
        Assertions.assertEquals(2, buyValue);
    }

    @Test
    void shouldCalculateSellValueInGBP() {
        //given
        double amount = 10;
        //when
        when(currentValue.getSell(Currency.GBP)).thenReturn(5.5);
        double sellValue = calcCurrency.calculateSellValueInPln(amount, Currency.GBP);
        //then
        Assertions.assertEquals(55, sellValue);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfBuyValueIsNegattive() {
        //given
        //when
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> calcCurrency.calculateBuyValue(-1,Currency.GBP));
    }
    @Test
    void shouldThrowIllegalArgumentExceptionIfSellValueIsNegative() {
        //given
        //when
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> calcCurrency.calculateSellValueInPln(-1,Currency.GBP));
    }
}
