package ru.homework.cdrtest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.homework.cdrtest.*;
import ru.homework.cdrtest.component.CallDataRecord;
import ru.homework.cdrtest.entity.CallRecord;
import ru.homework.cdrtest.repository.CallRecordRepository;
import ru.homework.cdrtest.repository.PhoneNumberRepository;


import java.util.ArrayList;
import java.util.List;

public class TestGenerator {
    /*CallDataRecord callDataRecord = new CallDataRecord(PhoneNumberRepository phoneNumberRepository,
                                                       CallRecordRepository callRecordRepository);
*/
   // CallDataRecord callDataRecord = new CallDataRecord(new PhoneNumberRepository(), new CallRecordRepository());

      /*  @Autowired
    CallDataRecord callDataRecord;
*/

    ConfigurableApplicationContext run = SpringApplication.run(CdrTestApplicationTests.class);
    CallDataRecord cdr = run.getBean(CallDataRecord.class);
    @Test
    public void a() {
        /*List<CallRecord> list;
        list = cdr.generateCDR();
        System.out.println(list);*/

        int a = CallDataRecord.getRandomDuration();

    }
}
