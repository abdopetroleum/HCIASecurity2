import Questions.MultipleChoice;
import Questions.SingleChoice;
import Questions.TrueAndFalse;


import java.util.ArrayList;
import java.util.LinkedList;

public class QuestionsFillers {
    public void trueAndFalseFillers(){
        ArrayList<TrueAndFalse> trueAndFalses=new ArrayList<TrueAndFalse>();
        trueAndFalses.add(new TrueAndFalse(
                "Caesar Code is primarily used to encrypt data by using a stick of a specific specification",
          false,
          0
        ));
        trueAndFalses.add(new TrueAndFalse(
                "",
                false,
                0
        ));

    }
    public void singleChoicesFillers(){
        ArrayList<SingleChoice> singleChoices=new ArrayList<SingleChoice>();
        singleChoices.add(new SingleChoice(
           "Which of the following is the core part of the P2DR model?",
           "Policy Strategy",
                new LinkedList<String>(){
                    {
                        add("Protection");
                        add("Detection");
                        add("Response");
                    }
                },
           0
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following types of attacks does the DDoS attack belong to?",
                "Traffic attack",
                new LinkedList<String>(){
                    {
                        add("Snooping scanning attack");
                        add("Malformed packet attack");
                        add("Special message attack");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "",
                "",
                new LinkedList<String>(){
                    {
                        add("");
                        add("");
                        add("");
                    }
                },
                0
        ));


    }
    public void multipleChoiceFillers(){
        ArrayList<MultipleChoice> multipleChoices=new ArrayList<MultipleChoice>();
        multipleChoices.add(new MultipleChoice(
                "Which of the following is the correct description of windows log event type? ",
                new LinkedList<String>(){
                    {
                        add("Error events usually refer to the loss of function and data. For example, if a service\n" +
                                "cannot be loaded as a system boot, an error event will be generated. ");
                        add("When the disk space is insufficient, it will be recorded as an \"information event\" ");
                        add("Failure audit event refers to a failed audit security login attempt, such as a failure\n" +
                                "when the user views accesses the network drive is logged as a failed audit event.");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("A warning event is a successful operation event of an application, driver, or service.");
                    }
                },
                0
        ));
        multipleChoices.add(new MultipleChoice(
                "Which types of encryption technology can be divided into?",
                new LinkedList<String>(){
                    {
                        add("Symmetric encryption");
                        add("Asymmetric encryption");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Fingerprint encryption");
                        add("Data encryption");
                    }
                },
                17

        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following are international organizations related to information security standardization?",
                new LinkedList<String>(){
                    {
                        add("International Organization for Standardization (ISO)");
                        add("International Electrotechnical Commission");
                        add("International Telecommunication Union (ITU)");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Wi-Fi Alliance");

                    }
                },
                17

        ));
    }


}
