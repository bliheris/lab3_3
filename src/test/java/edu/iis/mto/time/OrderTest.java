package edu.iis.mto.time;

import edu.iis.mto.time.clock.RealTimeSource;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void orderExpired() {
        //given
        FakeTimeSource fakeTS = new FakeTimeSource();
        Order order = new Order(fakeTS);
        order.submit();

        //when
        fakeTS.setDeltaHours(48);

        //then
        try {
            order.confirm();
            fail("Should throw OrderExpired");
        }catch (OrderExpiredException ex){
            assertThat(order.getOrderState(), is(Order.State.CANCELLED));
        }
    }

}