import java.util.concurrent.TimeUnit;

public class Fighter {
    public static int strong;
    public static int protect;
    public static int life = 10;
    public static int numberOfFigher;


    public Fighter(int strong, int protect) {
        this.strong = strong;
        this.protect = protect;
    }

    public static int randomFight (int maxSila){
        maxSila -=1;
        return (int)((Math.random() * ++maxSila)+1);
    }
    public static int randomSkill (int max){
        max -=1;
        return (int)((Math.random() * ++max)+1);
    }


    public static void main(String[] args) throws InterruptedException{
        int numberOfPersons = 10;
        int maxSkillValue = 10;
        int numberOfArraySecondLevel = 4;

        int[][] persons = new int[numberOfPersons][numberOfArraySecondLevel];

        for (int i = 0; i < persons.length; i++){
            for (int j = 0; j < persons[i].length; j++){
                if (j == 0){
                    persons[i][j] = i+1;
                    numberOfFigher = persons[i][j];
                }
                if (j == 1){
                    persons[i][j] = randomSkill(maxSkillValue);
                    strong = persons[i][j];
                }
                if (j == 2){
                    persons[i][j] = randomSkill(maxSkillValue);
                    protect = persons[i][j];
                }
                if (j == 3){
                    persons[i][j] = life;
                }
            }
            System.out.println("Fighter #" + numberOfFigher);
            System.out.println("strong = "+ strong);
            System.out.println("protect = "+ protect);
            System.out.println("life = "+ life);
            System.out.println("----------------------------");
        }

        int count = 1;
        int i = 0;

            do {
                int j = 0;

                int name1 = persons[i][j];
                int strong1 = persons[i][++j];
                int protect1 = persons[i][++j];
                int life1 = persons[i++][++j];

                j = 0;
                int name2 = persons[i][j];
                int strong2 = persons[i][++j];
                int protect2 = persons[i][++j];
                int life2 = persons[i][++j];

                System.out.println("-----------------------------");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Начинается бой #" + count + " между бойцом "+ name1 + " и " + name2);
                System.out.println("-----------------------------");

                int start1 = randomSkill(maxSkillValue);
                int start2 = randomSkill(maxSkillValue);

                if (start1 > start2) {

                    while (life1 > 0 || life2 > 0) {
                        int strike1 = randomFight(strong1);
                        int prt2 = randomFight(protect2);

                        if (strike1 != prt2) {
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Бьет боец номер " + name1 + ", наносит урон " + strike1);
                            if (life2 - strike1 <= 0) {
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println("Победил боец номер " + name1);
                                life2 = 0;
                                break;
                            } else {
                                life2 = life2 - strike1;
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println("У бойца номер " + name2 + " остается жизней " + life2);
                            }
                        } else {
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Бьет боец номер " + name1);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Боец номер " + name2 + " ставит блок");
                        }

                        int strike2 = randomFight(strong2);
                        int prt1 = randomFight(protect1);

                        if (strike2 != prt1) {
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Бьет боец номер " + name2 + ", наносит урон " + strike2);
                            if (life1 - strike2 <= 0) {
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println("Победил боец номер " + name2);
                                life1 = 0;
                                break;
                            } else {
                                life1 = life1 - strike2;
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println("У бойца номер " + name1 + " остается жизней " + life1);
                            }
                        } else {
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Бьет боец номер " + name2);
                            System.out.println("Боец номер " + name1 + " ставит блок");
                        }
                    }

                } else {
                    while (life1 > 0 || life2 > 0) {
                        int strike2 = randomFight(strong2);
                        int prt1 = randomFight(protect1);

                        if (strike2 != prt1) {
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Бьет боец номер " + name2 + ", наносит урон " + strike2);
                            if (life1 - strike2 <= 0) {
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println("Победил боец номер " + name2);
                                life1 = 0;
                                break;
                            } else {
                                life1 = life1 - strike2;
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println("У бойца номер " + name1 + " остается жизней " + life1);
                            }
                        } else {
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Бьет боец номер " + name2);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Боец номер " + name1 + " ставит блок");
                        }
                        int strike1 = randomFight(strong1);
                        int prt2 = randomFight(protect2);

                        if (strike1 != prt2) {
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Бьет боец номер " + name1 + ", наносит урон " + strike1);
                            if (life2 - strike1 <= 0) {
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println("Победил боец номер " + name1);
                                life2 = 0;
                                break;
                            } else {
                                life2 = life2 - strike1;
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println("У бойца номер " + name2 + " остается жизней " + life2);
                            }
                        } else {
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Бьет боец номер " + name1);
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("Боец номер " + name2 + " ставит блок");
                        }
                    }
                }

                if (life1 <= 0) {
                    for (i = 0; i < persons.length - 1; i++) {
                        for (j = 0; j < persons[i].length; j++) {
                            persons[i][j] = persons[++i][j];
                            --i;
                        }
                    }
                    for (i = 0; i < numberOfArraySecondLevel; i++) {
                        persons[numberOfPersons-1][i] = 0;
                    }
                    for (i = 0; i < persons.length; i++) {
                        for (j = 0; j < persons[i].length; j++) {
                            persons[i][j] = persons[i][j];
                        }
                    }
                }

                if (life2 <= 0) {
                    for (i = 1; i < persons.length - 1; i++) {
                        for (j = 0; j < persons[i].length; j++) {
                            persons[i][j] = persons[++i][j];
                            --i;
                        }
                    }
                    for (i = 0; i < numberOfArraySecondLevel; i++) {
                        persons[numberOfPersons-1][i] = 0;
                    }
                    for (i = 0; i < persons.length; i++) {
                        for (j = 0; j < persons[i].length; j++) {
                            persons[i][j] = persons[i][j];
                        }
                    }
                }

                count++;
                i = 0;

            }
            while (persons[1][0] != 0);

        System.out.println("WINNER fighter #"+ persons[0][0]);

    }
}
