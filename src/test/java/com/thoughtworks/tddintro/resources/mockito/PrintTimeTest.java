package com.thoughtworks.tddintro.resources.mockito;

import com.thoughtworks.tddintro.resources.test_double.TimePrinter;
import org.joda.time.DateTime;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class PrintTimeTest {

    @Test
    public void shouldPrintTime() {
        PrintStream printStream = mock(PrintStream.class);
        DateTime dateTime = mock(DateTime.class);
        when(dateTime.toString()).thenReturn("2013-04-08 16:33:17");
        TimePrinter timePrinter = new TimePrinter(printStream, dateTime);

        timePrinter.print();

        verify(printStream).println("2013-04-08 16:33:17");
    }
}
