public class Main {
    public static void main(String[] args) {
        HavingSuperAbility magic = new Magic();
        HavingSuperAbility medic = new Medic();
        HavingSuperAbility warrior = new Warrior();
        HavingSuperAbility[] havingSuperAbilities = {magic, medic, warrior};
        int i;
        for (i = 0; i < havingSuperAbilities.length; i++) {
            havingSuperAbilities[i].applySuperAbility();
            if (havingSuperAbilities[i] instanceof Medic)
                ((Medic) havingSuperAbilities[i]).increaseExperience();
        }

    }
}
