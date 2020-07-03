package Praticando;

public class praticando01Moto {
    public static void main(String[] args) {
        Moto moto1 = new Moto("Bros - ESD - 160", "Preta", "ABC2020", 0.0f, 11.999f);
        moto1.status();

        Moto moto2 = new Moto("Titan - Flex - 150", "Branca", "DEF2021", 50.7f, 6.500f);
        moto2.status();
    }
}