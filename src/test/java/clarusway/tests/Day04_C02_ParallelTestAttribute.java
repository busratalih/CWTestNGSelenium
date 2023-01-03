package clarusway.tests;

import org.testng.annotations.Test;

public class Day04_C02_ParallelTestAttribute {

    @Test(
            threadPoolSize = 4, // testimizin kaç çekirdekte paralel olarak calısacagını belirler
            invocationCount = 7  // testimizin kac defa calıstırılacagını belirler
    )
    public void test(){

        System.out.println("Current thread Id = "+ Thread.currentThread().getId());


    }
}
