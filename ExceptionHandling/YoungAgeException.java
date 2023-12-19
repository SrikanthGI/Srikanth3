package ExceptionHandling;

import java.util.Scanner;

public class YoungAgeException extends RuntimeException {
    YoungAgeException(String msg) {
        super(msg);
    }

}
