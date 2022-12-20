package character;

import enums.Gender;

public class MainCharacter extends Character{
    private int level;
    private int experience;
    private int magicDamage;

    public MainCharacter(String name, String gender){
        this.name = name;
        this.gender = this.checkChosenGender(gender);
        this.level = 1;
        this.experience = 0;
        this.magicDamage = 2;
    }

    public void getExperience(int gatteredExperience){
        this.experience += gatteredExperience;
    }

    public void checkLevel(){
        if(experience >= 100){
            experience -= 100;
            level++;
    }
}

    public Gender checkChosenGender(String gender){
        if(gender == "female")
        return Gender.FEMALE;
        else if(gender == "male")
        return Gender.MALE;
        else return Gender.LGTBQ;
    }


}
