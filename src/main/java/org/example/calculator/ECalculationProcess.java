package org.example.calculator;


public enum ECalculationProcess {
    ADD("TOPLAMA","Toplama işlemi",1),
    SUBS("ÇIKARMA","Çıkarma işlemi",2),
    ERROR("ERROR","Error oluştu",99);

    public static String test = "osman";

    private String summary;
    private String description;
    private int index;

    ECalculationProcess(final String summaryParam,
                        final String descriptionParam,
                        final int indexParam) {
        summary     = summaryParam;
        description = descriptionParam;
        index       = indexParam;
    }

    public String getIndexSummary(){
        return index + "-" + summary;
    }

    public int getIndex() {
        return index;
    }

    public static ECalculationProcess getEnumVal(int index) {
        ECalculationProcess[] valuesLoc = ECalculationProcess.values();
        if (valuesLoc.length - 1 < index) {
            return ERROR;
        }
        return valuesLoc[index - 1];
    }
}
