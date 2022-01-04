public abstract class Entity {
    //List <Skills> Skill = new List<Skills>();

    int currentLife;
    int maxLife;
    int currentMana;
    int maxMana;
    boolean fire , ice , earth;

    //Regenereaza viata cu valoarea data ca parametru (nu se va depasi maximul).
    public void lifeRegen(int lifeUp){

    }
    //Regenereaza mana cu valoarea data ca parametru (nu se va depasi maximul).
    public void manaRegen(int manaUp){

    }

    //Functia primeste abilitatea aleasa si inamicul curent. Daca exista suficienta mana, va folosi abilitatea ımpotriva acestuia.
    public void useSkill(){

    }


    public abstract void reciveDamange(int damage);

    public abstract void getDamange(int damage);
}
