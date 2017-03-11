package annotations;

import java.lang.annotation.*;

/**
 * @author Dylan.Deng
 * @version 1.00 9/22/2016 21:01
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
    String value();
}
