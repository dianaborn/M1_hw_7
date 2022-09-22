public class Medic extends Hero{
    int healPoints;
    @Override
    public void applySuperAbility() {System.out.println("Medic применил супер способность HEALING HEROES");}
    public void increaseExperience(){
        double[] havingSuperAbilities = new double[30];
        int i = 0;
        if ( havingSuperAbilities[i] % 10 == 0){
            System.out.println("Medic увеличил опыт лечения!!!");
        }
    }

}

