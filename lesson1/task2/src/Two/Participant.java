package Two;

import java.sql.Struct;

public class Participant {
    String name;
    int Run;
    int Jump;
    public Participant(String name,int Run, int Jump) {
        this.name = name;
        this.Run = Run;
        this.Jump = Jump;
    }
    public void PutMeInArray(Participant[] Participants, int arrayIndex)
    {
        Participants[arrayIndex] = this;
    }
}
