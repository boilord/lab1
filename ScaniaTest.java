import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaniaTest extends CarTest{

    private Scania scania = new Scania();

    public ScaniaTest(){
        super(new Scania());
    }

    @Test
    void setRampAngle() {
        scania.setRampAngle(15);
        assertEqual(scania.getTurboOn(), 15);
    }

    @Override
    public void speedFactor() {
        
    }
}
