package optional.app;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.Optional.ofNullable;

import java.util.HashSet;
import java.util.Set;

public class OrElse {

  public static void main(String... args) {
    String nullable = null;
    String value = ofNullable(nullable).orElse(defaultValue());
    out.println(format("value: %s", value));

    String withContent = "content";
    value = ofNullable(withContent).orElse(defaultValue());
    out.println(format("value: %s", value));

    String nonNull = "some";
    value = ofNullable(nonNull).orElseGet(() -> defaultValue());
    out.println(format("value: %s", value));

    Set<String> present = new HashSet<>();
    ofNullable(nullable).ifPresentOrElse(e -> present.add(e), () -> out.println("empty"));
    ofNullable(withContent).ifPresentOrElse(e -> present.add(e), () -> out.println("empty"));
    present.forEach(out::println);

    ofNullable(nullable).orElseThrow(() -> new RuntimeException("null value"));
  }

  static String defaultValue() {
    out.println("inside defaultValue method");
    return "default value";
  }
}
