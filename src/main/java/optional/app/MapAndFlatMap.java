package optional.app;

import static java.lang.System.out;
import static java.util.Optional.empty;
import static java.util.Optional.of;
import static java.util.Optional.ofNullable;

import java.util.Optional;

public class MapAndFlatMap {

  public static void main(String... args) {
    String nonNull = "some";
    Optional<String> opt = ofNullable(nonNull).map(MapAndFlatMap::getOutput);

    opt.ifPresent(out::println);

    opt = ofNullable(nonNull).flatMap(MapAndFlatMap::getOutputOpt);

    opt.ifPresent(out::println);
  }

  static String getOutput(String input) {
    return input == null ? null : "output for " + input;
  }

  static Optional<String> getOutputOpt(String input) {
    return input == null ? empty() : of("optional output for " + input);
  }
}
