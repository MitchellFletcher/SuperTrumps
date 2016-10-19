import javax.swing.*;

public class SelectCategoryView {

    public static String currentCategory;

    public static String getCurrentCategory() {
        Object[] categories = {"Hardness", "Specific Gravity", "Cleavage", "Crustal Abundance", "Economic Value"};
        int n = -1;
        while (n == -1) {
            n = JOptionPane.showOptionDialog(new JOptionPane(), "Please choose a category to play.", "Category Selection",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, categories, categories[0]);
        }
        switch (n) {
            case 0:
                currentCategory = "Hardness";
                break;
            case 1:
                currentCategory = "Specific Gravity";
                break;
            case 2:
                currentCategory = "Cleavage";
                break;
            case 3:
                currentCategory = "Crustal Abundance";
                break;
            case 4:
                currentCategory = "Economic Value";
                break;
        }
        return currentCategory;
    }
}