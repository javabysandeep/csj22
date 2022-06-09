package classComponents.nestedClasses;

public class Constants {
    static String companyName = "google";

    static class MySql {
        static String username = "mysql";
        static String password = "mysql123";
    }

    static class Oracle {
        static class Dev{
            static String username = "oracleDev";
            static String password = "oracle123Dev";
        }
        static class Prod{
            static String username = "oraclePrd";
            static String password = "oracle123Prd";
        }
    }
}
