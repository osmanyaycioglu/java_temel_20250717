package org.example.java.abstraction;

public class HelloFactory {

    private static IHello[] hellos = new IHello[]{
            new HelloEsp(),
            new HelloEng(),
            new HelloJp(),
            new HelloDutch(),
            new HelloTr()
    };

    public static IHello createHelloImpl(int iLoc) {
        return hellos[iLoc - 1];
    }

    public static String getMenu() {

        String f = "osman";
        f = f + " yay";
        f += " yay";

        StringBuilder builderLoc = new StringBuilder();
        for (int i = 0; i < hellos.length; i++) {
            builderLoc.append((i + 1))
                      .append("-")
                      .append(hellos[i].getSummary())
                      .append("\n");
        }
        return builderLoc.toString();
    }

    public static IHello createHelloImplOld(int iLoc) {
        switch (iLoc) {
            case 1:
                return new HelloEng();
            case 2:
                return new HelloEsp();
            case 3:
                return new HelloJp();
            default:
                return new HelloTr();
        }

    }

}
