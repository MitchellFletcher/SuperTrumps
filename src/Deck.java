import java.util.ArrayList;
import java.util.Random;

public class Deck {
        private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        ArrayList<String> cardOccurrence = new ArrayList<>();

        //Play card creation
        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide01.jpg", "play", "Quartz", "SiO2", "tectosilicate", "hexagonal", cardOccurrence, 7, 2.65, "poor/none", "high", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide02.jpg", "play", "Plagioclase", "Na Al Si3 O8 - Ca Al2 Si2 O8", "tectosilicate", "triclinic", cardOccurrence, 6.5, 2.8, "1 perfect, 1 good", "very high", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide03.jpg", "play", "Orthoclase", "K Al Si3 O3", "tectosilicate", "monoclinic", cardOccurrence, 6.5, 2.6, "1 perfect, 1 good", "high", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide04.jpg", "play", "Biotite", "K(Fe, Mg)3 Al Si3 O10 (OH)2", "phyllosilicate", "monoclinic", cardOccurrence, 3, 3.3, "1 perfect", "moderate", "low"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide05.jpg", "play", "Muscovite", "K Al3 Si3 O10 (OH)2", "phyllosilicate", "monoclinic", cardOccurrence, 3, 2.9, "1 perfect", "moderate", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide06.jpg", "play", "Hornblende", "Ca2 (Mg, Fe)4 Al2 Si7 O22 (OH)2", "inosilicate", "monoclinic", cardOccurrence, 6, 3.5, "2 good", "moderate", "trivial"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide07.jpg", "play", "Actinolite", "Ca2 (Mg, Fe)5 Si8 O22 (OH)2", "inosilicate", "monoclinic", cardOccurrence, 6, 3.5, "2 good", "low", "low"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide08.jpg", "play", "Glaucophane", "Na2 (Mg, Fe)3 Al2 Si8 O22 (OH)2", "inosilicate", "monoclinic", cardOccurrence, 6, 3.2, "2 good", "low", "trivial"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("mantle");
        cards.add(new Card("Slide09.jpg", "play", "Olivine", "(Mg, Fe)2 Si O4", "nesosilicate", "orthorhombic", cardOccurrence, 7, 4.4, "2 poor", "high", "low"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("mantle");
        cards.add(new Card("Slide10.jpg", "play", "Garnet", "(Fe, Mg, Ca, Mn)3 (Al, Fe)2 Si3 O12", "nesosilicate", "isometric", cardOccurrence, 7.5, 4.3, "none", "moderate", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide11.jpg", "play", "Titanite", "Ca Ti Si O5", "nesosilicate", "monoclinic", cardOccurrence, 5.5, 3.6, "3 good", "low", "low"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide12.jpg", "play", "Zircon", "Zr Si O4", "nesosilicate", "tetragonal", cardOccurrence, 7.5, 4.7, "2 poor", "trace", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide13.jpg", "play", "Augite", "Ca (Mg, Fe) Si2 O6", "inosilicate", "monoclinic", cardOccurrence, 6.5, 3.6, "2 good", "high", "trivial"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("mantle");
        cards.add(new Card("Slide14.jpg", "play", "Orthopyroxene", "(Mg, Fe)2 Si2 O6", "inosilicate", "orthorhombic", cardOccurrence, 6, 3.9, "2 good", "high", "trivial"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide15.jpg", "play", "Chlorite", "(Mg, Fe)5 Al2 Si3 O10 (OH)8", "phyllosilicate", "monoclinic", cardOccurrence, 3, 3.3, "1 perfect", "moderate", "low"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cardOccurrence.add("mantle");
        cards.add(new Card("Slide16.jpg", "play", "Antigorite", "(Mg, Fe)3 Si2 O5 (OH)4", "phyllosilicate", "monoclinic", cardOccurrence, 4, 2.6, "1 perfect", "low", "low"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide17.jpg", "play", "Talc", "Mg3 Si4 O10 (OH)2", "phyllosilicate", "monoclinic", cardOccurrence, 1, 2.8, "1 perfect", "low", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide18.jpg", "play", "Kaolinite", "Al2 Si2 O5 (OH)4", "phyllosilicate", "triclinic", cardOccurrence, 2.5, 2.7, "1 perfect", "moderate", "high"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide19.jpg", "play", "Andalusite", "Al2 Si O5", "nesosilicate", "orthorhombic", cardOccurrence, 7, 3.15, "2 good", "low", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide20.jpg", "play", "Kyanite", "Al2 Si O5", "nesosilicate", "triclinic", cardOccurrence, 7, 3.7, "1 perfect, 1 good", "trace", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide21.jpg", "play", "Sillimanite", "Al2 Si O5", "nesosilicate", "orthorhombic", cardOccurrence, 7.5, 3.25, "1 perfect, 1 good", "low", "low"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide22.jpg", "play", "Staurolite", "(Fe, Mg)2 Al9 Si4 O22 (OH)2", "nesosilicate", "monoclinic", cardOccurrence, 7, 3.8, "1 good", "trace", "low"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide23.jpg", "play", "Epidote", "Ca2 (Al, Fe)3 Si3 O12 (OH)", "sorosilicate", "monoclinic", cardOccurrence, 6.5, 3.5, "1 perfect", "moderate", "trivial"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide24.jpg", "play", "Tourmaline", "Na (Mg, Fe)3 Al6 B3 Si6 O27 (OH)4", "cyclosilicate", "hexagonal", cardOccurrence, 7.5, 3.2, "2 poor", "trace", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide25.jpg", "play", "Topaz", "Al2 Si O4 (F, OH)2", "nesosilicate", "orthorhombic", cardOccurrence, 8, 3.6, "1 perfect", "ultratrace", "low"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide26.jpg", "play", "Beryl", "Be3 Al2 Si6 O18", "cyclosilicate", "hexagonal", cardOccurrence, 8, 2.9, "1 poor", "trace", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide27.jpg", "play", "Pyrite", "Fe S2", "sulfide", "isometric", cardOccurrence, 6.5, 5, "2 poor", "low", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide28.jpg", "play", "Pyrrhotite", "Fe1-x S", "sulfide", "monoclinic", cardOccurrence, 4.5, 4.6, "none", "low", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide29.jpg", "play", "Chalcopyrite", "Cu Fe S2", "sulfide", "tetragonal", cardOccurrence, 4, 4.3, "2 poor", "low", "very high"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide30.jpg", "play", "Galena", "Pb S", "sulfide", "isometric", cardOccurrence, 7.5, 7.6, "3 perfect", "trace", "high"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide31.jpg", "play", "Sphalerite", "(Zn, Fe) S", "sulfide", "isometric", cardOccurrence, 4, 4.1, "6 perfect", "trace", "high"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide32.jpg", "play", "Molybdenite", "Mo S2", "sulfide", "hexagonal", cardOccurrence, 1.5, 4.7, "1 perfect", "trace", "high"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide33.jpg", "play", "Gold", "Au", "native element", "isometric", cardOccurrence, 3, 19.3, "none", "ultratrace", "I'm rich!"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide34.jpg", "play", "Diamond", "C", "native element", "isometric", cardOccurrence, 10, 3.5, "4 perfect", "ultratrace", "I'm rich!"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide35.jpg", "play", "Graphite", "C", "native element", "hexagonal", cardOccurrence, 2, 2.2, "1 perfect", "trace", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide36.jpg", "play", "Halite", "Na Cl", "halide", "isometric", cardOccurrence, 2.5, 2.2, "3 perfect", "trace", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cards.add(new Card("Slide37.jpg", "play", "Fluorite", "Ca F2", "halide", "isometric", cardOccurrence, 4, 3.2, "4 perfect", "trace", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide38.jpg", "play", "Gypsum", "Ca S O4 (H2 O)2", "sulfate", "monoclinic", cardOccurrence, 2, 2.3, "1 perfect, 2 good", "trace", "high"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide39.jpg", "play", "Barite", "Ba S O4", "sulfate", "orthorhombic", cardOccurrence, 3.5, 4.5, "2 perfect, 1 good", "trace", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide40.jpg", "play", "Apatite", "Ca5 (P O4)3 (OH, F, Cl)", "phosphate", "hexagonal", cardOccurrence, 5, 3.2, "2 poor", "low", "high"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide41.jpg", "play", "Monazite", "(La, Ce, Nd) P O4", "phosphate", "monoclinic", cardOccurrence, 5, 5.3, "1 good, 1 poor", "trace", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide42.jpg", "play", "Calcite", "Ca C O3", "carbonate", "hexagonal", cardOccurrence, 3, 2.7, "3 perfect", "moderate", "high"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide43.jpg", "play", "Dolomite", "Ca Mg (C O3)2", "carbonate", "hexagonal", cardOccurrence, 4, 2.9, "3 perfect", "low", "low"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide44.jpg", "play", "Magnesite", "Mg C O3", "carbonate", "hexagonal", cardOccurrence, 4, 3.0, "3 perfect", "low", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide45.jpg", "play", "Siderite", "Fe C O3", "carbonate", "hexagonal", cardOccurrence, 4.5, 4, "3 perfect", "trace", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide46.jpg", "play", "Magnetite", "Fe3 O4", "oxide (spinel)", "isometric", cardOccurrence, 6, 5.2, "none", "moderate", "very high"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide47.jpg", "play", "Hematite", "Fe2 O3", "oxide", "hexagonal", cardOccurrence, 6, 5.3, "none", "trace", "high"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide48.jpg", "play", "Chromite", "(Fe, Mg) Cr2 O4", "oxide (spinel)", "isometric", cardOccurrence, 5.5, 5.1, "none", "low", "high"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide49.jpg", "play", "Ilmenite", "Ti Fe O3", "oxide", "hexagonal", cardOccurrence, 6, 4.8, "none", "low", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide50.jpg", "play", "Rutile", "Ti O2", "oxide", "tetragonal", cardOccurrence, 6.5, 4.3, "2 good", "low", "high"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide51.jpg", "play", "Corundum", "Al2 O3", "oxide", "hexagonal", cardOccurrence, 9, 4.0, "none", "trace", "moderate"));
        cardOccurrence.clear();

        cardOccurrence.add("igneous");
        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide52.jpg", "play", "Cassiterite", "Sn O2", "oxide", "tetragonal", cardOccurrence, 7, 7.1, "1 good, 1 poor", "trace", "high"));
        cardOccurrence.clear();

        cardOccurrence.add("metamorphic");
        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide53.jpg", "play", "Gibbsite", "Al (O H)3", "hydroxide", "monoclinic", cardOccurrence, 3.5, 2.4, "1 perfect", "low", "high"));
        cardOccurrence.clear();

        cardOccurrence.add("sedimentary");
        cards.add(new Card("Slide54.jpg", "play", "Goethite", "Fe O (OH)", "hydroxide", "orthorhombic", cardOccurrence, 5.5, 4.3, "1 perfect, 1 good", "moderate", "moderate"));
        cardOccurrence.clear();

        //Trump card creation
        cards.add(new Card("Slide55.jpg", "trump", "The Miner", "Economic Value", "", "", cardOccurrence, 0, 0, "", "", ""));

        cards.add(new Card("Slide56.jpg", "trump", "The Petrologist", "Crustal Abundance", "", "", cardOccurrence, 0, 0, "", "", ""));

        cards.add(new Card("Slide58.jpg", "trump", "The Mineralogist", "Cleavage", "", "", cardOccurrence, 0, 0, "", "", ""));

        cards.add(new Card("Slide59.jpg", "trump", "The Geophysicist", "Specific Gravity", "", "", cardOccurrence, 0, 0, "", "", ""));

        cards.add(new Card("Slide60.jpg", "trump", "The Geologist", "your choice", "", "", cardOccurrence, 0, 0, "", "", ""));
    }

    public ArrayList<Card> dealCards(int numCardsDealt) {
        ArrayList<Card> ret = new ArrayList<Card>();
        for (int i = 0; i < numCardsDealt; i++) {
            int idx = new Random().nextInt(cards.size());
            Card card = cards.remove(idx);
            ret.add(card);
        }
        return ret;
    }
}
