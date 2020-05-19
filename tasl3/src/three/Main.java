package three;

public class Main {
    public static void main(String[] args) {

        obstacle obstacle1 = new obstacle("Стена",5);
        obstacle obstacle2 = new obstacle("Дорожка",200);
      //  obstacle obstacle3 = new obstacle("Илья",202,3);

        obstacle[] obstacles = new obstacle[2];
        obstacle1.PutMeInArray(obstacles,0);
        obstacle2.PutMeInArray(obstacles,1);
        //Participant3.PutMeInArray(Participants,2);



        Participant Participant1 = new Participant("Василий",220,10);
        Participant Participant2 = new Participant("Петр",190,6);
        Participant Participant3 = new Participant("Илья",202,3);

        Participant[] Participants = new Participant[3];
        Participant1.PutMeInArray(Participants,0);
        Participant2.PutMeInArray(Participants,1);
        Participant3.PutMeInArray(Participants,2);

        for (int i = 0; i < Participants.length; i++) {

                if (Participants[i].Jump < obstacles[0].parameter) {
                    System.out.println("Участник " + Participants[i].name + " не перепрыгнул");
                    continue;
                }
                if (Participants[i].Run < obstacles[1].parameter) {
                    System.out.println("Участник " + Participants[i].name + " не пробежал");
                    continue;
                }
                System.out.println("Участник " + Participants[i].name + " прошел все припятствия");

        }


    }
}