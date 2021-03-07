import java.util.Optional;
import static java.lang.String.format;
import static java.util.Optional.of;
import static java.util.Optional.empty;
import static java.util.Optional.ofNullable;

public class OrElse {

  public static void main(String... args) {
		String nullable = null;
		String value = ofNullable(nullable)
		  .orElse(defaultValue());

    System.out.println(format("value: %s", value));

		String withContent = "content";
		value = ofNullable(withContent)
		  .orElse(defaultValue());

    System.out.println(format("value: %s", value));

    String nonNull = "some";
		value = ofNullable(nonNull)
		  .orElseGet(() -> defaultValue());

		System.out.println(format("value: %s", value));
	}

	static String defaultValue() {
	  System.out.println("inside defaultValue method");
    return "default value";
	}
}
