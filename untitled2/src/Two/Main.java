package Two;

public class Main {
    public static void main(String[] args) {

        Wall wall1= new Wall(5);
        Track track = new Track(200);
        Participant Participant1 = new Participant("Василий",220,10);
        Participant Participant2 = new Participant("Петр",190,6);
        Participant Participant3 = new Participant("Илья",202,3);

        Participant[] Participants = new Participant[3];
        Participant1.PutMeInArray(Participants,0);
        Participant2.PutMeInArray(Participants,1);
        Participant3.PutMeInArray(Participants,2);

        for (int i = 0; i < Participants.length; i++) {

            if (Participants[i].Jump < wall1.Height)
            {
                System.out.println("Участник " +Participants[i].name + " не перепрыгнул");
                continue;
            }
            if (Participants[i].Run < track.Length)
            {
                System.out.println("Участник " +Participants[i].name + " не пробежал");
                continue;
            }
                System.out.println("Участник " +Participants[i].name + " прошел все припятствия");
        }


    }
}
