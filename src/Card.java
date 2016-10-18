import java.util.ArrayList;

//TODO: Fix Occurrence not displaying when printed

public class Card {
    public String fileName, cardType, title, chemistry, classification, crystalSystem, cleavage, crustalAbundance, economicValue, occurString;
    private ArrayList<String> occurrence = new ArrayList<>();
    private double hardness, specificGravity;

    public Card(String fileName, String cardType, String title,
                String chemistry, String classification, String crystalSystem,
                ArrayList<String> occurrence, double hardness, double specificGravity,
                String cleavage, String crustalAbundance, String economicValue) {
        this.fileName = fileName;
        this.cardType = cardType;
        this.title = title;
        this.chemistry = chemistry;
        this.classification = classification;
        this.crystalSystem = crystalSystem;
        this.cleavage = cleavage;
        this.crustalAbundance = crustalAbundance;
        this.economicValue = economicValue;
        this.occurrence = occurrence;
        this.hardness = hardness;
        this.specificGravity = specificGravity;
        occurString = "";
        for (int i = 0; i < occurrence.size(); i++) {
            occurString = occurString + " " + occurrence.get(i);
        }
    }

    public String toString() {
        String ret;
        if (cardType.equals("play")) {
            ret = "\n" + title + "\n Chemistry: " + chemistry + "\n Classification: " + classification +
                    "\n Crystal System: " + crystalSystem + "\n Occurrence: " + occurString +
                    "\n Hardness: " + hardness + "\n Specific Gravity: " + specificGravity +
                    "\n Cleavage: " + cleavage + "\n Crustal Abundance: " + crustalAbundance +
                    "\n Economic Value: " + economicValue;
            return ret;
        } else if (cardType.equals("trump")) {
            ret = "\n" + title + "\n Change trump category to: " + chemistry;
            return ret;
        } else
            return "cardError-1";
    }

    public double getCardCategory(String currentCardCategory) {
        if (currentCardCategory.equals("Hardness")) {
            return this.hardness;
        }
        if (currentCardCategory.equals("Specific Gravity")) {
            return this.specificGravity;
        }
        if (currentCardCategory.equals("Cleavage")) {
            switch (this.cleavage) {
                case "none":
                    return 0;
                case "poor/none":
                    return 1;
                case "1 poor":
                    return 2;
                case "2 poor":
                    return 3;
                case "1 good":
                    return 4;
                case "1 good, 1 poor":
                    return 5;
                case "2 good":
                    return 6;
                case "3 good":
                    return 7;
                case "1 perfect":
                    return 8;
                case "1 perfect, 1 good":
                    return 9;
                case "1 perfect, 2 good":
                    return 10;
                case "2 perfect, 1 good":
                    return 11;
                case "3 perfect":
                    return 12;
                case "4 perfect":
                    return 13;
                case "6 perfect":
                    return 14;
            }
        }
        if (currentCardCategory.equals("Crustal Abundance")) {
            switch (this.crustalAbundance) {
                case "ultratrace":
                    return 0;
                case "trace":
                    return 1;
                case "low":
                    return 2;
                case "moderate":
                    return 3;
                case "high":
                    return 4;
                case "very high":
                    return 5;
            }
        }
        if (currentCardCategory.equals("Economic Value")) {
            switch (this.economicValue) {
                case "trivial":
                    return 0;
                case "low":
                    return 1;
                case "moderate":
                    return 2;
                case "high":
                    return 3;
                case "very high":
                    return 4;
                case "I'm rich":
                    return 5;
            }
        }
        return -1;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardTitle() {
        return title;
    }

    public String getChemistry() {
        return chemistry;
    }
}