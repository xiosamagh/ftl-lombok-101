package com.bashl.lombok;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Log
public class LogExample {

    public static void main(String... args) {
        log.severe("Something's wrong here");
        log.severe("hello");
    }
}

@Slf4j
class LogExampleOther {

    public static void main(String... args) {
        log.error("Something else is wrong here");
    }
}

//@CommonsLog(topic="CounterLog")
//public class LogExampleCategory {
//
//    public static void main(String... args) {
//        log.error("Calling the 'CounterLog' with a message");
//    }
//}