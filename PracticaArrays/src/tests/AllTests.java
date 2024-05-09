package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ test_maximanota.class, test_mediananotas.class, test_medianotas.class, test_minimanota.class })
public class AllTests {

}
