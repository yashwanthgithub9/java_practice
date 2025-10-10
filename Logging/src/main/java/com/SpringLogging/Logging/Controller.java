package com.SpringLogging.Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home(){
        String str = "<html><body><font color=\\\"green\\\">\"\n" +
                    "\"<h1>WELCOME To GeeksForGeeks Logging project live reload</h1>\"\n" +
                "\"</font></body></html>";
            return str;
    }
    Logger logger = LoggerFactory.getLogger(Controller.class);
    @RequestMapping("/log")
    public String log(){
        logger.error("ERROR Logged");
        logger.warn("WARN logged");
        logger.info("INFO logged");
        logger.trace("TRACE logged");
        logger.debug("DEBUG logged");
        return "Logged in to requested file check there";
    }
}
