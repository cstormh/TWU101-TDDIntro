package com.thoughtworks.tddintro.resources.test_double;

import org.joda.time.DateTime;
import java.io.PrintStream;

public class TimePrinter {

    private PrintStream printStream;
    private DateTime dateTime;

    public TimePrinter(PrintStream printStream, DateTime dateTime) {

        this.printStream = printStream;
        this.dateTime = dateTime;
    }

    public void print(){

        printStream.println(dateTime);
    }
}
