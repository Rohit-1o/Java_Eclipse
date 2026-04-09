package java_project;

public class RupeeToPoundConvertor implements CurrencyConverter {

    @Override
    public float doConvert(float amountInRupees) {
        float amountInPounds = amountInRupees / POUND_TO_RUPEE;
        return amountInPounds;
    }
}