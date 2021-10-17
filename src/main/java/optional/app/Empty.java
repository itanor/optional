package optional.app;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.Optional.empty;
import static java.util.Optional.ofNullable;

import java.util.Optional;

public class Empty {

  public static void main(String... args) {
    Optional<String> empty = empty();

    out.println(format("present: %s", empty.isPresent()));

    String name = "peter";
    Optional<String> opt = ofNullable(name);
    out.println(format("present: %s", opt.isPresent()));
    opt.ifPresent(out::println);

    String nullable = null;
    Optional<String> nullOpt = ofNullable(nullable);
    out.println(format("present: %s", nullOpt.isPresent()));
  }
}
