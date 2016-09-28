import java.util.ArrayList;

//TODO: Fix Occurrence not displaying when printed

public class Card {
    private String fileName, cardType, title, chemistry, classification, crystalSystem, cleavage, crustalAbundance, economicValue, occurString;
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
//            System.out.println(occurrence.get(i)); //Debug
//            System.out.println(occurString); //Debug
        }
//        System.out.println(this.occurrence); //Debug to check occurrence passed correctly
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
}
