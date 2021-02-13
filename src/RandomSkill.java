public class RandomSkill {

    public static int strong;
    public static int protect;
    public static int life = 10;
    public static int numberOfFigher;


    public static int randomSkill (int max){
        max -=1;
        return (int)((Math.random() * ++max)+1);
    }

    public static void main(String[] args) {
        int numberOfPersons = 4;
        int maxSkillValue = 10;
        int num2 = 4;

        int[][] persons = new int[numberOfPersons][num2];


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

        System.out.println(persons[0][0]);



            System.out.println("====================");
            for (int i = 0; i < persons.length - 1; i++) {
                for (int j = 0; j < persons[i].length; j++) {
                    persons[i][j] = persons[++i][j];
                    System.out.println(persons[i][j]);
                    --i;
                }
            }
            for (int i = 0; i < num2; i++) {
                persons[numberOfPersons-1][i] = 0;
            }

        System.out.println("====================");
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons[i].length; j++) {
                persons[i][j] = persons[i][j];
                System.out.println(persons[i][j]);
            }
        }






    }


}



