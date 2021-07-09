package Game1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ModelTest {

    private static Model model = new Model();

    @Before
    public void setUp() {
        model = new Model();
        model.setPrimaryBarrier(Constants.PRIMARY_MIN_BARRIER,
                Constants.PRIMARY_MAX_BARRIER);
    }

    @Test
    public void setSecretValue() {
        model.setSecretValue();
        Assert.assertTrue(model.getSecretValue() >= 1 &&
                model.getSecretValue() <= 99);
    }

    @Test
    public void setPrimaryBarrier() {
        Assert.assertEquals(model.getMaxBarrier(), Constants.PRIMARY_MAX_BARRIER);
        Assert.assertEquals(model.getMinBarrier(), Constants.PRIMARY_MIN_BARRIER);
    }

    @Test
    public void getYourWay() {
        model.checkValue(50);
        Assert.assertEquals(List.of(50), model.getYourWay());
    }
}