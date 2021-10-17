package optional.app;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.Optional.ofNullable;

import java.util.Optional;

public class Filter {

  public static void main(String... args) {
    String name = "peter";
    Optional<String> opt = ofNullable(name).filter(n -> n.contains("e"));
    out.println(format("present: %s", opt.isPresent()));
    opt.ifPresent(out::println);

    String nullable = null;
    Optional<String> nullOpt = ofNullable(nullable);
    out.println(format("present: %s", nullOpt.isPresent()));
  }
}
